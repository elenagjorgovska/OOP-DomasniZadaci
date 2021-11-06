import java.util.*;

public class Glavna {
    public static void main(String[] args) {
    int n;
    String ime,prezime,telefon,predmet,data;
    int br,ocena;
    Scanner sc=new Scanner(System.in);
    System.out.println("Vnesete broj na studenti: ");
    n=sc.nextInt();
    Student niza[]=new Student[100];
    for(int i=0;i<n;i++)
    {
        Student s=new Student();
        System.out.println("Vnesete ime na studentot: ");
        ime=sc.next();
        System.out.println("Vnesete prezime na studentot: ");
        prezime=sc.next();
        System.out.println("Vnesete telefon na studentot: ");
        telefon=sc.next();
        System.out.println("Vnesete broj na predmeti: ");
        br=sc.nextInt();
        s.setIme(ime);
        s.setPrezime(prezime);
        s.setTelefon(telefon);
        s.setBr(br);
        Ocenka []o=new Ocenka[100];
        for(int j=0;j<br;j++)
        {
            Ocenka ol=new Ocenka();
            System.out.println("Vnesete ime na predmet: ");
            predmet=sc.next();
            System.out.println("Vnesete data na polaganje na predmet: ");
            data=sc.next();
            System.out.println("Vnesete ocenka na predmet: ");
            ocena=sc.nextInt();
            ol.setPredmet(predmet);
            ol.setData(data);
            ol.setOcena(ocena);
            o[j]=ol;
        }
        s.setOcenka(o);
        niza[i]=s;
    }

    for(int i=0;i<n;i++)
    {
        System.out.println();
        niza[i].toStringCovek();
        for(int j=0;j<niza[i].getBr();j++)
        {
            System.out.print(" " +niza[i].getOcenka()[j].getPredmet()+" ");
            System.out.print(niza[i].getOcenka()[j].getData()+" ");
            System.out.print(niza[i].getOcenka()[j].getOcena()+" ");

        }
        System.out.print(niza[i].prosek());
    }
}
}
