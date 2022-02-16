package com.cc.grpc;

import com.cc.grpc.gen.HelloRequest;
import com.cc.grpc.gen.HelloResponse;
import com.cc.grpc.gen.HelloServiceGrpc;
import io.grpc.stub.StreamObserver;

public class HelloServiceImpl extends HelloServiceGrpc.HelloServiceImplBase {
    @Override
    public void hello(HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        String s = "HelloService handler, method: hello, request: " + request;
        System.out.println(s);
        HelloResponse response = HelloResponse.newBuilder().setGreeting(s).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

    }
}
