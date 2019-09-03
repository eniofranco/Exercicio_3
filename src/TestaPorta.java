
public class TestaPorta {
    public static void main (String[] args){
        
        Porta pt1 = new Porta();
        pt1.fecha();
        pt1.cor = "azul";
        pt1.dimensaoX = 0.39;
        pt1.dimensaoY = 1.77;
        pt1.dimensaoZ = 4.66;
        pt1.abre();
        
        System.out.println(pt1.cor);
        System.out.println( pt1.dimensaoX );
        
       
        pt1.estaAberta();
        
    }
    
}
