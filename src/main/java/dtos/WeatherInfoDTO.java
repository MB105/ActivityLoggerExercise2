package dtos;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;



@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class WeatherInfoDTO {

    @JsonProperty("CurrentData")
    private CurrentData currentData;

    @JsonProperty("LocationName")
    private String locationName;

    @Data
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    private class CurrentData {


    @JsonProperty("temperature")
    private double temperature;

    @JsonProperty("skyText")
    private String skyText;

    @JsonProperty("humidity")
    private double humidity;

    @JsonProperty("windText")
    private String windText;


    }
}



