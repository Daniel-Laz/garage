package garage;

public class Garage {
    private VeicoloAMotore[] posti;
    private final int MAX_POSTI = 15;

    public Garage() {
        posti = new VeicoloAMotore[MAX_POSTI];
    }

    public int inserisciNuovoVeicolo(VeicoloAMotore veicolo) {
        for (int i = 0; i < MAX_POSTI; i++) {
            if (posti[i] == null) {
                posti[i] = veicolo;
                return i;
            }
        }
        return -1;
    }

    public VeicoloAMotore estraiVeicolo(int posto) {
        if (posto >= 0 && posto < MAX_POSTI && posti[posto] != null) {
            VeicoloAMotore veicolo = posti[posto];
            posti[posto] = null;
            return veicolo;
        }
        return null;
    }

    public void stampaSituazionePosti() {
        for (int i = 0; i < MAX_POSTI; i++) {
            if (posti[i] == null) {
                System.out.println("Posto " + i + ": Vuoto");
            } else {
                System.out.println("Posto " + i + ": " + posti[i]);
            }
        }
    }
}
