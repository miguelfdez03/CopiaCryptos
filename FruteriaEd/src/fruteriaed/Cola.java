
package fruteriaed;


public class Cola {
    
    Cliente cola[];
    int nclientes;
            
    public Cola(int n){
        this.nclientes= n;
        this.cola = new Cliente[nclientes];
        for (int i = 0; i < cola.length; i++) {
            this.cola[i]= new Cliente(i);
        }
    }
    
}
