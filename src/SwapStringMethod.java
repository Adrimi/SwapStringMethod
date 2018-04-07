import java.util.Scanner;


public class SwapStringMethod {

    public static boolean end;

    public static void main(String[] args) {
        end = false;
        System.out.println("SWAPPING PROGRAM");
        System.out.println("Please, enter some lines of words");

        while (end == false) {
            Scanner scan = new Scanner(System.in);
            String s = scan.nextLine();
            if (s.isEmpty()) {
                System.out.println("Gimme somethin'!");
            }
            else {
                SwapStringMethod x = new SwapStringMethod();
                String[] parts = s.split(" ");

                if (parts.length < 3) {
                    System.out.println("No, too few!");
                    end = false;
                }
                else {
                    for (int i = 0; i < parts.length; i++) {
                        parts[i] = x.reverse(parts[i]);
                    }
                    String temp = parts[0];
                    parts[0] = parts[parts.length - 1];
                    parts[parts.length - 1] = temp;
                    end = true;

                    s = "";
                    for (int i = 0; i < parts.length; i++) {
                        s = s + parts[i] + " ";
                    }

                    System.out.println(s);
                }
            }
        }
    }

    public static String reverse(String s) {
        return new StringBuffer(s).reverse().toString();
    }
}
