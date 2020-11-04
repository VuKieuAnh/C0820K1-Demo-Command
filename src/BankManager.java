public class BankManager {
    private Command commandOpen;
    private Command commandClose;

    public BankManager(Command commandOpen, Command commandClose) {
        this.commandOpen = commandOpen;
        this.commandClose = commandClose;
    }

    public void clickOpenAccount(){
        commandOpen.execute();
    }

    public void clickCloseAccount(){
        commandClose.execute();
    }
}
