package com.springbootorm.api.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public void addLocation(Location location) {
        locationRepository.save(location);
    }

    public List<Location> getAllLocations() {
        List<Location> locations = new ArrayList<>();
        locationRepository.findAll().forEach(locations::add);
        return locations;
    }

    //Read one
    public ArrayList<Location> getLocation(Integer id){
        ArrayList<Location> locationList = new ArrayList<>();
        locationList.add(locationRepository.findById(id).get());
        return locationList;
    }

    //Update
    public void updateLocation(Location location, Integer id) {
        locationRepository.save(location);
    }

    public void deleteLocation(Integer id) {
        locationRepository.deleteById(id);
    }
}
