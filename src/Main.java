import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Ödev
        Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        𝜋 sayısını = 3.14 alınız.
        Formül : (𝜋 * (r*r) * 𝛼) / 360.*/

        int r;
        double pi = 3.14, a, alan;


        Scanner input = new Scanner(System.in);

        System.out.println("Daire dilimiminin alanı bulmak için, dairenin yarıçapını ve merkez açışısını giriniz...");

        System.out.print("Yarıçapı giriniz :");
        r = input.nextInt();

        System.out.print("Dairenin merkez açısını giriniz : ");
        a = input.nextDouble();

        alan = (pi * (r * r) * a) / 360;

        System.out.print("Daire dilimimin alanı : " + alan);

    }
}