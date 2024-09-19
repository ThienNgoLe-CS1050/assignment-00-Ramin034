
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ramin_Akbari_Assignment02 {

	public static void main(String[] args) {
		String firstName;
		String middlePlaceHolder;
		char middleInitial;
		String lastName;
		int age;
		double grossAnnualPay;
		double taxRate;
		double netAnnualPay;
		String agePlaceHolder;
		String gAnnualPay; // Place holder for annual pay
		String tRateHolder; // place holder for tax rate
		
		firstName = JOptionPane.showInputDialog("Enter your first name.");
		middlePlaceHolder = JOptionPane.showInputDialog("Enter middle initial.");
		lastName = JOptionPane.showInputDialog("Enter Last Name.");
		agePlaceHolder = JOptionPane.showInputDialog("Enter Age.");
		gAnnualPay = JOptionPane.showInputDialog("Enter your annual pay.");
		tRateHolder = JOptionPane.showInputDialog("Enter your tax rate.");
		
		middleInitial = middlePlaceHolder.charAt(0); //these next lines do conversions.
		age = Integer.parseInt(agePlaceHolder);
		grossAnnualPay = Double.parseDouble(gAnnualPay);
		taxRate = Double.parseDouble(tRateHolder);
		
		netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);
		System.out.println("Hello " + firstName + " " + middleInitial + ". " + lastName + ",\n"
				+ "You are " + age + " years old now.\nIt is amazing that you made $" + grossAnnualPay
				+ " this year. With the tax\nrate of " + taxRate + ", you can take home $" + netAnnualPay +".");
		
		
	}

}
