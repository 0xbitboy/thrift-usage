# thrift-usage
  Java Maven project of  Micro service using thrift
  使用thrift 提供微服务的 Maven项目基本架构

## 各个模块的介绍

  #### 1.demo-facade-hellworld

  ```
  对外接口层，可理解微API层,里面也包含thrift 生成的文件，因为这部分也是 provider 和 client 共用的。
  ```
  #### 2.demo-service-hellworld

  ```
  业务逻辑层，实现服务的业务，对于一般的系统就是对数据库的操作，当然也存在调用其他服务的情况（使用XXX-client-xxx的一些模块）
  ```
  #### 3.demo-provider-helloworld

  ```
  服务提供层，具体使用的协议 可以是 dubbo ，http ，rpc ，thrift 等，这里用的是thrift
  ```
  #### 4.demo-client-hellworld

  ```
  实现 facade 层的接口，（调用thrift 服务）
  模糊业务方代码对thrift服务层逻辑的感知
  ```

  #### 5.thrift-interface-descriptions

  ```
  维护thrift定义文件，负责生成thrift java 代码 和其他 语言的代码。
  ```
