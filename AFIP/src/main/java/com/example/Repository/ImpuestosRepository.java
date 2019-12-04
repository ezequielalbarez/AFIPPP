package com.example.Repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.Entity.ImpuestosEntity;



@Repository
public interface ImpuestosRepository extends JpaRepository<ImpuestosEntity,Long> {

    List<ImpuestosEntity> findAllByFechaBetween(Date desde, Date hasta);
    ImpuestosEntity findByIdimpuestosLike(Long id);
     
}








