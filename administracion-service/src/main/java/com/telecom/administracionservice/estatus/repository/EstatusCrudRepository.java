package com.telecom.administracionservice.estatus.repository;

import com.telecom.administracionservice.estatus.data.entity.Estatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstatusCrudRepository extends JpaRepository<Estatus,Integer> {
}
