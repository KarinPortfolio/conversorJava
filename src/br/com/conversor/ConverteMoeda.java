package br.com.conversor;

import static java.lang.String.format;

public class ConverteMoeda {
private final ChamaApi chamaApi = new ChamaApi();
    public void modifica(String fromCurrency, String toCurrency, double amount) {
        ConverteValor rates = chamaApi.getConverteValor(fromCurrency);
        double rate = rates.getValor(toCurrency);
        double result = amount * rate;
        String conversion = String.format("%.2f %s = %.2f %s%n",amount, fromCurrency, result, toCurrency);

        System.out.println(conversion);
        }

}
