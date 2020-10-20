package Lesson04;

public class Runner {
    private String name;
    private final int maxRunDistance;
    private final double maxJumpHeight;

    public Runner(String name, int maxRunDistance, double maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    public String getName() {
        return name;
    }

    public int getMaxRunDistance() {
        return maxRunDistance;
    }

    public double getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public boolean Run(int distance) {
        if (getMaxRunDistance() < distance) {
            System.out.println(getName() + " устал и не добежал");
            return false;
        }
        System.out.println(getName() + " успешно пробежал");
        return true;
    }

    public boolean Jump(double height) {
        if (getMaxJumpHeight() < height) {
            System.out.println(getName() + " не допрыгнул");
            return false;
        }
        System.out.println(getName() + " успешно перепрыгнул");
        return true;
    }
}
