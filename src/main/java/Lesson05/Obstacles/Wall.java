package Lesson05.Obstacles;

import Lesson05.Interfaces.Flyable;
import Lesson05.Interfaces.Jumpable;
import Lesson05.Obstacle;
import Lesson05.Participant;

public class Wall extends Obstacle {

    public Wall(int size) {
        super(size);
    }

    @Override
    public boolean canCross(Participant p) {
        if (p instanceof Flyable) {
            System.out.printf("%s перелетел стену высотой %d%n", p.getName(), getSize());
            return ((Flyable) p).fly();
        }
        if (p instanceof Jumpable) {
            if (((Jumpable) p).jump(getSize())) {
                System.out.printf("%s перепрыгнул стену высотой %d%n", p.getName(), getSize());
                return true;
            }
        }
        System.out.printf("%s не перепрыгнул стену высотой %d%n", p.getName(), getSize());
        return false;
    }
}
