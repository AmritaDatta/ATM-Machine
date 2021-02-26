package atmmachine;

import java.util.Scanner;

public class ATMMachine {

    public static void main(String[] args) {
        String bankname="Commerzbank";
        String password="amri1405";
        String username="Amrita Datta";
        long accountnumber=1256899565;
                
        double userbalance=5000;
        
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to " + bankname);
        System.out.println("Enter password: ");
        String enterpassword=in.nextLine();
        
        if (enterpassword.equalsIgnoreCase(password)){
            System.out.println("Account holder: " + username + "  Account no: " + accountnumber);
            System.out.println("Choose the following options: ");
            System.out.println("1 - Show Balance , 2 - Deposit Amount , 3 - Withdraw Amount");
            
            int userchoice=in.nextInt();
            if (userchoice==1){
                System.out.println("Current ballance is " + userbalance);
            }
            
            else if (userchoice==2){
                System.out.println("Enter The Amount To Deposit ");
                double depositamount=in.nextDouble();
                userbalance += depositamount;
                System.out.println("You have successfully deposited " + depositamount + "\nNow your balance is " + userbalance);               
            }
            
            else if(userchoice==3){
                System.out.println("Enter The Amount To withdraw ");
                double withdrawamount=in.nextDouble();
                
                if (userbalance<withdrawamount){
                    System.out.println("Insufficient Balance. Please Try Again");
                }
                
                else {
                    userbalance -= withdrawamount;                   
                    System.out.println("You have successfully withdraw " + withdrawamount + "\nNow your balance is " + userbalance);
                }                       
            }
        }
        else{
            System.out.println("Wrong Password");
        }
    }
}