class GameBoard {
    private int size;
    private Snake snake;
    private Food food;

    // Function to initialize the game board
    public void initializeGameBoard() {
        // Initialize with snake and initial food position
        this.size = 10; // Set the size of the game board
        this.snake = new Snake(); // Create a new snake object
        this.food = new Food(); // Create a new food object
    }

    // Function to update the game board
    public void updateGameBoard() {
        // Update based on snake movement and food consumption
        snake.move(); // Move the snake
        if (snake.isEatingFood(food)) {
            snake.grow(); // Make the snake grow if it eats the food
            food.changePosition(); // Change the position of the food
        }
    }

    // Function to check for collisions
    public void checkCollisions() {
        // Check for collisions between snake, walls, and food items
        if (snake.collidesWithWall(size)) {
            // Handle collision with walls
            snake.reset(); // Reset the snake position
        }
        if (snake.collidesWithItself()) {
            // Handle collision with itself
            snake.reset(); // Reset the snake position
        }
    }
}
