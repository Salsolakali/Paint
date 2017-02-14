/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Albertaco
 */
    public class Circulo extends Forma{
        public Circulo(int _posX, int _posY,Color _color, boolean _relleno){
        super(_posX, _posY, new int[500], new int[500], _color, _relleno, 4);
   }
  }

