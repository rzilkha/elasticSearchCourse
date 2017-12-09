import java.util.concurrent.BlockingQueue;

/**
 * Created by Roee Zilkha on 11/19/2017.
 */
public class TaskCronRunner {
    private BlockingQueue<Task> tasks;
    void runTasks() throws InterruptedException {
        Task task = tasks.take();
        task.run();
    }


    public BlockingQueue<Task> getTasks() {
        return tasks;
    }
}
