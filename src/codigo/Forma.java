/*La clase forma es la clase comun a todos los objetos graficos que estamos creando.
Contiene los metodos comunes de pintado y de calculo de posicion de los vertices y 
las propiedades comunes de todos los objetos graficos que estamos creando: 
color, relleno, posiciones x e y de cada vertice y numero de lados



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
public class Forma extends Polygon {
    //Variales de color y relleno del triangulo
    Color color = null;
    Boolean relleno = false;
    int x = 0;
    int y = 0;
    int numeroLados;
    
    public Forma (int _posX, int _posY, int [] _puntosX, int [] _puntosY, Color _color, boolean _relleno, int _numeroLados){
        super(_puntosX, _puntosY, _numeroLados);
        
        numeroLados = _numeroLados;
        this.x = _posX;
        this.y = _posY;
        
        calculaVertices(1);
        
        color = _color;
        relleno = _relleno;
    }
    public void Dibujate(Graphics2D g2, int posY){
              
        int radio = this.y - posY;

        calculaVertices(radio);
        
        g2.setColor(color);
        if (relleno){
            g2.fill(this);
        }
        else {
            g2.draw(this);
        }
        
    } 
    public void calculaVertices(int _radio){
        for (int i=0; i<numeroLados; i++){
            this.xpoints[i] = (int) (this.x + _radio*Math.cos(2*Math.PI*(i+12)/npoints));
            this.ypoints[i] = (int) (this.y + _radio*Math.sin(2*Math.PI*(i+12)/npoints));
        }
    }
}
