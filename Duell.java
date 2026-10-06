public class Duell {
    private Spieler spieler1, spieler2;

    public Duell(Spieler pSpieler1, Spieler pSpieler2) {
        this.spieler1 = pSpieler1;
        this.spieler2 = pSpieler2;
    }

    public String ermittleSieger() {
        if(spieler1.gesamtPunkte() > spieler2.gesamtPunkte()) {
            System.out.println("Spieler 1 gewinnt!");
            return "Spieler 1 gewinnt";
        }
        else if(spieler2.gesamtPunkte() > spieler1.gesamtPunkte()) {
            System.out.println("Spieler 2 gewinnt!");
            return "Spieler 2 gewinnt";
        }
        else {
            System.out.println("Unentschieden");
            return "Unentschieden.";
        }
    }
}