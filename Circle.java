import java.util.*;

public class Circle {
  public Circle() {
  }

  public static void circlePrompt() {
    System.out.println("\nPlease select circle function needed: ");
    System.out.println("1. Equation from center and radius");
    System.out.println("2. Put equation into standard form");
    System.out.println("3. Equation from 2 points");

    System.out.println("\n\nEnter Number ->");

    Scanner input = new Scanner(System.in);

    int inputWait = 0;

    switch (input.nextInt()) {
      case 1: {
        circleFromCenter();
        break; }
      case 2: {
        standardForm();
        break; }
      case 3: {
        Matrix.solve(1);
        break; }
      default: System.out.println("Please enter a valid number");
    }

  }

  public static void circleFromCenter() {
    System.out.println("\nEnter circle radius");

    Scanner input = new Scanner(System.in);

    Calculate sum = new Calculate();
    sum.setRadius(input.nextDouble());

    System.out.println("Enter x cord");
    sum.setX(input.nextDouble());

    System.out.println("Enter Y cord");
    sum.setY(input.nextDouble());

    System.out.println(sum.circle());

    System.out.println("\n\nRemember to ctrl+shift+c to copy");

  }

  public static void standardForm() {

    Scanner input = new Scanner(System.in);

    System.out.print("ax^2 + by^2 + Dx + Ey + F = 0");

    CircleMod user = new CircleMod();

    System.out.println("\nWhat is the value of 'a'");
    user.setA(input.nextDouble());

    System.out.println("What is the value of 'b'");
    user.setB(input.nextDouble());

    System.out.println("What is the value of 'D'");
    user.setD(input.nextDouble());

    System.out.println("What is the value of 'e'");
    user.setE(input.nextDouble());

    System.out.println("What is the value of 'f'");
    user.setF(input.nextDouble());

    System.out.println(user.solve());

    

    
  }

}