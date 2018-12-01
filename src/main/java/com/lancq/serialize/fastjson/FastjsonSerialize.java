package com.lancq.serialize.fastjson;

import com.alibaba.fastjson.JSON;
/**
 * @Author lancq
 * @Description
 * @Date 2018/10/30
 **/
public class FastjsonSerialize {

    public static String serialize(Object obj) {
        String json = JSON.toJSONString(obj);
        return json;
    }

    public static Object deserialize(String json, Class<?> clazz) {
        Object obj = JSON.parseObject(json, clazz);
        return obj;
    }

}
