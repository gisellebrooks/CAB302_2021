package bank;

public class BankAccount {
    private int funds;

    /**
     * Deposits an amount into this bank account.
     *
     * @param amount
     */
    public void deposit(int amount) {
        this.funds += amount;
    }

    /**
     * Getter method for funds.
     *
     * @return current funds.
     */
    public int getFunds() {
        return this.funds;
    }

    /**
     * Withdraws an amount from this bank account.
     *
     * @param amount
     * @throws FundsException if there are insufficient funds for the withdraw.
     */
    public void withdraw(int amount) {
        System.out.printf("Attempting withdraw... ");
        this.funds -= amount;
        System.out.printf("Withdrew %d funds.\\n", amount);
    }

    /**
     * Transfers an amount from one bank account to another.
     *
     * @param b1 The bank account the funds are transferred from.
     * @param b2 The bank account the funds are transferred to.
     * @param amount The amount to be transferred.
     * @throws TransferException if the withdraw fails.
     */
    public static void transfer(BankAccount b1, BankAccount b2, int amount) {
        System.out.printf("Attempting transfer... ");
        b1.withdraw(amount);
        b2.deposit(amount);
        System.out.printf("Transferred %d funds from b1 to b2. Account b1 has %d funds. Account b2 has %d funds.\\n", amount, b1.getFunds(), b2.getFunds());
    }
}
