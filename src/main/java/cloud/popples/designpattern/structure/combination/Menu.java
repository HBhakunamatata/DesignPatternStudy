package cloud.popples.designpattern.structure.combination;

import java.util.LinkedList;
import java.util.List;

/**
 * @description: 菜单类
 * @author: Mr.Han
 * @create: 2025-05-05 19:11
 */

public class Menu extends MenuComponent {

    private List<MenuComponent> menuItems;

    public Menu(String name, int level) {
        super(name, level);
        menuItems = new LinkedList<>();
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        for (MenuComponent menuItem : menuItems) {
            menuItem.print();
        }
    }

    @Override
    public void add(MenuComponent component) {
        menuItems.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        menuItems.remove(component);
    }


}
