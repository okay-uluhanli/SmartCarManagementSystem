package main;

public class Maintenance {
    private int gefahreneKilometer;

    public Maintenance() {
        this.gefahreneKilometer = 0;
    }

    public void fahren(int kilometer) {
        gefahreneKilometer += kilometer;
    }

    public void überprüfen() {
        if (gefahreneKilometer >= 10000) {
            System.out.println("Wartung erforderlich!");
        } else {
            System.out.println("Nächste Wartung in " + (10000 - gefahreneKilometer) + " km.");
        }
    }
}
