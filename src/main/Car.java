package main;

public class Car {
    private String marke;
    private String modell;
    private int baujahr;
    private int geschwindigkeit;
    private Engine motor;
    private FuelTank tank;
    private Maintenance wartung;

    public Car(String marke, String modell, int baujahr, int tankKapazität) {
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.geschwindigkeit = 0;
        this.motor = new Engine();
        this.tank = new FuelTank(tankKapazität);
        this.wartung = new Maintenance();
    }

    public void beschleunigen(int erhöhung) {
        if (motor.istAn() && tank.getTankstand() > 0) {
            geschwindigkeit += erhöhung;
            tank.verbrauchen(erhöhung / 10);
            System.out.println("Geschwindigkeit auf " + geschwindigkeit + " km/h erhöht.");
        } else {
            System.out.println("Kann nicht beschleunigen. Entweder ist der Motor aus oder der Tank ist leer.");
        }
    }

    public void verlangsamen(int verringerung) {
        if (geschwindigkeit > 0) {
            geschwindigkeit -= verringerung;
            System.out.println("Geschwindigkeit auf " + geschwindigkeit + " km/h verringert.");
        } else {
            System.out.println("Das Auto steht bereits still.");
        }
    }

    public void stoppen() {
        geschwindigkeit = 0;
        System.out.println("Auto gestoppt.");
    }

    public void tanken(int menge) {
        tank.tanken(menge);
    }

    public void motorStarten() {
        motor.starten();
    }

    public void motorStoppen() {
        motor.stoppen();
    }

    public void wartungÜberprüfen() {
        wartung.überprüfen();
    }

    @Override
    public String toString() {
        return "Auto [Marke=" + marke + ", Modell=" + modell + ", Baujahr=" + baujahr + ", Geschwindigkeit=" + geschwindigkeit + " km/h, Tankstand=" + tank.getTankstand() + "L, Motor an=" + motor.istAn() + "]";
    }
}
