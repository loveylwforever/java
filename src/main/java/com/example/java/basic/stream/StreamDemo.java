package com.example.java.basic.stream;

import java.io.*;

// Java 流
public class StreamDemo {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入字符，按 q 退出：");
        do {
            // 使用 read 读取输入
            c = (char) bufferedReader.read();
            System.out.print("挨个打印输入的字符：" + c);

            // 使用 write 输出到控制台
            System.out.write('.');
            System.out.write('\n');
        } while (c != 'q');


        // 文件读取
        InputStream i = new FileInputStream("/home/JamieGao/idea-workspace/java/java.iml");
        for (int j = 0; j < i.available(); j++) {
            System.out.print((char) i.read());
        }
    }

}