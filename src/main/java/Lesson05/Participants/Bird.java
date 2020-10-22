package Lesson05.Participants;

import Lesson05.Interfaces.Flyable;
import Lesson05.Participant;

public class Bird extends Participant implements Flyable {

    public Bird(String name) {
        super(name, 0, 0, 0);
    }

    @Override
    public boolean fly() {
        return true;
    }
}
