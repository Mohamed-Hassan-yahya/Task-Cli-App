
import java.util.ArrayList;
import java.util.List;

public class TaskHome {
    private List<Task>tasks;
    public TaskHome(){
        this.tasks=new ArrayList<>();
    }
    public List<Task> getList(){
        return tasks;
    }
    public void setTasks(List<Task>tasks){
        this.tasks=tasks;
    }
    public void addTask(String description){
        int id=0;
        if(!tasks.isEmpty()){
            id=tasks.getLast().getId()+1;
        }
        else {
            id=1;
        }
        tasks.add(new Task(id,description));
        System.out.println("Task Added Successfully (ID: " +tasks.getLast().getId()+")");
    }
    public void updateTask(int id,String description){
        boolean found=false;
        for(Task task:tasks){
            if(task.getId()==id){
                task.setDescription(description);
                task.setUpdatedAt();
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Task Updated Successfully");
        }
        else{
            System.out.println("Task Not Found");
            return;
        }
    }
    public void deleteTask(int id){
        boolean found=false;
        for(Task task:tasks){
            if(task.getId()==id){
                tasks.remove(task);
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Task deleted Successfully");
        }
        else{
            System.out.println("Task Not Found");
            return;
        }
    }
    public void mark_in_progress(int id){
        boolean found=false;
        for(Task task :tasks){
            if(task.getId()==id) {
                task.setStatus(TaskStatus.IN_PROGRESS);
                task.setUpdatedAt();
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Task status changed Successfully");
        }
        else{
            System.out.println("Task Not Found");
        }
    }
    public void mark_done(int id){
        boolean found=false;
        for(Task task :tasks){
            if(task.getId()==id) {
                task.setStatus(TaskStatus.DONE);
                task.setUpdatedAt();
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Task status changed Successfully");
        }
        else{
            System.out.println("Task Not Found");
        }
    }

    public void ShowListTasks() {
        System.out.println("----------------- Tasks -----------------");
        for (Task task : tasks) {
            System.out.println(task.ShowTask());
        }
        System.out.println("-----------------------------------------");
    }
    public void FilterListTask(TaskStatus status) {
        System.out.println("----------------- "+status+" Tasks -----------------");
        boolean found=false;
        System.out.println("This is the "+status.getStatus()+" Tasks :");
        for (Task task : tasks) {
            if(task.getStatus()==status){
                found=true;
                System.out.println(task.ShowTask());
            }
        }
        if(!found){
            System.out.println(" NO Tasks with this status.");
        }
        System.out.println("----------------------------------------------------");
    }
}
