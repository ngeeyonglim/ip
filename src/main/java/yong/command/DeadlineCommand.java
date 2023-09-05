package yong.command;

import yong.tasklist.TaskList;

import yong.tasks.Task;
import yong.tasks.Deadline;

import yong.exception.DukeException;


/**
 * Represents the actions needed if the user inputs a deadline task
 */
public class DeadlineCommand extends Command {

    private String inp;

    /**
     * Constructor for the deadline command.
     *
     * @param taskList TaskList object being used to maintain the list of tasks in the chatbot.
     * @param inp Line of input from the CLI
     */
    public DeadlineCommand(TaskList taskList, String inp) {
        super(taskList);
        this.inp = inp;
    }

    /**
     * Method to be executed when this command is called.
     * Initializes a new Deadline object and adds it to the taskList.
     */
    @Override
    public String execute() {
        try {
            String[] parts = inp.split("/", 2);
            String[] typeDescription = parts[0].split(" ", 2);
            String type = typeDescription[0];
            String description = typeDescription[1];

            Task newTask = new Deadline(description, parts[1]);

            taskList.add(newTask);

            outputString = "Okay! Task added \n" + newTask;

            return outputString;
        } catch (Exception e) {
            throw new DukeException("Please give a valid description for a Deadline task!");
        }
    }
}