public class Owner {
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Owner(String a,String b,String c){
        firstName = a;
        lastName = b;
        phoneNumber = c;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String a){
        firstName = a;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String a){
        lastName = a;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String a){
        phoneNumber = a;
    }

}
