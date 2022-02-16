package com.cc.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;


public class HelloServer {
    public static void main(String[] args) {
        System.out.println("this is grpc hello server~~~");
        try {
            int port = 50051;
            final Server server = ServerBuilder.forPort(port).addService(new HelloServiceImpl()).build().start();
            server.awaitTermination();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
