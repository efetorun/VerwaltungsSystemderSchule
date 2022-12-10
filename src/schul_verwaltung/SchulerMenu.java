package schul_verwaltung;

import java.util.ArrayList;
import java.util.Scanner;

public class SchulerMenu implements Transaktionen {

    ArrayList<Schuler> schulerArrayList = new ArrayList<>();

    Scanner scan = new Scanner(System.in);

    void schulerMenu() {
        System.out.println("=============Transaktionen============\n" +
                "1. Hinfügen\n" +
                "2. Nach Suchen\n" +
                "3. Listing\n" +
                "4. Löschen(Radieren)\n" +
                "Q. Abmelden\n" +
                "Ihr Wahl : ");

        while (true) {
            char auswahl = scan.next().toUpperCase().charAt(0);
            switch (auswahl) {
                case '1': {
                    hinfugen();
                }
                case '2': {
                    nachSuchen();
                }
                case '3': {
                    listing();
                }
                case '4': {
                    loschen();
                }
                case 'Q': {
                    abmelden();
                }


            }
        }
    }


    @Override
    public void hinfugen() {
        System.out.println("Bitte geben Sie Ihren Namen ein : ");
        scan.nextLine();
        String name = scan.nextLine();
        System.out.println("Bitte geben Sie Ihren Nachnamen ein : ");
        String nachName = scan.nextLine();
        System.out.println("Bitte geben Sie Ihre ausweisNummer ein : ");
        String ausweisNummer = scan.next();
        System.out.println("Bitte geben Sie Ihre alt ein : ");
        int alt = scan.nextInt();
        System.out.println("Bitte geben Sie Ihre Klasse ein : ");
        String klasse = scan.next();
        System.out.println("Bitte geben Sie Ihre nummerDerSchuler ein : ");
        int nummerDerSchuler = scan.nextInt();
        Schuler schuler = new Schuler(name, nachName, ausweisNummer, alt, klasse, nummerDerSchuler);
        schulerArrayList.add(schuler);
        schulerMenu();
    }

    @Override
    public void nachSuchen() {
        if (!schulerArrayList.isEmpty()) {
            System.out.println("Bitte geben Sie die Ausweißnummer ein,die gesucht werden wird");
            String zuSuchendeANummmer = scan.next();
            for (Schuler each : schulerArrayList) {
                if (each.getausweisNummer().equals(zuSuchendeANummmer)) {
                    System.out.println(each.toString());
                    schulerMenu();
                }else {
                    System.out.println(zuSuchendeANummmer + "Keine Info wurden festgestellt,die sich auf Ausweisnummer bezieht!!");
                schulerMenu();
                }
            }
            schulerMenu();
        } else {
            System.out.println("List der Schuler ist leer!!!");
            schulerMenu();
        }


    }

    @Override
    public void listing() {
        if (!schulerArrayList.isEmpty()) {
            for (Schuler each : schulerArrayList) {
                System.out.println(each.toString());
            }
            schulerMenu();
        } else {
            System.out.println("List der Schuler ist leer!!!");
            schulerMenu();
        }


    }

    @Override
    public void loschen() {
        if (!schulerArrayList.isEmpty()) {
            System.out.println("Bitte geben Sie die Ausweißnummer ein,die gelöscht werden wird");
            String zuSuchendeANummmer = scan.next();
            for (int i = 0; i < schulerArrayList.size(); i++) {
               if (zuSuchendeANummmer.equals(schulerArrayList.get(i).getausweisNummer())){
                   schulerArrayList.remove(i);
                   schulerMenu();
               }
            }
            schulerMenu();
        }
    }

    @Override
    public void abmelden() {
HauptMenu hauptMenu= new HauptMenu();
hauptMenu.hauptMenu();
    }


}