public class Spieler {
    private String name;
    private int[] punkte;

    public Spieler(String pName) {
        name = pName;
        punkte = new int[5];
    }

    public void setzePunkte(int pRunde, int pPunkte) {
        if (pRunde >= 0 && pRunde < punkte.length) {
            punkte[pRunde] = pPunkte;
        } else {
            System.out.println("Ungültige Runde: " + pRunde);
        }
    }

    public int gesamtPunkte() {
        int summe = 0;
        for (int punkt : punkte) {
            summe += punkt;
        }
        return summe;
    }

    public int anzahlGuterRunden(int pGrenze) {
        int count = 0;
        for (int punkt : punkte) {
            if (punkt >= pGrenze) {
                count++;
            }
        }
        return count;
    }

    public String gibName() {
        return name;
    }
}