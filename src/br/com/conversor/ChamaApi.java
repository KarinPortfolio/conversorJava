package br.com.conversor;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ChamaApi {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/96cdc9345154770797b7a6f8/latest/USD";

    public ConverteValor getConverteValor(String baseCurrency){
        try {
            HttpClient client =  HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(API_URL.replace("USD", baseCurrency))).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            return gson.fromJson(response.body(), ConverteValor.class);
        }
    catch (Exception e){
            e.printStackTrace();
            return null;
    }
    }
}
