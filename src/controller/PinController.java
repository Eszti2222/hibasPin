
package controller;

import modell.PinModell;

public class PinController {
    private PinModell modell;

    public PinController(PinModell modell) {
        this.modell = modell;
    }

    public boolean hozzaadSzam(String szam) {
        return modell.hozzaadSzam(szam);
    }

    public String getPin() {
        return modell.getPin();
    }

    public void reset() {
        modell.reset();
    }

    public boolean isMentve() {
        return modell.isMentve();
    }
}

