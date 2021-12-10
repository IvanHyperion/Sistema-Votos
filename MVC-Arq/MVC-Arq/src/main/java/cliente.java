/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class cliente  {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {

        //REFLECTION
        ModeloVotacion modelo = build(ModeloVotacion.class,0,null);
        VistaVotaciones vista = build(VistaVotaciones.class,0,null);
        Object[] initargs = new Object[] {modelo, vista};
        ControladorVotaciones ctrl = build(ControladorVotaciones.class,0,initargs);
        
        
        getFrame(ctrl);
       
    
    }
    
    @SuppressWarnings("unchecked")
    public static <T> T build(final Class<?> anyClass, final int index, final Object ... initargs ) 
            throws InstantiationException, 
            IllegalAccessException, 
            IllegalArgumentException, 
            InvocationTargetException{
        
        final var builder = anyClass.getConstructors();
        
        
        return (T) builder[index].newInstance(initargs);
        
    }
    
    
    
    public static void getFrame(Object AnyClass) throws NoSuchMethodException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        final Class<?> instanceClass = AnyClass.getClass();
        var methods = instanceClass.getMethods();
        for(Method method : methods){
            var name = method.getName();
            if(name.startsWith(getFunction())){
                instanceClass.getMethod(name, null).invoke(AnyClass, null);
            }
        }
    }

    public static String getFunction(){
        String funcion = null;
        try {
            int numLineas = 2;
            int contador = 0;

            String datos[] = new String[numLineas];

            BufferedReader reader = new BufferedReader(new FileReader("funcion.txt"));
            String linea = reader.readLine();

            while (linea != null && contador < numLineas) {
                datos[contador] = linea;
                linea = reader.readLine();
                contador++;


            }

            funcion = datos[1];
            
            

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return funcion;
    }

    
}
