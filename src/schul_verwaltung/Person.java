package schul_verwaltung;

public class Person {

private  String name;
private  String nachName;
private String ausweisNummer;
private  int alt;

    public Person() {
    }

    public Person(String name, String nachName, String ausweisNummer, int alt) {
        this.name = name;
        this.nachName = nachName;
        this.ausweisNummer = ausweisNummer;
        this.alt = alt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public String getausweisNummer() {
        return ausweisNummer;
    }

    public void setausweisNummer(String ausweisNummer) {
        this.ausweisNummer = ausweisNummer;
    }

    public int getAlt() {
        return alt;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nachName='" + nachName + '\'' +
                ", idNummer='" + ausweisNummer + '\'' +
                ", alt=" + alt +
                '}';
    }
}
