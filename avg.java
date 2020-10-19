import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        System.out.println("Zadej počet čísel ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double[] a = new double[num];
        double total = 0;

        for(int i=0; i<a.length; i++){
            System.out.println("Zadej čislo "+(i+1)+":");
            a[i] = (int) scan.nextDouble();
        }
        for(int i=0; i<a.length; i++){
            total = total + a[i];
        }
        double average = total / a.length;
        System.out.println("Průměr je: " + average);
    }
    }