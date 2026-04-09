package com.iniflex.dto;

import java.math.BigDecimal;

public class FuncionarioDTO {

    private String nome;
    private String funcao;
    private BigDecimal salario;

    public FuncionarioDTO(String nome, String funcao, BigDecimal salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;
    }

    public String getNome() { return nome; }
    public String getFuncao() { return funcao; }
    public BigDecimal getSalario() { return salario; }
}