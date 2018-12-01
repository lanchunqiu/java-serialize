package com.lancq.serialize.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @Author lancq
 * @Description
 * @Date 2018/10/30
 **/
public class JacksonSerialize {
    public static String serialize(Object obj) {
        ObjectMapper mapper = new ObjectMapper();
        String json = null;
        try {
            json = mapper.writeValueAsString(obj);
        } catch (Exception e) {
        }
        return json;
    }

    public static Object deserialize(String json, Class<?> clazz) {
        ObjectMapper mapper = new ObjectMapper();
        Object obj = null;
        try {
            obj = mapper.readValue(json, clazz);
        } catch (Exception e) {
        }
        return obj;
    }
}