package garage;

public class Motocicletta extends VeicoloAMotore {
    private String tipologia;

    public Motocicletta(int annoImmatricolazione, String marca, String modello, String tipoAlimentazione, int cilindrata, String tipologia) {
        super(annoImmatricolazione, marca, modello, tipoAlimentazione, cilindrata);
        this.tipologia = tipologia;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public String toString() {
        return super.toString() + ", Tipologia: " + tipologia;
    }
}
