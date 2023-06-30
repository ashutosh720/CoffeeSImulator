import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            OrderCoffee.print();
            System.out.println("----------------------------------------------------------------");
            System.out.println("Which cofee would you like to have?");
            System.out.println("----------------------------------------------------------------");
            int cmd = sc.nextInt();
            if(cmd!=0){
                OrderCoffee.placeOrder(cmd);
                System.out.println("----------------------------------------------------------------");
                System.out.println("Would you like to continue ? If yes press 1 else press 2 ");
                int cmd2 = sc.nextInt();
                if(cmd2!=2){
                    continue;
                }else{
                    return;
                }
            }else{
//                Record.printRecord();
                return;
            }

        }

    }
}