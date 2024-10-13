package Assignment3.Memento;

import java.util.*;

public class Caretaker {

    private List<TextMemento> savedStates = new ArrayList<>();

    public void addMemento(TextMemento memento) {
        savedStates.add(memento);
    }


    public TextMemento getMemento(int index) {
        if (index >= 0 && index < savedStates.size()) {
            return savedStates.get(index);
        }
        return null;
    }

}
