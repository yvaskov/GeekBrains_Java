package Lesson05.Participants;

import Lesson05.Interfaces.Swimmable;
import Lesson05.Obstacle;
import Lesson05.Participant;

public class Fish extends Participant implements Swimmable {

    public Fish(String name, int maxSwimLength) {
        super(name, 0, 0, maxSwimLength);
    }

    @Override
    public boolean swim(int length) {
        return (getMaxSwimLength() >= length);
    }
}
