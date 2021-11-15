package zadaca4;

public class Avtomobil {
    private String marka;
    private String model;
    private double pominatiKm;
    private String boja;

    public Avtomobil (String marka, String model, double pominatiKm, String boja) {
        this.marka = marka;
        this.model = model;
        this.pominatiKm = pominatiKm;
        this.boja = boja;
    }

    public double mnoziKm (double pomnoziKm) {
        double vkupnoKm = this.pominatiKm * pomnoziKm;
        return vkupnoKm;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPominatiKm() {
        return pominatiKm;
    }

    public void setPominatiKm(double pominatiKm) {
        this.pominatiKm = pominatiKm;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }
}

