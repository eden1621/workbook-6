package com.pluralsight;
import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

public static void main(String[] args) {
    BankAccount account1 = new BankAccount(123, "Pam", 12500);
    Valuable account2 = new BankAccount(456, "Gary", 1500);

    // Deposit money into both
    account1.deposit(100);          //  Works
    // account2.deposit(100);       //  Compile Error!

    System.out.println("Pam's balance: $" + account1.getBalance());
    System.out.println("Gary's value: $" + account2.getValue());
}
}
