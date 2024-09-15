package services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import dtos.WeatherInfoDTO;

public class WeatherService {

    public static void main(String[] args) {
        try {
            // Create an HttpClient instance
            HttpClient client = HttpClient.newHttpClient();

            // Create a request
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI("https://vejr.eu/api.php?location=Roskilde&degree=C"))
                    .version(HttpClient.Version.HTTP_1_1)
                    .GET()
                    .build();

            // Send the request and get the response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Check the status code and print the response
            if (response.statusCode() == 200) {
                System.out.println(response.body());
                // Example JSON string
                String json = response.body();
                // Create ObjectMapper instance
                ObjectMapper objectMapper = new ObjectMapper();

                try {
                    // Convert JSON string to WeatherInfoDTO
                    WeatherInfoDTO weatherInfoDTO = objectMapper.readValue(json, WeatherInfoDTO.class);

                    // Print the weatherInfoDTO object
                    System.out.println(weatherInfoDTO);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                System.out.println("GET request failed. Status code: " + response.statusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


