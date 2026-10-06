public class Main {
    public static void main(String[] args) {
        Spieler spieler1 = new Spieler("Alice");
        Spieler spieler2 = new Spieler("Bob");
        spieler1.setzePunkte(0, 5);
        spieler2.setzePunkte(0, 5);
        Duell duell = new Duell(spieler1, spieler2);
        duell.ermittleSieger();
        spieler1.setzePunkte(0, 5);
        spieler2.setzePunkte(0, 8);
        duell.ermittleSieger();
        spieler1.setzePunkte(0, 7);
        spieler2.setzePunkte(0, 5);
        duell.ermittleSieger();
    }
}
