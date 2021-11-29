package com.test.currencyfair.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WeatherResponse {
    @JsonProperty("temperature_degrees")
    private Integer temperatureDegrees;
    @JsonProperty("wind_speed")
    private Integer windSpeed;
}
