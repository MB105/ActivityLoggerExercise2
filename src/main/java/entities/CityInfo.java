package entities;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
public class CityInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cityName;
    private double latitude;
    private double longitude;
    private String municipality;
    private long population;




    @ManyToMany(mappedBy = "cities")
    private Set<Activity> activities = new HashSet<>();

}
