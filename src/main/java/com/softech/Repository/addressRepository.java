package com.softech.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softech.Entity.address;
@Repository
public interface addressRepository extends JpaRepository<address, Long> {

}
