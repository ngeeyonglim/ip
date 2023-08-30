package duke.command;
import duke.tasklist.*;
import duke.tasks.*;
import duke.exception.*;
/**
 * Represents a command given by the user. Parent class with abstract execute() method.
 */
public abstract class Command {

    TaskList taskList;

    public boolean isExitCommand = false;

    /**
     * Constructor for command objects.
     *
     * @param taskList TaskList object being used to maintain the list of tasks in the chatbot.
     */
    public Command(TaskList taskList) {
        this.taskList = taskList;
    }

    /**
     * Abstract method to be implemented for all commands.
     * To be run when the command is entered by the user.
     */
    public abstract void execute();

    /**
     * Returns whether the command entered by the user is an Exit command.
     * @return true if it is an exit command, false otherwise
     */
    public boolean isExit() {
        return isExitCommand;
    }


}