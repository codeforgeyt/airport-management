package com.codeforgeyt.airportapi.config;


import com.codeforgeyt.airportcore.service.PlaneService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlaneConfig{
    @Bean
    public PlaneService planeService(){
        return new PlaneService();
    }
}
