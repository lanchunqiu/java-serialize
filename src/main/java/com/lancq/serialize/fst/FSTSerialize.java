package com.lancq.serialize.fst;

import org.nustaq.serialization.FSTConfiguration;

import java.io.Serializable;

/**
 * @Author lancq
 * @Description
 * @Date 2018/10/30
 **/
public class FSTSerialize {
    static FSTConfiguration configuration = FSTConfiguration.createDefaultConfiguration();

    public static byte[] serialize(Object obj) {
        return configuration.asByteArray((Serializable) obj);
    }

    public static Object deserialize(byte[] sec) {
        return configuration.asObject(sec);
    }

}
