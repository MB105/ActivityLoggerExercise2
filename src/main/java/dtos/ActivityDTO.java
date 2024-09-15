package dtos;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ActivityDTO {
    private LocalDate excerciseDate;
    private String exerciseType;
    private LocalDateTime timeOfDay;
    private int duration;
    private double distance;
    private String comment;

    private WeatherInfoDTO weatherInfo;
    private CityInfoDTO cityInfo;

    public ActivityDTO(LocalDate excerciseDate, String exerciseType, LocalDateTime timeOfDay, int duration, double distance, String comment, WeatherInfoDTO weatherInfo, CityInfoDTO cityInfo) {
        this.excerciseDate = excerciseDate;
        this.exerciseType = exerciseType;
        this.timeOfDay = timeOfDay;
        this.duration = duration;
        this.distance = distance;
        this.comment = comment;
        this.weatherInfo = weatherInfo;
        this.cityInfo = cityInfo;
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

    public WeatherInfoDTO getWeatherInfo() {
        return weatherInfo;
    }

    public CityInfoDTO getCityInfo() {
        return cityInfo;
    }
}

