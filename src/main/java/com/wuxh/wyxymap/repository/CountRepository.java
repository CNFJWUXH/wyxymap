package com.wuxh.wyxymap.repository;

import com.wuxh.wyxymap.domin.Count;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountRepository extends JpaRepository<Count, Long> {

}
