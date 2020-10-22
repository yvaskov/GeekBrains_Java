package Lesson04;

public class ObstacleCourse {
    public static void main(String[] args) {
        Runner[] runners = {new Human("Человек", 100, 1.5),
                new Cat("Кот", 50, 1),
                new Robot("Робот", 500, 2.5)};
        Object[] obstacles = {new Track(50), new Wall(1),
                new Track(100), new Wall(1.5),
                new Track(500), new Wall(2.5)};

        for (Runner runner : runners) {
            boolean failure = false;
            for (Object obstacle : obstacles) {
                if (obstacle instanceof Wall) {
                    if (!runner.Jump(((Wall) obstacle).getWallHeight())) {
                        failure = true;
                        break;
                    }
                }
                if (obstacle instanceof Track) {
                    if (!runner.Run(((Track) obstacle).getTrackLength())) {
                        failure = true;
                        break;
                    }
                }
            }
            if (!failure) {
                System.out.println(runner.getName() + " преодолел полосу препятствий");
            }
        }
    }
}
