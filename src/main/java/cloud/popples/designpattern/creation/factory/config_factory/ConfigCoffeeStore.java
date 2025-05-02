package cloud.popples.designpattern.creation.factory.config_factory;

import cloud.popples.designpattern.creation.factory.coffee.Coffee;

/**
 * @description: 基于configfactory的咖啡店
 * @author: Mr.Han
 * @create: 2025-05-02 21:20
 */

public class ConfigCoffeeStore {

    public Coffee createCoffee(String key) {
        return ConfigFactory.createCoffee(key);
    }

}
