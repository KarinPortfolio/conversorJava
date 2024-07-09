package br.com.conversor;
import java.util.Map;

public class ConverteValor {

    private final Map<String, Double> conversion_rates;

    public ConverteValor(Map<String, Double> converteValor){
        conversion_rates = converteValor;
        throw new NullPointerException();

    }
    public double getValor(String currency){
        return conversion_rates.get(currency);


    }
}
