package com.softech.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softech.Entity.RdDocuments;

@Repository
public interface RdDocumentsRepo extends JpaRepository<RdDocuments, Long>{

}
