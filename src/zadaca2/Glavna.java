package zadaca2;

public class Glavna {
	public static void main(String[] args){
    Restoran r=new Restoran();
		r.setIme("Kapri");
		r.setLokacija("Kaj Angroto");
		r.setTel("075-555-234");
		r.setBrsedista(40);

		System.out.println("Ime: " + r.getIme());
		System.out.println("Lokacija: " + r.getLokacija());
		System.out.println("Telefon:  " + r.getTel());
		System.out.println("Broj na sedista:  " + r.getBrsedista());
}
}
