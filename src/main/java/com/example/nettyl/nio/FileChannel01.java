package com.example.nettyl.nio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author zsl
 * @date 2023/3/22
 * @apiNote
 */
public class FileChannel01 {
    public static void main(String[] args) throws Exception {
        String str = "ghjkgf";
        // 这个做了什么工作...
        FileOutputStream fos = new FileOutputStream("d:/a.txt");
        FileChannel fileChannel = fos.getChannel();

        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put(str.getBytes());
        byteBuffer.flip();

        fileChannel.write(byteBuffer); // buffer-->channel
        fos.close();
    }
}
