import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SnakeController {
    
    private final SnakeService snakeService;
    
    public SnakeController(SnakeService snakeService) {
        this.snakeService = snakeService;
    }
    
    @PostMapping("/moveSnake")
    public void moveSnake(@RequestBody String direction) {
        snakeService.moveSnake(direction);
    }
    
    @PostMapping("/collectFood")
    public void collectFood() {
        snakeService.collectFood();
    }
}
