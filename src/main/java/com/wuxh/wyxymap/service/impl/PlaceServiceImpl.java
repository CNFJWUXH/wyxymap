package com.wuxh.wyxymap.service.impl;

import com.wuxh.wyxymap.domin.Place;
import com.wuxh.wyxymap.repository.PlaceRepository;
import com.wuxh.wyxymap.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceServiceImpl implements PlaceService {

    @Autowired
    private PlaceRepository placeRepository;

    @Override
    public Place addPlace(Place place) {
        return placeRepository.save(place);
    }

    @Override
    public Place getPlace(Long id) {
        return placeRepository.getOne(id);
    }

    @Override
    public List<Place> getAllPlace() {
        return placeRepository.findAll();
    }

    @Override
    public Place editPlace(Place place) {
        return placeRepository.save(place);
    }

    @Override
    public void deletePlace(Place place) {
        placeRepository.delete(place);
    }

    @Override
    public void deletePlaceById(Long id) {
        placeRepository.deleteById(id);
    }
}
