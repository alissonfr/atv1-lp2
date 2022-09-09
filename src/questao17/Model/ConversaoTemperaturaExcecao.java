package questao17.Model;

public class ConversaoTemperaturaExcecao extends Exception {
    @Override
    public String getMessage(){
        return "\nErro! O resultado de conversão de temperatura para graus Fahrenheit é inferior ao zero absoluto (459,67°F).";
    }
}
