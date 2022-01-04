package Date;

import java.util.Date;

public class DateTester {
    public static void main(String[] args) {
        Transaction transaction = new Transaction("1st Transaction", new Date(),"123456", "$500");

        System.out.println(transaction);
    }
}
