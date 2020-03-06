package epam4.cleancode;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class App
{
	private static PrintStream myoutput;
	private static Scanner in;
	public static void getInterest() {
		myoutput =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		myoutput.print("Enter Principal Amount ");
		double p=in.nextDouble();
		myoutput.print("Enter Time Period ");
		double t= in.nextDouble();
		myoutput.print("Enter Rate of Interest ");
		double r=in.nextDouble();
		Interest i=new Interest(p,t,r);
		myoutput.print("\nOption 1- Calculate simple interest\nOption 2- Calculates the Compound Interest\nEnter option ");
		int  op=in.nextInt();
		if(op==1) {
			myoutput.print("Simple Interest is "+i.getSimpleinterest());
		}
		else {
			myoutput.print("Compound Interest is "+i.getCompoundInterest());
		}
	}
	public static void getCostofBuliding() {
		myoutput =  new PrintStream(new FileOutputStream(FileDescriptor.out));
		myoutput.print("• Option 1-Std Materials\n• Option 2-use above std materials\n• Option 3-high std material\n• Option 4-high std material and fully automated home\n Enter the  material requried for constuction of buliding ");
		int op2=in.nextInt();
		myoutput.print("Enter the Area of land to estimate the cost of buliding ");
		double area=in.nextDouble();
		Building b=new Building(area,op2);
		myoutput.print("Cost for construction of buliding is "+b.getCostOfBuilding());
	}
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
	    PrintStream myoutput =  new PrintStream(new FileOutputStream(FileDescriptor.out));
    	in =new Scanner(System.in);
        while(true) {
        	myoutput.print("\n1 opion 1 for claculating Interest\n2 option for calculating the cost for buliding a buliding\n3 option to exit\n");
        	myoutput.print("Enter the option/choice ");
        	int option = in.nextInt();
        	switch(option) {
        	case 1:
        		getInterest();
        		break;
        	case 2:
        		getCostofBuliding();
        		break;
        	case 3:
        		in.close();
        		return;
        	default:
        		error();
        	}
        }
        
    }
	private static void error() {
		myoutput.print("Enter a valid opion/choice");
			myoutput.close();
	}
}

