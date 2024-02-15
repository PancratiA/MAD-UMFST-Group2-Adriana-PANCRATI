import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Introduceti un numar");
        int nr = sc.nextInt();
        if(nr<0) System.out.println("Nr. Negativ");
        else if(nr > 0) System.out.println("Nr. Pozitiv");
        else System.out.println("Numarul nu este nici negativ nici pozitiv:)");




    }
}