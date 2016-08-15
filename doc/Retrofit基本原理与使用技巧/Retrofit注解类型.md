网络请求需要传入各种参数, Retrofit通过注解的形式使得Http请求的参数更加直接, 而且类型安全。


#一 Path

说明:Path相当于Url路径的动态拼接。

```java
public interface GetService{
    @GET("https://github.com/guoxiaoxing/repositories")
    Call<ResponseBody> getRepositories(@Query("key") int key);
}
```

#一 Query & QueryMap

@Query & @QueryMap

>添加GET请求参数, 添加的参数缀于URL上。

GET:https://github.com/guoxiaoxing/repositories?key=android
说明:单个或少数参数(key-value)

```java
public interface GetService{
    @GET("https://github.com/guoxiaoxing/repositories")
    Call<ResponseBody> getRepositories(@Query("key") int key);
}
```

GET:https://github.com/guoxiaoxing/repositories?key1=android1&key2=android2...
说明:大量参数(key-value)

```java
public interface GetService{
    @GET("https://github.com/guoxiaoxing/repositories")
    Call<ResponseBody> getRepositories(@QueryMap Map<String, String> keyMap);
}
```

#二 Field & FieldMap

@Field & @FieldMap

>添加表单请求参数, 添加的参数放于请求体中。

POST:https://github.com/guoxiaoxing/repositories

说明:单个或少数参数(key-value)

```java
public interface PostService{
    @FormUrlEncoded
    @POST("https://github.com/guoxiaoxing/repositories")
    Call<ResponseBody> getRepositories(@Field("key") int key);
}
```

POST:https://github.com/guoxiaoxing/repositories

说明:大量参数(key-value)

```java
public interface PostService{
    @FormUrlEncoded
    @POST("https://github.com/guoxiaoxing/repositories")
    Call<ResponseBody> getRepositories(@FieldMap Map<String, String> keyMap);
}
```

#三 Part & PartMap
 
```
public interface FileUploadService{
    @GET("https://github.com/guoxiaoxing/repositories")
    Call<ResponseBody> uploadFile();
}
```


Header & Headers

@Header & @Headers

>Headers用于添加请求头, Header用于添加不固定值的请求头。

FormUrlEncoded

>表示请求题是一个form表单, 比如登录网页的请求方式是: Content-Type:application/x-www-form-urlencode

提交一个表单格式的请求（Content-Type:application/x-www-form-urlencoded）@Field("username")表示将后
面的String name中name的取值作为 username 的值

```java
 @POST("/form")
 @FormUrlEncoded
 Call<ResponseBody> testFormUrlEncoded1(@Field("username") String name, @Field("age") int age);
```


提交一个表单格式的请求（Content-Type:application/x-www-form-urlencoded), Map的key作为表单的键

```java
@POST("/form")
@FormUrlEncoded
Call<ResponseBody> testFormUrlEncoded2(@FieldMap Map<String, Object> map);
```

Multipart

@Multipart

>表示请求体是一个支持文件上传的from表单, 比如支持文件上传的网页的请求方式是: Content-Type:multipart/form-data

后面支持三种类型

```java
@POST("/form")
@Multipart
Call<ResponseBody> testFileUpload1(@Part("name") RequestBody name, @Part("age") RequestBody age, @Part MultipartBody.Part file);
```

Streaming

@Streaming

>表示响应体的数据是用流的形式返回的, 该注解通常在返回的数据量比较大的时候是用, 因为没有是用该注解时, 返回的数据会默认潜入内存中,
数据也从内存中读取。