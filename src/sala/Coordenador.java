package sala;

public class Coordenador implements ControleSala{
    private String nome;
    private String Escola;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEscola() {
        return Escola;
    }

    public void setEscola(String Escola) {
        this.Escola = Escola;
    }
    
    @Override
    public void abrirSala(){
        System.out.println(this.nome+" Abriu a sala");
    }
}
