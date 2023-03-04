package com.spring2.demo.controller;

import com.spring2.demo.models.Empresa;
import com.spring2.demo.services.EmpresaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class empresaController {

    @Autowired
    EmpresaServices empresaServices;
    @GetMapping({"/","/VerEmpresa"})
    public String viewEmpresas(Model model){
        List<Empresa> listEmpresas = empresaServices.getAllEmpresas();
        model.addAttribute("empList",listEmpresas);
        return "verEmpresas";
    }
}
