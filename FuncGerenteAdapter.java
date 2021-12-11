public class FuncGerenteAdapter implements  Funcionario{

    private FuncGerente funcionarioGerente;

    public FuncGerenteAdapter(FuncGerente funcionarioGerente) {
        this.funcionarioGerente = funcionarioGerente;
    }
    @Override
    public int getId() {
        return funcionarioGerente.getId();
    }

    @Override
    public String getNome() {
        return funcionarioGerente.getNome();
    }

    @Override
    public String getEndereco() {
        return funcionarioGerente.getEndereco();
    }

    @Override
    public String getEmail() {
        return funcionarioGerente.getEmail();
    }

    @Override
    public float getSalario() {
        return funcionarioGerente.getSalario();
    }
}
