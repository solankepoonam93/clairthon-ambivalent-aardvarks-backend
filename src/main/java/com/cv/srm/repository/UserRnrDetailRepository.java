package com.cv.srm.repository;

import com.cv.srm.model.UserRnrDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRnrDetailRepository extends JpaRepository<UserRnrDetail, String> {

}
