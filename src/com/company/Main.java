package com.company;

public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        while (true) {
            try {
                bankAccount.withDraw(6000);

            } catch (LimitExeption limit) {
                System.out.println(limit.getMessage());
            }
            try {
                bankAccount.withDraw((int) bankAccount.getAmount());
            } catch (LimitExeption l) {
                System.out.println(l.getMessage());
            }

            finally {
                System.out.println("Доступный баланс: " + bankAccount.getAmount() + "\n Ваш баланс после снятия доступного баланса: " + (bankAccount.getAmount() - bankAccount.getAmount()));
            }
            break;
        }


    }
}
