package cloud.popples.designpattern.creation.factory.config_factory;

import cloud.popples.designpattern.creation.factory.coffee.Coffee;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @description: 静态工厂模式+配置类
 * @author: Mr.Han
 * @create: 2025-05-02 20:56
 */

public class ConfigFactory {

    private static Map<String, Coffee> beans;

    static {
        InputStream inputStream = ConfigFactory.class.getClassLoader()
            .getResourceAsStream("beans.properties");
        Properties properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        beans = new HashMap<>();
        try {
            for (Object key : properties.keySet()) {
                Class clazz = Class.forName((String) properties.get(key));
                Coffee coffee = (Coffee) clazz.newInstance();
                beans.put((String) key, coffee);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static Coffee createCoffee(String key) {
        return beans.get(key);
    }

}
