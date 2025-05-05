package cloud.popples.designpattern.structure.combination;

import java.util.List;

/**
 * @description: 菜单抽象类
 * @author: Mr.Han
 * @create: 2025-05-05 15:50
 */

public abstract class MenuComponent {

    protected String name;
    protected int level;

    protected MenuComponent(String name, int level) {
        this.name = name;
        this.level = level;
    }

    protected String getName() {
        return name;
    }

    protected int getLevel() {
        return level;
    }

    abstract public void print();

    public void add(MenuComponent component) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void remove(MenuComponent component) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
