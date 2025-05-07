package cloud.popples.designpattern.structure.combination;

import org.junit.jupiter.api.Test;

/**
 * @description: 组合模式测试类
 * @author: Mr.Han
 * @create: 2025-05-05 19:29
 */

public class CombinationTest {

    @Test
    void testCombination() {
        MenuComponent menu1 = new Menu("菜单管理", 2);
        menu1.add(new MenuItem("页面访问", 3));
        menu1.add(new MenuItem("展开菜单", 3));
        menu1.add(new MenuItem("编辑菜单", 3));

        MenuComponent menu2 = new Menu("权限管理", 2);
        menu2.add(new MenuItem("页面访问", 3));
        menu2.add(new MenuItem("展开菜单", 3));
        menu2.add(new MenuItem("编辑菜单", 3));

        MenuComponent menu3 = new Menu("角色管理", 2);
        menu3.add(new MenuItem("页面访问", 3));
        menu3.add(new MenuItem("新增角色", 3));
        menu3.add(new MenuItem("修改角色", 3));

        MenuComponent menu = new Menu("系统管理", 1);
        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);

        menu.print();
    }

}
