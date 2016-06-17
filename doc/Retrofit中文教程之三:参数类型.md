网络请求需要传入各种参数, Retrofit通过注解的形式使得Http请求的参数更加直接, 而且类型安全。


#一 Path

说明:Path相当于Url路径的动态拼接。


#一 Query & QueryMap

GET:https://github.com/guoxiaoxing/repositories?key=android
说明:单个或少数参数(key-value)

```
public interface GetService{
    @GET("https://github.com/guoxiaoxing/repositories")
    Call<ResponseBody> getRepositories(@Query("key") int key);
}
```

GET:https://github.com/guoxiaoxing/repositories?key1=android1&key2=android2...
说明:大量参数(key-value)

```
public interface GetService{
    @GET("https://github.com/guoxiaoxing/repositories")
    Call<ResponseBody> getRepositories(@QueryMap Map<String, String> keyMap);
}
```

#二 Field & FieldMap

POST:https://github.com/guoxiaoxing/repositories
说明:单个或少数参数(key-value)

```
public interface PostService{
    @FormUrlEncoded
    @POST("https://github.com/guoxiaoxing/repositories")
    Call<ResponseBody> getRepositories(@Field("key") int key);
}
```

POST:https://github.com/guoxiaoxing/repositories
说明:大量参数(key-value)

```
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