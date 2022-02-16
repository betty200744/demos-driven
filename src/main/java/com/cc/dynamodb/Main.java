package com.cc.dynamodb;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("hello aws-dynamodb");

        String tableName = "table_for_test_hc_" + System.currentTimeMillis();

        final AmazonDynamoDB ddb = AmazonDynamoDBClientBuilder.defaultClient();

        createTable(ddb, tableName);


        System.out.println("wait for create table complete");
        TimeUnit.SECONDS.sleep(8L);

        putItem(ddb, tableName, "name-abc", "attr1=val1;attr2=val2");
        deleteTable(ddb, tableName);
    }

    /**
     * create a new table
     */
    public static void createTable(AmazonDynamoDB ddb, String tableName) throws Exception {
        System.out.format("Creating table \"%s\" with a simple primary key: \"Name\".\n", tableName);

        CreateTableRequest request = new CreateTableRequest()
                .withAttributeDefinitions(new AttributeDefinition("Name", ScalarAttributeType.S))
                .withKeySchema(new KeySchemaElement("Name", KeyType.HASH))
                .withProvisionedThroughput(new ProvisionedThroughput(10L, 10L))
                .withTableName(tableName);

        CreateTableResult result = ddb.createTable(request);
        System.out.println(result.getTableDescription().getTableName());
        System.out.println("Creating table Done!");
    }

    /**
     * create a new table
     */
    public static void deleteTable(AmazonDynamoDB ddb, String tableName) throws Exception {
        System.out.format("Delete table \"%s\" with a simple primary key: \"Name\".\n", tableName);
        ddb.deleteTable(tableName);
        System.out.println("Delete table Done!");
    }

    public static void putItem(AmazonDynamoDB ddb, String tableName, String name, String values) {
        System.out.format("putItem for %s\n\n", tableName);

        ArrayList<String[]> extraFields = new ArrayList<>();

        String[] vals = values.split(",");
        for (int x = 2; x < vals.length; x++) {
            String[] fields = vals[x].split("=", 2);
            if (fields.length == 2) {
                extraFields.add(fields);
            } else {
                System.out.format("Invalid argument: %s\n", vals[x]);
                System.exit(1);
            }
        }
        System.out.format("Adding \"%s\" to \"%s\" \n", name, tableName);
        if (extraFields.size() > 0) {
            System.out.println("Additional fields:");
            for (String[] field : extraFields) {
                System.out.format("  %s: %s\n", field[0], field[1]);
            }
        }
        HashMap<String, AttributeValue> itemValues = new HashMap<>();

        itemValues.put("Name", new AttributeValue(name));

        for (String[] field : extraFields) {
            itemValues.put(field[0], new AttributeValue(field[1]));
        }
        ddb.putItem(tableName, itemValues);
        System.out.println("putItem Done!");
    }
}
