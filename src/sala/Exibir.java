package sala;

public class Exibir{
    
    public static void Professor(Professor p){
        System.out.println("Professor");
        System.out.println("Nome: "+p.getNome());
        System.out.println("Disciplina: "+p.getDisciplina());
    }
    public static void Coordenador(Coordenador c){
        System.out.println("Coordenador");
        System.out.println("Nome: "+c.getNome());
        System.out.println("Escola: "+c.getEscola());
    }
}
