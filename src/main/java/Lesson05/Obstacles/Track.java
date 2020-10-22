package Lesson05.Obstacles;

import Lesson05.Interfaces.Flyable;
import Lesson05.Interfaces.Runnable;
import Lesson05.Obstacle;
import Lesson05.Participant;

public class Track extends Obstacle {

    public Track(int size) {
        super(size);
    }

    @Override
    public boolean canCross(Participant p) {
        if (p instanceof Flyable) {
            System.out.printf("%s пролетел дорожку длиной %d%n", p.getName(), getSize());
            return ((Flyable) p).fly();
        }
        if (p instanceof Runnable) {
            if (((Runnable) p).run(getSize())){
                System.out.printf("%s пробежал дорожку длиной %d%n", p.getName(), getSize());
                return true;
            }
        }
        System.out.printf("%s не пробежал дорожку длиной %d%n", p.getName(), getSize());
        return false;
    }
}
