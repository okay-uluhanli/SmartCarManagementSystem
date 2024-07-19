package main;

public class Engine {
    private boolean an;

    public void starten() {
        an = true;
        System.out.println("Motor gestartet.");
    }

    public void stoppen() {
        an = false;
        System.out.println("Motor gestoppt.");
    }

    public boolean istAn() {
        return an;
    }
}
