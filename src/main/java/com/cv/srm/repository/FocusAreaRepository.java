package com.cv.srm.repository;

import com.cv.srm.model.FocusArea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FocusAreaRepository extends JpaRepository<FocusArea, String> {

}
