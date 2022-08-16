package com.sifipe.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sifipe.api.model.Despesa;

@RestController
@RequestMapping("/despesas")
public class DespesaController {

    @GetMapping
    public List<Despesa> listar() {

        List<Despesa> despesas = null;
        return despesas;
    }

}
