import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int r;
        double pi = 3.14 ,x, alan;

        System.out.println("Dairenin yarıçapını giriniz:");
        r = input.nextInt();

        System.out.println("Merkez açının ölçüsünü giriniz:");
        x = input.nextDouble();

        alan = ( pi * (r*r)* x)/360;

        System.out.println("Dairenin alanı :" + alan);


    }


}
