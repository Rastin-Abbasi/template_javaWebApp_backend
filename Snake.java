import java.util.ArrayList;
import java.util.List;

class Snake {
    private int length;
    private String direction;
    private List<Integer> position;

    public Snake() {
        this.position = new ArrayList<>();
    }

    // Function to initialize the snake
    public void initializeSnake() {
        this.length = 1;
        this.direction = "right";
        this.position.add(0); // Initial x-coordinate
        this.position.add(0); // Initial y-coordinate
    }

    // Function to update the snake's direction
    public void updateDirection(String newDirection) {
        this.direction = newDirection;
    }

    // Function to update the snake's position
    public void updatePosition() {
        if (this.direction.equals("up")) {
            this.position.set(1, this.position.get(1) + 1);
        } else if (this.direction.equals("down")) {
            this.position.set(1, this.position.get(1) - 1);
        } else if (this.direction.equals("left")) {
            this.position.set(0, this.position.get(0) - 1);
        } else if (this.direction.equals("right")) {
            this.position.set(0, this.position.get(0) + 1);
        }
    }
}
