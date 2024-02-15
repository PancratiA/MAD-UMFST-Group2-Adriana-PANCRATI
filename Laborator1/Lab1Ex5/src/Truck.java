public class Truck extends Car{
    public int weight;

    Truck(int speed , double regularPrice , String color , int weight){
        super(speed,regularPrice,color);
        this.weight=weight;
    }
    @Override
    public double getSalePrice() {
        if(this.weight > 1000) return super.getSalePrice()- 0.1*super.getSalePrice(); // 0.1 = 10%
        else return super.getSalePrice()- 0.2*super.getSalePrice(); //0.2 = 20%
    }

    @Override
    public void afisare() {
        super.afisare();
        System.out.println("Weight = " + this.weight );
    }
}
