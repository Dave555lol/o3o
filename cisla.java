import java.util.Scanner;

public class cisla {
    public static void main(String[] args) {
        int n, y = 1, z = 3, p, q;
        Scanner in = new Scanner(System.in);
        System.out.print("Zadej cislo: ");
        n = in.nextInt();
        if (n >= 1){
            System.out.println(2);
        }
        for (p = 2; p <=n; ){
            for (q = 2; q <= Math.sqrt(z); q++){
                if (z%q == 0){
                    y = 0;
                    break;
                }
            }
            if (y != 0){
                System.out.println(z);
                p++;
            }
            y = 1;
            z++;
        }
    }
}