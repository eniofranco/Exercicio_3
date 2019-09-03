
public class TestaPessoa {
    public static void main (String [] args)
    {
        Pessoa p1 = new Pessoa ();
        p1.nome = "Josiane";
        p1.idade = 20;
        
        
        System.out.println("Idade antiga  " + p1.idade);
        
        
        p1.fazAniversario();
        System.out.println("Parabéns Você fez  " + p1.idade);
       
        
    }
    
}
