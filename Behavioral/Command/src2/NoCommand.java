public class NoCommand implements Command {

    @Override
    public void execute() {
        System.out.println("nothing to do"); // Будет красиво кидать исключение
    }

    @Override
    public void undo() {
        System.out.println("nothing to undo"); // Будет красиво кидать исключение
    }
}
