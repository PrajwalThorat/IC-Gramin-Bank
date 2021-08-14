import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AccountOpening accountOpen = new AccountOpening();
        while(true){
            System.out.println("--Menu--");
            System.out.println("1.New Account\n2.Search \n3.Display Account\n4.Exit");
            System.out.print("Choose :");
            int choose = scanner.nextInt();
            
            switch(choose){
                case 1: accountOpen.acceptDetail();
                        break;
                case 2: accountOpen.showData();
                        break;
                case 3: System.exit(0);
            }
        }
    }
}
