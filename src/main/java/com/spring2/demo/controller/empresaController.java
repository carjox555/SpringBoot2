package com.spring2.demo.controller;

import com.spring2.demo.models.Empresa;
import com.spring2.demo.services.EmpresaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class empresaController {

    @Autowired
    EmpresaServices empresaServices;

    @GetMapping({"enterprises"})
    public List<Empresa> verEmpresas(){
        return empresaServices.getAllEmpresas();
    }

    @PostMapping("/enterprises")
    public Empresa guardarEmpresa(@RequestBody Empresa emp){
        return this.empresaServices.saveOrUpdateEmpresa(emp);
    }
    @GetMapping(path = "enterprises/{id}")
    public Empresa empresaPorId(@PathVariable("id") Integer id){
        return this.empresaServices.getEmpresaById(id);
    }
    @PatchMapping("/enterprises/{id}")
    public Empresa actualizarEmpresa(@PathVariable("id") Integer id,@RequestBody Empresa empresa){
       Empresa emp= empresaServices.getEmpresaById(id);
       emp.setNombre(empresa.getNombre());
       emp.setDireccion(empresa.getDireccion());
       emp.setTelefono(empresa.getTelefono());
       emp.setNIT(empresa.getNIT());
       return empresaServices.saveOrUpdateEmpresa(emp);
    }
    @DeleteMapping(path = "enterprises/{id}")
    public String deleteEmpresa(@PathVariable("id") Integer id){
        boolean respuesta= this.empresaServices.deleteEmpresa(id);
        if(respuesta){
            return "Se elimino la empres con id "+id;
        }
        else {
            return "No se pudo eeminar la empresa con id "+ id;
        }
    }
}