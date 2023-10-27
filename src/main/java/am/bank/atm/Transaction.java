package am.bank.atm;

import java.util.Date;

public class Transaction {
    private Long id;
    private double amount;
    private Date timestamp;
    private String memo;
    private Account inAccount;

    public Long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Account getInAccount() {
        return inAccount;
    }

    public void setInAccount(Account inAccount) {
        this.inAccount = inAccount;
    }
}
