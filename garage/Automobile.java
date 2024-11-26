package garage;

public class Automobile extends VeicoloAMotore {
    private int numPorte;

    public Automobile(int annoImmatricolazione, String marca, String modello, String tipoAlimentazione, int cilindrata, int numPorte) {
        super(annoImmatricolazione, marca, modello, tipoAlimentazione, cilindrata);
        this.numPorte = numPorte;
    }

    public int getNumPorte() {
        return numPorte;
    }

    public void setNumPorte(int numPorte) {
        this.numPorte = numPorte;
    }
    
    public String toString() {
        return super.toString() + ", Numero porte: " + numPorte;
    }
}
