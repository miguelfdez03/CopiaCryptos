
package fruteriaed;


public class Cliente {
    
    int puesto;
    int edad;
    public Cliente(int p, int e){
        this.puesto= p;
        this.edad=e;
    }

    @Override
    public String toString() {
        return "Cliente " + "puesto: " + puesto +" Edad: "+ this.edad + "\n" ;
    }
    
    
}
