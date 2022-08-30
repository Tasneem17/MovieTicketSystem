package za.ac.cput.service;

import za.ac.cput.domain.Location;
import za.ac.cput.domain.User;

import java.util.List;

public interface LocationService extends IService<Location,String> {

    void deleteById(String id);

    List<Location> findAll();
}
