package com.cc.thrift;

import com.cc.thrift.gen.HelloRequest;
import com.cc.thrift.gen.HelloResponse;
import com.cc.thrift.gen.HelloService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class Client {

    public static void main(String[] args) throws TException {
        System.out.println("this is thrift hello client~~~");

        TTransport transport = new TSocket("localhost", 50052);
        transport.open();

        TProtocol protocol = new TBinaryProtocol(transport);
        HelloService.Client cli = new HelloService.Client(protocol);
        HelloResponse response = cli.hello(new HelloRequest("test msg"));
        transport.close();
        System.out.println("response: " + response.getGreeting());

    }
}
