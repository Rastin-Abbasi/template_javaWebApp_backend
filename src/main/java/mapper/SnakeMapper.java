import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SnakeMapper {
    // Define SQL queries to store and retrieve game data
    
    void saveGameData(GameData gameData);
    
    GameData getGameDataById(int id);
}
