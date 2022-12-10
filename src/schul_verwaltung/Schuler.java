package schul_verwaltung;

public class Schuler extends Person{

private String klasse;
private int nummerDerSchuler;

    public Schuler() {
    }

    public Schuler(String name, String nachName, String ausweisNummer, int alt) {
        super(name, nachName, ausweisNummer, alt);
    }

    public Schuler(String klasse, int nummerDerSchuler) {
        this.klasse = klasse;
        this.nummerDerSchuler = nummerDerSchuler;
    }

    public Schuler(String name, String nachName, String ausweisNummer, int alt, String klasse, int nummerDerSchuler) {
        super(name, nachName, ausweisNummer, alt);
        this.klasse = klasse;
        this.nummerDerSchuler = nummerDerSchuler;
    }

    public String getKlasse() {
        return klasse;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }

    public int getNummerDerSchuler() {
        return nummerDerSchuler;
    }

    public void setNummerDerSchuler(int nummerDerSchuler) {
        this.nummerDerSchuler = nummerDerSchuler;
    }
}
