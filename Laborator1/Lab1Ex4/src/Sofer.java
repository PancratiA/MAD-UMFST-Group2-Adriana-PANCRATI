public class Sofer {
    private String  nume;
    private int numarSofer;
    private double inaltime;
  Sofer(String nume , int numarSofer, double inaltime){
      this.nume=nume;
      this.numarSofer=numarSofer;
      this.inaltime=inaltime;
  }
  Sofer(){}
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getInaltime() {
        return inaltime;
    }

    public int getNumarSofer() {
        return numarSofer;
    }

    public void setInaltime(double inaltime) {
        this.inaltime = inaltime;
    }

    public void setNumarSofer(int numarSofer) {
        this.numarSofer = numarSofer;
    }
}
