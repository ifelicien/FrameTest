import java.util.Scanner;

public class someFunction {
    public static void myFunction(){

        Scanner myObj = new Scanner(System.in);
        int result;

        System.out.println("enter your two numbers: ");
        int x = myObj.nextInt();
        int y = myObj.nextInt();

        result = x + y;

        System.out.println(result);

    }
}
