package schul_verwaltung;

import java.util.Locale;
import java.util.Scanner;

public class HauptMenu {
/*
====================================
Schüler und Lehrer Verwaltungspanel
====================================
1. Schüler Transaktionen
2. Lehrer  Transaktionen
Q. Abmelden
 */
void  hauptMenu(){
    System.out.println("==================================\n" +
                      "Schüler und Lehrer Verwaltungspanel\n" +
            "====================================\n" +
            "1. Schüler Transaktionen\n" +
            "2. Lehrer  Transaktionen\n" +
            "Q. Abmelden\n" +
            "IHR AUSWAHL : ");
    Scanner scan=new Scanner(System.in);

    while (true){
        char auswahl=scan.next().toUpperCase().charAt(0);
        switch (auswahl){
            case '1':{
SchulerMenu schMenu=new SchulerMenu();
schMenu.schulerMenu();
            }
            case '2':{
        LehrerMenu lehrMenu=new LehrerMenu();
        lehrMenu.lehrerMenu();
            }
            case 'Q':{
                System.out.println("TSHCHÜSS!!!");
                System.exit(0);
            }
            default: {
                System.out.println("Bitte geben Sie einen gültigen Wert");
                hauptMenu();
            }

        }
    }
}


}
