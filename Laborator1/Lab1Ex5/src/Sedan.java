public class Sedan extends Car{
    public int length;
    Sedan(int speed , double regularPrice , String color ,int length){
        super(speed, regularPrice,color);
        this.length=length;
    }
    @Override
    public double getSalePrice() {
        if(this.length>20) return super.getSalePrice()-0.05*super.getSalePrice();
        else return super.getSalePrice()-0.1*super.getSalePrice();
    }

    @Override
    public void afisare() {
        super.afisare();
        System.out.println("Length =" + this.length );
       // System.out.println(super.getSalePrice());
       // System.out.println(0.1*super.getSalePrice());

    }
}
