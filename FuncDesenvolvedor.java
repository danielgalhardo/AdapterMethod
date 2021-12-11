public class FuncDesenvolvedor
{

    private Integer id;
    private String nome;
    private String endereco;
    private String email;
    private float  salario;

    public FuncDesenvolvedor(Integer id, String nome, String endereco, String email, float salario)
    {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getTecnologias()
    {
        return "Tecnologias utilizada pelo desenvolvedor: C# + Angular";
    }



    public String toString()
    {
        return "Funcionario Desenvolvedor:{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", email='" + email + '\'' +
                ", salario='" + salario + '\'' +
                '}';
    }
}
