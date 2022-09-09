package questao5.Model;

public class EquipamentoSonoro extends Equipamento {
    int volume = 0;

    public void aumentarVol() {
        if (isLigado() == true) {
            if (volume >= 10) {
                System.out.println("O volume já está no máximo (10)");
            } else {
                volume = volume + 1;
            }
        } else {
            System.out.println("Não foi possível aumentar o volume, o aparelho está desligado!");
        }
    }

    public void diminuirVol() {
        if(isLigado() == true) {
            if (volume <= 0) {
                System.out.println("O volume já está no mínimo (0)");
            } else {
                volume = volume - 1;
            }
        } else {
            System.out.println("Não foi possível diminuir o volume, o aparelho está desligado!");
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
