package com.wuxh.wyxymap.repository;

import com.wuxh.wyxymap.domin.Place;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlaceRepository extends JpaRepository<Place, Long> {
    @Override
    <S extends Place> S save(S s);

    @Override
    List<Place> findAll();

    @Override
    List<Place> findAll(Sort sort);

    @Override
    Page<Place> findAll(Pageable pageable);

    @Override
    Place getOne(Long aLong);

    @Override
    void delete(Place place);

    @Override
    void deleteById(Long aLong);
}
