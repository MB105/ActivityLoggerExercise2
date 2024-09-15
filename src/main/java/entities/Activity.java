package entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate excerciseDate;
    private String exerciseType;
    private LocalDateTime timeOfDay;
    private int duration;
    private double distance;
    private String comment;


    @OneToMany(mappedBy = "activity", cascade = CascadeType.ALL)
    private Set<WeatherInfo> weatherInfos = new HashSet<>();

   @ManyToMany
    private Set<CityInfo> cities = new HashSet<>();

public void addCityInfo(CityInfo cityInfo) {
    this.cities.add(cityInfo);
}

    public void addWeatherInfo(WeatherInfo weatherInfo) {
        this.weatherInfos.add(weatherInfo);
    }




    public Activity() {

    }

    public Activity(LocalDate excerciseDate, String exerciseType, LocalDateTime timeOfDay, int duration, double distance, String comment) {
        this.excerciseDate = excerciseDate;
        this.exerciseType = exerciseType;
        this.timeOfDay = timeOfDay;
        this.duration = duration;
        this.distance = distance;
        this.comment = comment;


    }


    public Long getId() {
        return id;
    }

    public LocalDate getExcerciseDate() {
        return excerciseDate;
    }

    public String getExerciseType() {
        return exerciseType;
    }

    public LocalDateTime getTimeOfDay() {
        return timeOfDay;
    }

    public int getDuration() {
        return duration;
    }

    public double getDistance() {
        return distance;
    }

    public String getComment() {
        return comment;
    }


}
