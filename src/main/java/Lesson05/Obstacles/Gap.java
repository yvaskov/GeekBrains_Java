package Lesson05.Obstacles;

import Lesson05.Interfaces.Flyable;
import Lesson05.Obstacle;
import Lesson05.Participant;

public class Gap extends Obstacle {

    public Gap() {
    }

    @Override
    public boolean canCross(Participant p) {
        if (p instanceof Flyable) {
            System.out.printf("%s перелетел пропасть%n", p.getName());
            return ((Flyable) p).fly();
        }
        System.out.printf("%s не преодолел пропасть%n", p.getName());
        return false;
    }
}
