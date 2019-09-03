
public class TestaCasa {
     public static void main (String[] args){
        Casa casa1 = new Casa();
        casa1.porta1 = true;
        casa1.porta2 = true;
        casa1.porta3 = false;
        
        casa1.pinta("Azul");
        
        System.out.println("Portas abertas é " + casa1.quantasPortasAbertas());
        
    }
}
