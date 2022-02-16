package com.cc.grpc;

import com.cc.grpc.gen.HelloRequest;
import com.cc.grpc.gen.HelloResponse;
import com.cc.grpc.gen.HelloServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;

public class HelloClient {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("this is grpc hello client~~~");
        int port = 50051;
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", port).usePlaintext().build();
        HelloServiceGrpc.HelloServiceBlockingStub stub = HelloServiceGrpc.newBlockingStub(channel);
        HelloRequest request = HelloRequest.newBuilder().setFirstName("betty").build();
        HelloResponse response = stub.hello(request);
        System.out.println("response: " + response.getGreeting());
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
}
