package ru.lizaminakova.JAVA1.Pr28;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
