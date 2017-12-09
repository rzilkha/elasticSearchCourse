/**
 * Created by Roee Zilkha on 11/19/2017.
 */
public class App {
    public static void main(String[] args) {
        TaskCronRunner taskCronRunner = new TaskCronRunner();
        BasicTask basicTask = new BasicTask();

        taskCronRunner.getTasks().add(basicTask);
    }
}
