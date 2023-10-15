import java.util.Scanner; //initialize scanner

class Main {
	public static void main(String[] args) {

Scanner value = new Scanner(System.in);


System.out.println("Player 1 Choose: ");

String p1 = value.nextLine(); //take input from the user for player 1

System.out.println("Player 2 Choose: ");

String p2 = value.nextLine(); //take input from the user for player 2


if (p1.equals("Rock") && (p2.equals("Paper"))) {      //outputs for all possible combinations
		System.out.println("Player 2 Wins");
} else if (p1.equals("Rock") && (p2.equals("Scissors"))) {
		System.out.println("Player 1 Wins");
} else if (p1.equals("Rock") && (p2.equals("Rock"))) {
		System.out.println("Tiebreaker");
} else if (p1.equals("Paper") && (p2.equals("Rock"))) {
		System.out.println("Player 1 Wins");
} else if (p1.equals("Paper") && (p2.equals("Paper"))) {
		System.out.println("Tiebreaker");
} else if (p1.equals("Paper") && (p2.equals("Scissors"))) {
		System.out.println("Player 2 Wins");
} else if (p1.equals("Scissors") && (p2.equals("Rock"))) {
		System.out.println("Player 2 Wins");
} else if (p1.equals("Scissors") && (p2.equals("Paper"))) {
		System.out.println("Player 1 Wins");
} else if (p1.equals("Scissors") && (p2.equals("Scissors"))) {
		System.out.println("Tiebreaker");
} else {
		System.out.println("Invalid Input"); //outputs this if the user puts an invalid statement
}







	}
}
