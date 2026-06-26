1. Create proto file - [order.proto](proto/order.proto)
2. Stub -> Compiled lang code for proto
   1. GOTO : https://github.com/protocolbuffers/protobuf/releases
   2. Download : protoc-35.1-win64.zip and unzip
   3. Copy [protoc.exe](protoc.exe) from bin to this project
   4. GOTO : terminal type 
   ```shell
   ./protoc -I=proto --java_out=src/main/java proto/order.proto
   ```
   5. Check if class file are generated in [dto](src/main/java/org/example/dto)
3. Write Sender and receiver : [Main.java](src/main/java/org/example/Main.java)

