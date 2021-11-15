package zadaca4;

public class Glavna {
    public static void main(String[] args) {
        Avtomobil a = new Avtomobil("Audi", "A4", 150000, "crna");

        System.out.println("Marka: " + a.getMarka());
        System.out.println("Model: " + a.getModel());
        System.out.println("Kilometri pred mnozenje: " + a.getPominatiKm());
        System.out.println("Kilometri posle mnozenje: " + a.mnoziKm(5));
        System.out.println("Boja: " + a.getBoja());
    }
}
