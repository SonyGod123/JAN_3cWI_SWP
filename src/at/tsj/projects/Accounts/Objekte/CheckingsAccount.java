package at.tsj.projects.Accounts.Objekte;

public class CheckingsAccount {
    public class CheckingsAccount extends BaseAccount {
        private int limit;

        public CheckingsAccount(double balance, int limit) {
            super(balance);
            this.limit = limit;
        }

        @Override
        public double withdraw(double amount) {
            if ((getBalance() - amount) > (limit * -1)) {
                System.out.println("Widthdrawn " + amount + " Euros");
                return super.withdraw(amount);
            } else {
                System.out.println("Leider keine Deckung");
                return 0;
            }


        }
    }
}
