package cloud.popples.designpattern.behavior.memento;

import lombok.Data;

/**
 * @description: 骑士状态类
 * @author: Mr.Han
 * @create: 2025-05-08 18:11
 */

@Data
public class KnightStatus {

    private int atk;
    private int def;
    private int hp;

    public KnightStatus(int atk, int def, int hp) {
        this.atk = atk;
        this.def = def;
        this.hp = hp;
    }

    public Memento createMemento() {
        return new KnightMemento(atk, def, hp);
    }

    public void restoreMemento(Memento memento) {
        if (memento instanceof KnightMemento) {
            KnightMemento knightMemento = (KnightMemento) memento;
            atk = knightMemento.getAtk();
            def = knightMemento.getDef();
            hp = knightMemento.getHp();
        } else {
            throw new IllegalArgumentException("memento is not a KnightMemento");
        }
    }

    public void die() {
        setHp(0);
    }


    /**
     * @description: 骑士状态备忘录
     * @author: Mr.Han
     * @create: 2025-05-08 17:57
     */
    @Data
    private class KnightMemento implements Memento {

        private int atk;
        private int def;
        private int hp;

        private KnightMemento(int atk, int def, int hp) {
            this.atk = atk;
            this.def = def;
            this.hp = hp;
        }

    }

}



