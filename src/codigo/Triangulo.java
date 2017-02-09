/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Albertaco
 */
public class Triangulo extends Polygon {
    //Variales de color y relleno del triangulo
    Color color = null;
    Boolean relleno = false;
    
    public Triangulo(int _posX, int _posY, int _altura, Color _color, boolean _relleno){
        super();
        
        //Número de puntos que tiene el polígono
        this.npoints = 3;
        
        //puntos de inicio del triangulo. Este array guarda las coordenadas x e y de cada punto del poligono
        this.xpoints[0] = _posX;
        this.ypoints[0] = _posY;
        
        
        this.ypoints[1] = _posY + _altura;
        
        this.ypoints[2] = _posY + _altura;
       
        int mediaBase = (int)(_altura/Math.sin(Math.toRadians(60)));
        
        this.xpoints[1] = _posX + mediaBase;
        this.xpoints[2] = _posY - mediaBase;
                
        this.color = _color;
        this.relleno = _relleno;
    }
    public void Dibujate(Graphics2D g2, int posY){
        
        int altura = Math.abs((int)ypoints[0] - posY);
        
        //Puntos Y donde dibujare los vertices inferiores del triangulo
        this.ypoints[1] = posY + altura;
        this.ypoints[2] = posY + altura;
        
        int mediaBase = (int) (altura/Math.sin(Math.toRadians(60)));
        
        //Puntos X donde dibujare los vertices inferiores del triangulo
        this.xpoints[1] = this.xpoints[0] + mediaBase;
        this.xpoints[2] = this.xpoints[0] - mediaBase;
        
        g2.setColor(color);
        if (relleno){
            g2.fill(this);
        }
        else{
            g2.draw(this);
        }
    }
}
