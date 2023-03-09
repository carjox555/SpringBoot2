package com.spring2.demo.services;

import com.spring2.demo.models.Empresa;
import com.spring2.demo.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpresaServices  {
    @Autowired  // conecta esta clase con el repository empresa
    EmpresaRepository empresaReposiory; //objeto para poder utilizar todos los metodos heredados del jpaRepository
    public List<Empresa> getAllEmpresas(){
        List<Empresa> empresaList = new ArrayList<>();
        empresaReposiory.findAll().forEach(empresa -> empresaList.add(empresa));  //recorremos el iterable
        return empresaList;
    }
    // trae un objeto de tipo empresa
    public Empresa getEmpresaById(Integer id){
        return empresaReposiory.findById(id).get();
    }
    // Guardar o actualizar
    public Empresa saveOrUpdateEmpresa(Empresa empresa){
        Empresa emp = empresaReposiory.save(empresa);
        return emp;
    }
    //metodo delete
    public boolean deleteEmpresa(Integer id){
        empresaReposiory.deleteById(id);
        if(empresaReposiory.findById(id)!=null){
            return true;
        }
        return false;
    }
}
