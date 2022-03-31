
package fruteriaed;


public class Cliente {
    
    int puesto;
    
    public Cliente(int p){
        this.puesto= p;
    }

    @Override
    public String toString() {
        return "Cliente " + "puesto: " + puesto + "\n" ;
    }
    
    
}
