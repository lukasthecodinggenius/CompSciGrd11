import java.util.Scanner; //initialize scanner

class Main {
  public static void main(String[] args) {

Scanner value = new Scanner(System.in);

System.out.println("What Country are you from? Type your answer below: ");

String country = value.nextLine(); //takes input from the user

if (country.equals("Canada")) {

  System.out.println("What is on Canada's Flag? a) Poutine b) A Beaver c) Maple Leaf d) Maple Syrup | Type a, b, c or d"); //canada quiz if the user is from canada
    String trivia1 = value.nextLine(); //takes input from the user

  if (trivia1.equals("c")) {
    System.out.println("Correct! You know a lot about your country"); //prints this if the user gets the question right
    System.exit(1); //terminates the program
  } else {
    System.out.println("Incorrect, you should know more about your country"); ///prints this if the user gets the question wrong
    System.exit(1); //terminates the program
  }

} else if (country.equals("Germany")) {

   System.out.println("How do you say hello in german?  a) Hallo b) Bonjour c) Hola d) Ciao | Type a, b, c or d"); //Germany quiz if the user is from germany
    String trivia2 = value.nextLine(); //takes input from the user

  if (trivia2.equals("a")) {
    System.out.println("Correct! You know a lot about your country"); //prints this if the user gets the question right
    System.exit(1); //terminates the program
  } else {
    System.out.println("Incorrect, you should know more about your country"); //prints this if the user gets the question wrong
    System.exit(1); //terminates the program
  }
  
} else if (country.equals("Italy")) {
   
  System.out.println("What is the tiny country inside italy called? a) Ciaoland b) Vatican City c) Vaticanty d) Canada | Type a, b, c or d"); //italy quiz if the user is from italy
    String trivia3 = value.nextLine(); //takes input from the user

  if (trivia3.equals("b")) {
    System.out.println("Correct! You know a lot about your country"); //prints this if the user gets the question right
    System.exit(1); //terminates the program
  } else {
    System.out.println("Incorrect, you should know more about your country"); //prints this if the user gets the question wrong
    System.exit(1);//terminates the program
  }
} else {
  System.out.println("Sorry, I do not have that region in my database"); //prints this if an invalid country is inputted 
}




  } 

  }

