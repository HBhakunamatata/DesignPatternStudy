package cloud.popples.designpattern.creation.singleton.example;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * @description: 单例模式在Java中的实例
 * @author: Mr.Han
 * @create: 2025-05-01 21:32
 */

public class Example {

    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process process = runtime.exec("ifconfig");

        byte[] buffer = new byte[1024 * 1024 * 100];
        try (InputStream in = process.getInputStream();) {
            int len = in.read(buffer);
            String result = new String(buffer, 0, len, StandardCharsets.UTF_8);
            System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
