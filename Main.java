
public class Main {
    public static void main(String[] args) {
        User us=new User("s30821@pjwstk.edu.pl");
        User us1=new User("s30212@pjwstk.edu.pl");
        User us2=new User("Stanislaw", "Radomski", "s30212@pjwstk.edu.pl", "654321");
        us.upgradeDoZarejestrowaniaKonta("Uladzislau", "Hurski", "123456");

        Product pr=new Product("telefon", 3900.00, 334455, 45);
        Product pr1=new Product("telefon", 3959.00, 334455, 45);
        Product pr2=new Product("telefon", 3950.00, 334455, 45);
        pr.setCena(3900.00);
    }
}