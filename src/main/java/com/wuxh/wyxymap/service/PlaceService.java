package com.wuxh.wyxymap.service;

import com.wuxh.wyxymap.domin.Place;

import java.util.List;

public interface PlaceService {
    public Place addPlace(Place place);

    public Place getPlace(Long id);

    public List<Place> getAllPlace();

    public Place editPlace(Place place);

    public void deletePlace(Place place);

    public void deletePlaceById(Long id);
}
