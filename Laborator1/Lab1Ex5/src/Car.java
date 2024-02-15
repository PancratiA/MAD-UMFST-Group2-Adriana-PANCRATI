public class Car {
    public int speed;
    public double regularPrice;
    public String color;

    Car(int speed , double regularPrice , String color){
        this.speed=speed;
        this.regularPrice=regularPrice;
        this.color=color;
    }
    public double getSalePrice() {
        return regularPrice+regularPrice/2; //adauga 50% pentru a fi diferit fata de regular price
        //putem avea si return regularPrice; daca dorim
    }
    public void afisare(){
        System.out.println("Speed = " + this.speed );
        System.out.println("Regular Price = " + this.regularPrice );
        System.out.println("Sale Price = " + this.getSalePrice() );
        System.out.println("Color = " + this.color );
    }
}
