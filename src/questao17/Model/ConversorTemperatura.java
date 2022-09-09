package questao17.Model;

public class ConversorTemperatura {
    double celsius;

    public double toFahrenheit() throws ConversaoTemperaturaExcecao {
    if(celsius <= -273.15) {
        throw new ConversaoTemperaturaExcecao();
    } else {
        double result = ((celsius*9)/5)+32;
        return result;
    }
    }

    public ConversorTemperatura(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
