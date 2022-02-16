namespace java com.cc.thrift.gen

struct HelloRequest {
     1: string firstName
}

struct HelloResponse {
     1: string greeting
}

service HelloService {
    HelloResponse hello(1:HelloRequest msg)
}
