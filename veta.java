import java.util.Scanner;

public class veta {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zadej vetu: ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        int n = 0;

            for (int i = 0; i < str.length(); i++) {
                if (Character.isLetter(ch[i]))
                    n++;
                }
            System.out.println("Pismenka: " + n);
            }
        }