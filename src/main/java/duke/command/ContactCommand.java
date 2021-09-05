package duke.command;

import duke.data.Storage;
import duke.data.InformationList;
import duke.data.Ui;
import duke.information.Contact;

/**
 * Command that adds a new Contact to InformationList when executed.
 */
public class ContactCommand extends Command {
    /** Contact to be added to InformationList. */
    private Contact contact;

    /**
     * Constructs ContactCommand class.
     *
     * @param contact Contact to be added to InformationList.
     */
    public ContactCommand(Contact contact) {
        this.contact = contact;
    }

    /**
     * Adds a contact to the InformationList.
     *
     * @param tasks The list of tasks that a user has.
     * @param ui The ui that sends a message to the user once the contact is added.
     * @param storage Saves the updated TaskList to disk.
     * @return The message produced by ui.
     */
    @Override
    public String execute(InformationList tasks, Ui ui, Storage storage) {
        tasks.addContact(contact);
        storage.save(tasks);
        return ui.showAddedInformation();
    }
}