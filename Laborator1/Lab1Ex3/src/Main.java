
public class Main {
    public static boolean isPrim(int nr) {
        if (nr <= 1) {return false;}
        for (int i = 2; i <= Math.sqrt(nr); i++) {
            if (nr % i == 0) {return false;}
        }
        return true;
    }
    public static void main(String[] args) {

        for(int i=3;i<=100;++i){
            if(isPrim(i)&&isPrim(i+2)){
                System.out.println("("+ i + "," + (i+2)+")");
            }
        }

    }
}