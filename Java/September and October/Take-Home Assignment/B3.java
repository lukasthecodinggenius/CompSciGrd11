import java.util.Scanner; //initialize scanner

class Main {
	public static void main(String[] args) {

Scanner value = new Scanner(System.in);


System.out.println("Enter First Number:");  
int num1 = value.nextInt();  //takes input from first player
System.out.println("Enter Second Number:");
int num2 = value.nextInt();  // takes input for second player
System.out.println("Enter Third Number: ");
int num3 = value.nextInt(); //takes input for third player

if ((num1 > num2) && (num1 > num3)) {
		System.out.println(num1 + " is the greatest number");   //printing statements for the greatest numbers
} else if ((num2 > num1) && (num2 > num3)) {
		System.out.println(num2 + " is the greatest number");
} else if ((num3 > num1) && (num3 > num2)) {
		System.out.println(num3 + " is the greatest number");
} else {
		System.out.println("2 of the numbers are the same, try making them different."); //prints this statement for numbers with the same value
}












	}
}
