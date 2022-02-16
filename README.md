# demos-driven

demos-driven

## grpc

```shell

cd ~/Downloads
wget https://repo1.maven.org/maven2/io/grpc/protoc-gen-grpc-java/1.4
4.0/protoc-gen-grpc-java-1.44.0-osx-x86_64.exe

chmod +x protoc-gen-grpc-java-1.44.0-osx-x86_64.exe

```

gen proto

```shell
protoc --proto_path=./ --java_out=../java/ ./HelloService.proto
protoc --plugin=protoc-gen-grpc-java=$HOME/Downloads/protoc-gen-grpc-java-1.44.0-osx-x86_64.exe  --grpc-java_out=../java/ --proto_path=./ ./HelloService.proto

```

build and run terminal

```shell
bazel run //src/main/java/com/cc/grpc:grpc_server
bazel run //src/main/java/com/cc/grpc:grpc_client

```

## thrift

```shell

brew install thrift


```

gen proto

```shell
thrift -r -out ../java  -gen java  HelloService.thrift
```

run terminal

```shell
bazel run //src/main/java/com/cc/thrift:thrift_server
bazel run //src/main/java/com/cc/thrift:thrift_client

```

## dynamodb

run terminal

```shell
bazel run //src/main/java/com/cc/dynamodb:dynamod 

```
