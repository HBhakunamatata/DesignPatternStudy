package cloud.popples.designpattern.structure.combination;

/**
 * @description: 菜单项类
 * @author: Mr.Han
 * @create: 2025-05-05 19:26
 */

public class MenuItem extends MenuComponent {

    public MenuItem(String name, int level) {
        super(name, level);
    }

    @Override
    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }
}
