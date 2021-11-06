import java.util.*;

    public class Covek {
        private String ime;
        private String prezime;
        private String telefon;

        public Covek()
        {
            ime="";
            prezime="";
            telefon="";
        }
        public String getIme(){
            return ime;
        }
        public String getPrezime(){
            return prezime;
        }
        public String getTelefon(){
            return telefon;
        }
        public void setIme(String ime){
            this.ime=ime;
        }
        public void setPrezime(String prezime){
            this.prezime=prezime;
        }
        public void setTelefon(String telefon){
            this.prezime=prezime;
        }
        public void toStringCovek(){
            System.out.println(ime+" "+prezime+" "+telefon+" ");
        }
    }
    class Ocenka{
        private String predmet;
        private String data;
        private int ocena;

        public Ocenka()
        {
            predmet="";
            data="";
            ocena=0;
        }
        public String getPredmet(){
            return predmet;
        }
        public String getData(){
            return data;
        }
        public int getOcena(){
            return ocena;
        }
        public void setPredmet(String predmet){
            this.predmet=predmet;
        }
        public void setData(String data){
            this.data=data;
        }
        public void setOcena(int ocena){
            this.ocena=ocena;
        }
        public void toStringOcena(){
            System.out.println(predmet+" "+data+" "+ocena+" ");
        }
    }
    class Student extends Covek{

        private Ocenka []ocen=new Ocenka[100];
        private int br;

        public Student(){
            super();
            ocen=null;
            br=0;
        }
        public int getBr(){
            return br;
        }
        public Ocenka []getOcenka(){
            return ocen;
        }
        public void setBr(int br){
            this.br=br;
        }
        public void setOcenka(Ocenka o[]){

            this.ocen=o;
        }
        public void toStringStudent(){
            System.out.println();
            for(int i=0;i<br;i++)
                System.out.println(ocen[i]+" ");
        }
        public double prosek(){
            int sum=0;
            for(int i=0;i<br;i++)
                sum=sum+ocen[i].getOcena();
            return sum/br;
        }
    }