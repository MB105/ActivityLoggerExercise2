package services;

import dtos.ActivityDTO;
import dtos.CityInfoDTO;
import dtos.WeatherInfoDTO;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ActivityService {

    public ActivityDTO createActivity (LocalDate excerciseDate, String exerciseType, LocalDateTime timeOfDay, int duration,
                                                             double distance, String comment, WeatherInfoDTO weatherInfo, CityInfoDTO cityInfo) {
        ActivityDTO activityDTO = new ActivityDTO(excerciseDate, exerciseType, timeOfDay, duration,
                distance, comment, weatherInfo, cityInfo);

        return activityDTO;

    }

    }


