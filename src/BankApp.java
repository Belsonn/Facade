public class BankApp {

    public static void main(String[] args)
    {
        BankFacade tryToAccess = new BankFacade(21372137, 7944);

        tryToAccess.withdrawCash(50.00);

        tryToAccess.withdrawCash(990.00);

        tryToAccess.depositCash(400);

        tryToAccess.withdrawCash(5000);

    }

}
