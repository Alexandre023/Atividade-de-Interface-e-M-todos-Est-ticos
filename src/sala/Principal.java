package sala;

public class Principal {

    public static void main(String[] args) {
        
        Professor p=new Professor();
        Coordenador c=new Coordenador();
        Exibir e=new Exibir();
        
        p.setNome("Rodolfo");
        p.setDisciplina("LPOO");
        
        
        c.setNome("Claudio");
        c.setEscola("ETEC Peruibe");
        
        p.abrirSala();
        Exibir.Professor(p);
        
        System.out.println("------------------------------------");
        
        c.abrirSala();
        Exibir.Coordenador(c);
        
        
        
        
    }
    
}
