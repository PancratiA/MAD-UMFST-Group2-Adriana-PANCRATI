
public class Main {
    public static void main(String[] args) {
        Sofer s1 =new Sofer();
        s1.setNume("Max");
        s1.setNumarSofer(1);
        s1.setInaltime(1.8);
        Sofer s2= new Sofer("Charles", 16,  1.6);
        System.out.println("["+ s1.getNumarSofer() + "]" +s1.getNume());
        System.out.println("["+ s2.getNumarSofer() + "]" +s2.getNume());


    }
}