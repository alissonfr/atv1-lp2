package questao5.Model;

public class EquipamentoSonoro extends Equipamento{
    int volume = 0;

    public void aumentarVol() {
        if (volume > 10) {
            System.out.println("erro, volume já é 10");
        } else {
            volume = volume + 1;
        }
    }

    public void diminuirVol() {
        if (volume > 0) {
            System.out.println("erro, volume já está em 0");
        } else {
            volume = volume - 1;
        }
    }

    @Override
    public void desligar() {
        setLigado(false);
        volume = 0;
    }

    public EquipamentoSonoro(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
