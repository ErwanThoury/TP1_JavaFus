package sio.tp1_javafus;

public class Monstre {
    private String nom;
    private String img;
    private int pvActuel;
    private int pvMax;
    private int attaque;
    private int defense;
    private int coupCritique;
    private int kamaGagneMax;
    private int kamaGagneMin;
    private static String deuxPointZero = "";
    public Monstre(String unNom, String unImg, int pvMax, int attaque, int defense, int critique, int kamaGagneMin, int kamaGagneMax){
        this.img = unImg;
        this.nom = unNom;
        this.attaque = attaque;
        this.defense = defense;
        this.coupCritique = critique;
        this.pvMax = pvMax;
        this.pvActuel = pvMax;
        this.kamaGagneMin = kamaGagneMin;
        this.kamaGagneMax = kamaGagneMax;
    }

    public static void setDeuxPointZero(String laDeuxPointZero) {
        deuxPointZero = laDeuxPointZero;
    }
    public void resetImage()
    {
        this.img = deuxPointZero + this.img;
    }
    public int reduitAttaque(int degat)
    {
        degat = degat - this.defense;
        if (degat <= 0)
            degat = 0;
        return degat;
    }

    public int perdrePDV(int degat)
    {
        degat = (int)(0.5 * degat + reduitAttaque(degat));
        this.pvActuel -= degat;
        return degat;
    }
    public int alea() { return (int)(Math.random() * 101 );}
    public int attaqueTotale()
    {
        int degatTotal = this.attaque;
        if(alea() < this.coupCritique)
            degatTotal += degatTotal;
        return degatTotal;
    }
    public String getNom() {
        return nom;
    }

    public String getImg() {
        return img;
    }

    public int getPvActuel() {
        return pvActuel;
    }

    public int getPvMax() {
        return pvMax;
    }

    public int getAttaque() {
        return attaque;
    }

    public int getDefense() {
        return defense;
    }

    public int getCoupCritique() {
        return coupCritique;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public void setPvActuel(int pvActuel) {
        this.pvActuel = pvActuel;
    }

    public void setPvMax(int pvMax) {
        this.pvMax = pvMax;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setCoupCritique(int coupCritique) {
        this.coupCritique = coupCritique;
    }

    public void setKamaGagneMax(int kamaGagneMax) {
        this.kamaGagneMax = kamaGagneMax;
    }

    public void setKamaGagneMin(int kamaGagneMin) {
        this.kamaGagneMin = kamaGagneMin;
    }

    public int getKamaGagneMax() {
        return kamaGagneMax;
    }

    public int getKamaGagneMin() {
        return kamaGagneMin;
    }
}
