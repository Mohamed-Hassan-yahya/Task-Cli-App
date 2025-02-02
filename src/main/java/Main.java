
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TaskCli taskCli=new TaskCli();
        taskCli.CLI(args);
    }
}

//javac -cp "lib/*" src/main/java/*.java -----> To Compile
//./task-cli command To Run
