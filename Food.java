import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Food {
    private int positionX;
    private int positionY;

    // Function to initialize food items
    public void initializeFood() {
        Random random = new Random();
        this.positionX = random.nextInt(10); // Random x-coordinate
        this.positionY = random.nextInt(10); // Random y-coordinate
    }

    // Function to retrieve the position of the food item
    public List<Integer> getFoodPosition() {
        List<Integer> foodPosition = new ArrayList<>();
        foodPosition.add(this.positionX);
        foodPosition.add(this.positionY);
        return foodPosition;
    }
}