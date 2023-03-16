package com.spring2.demo.services;

import com.spring2.demo.models.Employee;
import com.spring2.demo.models.MovimientoDinero;
import com.spring2.demo.repository.MvtoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovtoService {
    @Autowired
    MvtoRepository mvtoRepository;

    public List<MovimientoDinero> getAllMvtos(){
        List<MovimientoDinero> mvtosList = new ArrayList<>();
        mvtoRepository.findAll().forEach(movimiento -> mvtosList.add(movimiento));
        return mvtosList;
    }
    public MovimientoDinero getMvtoById(Integer id){
        return  mvtoRepository.findById(id).get();
    }
    public MovimientoDinero saveOrUpdateMvto(MovimientoDinero movimientoDinero){
        MovimientoDinero mov= mvtoRepository.save(movimientoDinero);
        return mov;
    }
    public boolean deleteMvto(Integer id){
        mvtoRepository.deleteById(id);
        if(this.mvtoRepository.findById(id).isPresent()){
            return  false;
        }
        return true;
    }

    public ArrayList<MovimientoDinero> getByEmployee(Integer id){
        return mvtoRepository.findByEmployee(id);
    }

}
