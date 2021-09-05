package duke.command;

import duke.data.Storage;
import duke.data.TaskList;
import duke.data.Ui;
import duke.information.Task;

/**
 * Command that adds a new Task to Tasklist when executed.
 */
public class AddCommand extends Command {
    /** Task to be added to Tasklist. */
    private Task task;

    /**
     * Constructs AddCommand class.
     *
     * @param task Task to be added to Tasklist.
     */
    public AddCommand(Task task) {
        this.task = task;
    }

    /**
     * Adds a task to the Tasklist.
     *
     * @param tasks The list of tasks that a user has.
     * @param ui The ui that sends a message to the user once the task is added.
     * @param storage Saves the updated TaskList to disk.
     * @return The message produced by ui.
     */
    @Override
    public String execute(TaskList tasks, Ui ui, Storage storage) {
        tasks.addTask(task);
        storage.save(tasks);
        return ui.showAddedInformation();
    }
}
