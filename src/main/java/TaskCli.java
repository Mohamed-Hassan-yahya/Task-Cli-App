import java.io.IOException;

public class TaskCli {

    public TaskCli(){
    }
    public void CLI(String []args) throws IOException {
        TaskHome taskHome=new TaskHome();
        FileControling fileControling=new FileControling();
        fileControling.loadTasks(taskHome);
        if(args.length<1){
            System.out.println("Name: TaskCLIApp <command> [arguments]");
            return;
        }
        String cmd=args[0];
        if(cmd.equals("add")){
            taskHome.addTask(args[1]);
        }
        else if(cmd.equals("update")){
            taskHome.updateTask(Integer.parseInt(args[1]),args[2]);
        }
        else if(cmd.equals("delete")){
            taskHome.deleteTask(Integer.parseInt(args[1]));
        }
        else if(cmd.equals("mark-in-progress")){
            taskHome.mark_in_progress(Integer.parseInt(args[1]));
        }
        else if(cmd.equals("mark-done")){
            taskHome.mark_done(Integer.parseInt(args[1]));
        }
        else if(cmd.equals("list") && args.length<2){
            taskHome.ShowListTasks();
        }
        else if(cmd.equals("list")){
            TaskStatus taskStatus;
            taskStatus=TaskStatus.valueOf(args[1].toUpperCase().replace('-','_'));
            taskHome.FilterListTask(taskStatus);
        }
        else{
            System.out.println("Invalid Command");
        }
        fileControling.saveTasks(taskHome);
    }

}
