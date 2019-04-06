package bot;


import java.util.StringTokenizer;

public class test_method {

   public static void main(String[] args) {

      StringTokenizer st1 = new StringTokenizer("what is your favorite food");
      System.out.println("The entire sentence: " + st1);

      for (int i = 1; st1.hasMoreTokens(); i++)
         System.out.println("Word "+i+":"+st1.nextToken());

   }
}