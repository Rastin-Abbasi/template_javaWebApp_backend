import java.util.Scanner;

class SnakeController {
    private SnakeService snakeService;

    public SnakeController(SnakeService snakeService) {
        this.snakeService = snakeService;
    }

    // Function to control the direction of the snake using arrow keys
    public void defineRequestMappings() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("up")) {
                snakeService.handleSnakeMovement("up");
            } else if (input.equals("down")) {
                snakeService.handleSnakeMovement("down");
            } else if (input.equals("left")) {
                snakeService.handleSnakeMovement("left");
            } else if (input.equals("right")) {
                snakeService.handleSnakeMovement("right");
            }
        }
    }

    // Function to handle actions when the snake eats food
    public void handleFoodEaten() {
        snakeService.handleFoodEaten();
    }
}
