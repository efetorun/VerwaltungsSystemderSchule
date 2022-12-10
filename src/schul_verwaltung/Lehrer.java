package schul_verwaltung;

public class Lehrer extends Person{

    private String branche;
    private String regstNummer;

    public Lehrer() {
    }

    public Lehrer(String name, String nachName, String ausweisNummer, int alt) {
        super(name, nachName, ausweisNummer, alt);
    }

    public Lehrer(String name, String nachName, String ausweis, int alt, String branche, String regstNummer) {
        super(name, nachName, ausweis, alt);
        this.branche = branche;
        this.regstNummer = regstNummer;
    }




    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    public String getRegstNummer() {
        return regstNummer;
    }

    public void setRegstNummer(String regstNummer) {
        this.regstNummer = regstNummer;
    }


    @Override
    public String toString() {
        return "Lehrer{" +
                "branche='" + branche + '\'' +
                ", regstNummer='" + regstNummer + '\'' +
                '}';
    }
}
