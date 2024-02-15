public class MyOwnAutoShop {
    public static void main(String[] args) {

    Sedan s= new Sedan(300, 15000 , "Red", 10);
    s.afisare();
    Ford f1 = new Ford(400 , 25000 , "Blue", 4500 );
    Ford f2 = new Ford(450 , 30000 , "Black", 2500 );
    f1.afisare();
    f2.afisare();
    Car c = new Car(500 , 10000, "Yellow");
    c.afisare();


    System.out.println("Toate Sale Price-urile Sunt : " + s.getSalePrice() + " , " +
            + f1.getSalePrice() + " , " + f2.getSalePrice() + " , " + c.getSalePrice());
    }
}
