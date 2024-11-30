import java.util.Scanner;

  public class IT24104080Lab5Q3 {
    public static void main(String[] args){
      Scanner resort = new Scanner(System.in);

System.out.print("Enter Start Date (1-31):");
int startDate=resort.nextInt();
System.out.print("Enter End Date (1-31):");
int endDate=resort.nextInt();

if(startDate>31||startDate<1){
	System.out.println("Days must be between 1 and 31");
	System.exit(0);
}else if(endDate>31||endDate<1){
	System.out.println("Days must be between 1 and 31");
	System.exit(0);
}else

if(startDate>endDate){
	System.out.println("Start Date must be less than End Date");
	System.exit(0);
} else

System.out.println("Room Charge Per Day: Rs. 48000.0/=");

int days ;
days=endDate-startDate ;

System.out.println("Number of days Reserved: " + days + "");

double amount ;

if(days<3){
	amount=days*48000;
	System.out.println("Total Amount to be Paid: " + amount + "");
}else if(days>4){
		amount=days*48000*80/100;
		System.out.println("Total Amount to be Paid: " + amount + "");
	}else amount=days*48000*90/100;
		System.out.println("Total Amount to be Paid: " + amount + "");
		

 }
}