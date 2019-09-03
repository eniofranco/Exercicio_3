
public class TestaProduto {
    public static void main (String[] args){
        
        Produto elemento1 = new Produto();
        elemento1.nome = "Arroz";
        elemento1.preco = 13.50;
        
        System.out.println("O Produto a ser verificado é: "+elemento1.nome);
        double valorCalculado = elemento1.diminuir10(elemento1.preco);
        System.out.println("Valor com desconto: " +valorCalculado);
        
        double valorCalculado1 = elemento1.aumenta25(elemento1.preco);
        System.out.println("Valor com acréscimo:  "+valorCalculado1);
    }
    
    
}
