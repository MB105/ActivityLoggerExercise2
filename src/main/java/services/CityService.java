package services;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CityService {


        public static void main(String[] args) {
            try {
                // Create an HttpClient instance
                HttpClient client = HttpClient.newHttpClient();

                // Create a request
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(new URI("https://dawa.aws.dk/steder?hovedtype=Bebyggelse&undertype=by&prim%C3%A6rtnavn=Roskilde"))
                        .version(HttpClient.Version.HTTP_1_1)
                        .GET()
                        .build();

                // Send the request and get the response
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                // Check the status code and print the response
                if (response.statusCode() == 200) {
                    System.out.println(response.body());
                } else {
                    System.out.println("GET request failed. Status code: " + response.statusCode());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

