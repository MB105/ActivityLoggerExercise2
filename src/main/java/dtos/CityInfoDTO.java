package dtos;

public class CityInfoDTO {
    private String cityName;
    private double latitude;
    private double longitude;
    private String municipality;
    private long population;

    public CityInfoDTO(String cityName, double latitude, double longitude, String municipality, long population) {
        this.cityName = cityName;
        this.latitude = latitude;
        this.longitude = longitude;
        this.municipality = municipality;
        this.population = population;
    }

    public String getCityName() {
        return cityName;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getMunicipality() {
        return municipality;
    }

    public long getPopulation() {
        return population;
    }
}
