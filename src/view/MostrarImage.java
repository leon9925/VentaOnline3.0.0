package view;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 * @author LeonardoSotillo
 * @author FernandoRainier
 * version 1.0.0
 */

    public class MostrarImage {
        
        public MostrarImage()
        {
            
        }
        
        public void cargarImg(){
            try{
                Icon icon = new ImageIcon(getClass().getResource("/images/telefono.jpg"));
                ConsultProduct.jLImagen.setIcon(icon);
            }catch (Exception error){
                JOptionPane.showMessageDialog(null, "ERROR " +error);
            }
            
        }
    
    
}
