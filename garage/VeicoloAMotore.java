package garage;

public class VeicoloAMotore {
    private int annoImmatricolazione;
    private String marca;
    private String modello;
    private String tipoAlimentazione;
    private int cilindrata;

    public VeicoloAMotore(int annoImmatricolazione, String marca, String modello, String tipoAlimentazione, int cilindrata) {
        this.annoImmatricolazione = annoImmatricolazione;
        this.marca = marca;
        this.modello = modello;
        this.tipoAlimentazione = tipoAlimentazione;
        this.cilindrata = cilindrata;
    }

    public int getAnnoImmatricolazione() {
        return annoImmatricolazione;
    }

    public void setAnnoImmatricolazione(int annoImmatricolazione) {
        this.annoImmatricolazione = annoImmatricolazione;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getTipoAlimentazione() {
        return tipoAlimentazione;
    }

    public void setTipoAlimentazione(String tipoAlimentazione) {
        this.tipoAlimentazione = tipoAlimentazione;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
    
    public String toString() {
        return "Anno: " + annoImmatricolazione + ", Marca: " + marca + ", Modello: " + modello +
               ", Alimentazione: " + tipoAlimentazione + ", Cilindrata: " + cilindrata + "cc";
    }
}
