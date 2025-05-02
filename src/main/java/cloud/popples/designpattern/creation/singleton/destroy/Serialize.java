package cloud.popples.designpattern.creation.singleton.destroy;

import cloud.popples.designpattern.creation.singleton.demo03.LazySingleton;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @description: 通过序列化破坏单例
 * @author: Mr.Han
 * @create: 2025-05-01 17:57
 */

public class Serialize {

    private final static String filePath = "/Users/hanbo/test/a.txt";

    public static void main(String[] args) throws Exception {
        LazySingleton before = LazySingleton.getInstance();
        writeObject2File(filePath, before);
        LazySingleton after1 = (LazySingleton) readObjectFromFile(filePath);
        LazySingleton after2 = (LazySingleton) readObjectFromFile(filePath);
        System.out.println(after1 == after2);
    }

    private static void writeObject2File(String filePath, Object obj) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.close();
    }

    private static Object readObjectFromFile(String filePath) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        return objectInputStream.readObject();
    }

}
