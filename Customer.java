import java.util.Random;

public class Customer {

    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;
    // private CustomerAddress address ;


    public Customer(String firstName , String lastName , String mobileNumber , String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.mobileNumber = mobileNumber;
        this.email = email;
        // this.address = address;
    }

    public long generateID(){
        long randomID = 0;
        Random rand = new Random();
        for(int i=0 ; i<10 ; i++){
            randomID = rand.nextLong();
        }
        return randomID;
    }

    public void display(){
        System.out.println("First Name : "+firstName+"\tLast Name : "+lastName);
        System.out.println("Account No. : "+generateID());
    }
}