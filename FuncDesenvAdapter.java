public class FuncDesenvAdapter implements  Funcionario{

    private FuncDesenvolvedor funcionarioDesenv;

    public FuncDesenvAdapter(FuncDesenvolvedor funcionarioDesenv) {
        this.funcionarioDesenv = funcionarioDesenv;
    }
    @Override
    public int getId() {
        return funcionarioDesenv.getId();
    }

    @Override
    public String getNome() {
        return funcionarioDesenv.getNome();
    }

    @Override
    public String getEndereco() {
        return funcionarioDesenv.getEndereco();
    }

    @Override
    public String getEmail() {
        return funcionarioDesenv.getEmail();
    }

    @Override
    public float getSalario() {
        return funcionarioDesenv.getSalario();
    }
}
