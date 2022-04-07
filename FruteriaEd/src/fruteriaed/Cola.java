
package fruteriaed;


public class Cola {
    
    Cliente cola[];
    int nclientes;
    Cliente despachados[] = new Cliente[100];;
    int despacho=0;
            
    public Cola(int n){
        this.nclientes= n;
        this.cola = new Cliente[nclientes];
        for (int i = 0; i < cola.length; i++) {
            int edadA=(int) Math.round((Math.random() * 50) + 10);
            this.cola[i]= new Cliente(i+1,edadA);
        }
    }
    
    public void mostrar(){
        System.out.print("En la cola estan los clientes: \n");
        for (int i = 0; i < nclientes; i++) {
            System.out.print(this.cola[i]);
        }
    }
    
    public void despachar(){
        this.despachados[despacho]=this.cola[0];
        despacho++;
        this.cola[0]=null;
        this.adelantar();
        nclientes--;
    }
    
    public void adelantar(){
        for (int i = 1; i < cola.length; i++) {
            this.cola[i-1]=this.cola[i];
        }
    }
    
    public void mostrarDespachados(){
        System.out.print("\n ---------------------- \n");
        System.out.println("Clientes Despachados:");
        for (int i = 0; i < despacho; i++) {
            System.out.print(this.despachados[i]);
        }
        System.out.println("----------------------");
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
