import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



      Scanner s = new Scanner(System.in);
      int input = -1;
      while (input != 3)
      {
        textForMenu();
        try {
          input = Integer.parseInt(s.nextLine());
        } catch (NumberFormatException e) {
          if ((input < 1 || input > 2) && input != -1) System.out.println("Number to low/high");
          System.out.println("Input is not an Number not an Number");
        }

        switch  (input)
        {
          case 1:beipiel1();
          case 2: System.out.println("placeholder");
        }
      }
}

  private static void textForMenu() {
    System.out.println("choose what you wanna do");
    System.out.println("1... Beispiel 1");
    System.out.println("2... Beispiel 2");
    System.out.println("3... end");
  }


  private static void beipiel1() {
    HalloJavamitForEach ob = new HalloJavamitForEach();
    System.out.println("Print with for-each-loop");
    ob.printList();
    System.out.println("Print with lamba");
    ob.printList2();
    System.out.println("Print with consumer");
    ob.printList3();
    System.out.println("Print with 'System.out::print'");
    ob.printList4();
  }
}
