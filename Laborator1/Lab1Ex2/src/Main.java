import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        System.out.println("Introduceti Numarul de elemente");
        int nrElem=sc.nextInt();
      double[] array= new double[nrElem];
      for(int i=0;i<nrElem;i++){
          System.out.println("Introduceti elementul " + i + " :");
          array[i]=sc.nextDouble();
      }
      double suma=0;
      for (double nr : array){ //pentru fiecare element(nr) din array
          suma+=nr;
      }
      System.out.println("Average="+suma/array.length);

sc.close();



    }
}