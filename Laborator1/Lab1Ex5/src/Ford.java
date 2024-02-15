public class Ford extends Car{
    public int manufacturerDiscount;

    Ford(int speed , double regularPrice , String color, int manufacturerDiscount){
        super(speed,regularPrice,color);
        this.manufacturerDiscount=manufacturerDiscount;
    }
    @Override
    public double getSalePrice() {
        return super.getSalePrice()-this.manufacturerDiscount;
    }

    @Override
    public void afisare() {
        super.afisare();
        System.out.println("Manufacturer Discount = " + this.manufacturerDiscount );
    }
}
