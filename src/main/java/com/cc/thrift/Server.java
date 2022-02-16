package com.cc.thrift;

import com.cc.thrift.gen.HelloService;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TTransportException;

public class Server {
    public static void main(String[] args) {
        System.out.println("this is thrift hello server~~~");
        try {
            start();
        } catch (TTransportException e) {
            e.printStackTrace();
        }
    }

    public static void start() throws TTransportException {
        TServerTransport serverTransport = new TServerSocket(50052);
        TSimpleServer ser = new TSimpleServer(new TServer.Args(serverTransport)
                .processor(new HelloService.Processor<>(new HelloServiceImpl())));
        System.out.println("Starting the server...");
        ser.serve();
        System.out.println("done.");
    }
}
