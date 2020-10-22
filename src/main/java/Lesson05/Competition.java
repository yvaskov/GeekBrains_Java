package Lesson05;

import Lesson05.Obstacles.Gap;
import Lesson05.Obstacles.Pool;
import Lesson05.Obstacles.Track;
import Lesson05.Obstacles.Wall;
import Lesson05.Participants.Bird;
import Lesson05.Participants.Cat;
import Lesson05.Participants.Fish;
import Lesson05.Participants.Human;

public class Competition {

    public static void main(String[] args) {
        Participant[] pts = {
                new Human("Человек", 100, 2, 100),
                new Cat("Кот", 10, 1),
                new Fish("Карась", 100),
                new Bird("Воробей")};
        Obstacle[] obs = {
                new Pool(100),
                new Track(100),
                new Wall(2),
                new Gap()};
        compete(pts, obs);
    }

    public static void compete(Participant[] pts, Obstacle[] obs) {
        for (Participant p : pts) {
            boolean failure = false;
            for (Obstacle o : obs) {
                if (!o.canCross(p)) {
                    System.out.printf("%s сошел с дистанции%n", p.getName());
                    failure = true;
                    break;
                }
            }
            if (!failure) {
                System.out.printf("%s преодолел все препятствия%n", p.getName());
            }
        }
    }
}
