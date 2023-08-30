/**
 * Represents the actions needed if the user inputs a todo task.
 */
public class ToDoCommand extends Command {

    String inp;

    /**
     * Constructor for the todo command.
     *
     * @param taskList TaskList object being used to maintain the list of tasks in the chatbot.
     * @param inp Line of input from the CLI
     */
    public ToDoCommand(TaskList taskList, String inp) {
        super(taskList);
        this.inp = inp;
    }

    /**
     * Method to be executed when this command is called.
     * Initializes a new ToDo object and adds it to the taskList.
     */
    @Override
    public void execute() {
        try {
            String[] type_description = inp.split(" ", 2);
            String type = type_description[0];
            String description = type_description[1];
            Task newTask = new ToDo(description);
            taskList.add(newTask);
            System.out.println("Okay! Task added \n" + newTask);
        } catch (Exception e) {
            throw new DukeException("Please give a valid description for a ToDo task!");
        }
    }
}
