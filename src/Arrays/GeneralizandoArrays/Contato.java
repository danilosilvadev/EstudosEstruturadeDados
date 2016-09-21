package Arrays.GeneralizandoArrays;

/**
 * Created by sg-0036936 on 21/09/2016.
 */
public class Contato {

    //classe pojo de dados

    private String nome;
    private String telefone;
    private String email;

    public Contato() {}

    public Contato(String nome, String telefone, String email) {

        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Para fazer a comparação e ver se os elementos de c4 são
    //idênticos ao de outro elemento do array, no caso o c3.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato)) return false;

        Contato contato = (Contato) o;

        if (getNome() != null ? !getNome().equals(contato.getNome()) : contato.getNome() != null) return false;
        if (getTelefone() != null ? !getTelefone().equals(contato.getTelefone()) : contato.getTelefone() != null)
            return false;
        return getEmail() != null ? getEmail().equals(contato.getEmail()) : contato.getEmail() == null;

    }

    @Override

    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
