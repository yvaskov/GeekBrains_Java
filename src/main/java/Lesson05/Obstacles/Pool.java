package Lesson05.Obstacles;

import Lesson05.Interfaces.Flyable;
import Lesson05.Interfaces.Swimmable;
import Lesson05.Obstacle;
import Lesson05.Participant;

public class Pool extends Obstacle {

    public Pool(int size) {
        super(size);
    }

    @Override
    public boolean canCross(Participant p) {
        if (p instanceof Flyable) {
            System.out.printf("%s перелетел бассейн длиной %d%n", p.getName(), getSize());
            return ((Flyable) p).fly();
        }
        if (p instanceof Swimmable) {
            if (((Swimmable) p).swim(getSize())) {
                System.out.printf("%s переплыл бассейн длиной %d%n", p.getName(), getSize());
                return true;
            }
        }
        System.out.printf("%s не переплыл бассейн длиной %d%n", p.getName(), getSize());
        return false;
    }
}
