import java.util.Scanner;
public class Java_Challenge {
    public static void main(String[] args) {
        //dispalyDetails();
        //option();
        //multipleOption();
        comparison();
    }

    public static void dispalyDetails() {

        String code;
        String Nrm=null, npf=null, biz=null;
        String name, lastName;
        int sales, id;
        //int rep;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Eneter your customer ID: ");
        id = keyboard.nextInt();
        System.out.print("Eneter your name: ");
        name = keyboard.next();
        lastName = keyboard.next();
        System.out.print("Eneter your sales amount: ");
        sales = keyboard.nextInt();
        System.out.print("Eneter your Tax code: ");
        code = keyboard.next();
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println("Tax code: " + code);
        double discnt1 = (sales - (sales * (0.03)));
        double discnt2 = (sales - (sales * (0.02)));
        double discnt3 = (sales - (sales * (0.01)));

        if (sales > 15000)
            System.out.println("YOu have 1% discount " + discnt3);
        else if (sales > 10000)
            System.out.println("You have 2% discount " + discnt2);
        else if (sales > 5000)
            System.out.println("You have 3% discount " + discnt1);
        else
            System.out.println("Sales amount: $" + sales);
    }

    public static int option() {
        String choice;
        String Y, N;
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to enter an other record? (Y/N)");
        choice = input.next();
        if (choice.equalsIgnoreCase("Y")) {
            dispalyDetails();
        } else if (choice.equalsIgnoreCase("N")) {
            System.out.println("Thank you for your time!");
        }


        return 0;
    }

    public static void multipleOption() {
        int x = option();
        for(x=0;x>1000000;x++)
        {
            x++;
        }
    }

public static void comparison() {
        String Nrm,npf,biz;
        String  tax=null;
     Scanner keyboard = new Scanner(System.in);
     System.out.println("Please tell your tax code: NRM,NPF, OR bIZ");
     Nrm = keyboard.next();
     npf = keyboard.next();
     biz = keyboard.next();
     //code= keyboard.next();
         if (tax.equalsIgnoreCase("Nrm"))
         {
             System.out.println("Your inserted Tax ID is " + Nrm);
         }
         else if (tax.equalsIgnoreCase("npf"))
         {
             System.out.println("Your inserted Tax ID is " + npf);
         }
         else if (tax.equalsIgnoreCase("biz")) {
             System.out.println("Your inserted  Tax ID is " + biz);
         }
}
}
