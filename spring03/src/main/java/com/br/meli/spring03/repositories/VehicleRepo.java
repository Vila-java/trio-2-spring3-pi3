package com.br.meli.spring03.repositories;

import com.br.meli.spring03.models.Vehicle;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class VehicleRepo {
    private final String LINKFILE = "src/main/resources/data.json";

    public List<Vehicle> getAllVehicle(){
        ObjectMapper mapper = new ObjectMapper();
        List<Vehicle> list = null;
        try {
            list = Arrays.asList(
                    mapper.readValue(new File(LINKFILE), Vehicle[].class));
        } catch (Exception ex) {

        }
        return list;
    }

}
