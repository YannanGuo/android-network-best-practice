# Mina框架篇：Android平台的长连接实现

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

长连接使我们在应用开发中经常遇到的一种场景，例如我们的推送就是基于长连接实现的，那么长连接是如何实现的呢，一般说来
，有以下3种方式：

1 使用第三方长连接服务，这种方式简单方便，但是定制性差。
2 使用NIO等方案实现长连接服务，这种方式定制化程度高，但是你需要自己实现心跳包，容错机制等，对技术要求比较高，时间成本也比较大。
3 使用MINA等第第三方框架实现长连接，这个是目前普遍采用的方式，MINA框架本质上就是一个NIO的框架，该框架实现了一整套的长连接机制
，包括长连接的建立、心跳包的实现与异常情况的容错等。

