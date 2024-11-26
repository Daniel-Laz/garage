package garage;

public class Furgone extends VeicoloAMotore {
    private int capacitaCarico;

    public Furgone(int annoImmatricolazione, String marca, String modello, String tipoAlimentazione, int cilindrata, int capacitaCarico) {
        super(annoImmatricolazione, marca, modello, tipoAlimentazione, cilindrata);
        this.capacitaCarico = capacitaCarico;
    }

    public int getCapacitaCarico() {
        return capacitaCarico;
    }

    public void setCapacitaCarico(int capacitaCarico) {
        this.capacitaCarico = capacitaCarico;
    }

    public String toString() {
        return super.toString() + ", Capacità di carico: " + capacitaCarico + " kg";
    }
}
