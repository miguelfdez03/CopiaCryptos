
package fruteriaed;


public class Cola {
    
    Cliente cola[];
    int nclientes;
            
    public Cola(int n){
        this.nclientes= n;
        this.cola = new Cliente[nclientes];
        for (int i = 0; i < cola.length; i++) {
            int edadA=(int) Math.round((Math.random() * 50) + 10);
            this.cola[i]= new Cliente(i+1,edadA);
        }
    }
    
    public void mostrar(){
        System.out.println("En la cola esta los clientes: ");
        for (int i = 0; i < cola.length; i++) {
            System.out.print(this.cola[i]);
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
