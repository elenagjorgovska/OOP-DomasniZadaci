package zadaca1;

public class Glavna {
    public static void main(String[] args) {
        Covek c =new Covek();
        c.setIme("RAJko");
        c.setPrezime("Markovski");
        c.setEmbg("27474848489");

        System.out.println("Ime: " + c.getIme());
        System.out.println("Prezime: "+ c.getPrezime());
        System.out.println("EMBG: "+ c.getEmbg());
    }
}
