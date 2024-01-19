package com.coding.programs;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CountryCodeAPIWithJava11 {

    public static void main(String[] args) {
        String countryName = "Afghanistan";  // Replace with the actual country name
        String phoneNumber = "1234567890"; // Replace with the actual phone number

        String result = getFormattedNumber(countryName, phoneNumber);

        System.out.println(result);
    }

    private static String getFormattedNumber(String countryName, String phoneNumber) {
        try {
            String apiUrl = "https://jsonmock.hackerrank.com/api/countries?name=" + countryName;

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .GET()
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            String responseBody = response.body();

            if (responseBody == null || responseBody.isEmpty()) {
                return "-1";
            }

            String callingCode = parseCallingCode(responseBody);
            if (callingCode.equals("-1")) {
                return "-1";
            }

            String formattedNumber = "+" + callingCode + " " + phoneNumber;
            return formattedNumber;
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return "-1";
        }
    }

    private static String parseCallingCode(String responseBody) {
        try {
            // Assuming a simple JSON structure for demonstration purposes
            String callingCodes = responseBody.split("\"callingCodes\":")[1].split("\\[")[1].split("]")[0].split(",")[0];
            return callingCodes.replaceAll("\"", "").trim();
        } catch (Exception e) {
            e.printStackTrace();
            return "-1";
        }
    }
}
