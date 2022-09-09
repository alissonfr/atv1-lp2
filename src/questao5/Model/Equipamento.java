package questao5.Model;

public class Equipamento {
    private boolean ligado;

    public Equipamento() {
        this.ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void ligar() {
        setLigado(true);
    }

    public void desligar() {
        setLigado(false);
    }

    protected void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}