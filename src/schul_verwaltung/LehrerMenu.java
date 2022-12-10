package schul_verwaltung;

import java.util.ArrayList;
import java.util.Scanner;

public class LehrerMenu implements Transaktionen{
/*
=============Transaktionen============
1. Hinfügen
2. Nach Suchen
3. Listing
4. Löschen(Radieren)
Q. Abmelden
 */

ArrayList<Lehrer> lehrerList=new ArrayList<>();
Scanner scan = new Scanner(System.in);
void lehrerMenu(){
    System.out.println("=============Transaktionen============\n" +
            "1. Hinfügen\n" +
            "2. Nach Suchen\n" +
            "3. Listing\n" +
            "4. Löschen(Radieren)\n" +
            "Q. Abmelden + " +
            "Ihrer Auswahl : ");

while(true){
    char auswahl=scan.next().toUpperCase().charAt(0);
    switch(auswahl) {
        case '1' : {hinfugen();}
        case '2' : {nachSuchen();}
        case '3' : {listing();}
        case '4' : {loschen();}
        case 'Q' : {abmelden();}




    }

}


}



    @Override
    public void hinfugen() {
        System.out.println("Bitte geben Sie den Namen des Lehrers : ");
        String lehName = scan.nextLine();
        System.out.println("Bitte geben Sie den Namen des Lehrers : ");
        String lehNachName=scan.nextLine();
        System.out.println("Bitte geben Sie die Ausweisnummer des Lehrers : ");
        String ausweisNummer = scan.next();
        System.out.println("Bitte geben Sie das Alter des Lehrers : ");
        int alter= scan.nextInt();
        System.out.println("Bitte geben Sie das Branche des Lehrers : ");
        String branche=scan.nextLine();
        System.out.println("Bitte geben Sie die Registrationsnummer des Lehrers : ");
        Lehrer lehrer=new Lehrer(lehName,lehNachName,ausweisNummer,alter);
        lehrerList.add(lehrer);
        lehrerMenu();
}

    @Override
    public void nachSuchen() {
    if(!lehrerList.isEmpty()){
        System.out.println("Bitte geben Sie zusuchende Ausweisnummer ein : ");
        String ausweisNummer= scan.next();
        for (Lehrer each:lehrerList ) {
            if (each.getausweisNummer().equals(ausweisNummer)){
                System.out.println(each.toString());
            }else {
                System.out.println("Keine Info wurde festtgestellt,die mit der Ausweisnummer zu tun haben !! ");
                lehrerMenu();
            }
        }





    }else {
        System.out.println("Lehrer List ist leer!!!");
        lehrerMenu();
    }


}

    @Override
    public void listing() {
if (!lehrerList.isEmpty()){
    for (Lehrer each:lehrerList) {
        System.out.println(each.toString());
        lehrerMenu();
    }
}



}
 @Override
    public void loschen() {
if (!lehrerList.isEmpty()){
    System.out.println("Bitte geben Sie die Ausweisnummer,die Sie löschen wollen : ");
    String ausweisnummer=scan.next();
    for (int i = 0; i < lehrerList.size(); i++) {
        if (lehrerList.get(i).getausweisNummer().equals(ausweisnummer)){
            lehrerList.remove(i);
            lehrerMenu();
        }
    }
        }else {    System.out.println("Lehrer List ist leer!!!");
            lehrerMenu();
}
    }


    @Override
    public void abmelden() {
        HauptMenu hauptMenu= new HauptMenu();
        hauptMenu.hauptMenu();
    }
}
