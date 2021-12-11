
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class FuncionarioTest {
    @Test

    public void retornaTodosFuncionarios()
    {
        List<Funcionario> listaFuncionarios = getFuncionarios();
        assertEquals(listaFuncionarios.stream().count(), 2);
    }

    private static List<Funcionario> getFuncionarios()
    {
        List<Funcionario> funcionarios = new ArrayList<Funcionario>();

        FuncGerente funcionarioGer = new FuncGerente(
                2,
                "Daniel Galhardo",
                "Rua Joao da Silva",
                "danidanidanidani@tmail.com",
                3500);
        funcionarios.add(new FuncGerenteAdapter(funcionarioGer));

        FuncDesenvolvedor funcDesenvolvedor = new FuncDesenvolvedor(
                3,
                "Ana Tejeda",
                "Rua Avenida do Bairro",
                "tejedanateja@kmail.com",
                1500);
        funcionarios.add(new FuncDesenvAdapter(funcDesenvolvedor));


        return funcionarios;
    }}
