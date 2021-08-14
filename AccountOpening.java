
import java.util.Scanner;

public class AccountOpening {

    private Customer[] customer;
    private int count = 0;


    public void numberOfCustomer(){
        customer = new Customer[20];
        // count = 0 ;
    }
    

    public void acceptDetail(){
        Scanner scan = new Scanner(System.in);
        if(count>=20){
            System.out.println("Update Data");
        }else{
            System.out.print("Enter First Name : ");
            String first = scan.nextLine();
            System.out.print("Enter Last Name  : ");
            String last = scan.nextLine();
            System.out.print("Enter Mobile No. : ");
            String mobileNumber = scan.nextLine();
            System.out.print("Enter Email      : ");
            String emails = scan.nextLine();
            // System.out.println("Enter The Address Details");
            // System.out.print("House Number : ");
            // int houseNumber = scan.nextInt();
            // scan.nextLine();
            // System.out.print("Enter Streat : ");
            // String streat = scan.nextLine();
            // System.out.print("Enter Landmark : ");
            // String landMarks = scan.nextLine();
            // System.out.print("Enter Villege  : ");
            // String villege = scan.nextLine();
            // System.out.print("Enter City  : ");
            // String city = scan.nextLine();
            // System.out.print("Enter PinCode : ");
            // int pinCode = scan.nextInt();

            // CustomerAddress address = new CustomerAddress(houseNumber, streat, landMarks, villege, city, pinCode);
            Customer customers = new Customer(first, last, mobileNumber, emails);

            customer[count] = customers;

            count++;
        }
    }
    public void showData(){
        for(int i=0 ; i<customer.length ; i++){ 
            Customer cust = customer[i];
            cust.display();
        }
    }
}
