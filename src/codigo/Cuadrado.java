/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author Albertaco
 */
public class Cuadrado extends Rectangle2D.Double{
    
//Variales de color y relleno del ccuadrado
    Color color = null;
    Boolean relleno = false;
    
    //Constructor del circulo. Los parametros que se pasan al constructor suelen llevar _ para saber que son de la propiedad
    public Cuadrado(int _posX, int _posY, int _lado, Color _color, boolean _relleno){
        //Aunque es un constructor, no lleva el super porque esta invocando al constructor de la clase que estas heredando. Lo puedo poner, pero es opcional.
        //Como está implicito en el constructor, no hace falta que lo ponga (es un constructor vacio)
        //super();
        this.x = _posX;
        this.y = _posY;
        this.width = _lado;
        this.height = _lado;
        this.color = _color;
        this.relleno = _relleno;
    }
    
    public void Dibujate(Graphics2D g2, int posX){
        int lado = Math.abs((int) this.x - posX);
        this.width = lado;
        this.height = lado;
        g2.setColor(color);
        if (relleno){
            g2.fill(this);
        }
        else{
            g2.draw(this);
        }
    }
}
