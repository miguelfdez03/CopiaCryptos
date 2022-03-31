
package fruteriaed;


public class Cola {
    
    Cliente cola[];
    int nclientes;
            
    public Cola(int n){
        this.nclientes= n;
        this.cola = new Cliente[nclientes];
        for (int i = 0; i < cola.length; i++) {
            this.cola[i]= new Cliente(i+1);
        }
    }
    
    public void mostrar(){
        System.out.println("En la cola esta los clientes: \n");
        for (int i = 0; i < cola.length; i++) {
            System.out.println(this.cola[i]);
        }
    }
    
    /*
    @Override
    public String toString() {
        String res;
        res="En la cola esta los clientes: \n";
        for (int i = 0; i < cola.length; i++) {
            res+=this.cola[i];
        }
         return res;         
    }
     */  
    
    
    
}
