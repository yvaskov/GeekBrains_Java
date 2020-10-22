package Lesson05;

public abstract class Participant {

    private String name;
    private final int maxRunLength;
    private final int maxJumpHeight;
    private final int maxSwimLength;

    public Participant(String name, int maxRunLength, int maxJumpHeight, int maxSwimLength) {
        this.name = name;
        this.maxRunLength = maxRunLength;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimLength = maxSwimLength;
    }

    public String getName() {
        return name;
    }

    public int getMaxRunLength() {
        return maxRunLength;
    }

    public int getMaxJumpHeight() {
        return maxJumpHeight;
    }

    public int getMaxSwimLength() {
        return maxSwimLength;
    }
}

