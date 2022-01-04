package exceptionExample;

public class PhoneExceptionTester {
    public static void main(String[] args) {
        String[] numberArr = new String[] {"123-456", null, "345-6778", "674-2323"};

        for (int i = 0; i < numberArr.length; i++) {
           try {
               System.out.println(new Phone(numberArr[i], "iPhone"));
           } catch (IllegalArgumentException ex) {
               System.out.println(ex.getLocalizedMessage());
           }
        }
    }
}
