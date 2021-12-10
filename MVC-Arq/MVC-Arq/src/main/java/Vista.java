/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Vista extends javax.swing.JFrame {
    private Modelo modelo; 
    private Controlador controlador; 
    
    public void Vista (Modelo modelo){
        
    }
    
    
    public Controlador callControlador(){
        this.controlador = controlador;
        return controlador;
    }
    
    public Controlador getControlador (){
        return controlador;
    }
    
    public Modelo getModelo(){
        return modelo;
    }

}
