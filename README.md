# Android网络开发最佳⌚️

>本系列文章讨论Retrofit、Okhttp等常见网络库的基本原理与使用技巧以及在实际应用开发中关于网络请求的一些实践。

本系列文章将由浅入深, 从最基本的网络请求原理开始讲起, 到Retrofit等网络库的原理与使用, 再到关于应用网络开发的一些最佳实践。共包括:

网络请求基本原理

网络库的原理与使用

应用网络框架的设计


#Retrofit中文教程

本系列文档旨在分享Retorfit的相关使用方法和技巧，该文档会以一个系列的形式不断更新，项目主页地址:https://github.com/guoxiaoxing/retrofit-plus。

什么是Retrofit？引用官方的描述来说就是：

>A type-safe REST client for Android and Java.

Retrofit本质上来讲是一个使用注解来描述http request/response的框架,其最终调用okhttp完成最终的网络访问,也正因为此,Retrofit的很多配置实际上
是通过设置okhttp完成的。

[Retrofit: Love Working with APIs on Android](https://futurestud.io/blog/retrofit-getting-started-and-android-client#)
