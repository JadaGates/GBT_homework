# Docker and Docker Compose Basics Homework

Homework for Docker and Docker Compose Basics
## Homework update
1. 建议启动命令使用`docker-compose up -d --build`
2. 在alice中使用 Java httpclient 发起 GET 请求，bob 中直接返回 hello from bob 字符串
3. 由于 docker-compose 会自动创建一个默认网络以为多个容器之间提供网络通信的功能，其 host 为服务名
4. 需要注意的是 httpclient 与 curl 之间的差异，比如对于2中提到的host
```
# shell
curl bob:8081/hello # 可以正常获取 bob 的返回值

# java
String url = "bob:8081/hello";
URL bobApi = new URL(url);
HttpURLConnection bobApiRequst = (HttpURLConnection) bobApi.openConnection();
...
// 上述代码执行的话会返回错误：java.net.MalformedURLException: unknown protocol: bob
```
上述 Java 的错误主要原因就是 Java 在解析 URL 的时候，需要指定协议名，将 url 更改为 **http://bob:8081/hello** 即可。

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

