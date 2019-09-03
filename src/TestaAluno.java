
public class TestaAluno {
    
    public static void main (String[] args){
        Aluno a1 = new Aluno ();
        a1.nome = "Meiriane";
        a1.cpf = "025.147.892-58";
        Data data = new Data ();
        data.dia = 14;
        data.mes = 4;
        data.ano = 1988;
        a1.dataDeNascimento = data;
        
        String dados = a1.imprimir();
        System.out.println(dados);
    }
    
}
