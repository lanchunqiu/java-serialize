package com.lancq.serialize.gson;

import com.google.gson.Gson;

/**
 * @Author lancq
 * @Description
 * @Date 2018/10/30
 **/
public class GsonSerialize {

    static Gson gson = new Gson();

    public static String serialize(Object obj) {
        String json = gson.toJson(obj);
        return json;
    }

    public static Object deserialize(String json, Class<?> clazz) {
        Object obj = gson.fromJson(json, clazz);
        return obj;
    }

}
