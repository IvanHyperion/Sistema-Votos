
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controlador  implements ActionListener{
    private Modelo modelo;
    private Vista vista; 

    Controlador(Modelo modelo, Vista vista) {
        this.vista = vista; 
        this.modelo = modelo;
    }
    
    public Modelo getModelo(){
        return modelo;
    }
    
    public Vista getVista(){
        return vista;
        
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
}
