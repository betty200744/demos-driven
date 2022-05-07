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
        Student student0 = mapper.readValue(stu, Student.class);
        Student student1 = mapper.readerFor(Student.class).readValue(stu);
        System.out.println(student0.name);
        System.out.println(student1.name);
    }

    private static void studentToJson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Student student = new Student(1, "betty");
        String studentString = mapper.writeValueAsString(student);
        System.out.println(studentString);
    }
}
