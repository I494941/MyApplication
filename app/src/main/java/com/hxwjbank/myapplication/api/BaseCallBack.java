package com.hxwjbank.myapplication.api;

import com.google.gson.internal.$Gson$Types;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import retrofit2.Call;
import retrofit2.Response;


/**
 * Created by wangshuai on 2017/3/21.
 */
public abstract class BaseCallBack<T> {
    Type mType;
    static Type getSuperclassTypeParameter(Class<?> subclass) {
        Type superclass = subclass.getGenericSuperclass();
        if (superclass instanceof Class){
            throw new RuntimeException("Missing type parameter.");
        }

        ParameterizedType parameterizedType = (ParameterizedType) superclass;
        return $Gson$Types.canonicalize(parameterizedType.getActualTypeArguments()[0]);
    }
    public BaseCallBack(){
        mType = getSuperclassTypeParameter(getClass());
    }
    protected abstract void onFailure(Call call, Throwable e);
    protected abstract void onSuccess(Response response, T t);
    protected abstract void onError(Response response, int code, Exception e);
}
