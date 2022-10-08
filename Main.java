import java.util.*;


class Main {
  public static void main(String[] args) throws InterruptedException {

    boolean lcv = true;

    ascii.title();

    Scanner input = new Scanner(System.in); 

    while(lcv) {

      Circle.circlePrompt();
          Thread.sleep(3000);

      System.out.print("\n\nUse again : <Y>es or <N>o  ");

      
      if(input.next().toLowerCase().charAt(0) != 'y')
            {
                System.out.println("\n\nGood Bye.");
                lcv = false;
            }
      
    }

    

  }
}