package Lesson05.Participants;

import Lesson05.Interfaces.Jumpable;
import Lesson05.Interfaces.Runnable;
import Lesson05.Interfaces.Swimmable;
import Lesson05.Obstacle;
import Lesson05.Participant;

public class Human extends Participant implements Runnable, Jumpable, Swimmable {

    public Human(String name, int maxRunLength, int maxJumpHeight, int maxSwimLength) {
        super(name, maxRunLength, maxJumpHeight, maxSwimLength);
    }

    @Override
    public boolean jump(int height) {
        return (getMaxJumpHeight() >= height);
    }

    @Override
    public boolean run(int length) {
        return (getMaxRunLength() >= length);
    }

    @Override
    public boolean swim(int length) {
        return (getMaxSwimLength() >= length);
    }
}
