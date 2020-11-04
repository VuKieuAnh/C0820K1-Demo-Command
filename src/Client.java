public class Client {
    public static void main(String[] args) {
        Account manhdung = new Account("Manh Dung");
        Command open = new OpenAccount(manhdung);
        Command close = new CloseAccount(manhdung);
        BankManager bankManager = new BankManager(open, close);

        bankManager.clickCloseAccount();
        bankManager.clickOpenAccount();
    }
}
