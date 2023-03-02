package com.spring2.demo.services;

import com.spring2.demo.models.Empresa;
import com.spring2.demo.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaServices  {
    @Autowired
    EmpresaRepository empresaReposiory;
    public List<Empresa> getAllEmpresas(){
        List<Empresa> empresaList = new ArrayList<>();
        empresaReposiory.findAll().forEach(empresa -> empresaList.add(empresa));
        return empresaList;
    }

}
