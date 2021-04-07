package com.company;

public class BankAccount {
    private double amount;

    public double getAmount(){
        return amount;
    }

    public double deposit(double sum){
        System.out.println(amount += sum);
        return amount;
    }

    public void withDraw(int sum) throws LimitExeption {
        for (int i = 0; i < getAmount() ; i++) {
            if(amount - sum < 0){
                throw new LimitExeption("На балансе недостаточно средтсв", sum);
            }
            if (amount - sum > 0){
                System.out.println("Баланс: " + getAmount() + "\n Снято: " + sum
                + "\n Остаток по счету: " + (amount -= sum));
            }
            
        }
    } 
}
