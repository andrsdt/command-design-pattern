package command.receiver.commandobjects;

public interface CommandBase {
    void execute();

    void undo();
}
