package com.lancq.serialize.kryo;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;

/**
 * @Author lancq
 * @Description
 * @Date 2018/10/30
 **/
public class KryoSerialize {
    static Kryo kryo = new Kryo();

    public static byte[] serialize(Object obj) {
        byte[] buffer = new byte[2048];
        Output output = new Output(buffer);
        kryo.writeClassAndObject(output, obj);
        byte[] bs = output.toBytes();
        output.close();
        return bs;
    }

    public static Object deserialize(byte[] src) {
        Input input = new Input(src);
        Object obj = kryo.readClassAndObject(input);
        input.close();
        return obj;
    }

}
