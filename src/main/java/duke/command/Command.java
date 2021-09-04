package duke.command;

import duke.data.Storage;
import duke.data.TaskList;
import duke.data.Ui;

/**
 * An abstract command that contains an execute and isExit method.
 */
public abstract class Command {

    /**
     * Executes the command and returns a string to be displayed to the user.
     *
     * @param tasks The user's tasks.
     * @param ui The ui that generates the string depending on the type of command.
     * @param storage The class that reads and writes to the user's txt file.
     * @return A response that is displayed to the user.
     */
    public abstract String execute(TaskList tasks, Ui ui, Storage storage);
}
