package questao17.Main;

import questao17.Model.ConversaoTemperaturaExcecao;
import questao17.Model.ConversorTemperatura;

public class TemperaturaUtil {
    public static void main(String[] args) throws ConversaoTemperaturaExcecao {

        ConversorTemperatura c1 = new ConversorTemperatura(1);
        ConversorTemperatura c2 = new ConversorTemperatura(420);
        ConversorTemperatura c3 = new ConversorTemperatura(50.0);
        ConversorTemperatura c4 = new ConversorTemperatura(-273.15);

        System.out.println(c1.toFahrenheit());
        System.out.println(c2.toFahrenheit());
        System.out.println(c3.toFahrenheit());
        System.out.println(c4.toFahrenheit());

    }
}
