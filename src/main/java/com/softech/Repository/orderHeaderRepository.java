package com.softech.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softech.Entity.orderHeader;
@Repository
public interface orderHeaderRepository extends JpaRepository<orderHeader, Long>{

}
