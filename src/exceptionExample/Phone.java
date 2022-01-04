package exceptionExample;

public class Phone {
    private String phoneNumber;
    private String phoneType;

  public Phone (String phoneNumber, String phoneType) {
      super();
      if(phoneNumber == null || phoneType == null) {
          throw new IllegalArgumentException("Set the values for Type and Number. Values cannot be null.");
      }
      this.phoneNumber = phoneNumber;
      this.phoneType = phoneType;
  }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", phoneType='" + phoneType + '\'' +
                '}';
    }
}
