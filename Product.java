public class Product {
    private String nazwa;
    private double cena;
    private int kodProd;
    private int liczbaSztuk;

    public Product(String nazwa, double cena, int kodProd, int liczbaSztuk){
        this.nazwa=nazwa;
        this.cena=cena;
        this.kodProd=kodProd;
        this.liczbaSztuk=liczbaSztuk;
    }
    public String getNazwa(){
        return nazwa;
    }
    public double getCena(){
        return cena;
    }
    public int getKodProd(){
        return kodProd;
    }
    public int getLiczbaSztuk(){
        return liczbaSztuk;
    }
    public void setNazwa(String nazwa){
        this.nazwa=nazwa;
    }
    public void setCena(double cena){
        this.cena=cena;
    }
    public void setkodProd(int kodProd){
        this.kodProd=kodProd;
    }
    public void setliczbaSztuk(int liczbaSztuk){
        this.liczbaSztuk=liczbaSztuk;
    }


}
