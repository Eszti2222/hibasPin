
package modell;

import controller.PinController;


public class PinModell {
    private String pin = "";
    private int kattDb = 0;
    private boolean mentve = false;

    public boolean hozzaadSzam(String szam) {
        if (kattDb < 4) {
            pin += szam;
            kattDb++;
            if (kattDb == 4) {
                mentve = true;
                return true; // PIN kész
            }
        }
        return false;
    }

    public String getPin() {
        return pin;
    }

    public void reset() {
        pin = "";
        kattDb = 0;
        mentve = false;
    }

    public boolean isMentve() {
        return mentve;
    }

}
