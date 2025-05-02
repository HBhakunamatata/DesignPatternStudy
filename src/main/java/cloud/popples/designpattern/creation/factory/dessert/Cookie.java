package cloud.popples.designpattern.creation.factory.dessert;

import sun.security.krb5.internal.crypto.Des;

/**
 * @description: 曲奇实现类
 * @author: Mr.Han
 * @create: 2025-05-02 13:40
 */

public class Cookie implements Dessert {

    private final String name;

    public Cookie(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
