
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private int id;
    private String description;
    private TaskStatus status;
    private String createdAt;
    private String updatedAt;
    public static final DateTimeFormatter time = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Task(){
    }
    public Task(int id, String description){
        this.id=id;
        this.description=description;
        this.status=TaskStatus.TODO;
        this.createdAt=LocalDateTime.now().format(time);
        this.updatedAt=createdAt;
    }
    public int getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public TaskStatus getStatus(){
        return status;
    }
    public String getCreatedAt(){
        return createdAt;
    }
    public void setCreatedAt(){
        this.createdAt=createdAt;
    }
    public String getUpdatedAt(){
        return updatedAt;
    }
    public void setUpdatedAt(){
        this.updatedAt= LocalDateTime.now().format(time);
    }
    public void setStatus(TaskStatus status){
        this.status=status;
    }
    public String ShowTask(){
        return String.format("""
                {
                "id":           %d",
                "description":   %s",
                "status":        %s",
                "createdAt":     %s",
                "updated":       %s",
                }
                """, id, description, status, createdAt, updatedAt);
    }


}
