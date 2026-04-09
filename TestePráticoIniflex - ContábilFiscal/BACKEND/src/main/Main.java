import model.Funcionario;
import service.FuncionarioService;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        NumberFormat nf = NumberFormat.getInstance(new Locale("pt", "BR"));

        // INSERÇÃO (EXATA DA TABELA)
        funcionarios.add(new Funcionario("Maria", LocalDate.of(2000,10,18), new BigDecimal("2009.44"), "Operador"));
        funcionarios.add(new Funcionario("João", LocalDate.of(1990,5,12), new BigDecimal("2284.38"), "Operador"));
        funcionarios.add(new Funcionario("Caio", LocalDate.of(1961,5,2), new BigDecimal("9836.14"), "Coordenador"));
        funcionarios.add(new Funcionario("Miguel", LocalDate.of(1988,10,14), new BigDecimal("19119.88"), "Diretor"));
        funcionarios.add(new Funcionario("Alice", LocalDate.of(1995,1,5), new BigDecimal("2234.68"), "Recepcionista"));
        funcionarios.add(new Funcionario("Heitor", LocalDate.of(1999,11,19), new BigDecimal("1582.72"), "Operador"));
        funcionarios.add(new Funcionario("Arthur", LocalDate.of(1993,3,31), new BigDecimal("4071.84"), "Contador"));
        funcionarios.add(new Funcionario("Laura", LocalDate.of(1994,7,8), new BigDecimal("3017.45"), "Gerente"));
        funcionarios.add(new Funcionario("Heloísa", LocalDate.of(2003,5,24), new BigDecimal("1606.85"), "Eletricista"));
        funcionarios.add(new Funcionario("Helena", LocalDate.of(1996,9,2), new BigDecimal("2799.93"), "Gerente"));

        // 3.2
        FuncionarioService.removerJoao(funcionarios);

        // 3.3
        funcionarios.forEach(f ->
            System.out.println(f.getNome() + " | " +
                f.getDataNascimento().format(dtf) + " | " +
                nf.format(f.getSalario()) + " | " +
                f.getFuncao())
        );

        // 3.4
        FuncionarioService.aplicarAumento(funcionarios);

        // 3.5/3.6
        var agrupados = FuncionarioService.agruparPorFuncao(funcionarios);
        agrupados.forEach((k,v) -> {
            System.out.println("\n" + k);
            v.forEach(f -> System.out.println(" - " + f.getNome()));
        });

        // 3.8
        System.out.println("\nAniversariantes:");
        FuncionarioService.aniversariantes(funcionarios)
                .forEach(f -> System.out.println(f.getNome()));

        // 3.9
        var velho = FuncionarioService.maisVelho(funcionarios);
        System.out.println("\nMais velho: " + velho.getNome() +
                " (" + FuncionarioService.calcularIdade(velho) + " anos)");

        // 3.10
        System.out.println("\nOrdem alfabética:");
        FuncionarioService.ordenarPorNome(funcionarios)
                .forEach(f -> System.out.println(f.getNome()));

        // 3.11
        System.out.println("\nTotal salários: " +
                nf.format(FuncionarioService.totalSalarios(funcionarios)));

        // 3.12
        System.out.println("\nSalários mínimos:");
        FuncionarioService.salariosMinimos(funcionarios)
                .forEach((nome, qtd) ->
                        System.out.println(nome + ": " + qtd));
    }
}