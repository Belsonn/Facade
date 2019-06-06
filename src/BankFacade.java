public class BankFacade {

    private int accountNumber;
    private int securityCode;

    AccNumberCheck acctChecker;
    PINCheck pinChecker;
    FundsCheck fundChecker;

    Welcome bankWelcome;

    public BankFacade(int newAcctNum, int newSecCode){

        accountNumber = newAcctNum;
        securityCode = newSecCode;

        bankWelcome = new Welcome();
        acctChecker = new AccNumberCheck();
        pinChecker = new PINCheck();
        fundChecker = new FundsCheck();

    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public int getSecurityCode()
    {
        return securityCode;
    }


    public void withdrawCash(double cashToGet){

        if(acctChecker.accountActive(getAccountNumber()) &&
                pinChecker.isCodeCorrect(getSecurityCode()) &&
                fundChecker.haveEnoughMoney(cashToGet)) {

            System.out.println("Transakcja zakończona powodzeniem\n");

        } else {

            System.out.println("Transakcja zakończona niepowodzeniem\n");

        }

    }


    public void depositCash(double cashToDeposit){

        if(acctChecker.accountActive(getAccountNumber()) &&
                pinChecker.isCodeCorrect(getSecurityCode())) {

            fundChecker.makeDeposit(cashToDeposit);

            System.out.println("Transakcja zakończona powodzeniem\n");

        } else {

            System.out.println("Transakcja zakończona niepowodzeniem\n");

        }

    }

}
