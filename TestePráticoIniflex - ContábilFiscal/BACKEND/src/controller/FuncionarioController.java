package com.iniflex.controller;

import com.iniflex.service.FuncionarioService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    private final FuncionarioService service;

    public FuncionarioController(FuncionarioService service) {
        this.service = service;
    }

    @GetMapping
    public Object listar() {
        return service.listar();
    }

    @PostMapping("/remover-joao")
    public void removerJoao() {
        service.removerJoao();
    }

    @PostMapping("/aumento")
    public void aumento() {
        service.aumentarSalarios();
    }

    @GetMapping("/agrupados")
    public Object agrupados() {
        return service.agrupar();
    }

    @GetMapping("/aniversariantes")
    public Object aniversariantes() {
        return service.aniversariantes();
    }

    @GetMapping("/mais-velho")
    public Object maisVelho() {
        return service.maisVelho();
    }

    @GetMapping("/total-salarios")
    public Object total() {
        return service.totalSalarios();
    }

    @GetMapping("/salarios-minimos")
    public Object salariosMinimos() {
        return service.salariosMinimos();
    }
}