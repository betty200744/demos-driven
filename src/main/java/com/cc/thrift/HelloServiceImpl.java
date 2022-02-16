package com.cc.thrift;

import com.cc.thrift.gen.HelloRequest;
import com.cc.thrift.gen.HelloResponse;
import com.cc.thrift.gen.HelloService;
import org.apache.thrift.TException;

public class HelloServiceImpl implements HelloService.Iface {

    @Override
    public HelloResponse hello(HelloRequest request) throws TException {

        String s = "HelloService handler, method: hello, request: " + request;
        System.out.println(s);
        return new HelloResponse().setGreeting(s);
    }
}
