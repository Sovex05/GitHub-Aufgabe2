public class Duell {
    private Spieler spieler1, spieler2;

    public Duell(Spieler pSpieler1, Spieler pSpieler2) {

    }

    public String ermittleSieger() {
        if(spieler1.gesamtPunkte() > spieler2.gesamtPunkte()) {
            return "Spieler 1 gewinnt";
        }
        else if(spieler2.gesamtPunkte() > spieler1.gesamtPunkte()) {
            return "Spieler 2 gewinnt";
        }
        else {
            return "Unentschieden.";
        }
    }
}