# Socket.io框架篇：框架概述

**关于作者**

>郭孝星，非著名程序员，主要从事Android平台基础架构与中间件方面的工作，爱好广泛，技术栈主要涉及以下几个方面
>
>- Android/Linux
>- Java/Kotlin/JVM
>- Python
>- JavaScript/React/ReactNative
>- DataStructure/Algorithm
>
>文章首发于[Github](https://github.com/guoxiaoxing)，后续也会同步在[简书](http://www.jianshu.com/users/66a47e04215b/latest_articles)与
[CSDN](http://blog.csdn.net/allenwells)等博客平台上。文章中如果有什么问题，欢迎发邮件与我交流，邮件可发至guoxiaoxingse@163.com。

>Realtime application framework (Node.JS server)

Socket.io是一套由JavaScript实现，基于Node.js，支持WebSocket协议用于实时通信、跨平台的开源框架，它实现了实时、双向、基于事件的通讯机制，它解
决了实时通信的问题，并统一了服务端与客户端的编程方式，当启动了Socket以后，服务端与客户端就建立了一条连接，两边可以互相通信。

Socket.io支持的协议：

```
- Webocket
- Adobe® Flash Socket
- AJAX long polling
- AJAX multipart streaming
- Forever Iframe
- JSONP Polling
```
Socket.io可以根据浏览器对通讯机制的支持情况自动地选择最佳的方式来实现网络实时应用。

Socket.io的功能模块：

```
- session.souket.io：http session中间件
- socket.io-cookie：cookie解析中间件
- session-web-sockets：以安全的方式传递session
- socket-logger：JSON格式的记录日志工具
- websocket.MQ：可靠的消息队列
- socket.io-mongo：使用MongoDB的适配器
- socket.io-redis：Redis的适配器
- socket.io-parser：服务端与客户端通讯的默认协议实现模块
```

另外，Socket.io支持avaScript、PHP、Swift、Java、C++等多语言的实现。


public Emitter on(String event, Listener fn)

用来监听一个emit发射的事件，参数含义：

```
String event：事件类型
Listener fn：监听器
```

public Emitter emit(String event, Object... args)

