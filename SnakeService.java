import java.util.List;

class SnakeService {
    private Snake snake;
    private Food food;
    private GameBoard gameBoard;
    private ScoreCalculator scoreCalculator;

    public SnakeService(Snake snake, Food food, GameBoard gameBoard, ScoreCalculator scoreCalculator) {
        this.snake = snake;
        this.food = food;
        this.gameBoard = gameBoard;
        this.scoreCalculator = scoreCalculator;
    }

    // Function to handle snake movement logic
    public void handleSnakeMovement(String direction) {
        snake.updateDirection(direction);
        snake.updatePosition();
        gameBoard.updateGameBoard();
        gameBoard.checkCollisions();
    }

    // Function to generate food items
    public void generateFoodItems() {
        food.initializeFood();
    }

    // Function to implement collision detection
    public void checkCollisions() {
        gameBoard.checkCollisions();
    }

    // Function to calculate and update the player's score
    public void updateScore() {
        scoreCalculator.increaseScore();
    }
}
