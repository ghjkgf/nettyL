package com.example.nettyl.nio;

import java.nio.IntBuffer;

/**
 * @author zsl
 * @date 2023/3/21
 * @apiNote
 */
public class Basic {
    public static void main(String[] args) {
        IntBuffer buffer = IntBuffer.allocate(10);
        for (int i = 0; i < 5; i++) {
            buffer.put(i*i);
        }
        buffer.flip();
        // while(buffer.hasRemaining()){
        //     System.out.println(buffer.get());
        // }
        for (int i = 0; i < 3; i++) {
            System.out.println(buffer.get());
        }
        buffer.flip();
        for (int i = 0; i < 3; i++) {
            buffer.put(i);
        }
        System.out.println("$$$$$");
        while(buffer.hasRemaining()){
            System.out.println(buffer.get());
        }
    }
}
