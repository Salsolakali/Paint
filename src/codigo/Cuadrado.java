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
public class Cuadrado extends Forma{
    
    public Cuadrado(int _posX, int _posY,Color _color, boolean _relleno){
        super(_posX, _posY, new int[4], new int[4], _color, _relleno, 4);
   }
}
