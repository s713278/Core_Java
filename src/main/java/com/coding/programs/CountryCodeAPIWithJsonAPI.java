package com.coding.programs;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CountryCodeAPIWithJsonAPI {

    public static void main(String[] args) {
        String countryName = "country";  // Replace with the actual country name
        String phoneNumber = "1234567890"; // Replace with the actual phone number

        String result = getFormattedNumber(countryName, phoneNumber);

        System.out.println(result);
    }

    private static String getFormattedNumber(String countryName, String phoneNumber) {
        try {
            String apiUrl = "https://jsonmock.hackerrank.com/api/countries?name=" + countryName;

            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();
            connection.disconnect();

            JSONObject json = new JSONObject(response.toString());

            JSONArray data = json.getJSONArray("data");

            if (data.length() == 0) {
                return "-1";
            }

            JSONObject countryInfo = data.getJSONObject(data.length() - 1); // Using the highest index

            String callingCode = countryInfo.getJSONArray("callingCodes").getString(0);
            String formattedNumber = "+" + callingCode + " " + phoneNumber;

            return formattedNumber;
        } catch (Exception e) {
            e.printStackTrace();
            return "-1";
        }
    }
}
