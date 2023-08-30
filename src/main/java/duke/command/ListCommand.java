package duke.command;
import duke.tasklist.*;
import duke.tasks.*;
import duke.exception.*;

import duke.command.Command;

/**
 * Represents the actions needed if the user inputs a list command.
 */
public class ListCommand extends Command {


    /**
     * Constructor for the list command.
     *
     * @param taskList TaskList object being used to maintain the list of tasks in the chatbot.
     */
    public ListCommand(TaskList taskList) {
        super(taskList);
    }

    /**
     * Method to be executed when this command is called.
     * Prints out all tasks in the tasklist in the specified format.
     */
    public void execute() {
        taskList.list();
    }
}