class Snake {
    private int length;
    private String direction;
    private List<Integer> position;

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
        // Update position based on direction
    }
}
