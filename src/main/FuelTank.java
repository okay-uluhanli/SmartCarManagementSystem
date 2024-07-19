package main;

public class FuelTank {
    private int kapazität;
    private int tankstand;

    public FuelTank(int kapazität) {
        this.kapazität = kapazität;
        this.tankstand = kapazität;
    }

    public int getTankstand() {
        return tankstand;
    }

    public void tanken(int menge) {
        if (tankstand + menge <= kapazität) {
            tankstand += menge;
            System.out.println(menge + "L getankt. Aktueller Tankstand: " + tankstand + "L.");
        } else {
            System.out.println("Kann nicht " + menge + "L tanken. Tankkapazität überschritten.");
        }
    }

    public void verbrauchen(int menge) {
        if (tankstand >= menge) {
            tankstand -= menge;
        } else {
            tankstand = 0;
        }
    }
}
