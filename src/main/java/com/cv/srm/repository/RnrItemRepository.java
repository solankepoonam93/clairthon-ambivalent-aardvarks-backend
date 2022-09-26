package com.cv.srm.repository;

import com.cv.srm.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RnrItemRepository extends JpaRepository<Role, String> {

}
