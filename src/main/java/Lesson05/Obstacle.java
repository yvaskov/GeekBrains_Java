package Lesson05;

public abstract class Obstacle {

    private final int size;

    public Obstacle(int size) {
        this.size = size;
    }

    public Obstacle() {
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean canCross(Participant p) {
        return false;
    }
}
