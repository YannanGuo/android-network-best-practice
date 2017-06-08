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

在我们的网络中存在着各种各样的协议，例如：HTTP、TCP等，这些协议分布在不同的层中，不同层之间彼此透明，这个分层模型
实现了应用协议与网络硬件物理特性与网络连接拓扑结构的解耦和。

主机网络层：主机网络层定义了一个特定的网络接口如何通过物理连接向本地网络或世界的其他地方发送IP数据报。

网际层：网际层定义了数据报的格式、寻址机制以及保证不同类型的主机网络层可以对话。它会去完成Wifi、Ethernet等协议的
转换。

传输层：传输层将数据报添加一个附加头部，保证数据报有序、完整的发送与接收。它包含一个传输控制协议TCP与用户数据报协议
UDP。

应用层：应用层向用户传送数据，通过各种协议，例如：HTTP、SMTP等将传输的数据转换为用户可以浏览的格式，例如：文字、图
片等。

IP地址：IPv4网络中，每台计算机都由一个4字节的数字来标识，例如：199.1.32.90，这就是IP地址。

域名：IP地址并不方便记忆，因此开发了域名，例如：www.github.com，用于将域名解析为IP地址的系统称为域名解析系统。

端口：计算机要同时处理很多事情，例如电子邮件需要与HTTP请求分开，因此每台IP地址的计算机都有65535个端口。其中1~1023
保留给了已知服务，例如：FTP-21、SSH-22、SMTP-25、HTTP-80、IMAP-143。


URL：Uniform Resource Locator，统一资源定位器，标识网络上资源的位置。


IETF（Internet Engineering Tasl Forece）：民间团体，向所有感兴趣参与的团队开发，它ed标准是"多数人的意见与正在运行代码"，它更倾向于跟踪而不是引导
实现，IETF的协议包括：TCP/IP、MIME与SMTP。

RFC(request for comments)：https://www.ietf.org/rfc.html

W#C：厂商组织，由缴纳会费的成员公司控制，它倾向于在实现之前先定义标准。W#C的协议包括：HTTP、HTML与XML。