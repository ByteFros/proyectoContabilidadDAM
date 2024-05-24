
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alex7
 */
public class PanelFondo extends JPanel {
   private Image imagenFondo;// esto es igual creas el objeto y le pones de atributo la imagen que tendra
    
    
    public PanelFondo(String urlImagen){
        imagenFondo=new ImageIcon(urlImagen).getImage();
    }
    
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(imagenFondo,0,0,getWidth(),getHeight(),this);
        
    }
}
