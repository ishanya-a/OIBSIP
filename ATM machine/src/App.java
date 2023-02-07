import java.util.Scanner;
public class App {
    public static int check_bal=100000;
    public static int deposit;
    public static int withdrawal;
    public static int transfer;
    static String name;
    static String username;
    static long account;
    static String pass;
    static String rep_name;
    static String rep_acc;
    static Scanner sc=new Scanner(System.in);
    private Object x;
    void register()
    {
        System.out.println(" ");
        System.out.println("Enter the account holder name");
        name=sc.next();
        System.out.println("Enter the account number");
        account=sc.nextLong();
        System.out.println("Enter the username");
        username=sc.next();
        System.out.println("Enter the password");
        pass=sc.next();
        System.out.println("you have Register Successfully");
        do{
            System.out.println(" ");
            System.out.println("1.login");
            System.out.println("2.exit");
            System.out.println("enter your choice");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    login();
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("wrong entered");
            }
        }while(true);
    }
    void login()
    {
        String login_name;
        String login_pass;
        System.out.println(" ");
        System.out.println("Enter the username");
        login_name=sc.next();
        if(login_name.equals(username))
        {
            for(int i=0;i<3;i++){
            System.out.println("Enter the password");
            login_pass=sc.next();
            if(login_pass.equals(pass))
            {
                System.out.println("You have logged in Successfully");
                account_holder();
                break;
            }
            else
            {
                System.out.println("Wrong password");
            }
        }
        System.out.println("you have exceeded you limit");
        }
        else
        {
            System.out.println("Wrong username");
        }
    }
    void account_holder()
    {
        do{
            System.out.println(" ");
            System.out.println("1.Withdrawal");
            System.out.println("2.Desopit");
            System.out.println("3.Check Balance");
            System.out.println("4.Transfer Money");
            System.out.println("5.Transaction history");
            System.out.println("6.exit");
            System.out.println("enter your choice");
            int num=sc.nextInt();
            switch(num)
            {
                case 1:
                    withdrawal();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    balance();
                    break;
                case 4:
                    tranfer();
                    break;
                case 5:
                    transaction_history();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("wrong entered");
            }
        }while(true);
    }
    void deposit()
    {
        System.out.println("enter amount: ");
        deposit=sc.nextInt();
        check_bal=check_bal+deposit;
        System.out.println("amount deposited");
    }
    void withdrawal()
    {
        System.out.println("enter amount: ");
        withdrawal=sc.nextInt();
        check_bal=check_bal-withdrawal;
        System.out.println("amount withdrawal");
    }
    void balance()
    {
        System.out.println("Balance: "+check_bal);
    }
    void tranfer()
    {
        System.out.println("enter recepient's name: ");
        rep_name=sc.next();
        System.out.println("enter recepient's account number: ");
        rep_acc=sc.next();
        System.out.println("enter amount: ");
        transfer=sc.nextInt();
        check_bal=check_bal-transfer;
        System.out.println("amount Successfully transfered");
    }
    void transaction_history()
    {
        System.out.println("Balance: "+check_bal);
        System.out.println("Deposited: "+deposit);
        System.out.println("Withdrawal: "+withdrawal);
        System.out.println("Transfered: "+transfer);
    }
    public static void main(String[] args) throws Exception {
        App a=new App();
        System.out.println("Welcome to ATM machine");
        do{
            System.out.println(" ");
            System.out.println("1.Register");
            System.out.println("2.exit");
            System.out.println("enter your choice");
            int value=sc.nextInt();
            switch(value)
            {
                case 1:
                    a.register();
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("wrong entered");
            }
        }while(true);
    }
}
