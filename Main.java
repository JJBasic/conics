import java.util.*;


class Main {
  public static void main(String[] args) throws InterruptedException {

    boolean lcv = true;

    ascii.title();

    while(lcv) {
    System.out.println("Enter circle radius");

    Scanner input = new Scanner(System.in);

    Calculate sum = new Calculate();
    sum.setRadius(input.nextDouble());

    System.out.println("Enter x cord");
    sum.setX(input.nextDouble());

    System.out.println("Enter Y cord");
    sum.setY(input.nextDouble());

    System.out.println(sum.circle());

    System.out.println("\n\nRemember to ctrl+shift+c to copy");

    Thread.sleep(3000);

    System.out.print("\n\nUse again : <Y>es or <N>o  ");

      String junk = input.nextLine();

      if(input.next().toLowerCase().charAt(0) != 'y')
            {
                lcv = false;
                System.out.println("\n\nGood Bye.");
            }
      
      }
    

  }
}