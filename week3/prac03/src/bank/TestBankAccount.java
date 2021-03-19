package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestBankAccount {
    BankAccount b1, b2;

    @BeforeEach
    public void initAccount() {
        b1 = new BankAccount();
        b2 = new BankAccount();
    }

    @Test
    public void testTransfer() throws TransferException {
        b1.deposit(100);
        BankAccount.transfer(b1, b2, 25);
        assertEquals(75, b1.getFunds());
        assertEquals(25, b2.getFunds());
    }

    @Test
    public void testInsufficientBalance() {
        b1.deposit(100);
        assertThrows(FundsException.class, () -> {
            b1.withdraw(200);
        });
    }

    @Test
    public void testTransferException() {
        b1.deposit(100);
        assertThrows(TransferException.class, () -> {
            BankAccount.transfer(b1, b2, 200);
        });
    }

}
