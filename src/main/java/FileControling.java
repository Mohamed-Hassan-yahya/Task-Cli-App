import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileControling {
    private final Path FILE_PATH = Path.of("json//test");
    public FileControling() throws IOException {

    }
    ObjectMapper objectMapper = new ObjectMapper();
    public void saveTasks(TaskHome taskHome) throws IOException {
        objectMapper.writeValue(new File("json//test"), taskHome.getList());
    }
    public void loadTasks(TaskHome taskHome) throws IOException {
        if(!Files.exists(FILE_PATH)){
            System.out.println("File Does Not Exist");
            taskHome.setTasks(new ArrayList<>());
            return;
        }
        else if (Files.size(FILE_PATH) == 0 || Files.readString(FILE_PATH).trim().equals("[]")) {
            taskHome.setTasks(new ArrayList<>());
            return;
        }
        try {
            List<Task> tasksFromFile = objectMapper.readValue(new File(String.valueOf(FILE_PATH)), new TypeReference<List<Task>>() {});
            taskHome.setTasks(tasksFromFile);
        } catch (IOException e) {
            System.err.println("Error reading JSON file: " + e.getMessage());
            taskHome.setTasks(new ArrayList<>()); // Initialize an empty list if there's an error
        }
    }
}
