package Lesson05.Participants;

import Lesson05.Interfaces.Jumpable;
import Lesson05.Interfaces.Runnable;
import Lesson05.Obstacle;
import Lesson05.Participant;

public class Cat extends Participant implements Runnable, Jumpable {

    public Cat(String name, int maxRunLength, int maxJumpHeight) {
        super(name, maxRunLength, maxJumpHeight, 0);
    }

    @Override
    public boolean jump(int height) {
        return (getMaxJumpHeight() >= height);
    }

    @Override
    public boolean run(int length) {
        return (getMaxRunLength() >= length);
    }
}
