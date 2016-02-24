/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author DanielaValentina
 */
public class Marciano extends Sprite{
    
   
    
   public Marciano() {
       this.setVelocidad(2);
        try {
            imagen = ImageIO.read(getClass().getResource("/imagenes/marcianito1.png"));
            imagen2 = ImageIO.read(getClass().getResource("/imagenes/marcianito2.png"));
            
        } catch (IOException e) {

        }
    }

    
    public void mueve(boolean direccionMarciano){
        if(direccionMarciano){
            this.setX(this.getX() - this.getVelocidad());
        }
        
        if (!direccionMarciano ){
            this.setX(this.getX() + this.getVelocidad());
        }
    }

    @Override
    public void mueve() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
