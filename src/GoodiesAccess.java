import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class GoodiesAccess {

	public static void main(String[] args) {
		
		/*Using Scanner Class*/
		
		Scanner scan = new Scanner(System.in);
		
		/* collecting All Goodies By Using Collection concept*/
		
		List<Goodies> goodiesList = new ArrayList<>();
		
		goodiesList.add(new Goodies ("Fitbit",7980));
		goodiesList.add(new Goodies ("IPods",22349));
		goodiesList.add(new Goodies ("MI Band",999));
		goodiesList.add(new Goodies ("Cult Pass",2799));
		goodiesList.add(new Goodies ("Macbook Pro",229900));
		goodiesList.add(new Goodies ("Digital Camera",11101));
		goodiesList.add(new Goodies ("Alexa",9999));
		goodiesList.add(new Goodies ("Sandwich Toaster",2195));
		goodiesList.add(new Goodies ("Microwave Oven",9800));
		goodiesList.add(new Goodies ("Scale",4999));
		
		System.out.println("Output");
		
		System.out.println();
		
		System.out.print("Enter Number of Employees : ");
		
		System.out.println();
		
		int emp = scan.nextInt();
		
		int emp1 = emp;
		
		System.out.println();
		
		System.out.println("Number of the employees: " + emp);
		
		System.out.println();
		
		System.out.println("Here the goodies that are selected for distribution are:");
		
		System.out.println();
		 
		/* Using Java 8 (Streams) */
		
		if(emp == emp1) {
			goodiesList.stream().sorted(Comparator.comparing(Goodies::getPrice)).skip(4).limit(emp).forEach(System.out::println);
		}else {
			System.out.println("Please Enter Valid Employee Numbers");
		}
		
		int lowestPrice ;
		int highestPrice ;
		
		/* Using the Method reference to sort the price*/
		/* and Using limit() and Skip() Method*/
		/* I have get the maximum and minimum Value by Using max() and min()*/
		
		highestPrice = 	goodiesList.stream().sorted(Comparator.comparing(Goodies::getPrice)).skip(4).limit(emp).mapToInt(Goodies::getPrice)
						.max().getAsInt();
		
		
		
		lowestPrice = 	goodiesList.stream().sorted(Comparator.comparing(Goodies::getPrice)).skip(4).limit(emp).mapToInt(Goodies::getPrice)
				.min().getAsInt();
		
		int ans = highestPrice - lowestPrice;
		
		System.out.println();
		
		System.out.println("And the difference between the chosen goodie with highest price and the lowest price is " + ans);
		
		
		
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
		
		System.out.println();
		
		System.out.print("Enter Number of Employees : ");
		
		System.out.println();
		
		int emp2 = scan.nextInt();
		
		int emp3 = emp2;
		
		System.out.println();
		
		System.out.println("Number of the employees: " + emp2);
		
		System.out.println();
		
		System.out.println("Here the goodies that are selected for distribution are:");
		
		System.out.println();
		
		
		if(emp2 == emp3) {
			goodiesList.stream().sorted(Comparator.comparing(Goodies::getPrice)).skip(1).limit(emp2).forEach(System.out::println);
		}else {
			System.out.println("Please Enter Valid Employee Numbers");
		}
		
		int lowestPrice1 ;
		int highestPrice1 ;
		
		highestPrice1 = 	goodiesList.stream().sorted(Comparator.comparing(Goodies::getPrice)).skip(1).limit(emp2).mapToInt(Goodies::getPrice)
						.max().getAsInt();
		
		
		
		lowestPrice1 = 	goodiesList.stream().sorted(Comparator.comparing(Goodies::getPrice)).skip(1).limit(emp2).mapToInt(Goodies::getPrice)
				.min().getAsInt();
		
		int ans1 = highestPrice1 - lowestPrice1;
		
		System.out.println();
		
		System.out.println("And the difference between the chosen goodie with highest price and the lowest price is " + ans1);
		
		
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		
		
		System.out.println();
		
		System.out.print("Enter Number of Employees : ");
		
		System.out.println();
		
		int emp4 = scan.nextInt();
		
		int emp5 = emp4;
		
		System.out.println();
		
		System.out.println("Number of the employees: " + emp4);
		
		System.out.println();
		
		System.out.println("Here the goodies that are selected for distribution are:");
		
		System.out.println();
		
		
		if(emp4 == emp5) {
			goodiesList.stream().sorted(Comparator.comparing(Goodies::getPrice)).skip(5).limit(emp4).forEach(System.out::println);
		}else {
			System.out.println("Please Enter Valid Employee Numbers");
		}
		
		int lowestPrice2 ;
		int highestPrice2 ;
		
		highestPrice2 = 	goodiesList.stream().sorted(Comparator.comparing(Goodies::getPrice)).skip(5).limit(emp4).mapToInt(Goodies::getPrice)
						.max().getAsInt();
		
		
		
		lowestPrice2 = 	goodiesList.stream().sorted(Comparator.comparing(Goodies::getPrice)).skip(5).limit(emp4).mapToInt(Goodies::getPrice)
				.min().getAsInt();
		
		int ans2 = highestPrice2 - lowestPrice2;
		
		System.out.println();
		
		System.out.println("And the difference between the chosen goodie with highest price and the lowest price is " + ans2);
		
	}
}
