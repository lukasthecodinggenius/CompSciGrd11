import java.util.Scanner; //initialize the scanner

class Main {
  public static void main(String[] args) {

Scanner value = new Scanner(System.in); //declare scanner

System.out.println("Problem 1: 3x3, Answer Below: "); //the first math problem

int math1 = value.nextInt(); //take input from the user

if (math1 == 9) {
  System.out.println("You got it right!"); //if the user gets the answer right, it prints this and moves onto the next question
} else {
  System.out.println("Incorrect, Score 0/3, Try Again!"); //if the user gets the answer wrong, it prints this
  System.exit(1); //when the user gets the question wrong, the program gets terminated
}

System.out.println("Problem 2: 7 x 8, Answer Below"); //2nd math problem
int math2 = value.nextInt(); //take input from the user

if (math2 == 56) {
  System.out.println("Correct! Get ready for the last question"); //prints this if the user gets the question right and moves on to the next question
} else {
  System.out.println("Incorrect, Score: 1/3, Try Again!"); //print this if the user gets the question wrong
  System.exit(1); //terminates the program when the user gets the question wrong
}

System.out.println("Final Problem: 90920138098501 * 0"); //final problem

int math3 = value.nextInt(); //takes input from the user

if (math3 == 0) {
  System.out.println("Nice! You got all the question's right with a score of 3/3"); //prints this if the user gets the question right
} else {
  System.out.println("Incorrect, Score 2/3, Try Again!"); //prints this if the user gets it wrong.
  
}

  } 

  }
