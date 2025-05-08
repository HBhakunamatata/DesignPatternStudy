package cloud.popples.designpattern.behavior.memento;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @description: 存储状态类
 * @author: Mr.Han
 * @create: 2025-05-08 18:21
 */

public class SaveService {

    private List<Memento> mementos;

    public SaveService() {
        mementos = new ArrayList<>();
    }

    public Optional<Memento> getMemento() {
        Memento result = null;
        if (!mementos.isEmpty()) {
            result = mementos.get(mementos.size() - 1);
        }
        return Optional.ofNullable(result);
    }

    public void setMemento(Memento memento) {
        mementos.add(memento);
    }

}
