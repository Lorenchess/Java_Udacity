package Date;

import java.util.Date;

public class Transaction {
    private String description;
    private Date date;
    private String account;
    private String amount;

    public Transaction(String description, Date date, String account, String amount) {
        this.description = description;
        this.date = date;
        this.account = account;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "description='" + description + '\'' +
                ", date=" + date +
                ", account='" + account + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
