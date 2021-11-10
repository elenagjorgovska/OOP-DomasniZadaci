package domasna2;
import java.util.Scanner;

public class Glavna {
    public static void main(String[] args) {
        int sansi;

        Brojac p = new Brojac();
        Brojac g = new Brojac();

        Scanner sc = new Scanner (System.in);
        System.out.println("Vnesete sansi za frlanja : ");
        sansi = sc.nextInt();

        while (sansi > 0) {
            p.reset();
            g.reset();

            for(int i=0; i<sansi; i++)
            {
                if(Math.random() < 0.5)
                    p.zgolemi();
                else
                    g.zgolemi();
            }
            System.out.println("Od " + sansi + " sansi");
            System.out.println(p.brojac + " se pisma");
            System.out.println(g.brojac + " se glavi");

            System.out.println("Vnesete sansi za povtorno frlanje: ");
            sansi = sc.nextInt();

        }
        sc.close();
    }
}

