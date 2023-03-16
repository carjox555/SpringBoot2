package com.spring2.demo.repository;

import com.spring2.demo.models.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface MvtoRepository extends JpaRepository<MovimientoDinero, Integer> {


@Query(value = "select * from movimientos where empleado_id=?1", nativeQuery = true)
    public abstract ArrayList<MovimientoDinero> findByEmployee(Integer id);
}
