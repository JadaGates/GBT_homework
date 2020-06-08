# Docker and Docker Compose Basics Homework

Homework for Docker and Docker Compose Basics

## 作业内容

- 本项目包含alice和bob两个Spring Boot服务的骨架。
- 请在两个服务中分别添加`/hello`接口
- alice的`/hello`接口直接调用bob的`/hello`接口
- bob的`/hello`接口返回"Hello from Bob!"字符串
- 通过Dockerfile和Docker Compose将两个服务部署起来，使得可以访问alice的`/hello`接口

最终效果：
- 浏览器访问`http://localhost:8080/hello`
- 返回"Hello from Bob!"字符串

提示：
- 可以用RestTemplate实现接口调用
- 接口调用时的host是Docker Compose中定义的服务名

