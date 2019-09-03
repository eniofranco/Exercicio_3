
public class Porta {
     boolean aberta;
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;
    
    void fecha (){
        aberta = false;
        System.out.println("A Porta está fechada!");
    }
    
    void abre (){
        aberta = true;
        System.out.println("A porta está aberta");
    }
    
    boolean estaAberta(){
        abre();
        return true;

    }
    
}
