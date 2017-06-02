# Retrofit基本使用

Retrofit 是一个Square开发的类型安全的REST安卓客户端请求库。这个库为网络认证、API请求以及用OkHttp发送网络请求提供了强大的框架。

> A type-safe HTTP client for Android and Java

项目地址: https://github.com/square/retrofit

官方例子: http://square.github.io/retrofit/



添加依赖

```
dependencies {
    // Retrofit & OkHttp
    compile 'com.squareup.retrofit2:retrofit:2.1.0'
    compile 'com.squareup.retrofit2:converter-gson:2.0.0'
}
```


`com.squareup.retrofit2:retrofit:2.0.0`底层已经使用okhttp来做网络请求,所以无需再配置okhttp。

`com.squareup.retrofit2:converter-gson:2.0.0`是用来做json反序列化的,我们同样也可以配置其他解析工具,如下所示:

- Gson: com.squareup.retrofit2:converter-gson
- Jackson: com.squareup.retrofit2:converter-jackson
- Moshi: com.squareup.retrofit2:converter-moshi
- Protobuf: com.squareup.retrofit2:converter-protobuf
- Wire: com.squareup.retrofit2:converter-wire
- Simple XML: com.squareup.retrofit2:converter-simplexml
- Scalars (primitives, boxed, and String): com.squareup.retrofit2:converter-scalars


创建Service

```java
public class ServiceGenerator {

    public static final String API_BASE_URL = "http://your.api-base.url";

    private static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

    private static Retrofit.Builder builder =
            new Retrofit.Builder()
                    .baseUrl(API_BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create());

    public static <S> S createService(Class<S> serviceClass) {
        Retrofit retrofit = builder.client(httpClient.build()).build();
        return retrofit.create(serviceClass);
    }
}
```


