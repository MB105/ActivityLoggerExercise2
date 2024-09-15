package entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter

public class WeatherInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private double temperature;

    private String skyText;

    private double humidity;

    private String windText;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    public WeatherInfo( double temperature, String skyText, double humidity, String windText) {
        this.temperature = temperature;
        this.skyText = skyText;
        this.humidity = humidity;
        this.windText = windText;
    }


    public WeatherInfo() {

    }
}
