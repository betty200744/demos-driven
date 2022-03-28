package com.cc.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        studentFromJson();
        studentToJson();
    }

    private static void studentFromJson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String stu = "{\"id\":1,\"name\":\"betty\"}";
        Student student = mapper.readerFor(Student.class).readValue(stu);
        System.out.println(student.name);
    }

    private static void studentToJson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Student student = new Student(1, "betty");
        System.out.println(mapper.writeValueAsString(student));
    }


}
