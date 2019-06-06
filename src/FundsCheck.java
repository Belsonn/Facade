public class FundsCheck {

    private double cashInAccount = 3124.53;

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void decreaseCashInAccount(double cashWithdrawn) {
        cashInAccount -= cashWithdrawn;
    }

    public void increaseCashInAccount(double cashDeposited) {
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double cashToWithdrawal) {

        if (cashToWithdrawal > getCashInAccount()) {

            System.out.println("BŁĄD: NIE MASZ TYLE SIANA");
            System.out.println("HAJS: " + getCashInAccount());

            return false;

        } else {

            decreaseCashInAccount(cashToWithdrawal);

            System.out.println("UDAŁO SIĘ, OBECNY HAJS: " + getCashInAccount());

            return true;

        }

    }

    public void makeDeposit(double cashToDeposit) {

        increaseCashInAccount(cashToDeposit);

        System.out.println("UDAŁO SIĘ, OBECNY HAJS: " + getCashInAccount());
    }
}

