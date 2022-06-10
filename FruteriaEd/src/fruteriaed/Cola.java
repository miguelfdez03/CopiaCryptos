package fruteriaed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Cola {

    Cliente cola[] = new Cliente[200];
    int nclientes;
    Cliente despachados[] = new Cliente[200];
    int despacho = 0;
    int adelantos=0;
    private Conectar conectar;
    private Connection con;

    public Cola(int n) {
        conectar = new Conectar();
        this.nclientes = n;
        for (int i = 0; i < this.nclientes; i++) {
            int edadA = (int) Math.round((Math.random() * 50) + 10);
            this.cola[i] = new Cliente(i + 1, edadA);
            Connection con = null;
     PreparedStatement stmt = null;


     String sURL = "jdbc:oracle:thin:@//localhost:1521/pruebas_bd";

     try{
   
        con = DriverManager.getConnection(sURL,"C##_admin","admin");
        stmt = con.prepareStatement("INSERT INTO clientesnodespachados VALUES (?)");
        stmt.setString(1,String.valueOf(this.cola[i]));

        int retorno = stmt.executeUpdate();
        if (retorno>0)
           System.out.println("Insertado correctamente");      

     } catch (SQLException sqle){
        System.out.println("SQLState: " 
           + sqle.getSQLState());
        System.out.println("SQLErrorCode: " 
           + sqle.getErrorCode());
        sqle.printStackTrace();
     } catch (Exception e){
        e.printStackTrace();
     } finally {
        if (con != null) {
           try{
              stmt.close();
              con.close();
           } catch(Exception e){
              e.printStackTrace();
           }
        }
     }           
        }
    }

    public void aniadirCliente() {
        this.nclientes++;
        int edadA = (int) Math.round((Math.random() * 50) + 10);
        this.cola[nclientes] = new Cliente(nclientes + 1, edadA);
    }

    public void mostrar() {
        System.out.print("En la cola estan los clientes: \n");
        for (int i = 0; i < nclientes; i++) {
            System.out.print(this.cola[i]);
        }
    }

    public void despachar() {
        this.despachados[despacho] = this.cola[0];
        despacho++;
        this.cola[0] = null;
        this.adelantar();
        nclientes--;
    }

    public void adelantar() {
        this.cola[0]=null;
        this.adelantos++;
        for (int i = 1; i < nclientes; i++) {
            if(this.adelantos>this.nclientes){
                System.out.println("No se puede adelantar mas");
            }else{
                this.cola[i] = this.cola[i - 1];
            }
            
        }
    }

    public void retrasar() {
        for (int i = 1; i < nclientes; i++) {
            if (this.nclientes == this.cola.length) {
                System.out.println("La cola esta llena");
            } else {
                this.cola[i] = this.cola[i + 1];
            }
        }
        nclientes++;
    }

    public void mostrarDespachados() {
        System.out.print("\n ---------------------- \n");
        System.out.println("Clientes Despachados:");
        System.out.println(this.despacho);
        for (int i = 0; i < despacho; i++) {
            System.out.print(this.despachados[i]);
             Connection con = null;
     PreparedStatement stmt = null;


     String sURL = "jdbc:oracle:thin:@//localhost:1521/pruebas_bd";

     try{
   
        con = DriverManager.getConnection(sURL,"C##_admin","admin");
        stmt = con.prepareStatement("INSERT INTO clientesdespachados VALUES (?)");
        stmt.setString(1,String.valueOf(this.despachados[i]));

        int retorno = stmt.executeUpdate();
        if (retorno>0)
           System.out.println("Insertado correctamente");      

     } catch (SQLException sqle){
        System.out.println("SQLState: " 
           + sqle.getSQLState());
        System.out.println("SQLErrorCode: " 
           + sqle.getErrorCode());
        sqle.printStackTrace();
     } catch (Exception e){
        e.printStackTrace();
     } finally {
        if (con != null) {
           try{
              stmt.close();
              con.close();
           } catch(Exception e){
              e.printStackTrace();
           }
        }
     }           
        }
        
        System.out.println("----------------------");
    }
    public void insertardespachados(String Datos){
        PreparedStatement ps;
        String sql;
        con = conectar.getConexion();
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
