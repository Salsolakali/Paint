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
public class Estrella extends Forma {
    
    public Estrella(int _posX, int _posY, Color _color, boolean _relleno) {
        super(_posX, _posY, new int [32], new int [32], _color, _relleno, 32);
        
    }
    

    //Sobreesribo el metodo de la clase principal Forma para poder gestionarme el su dibujo si estropear al resto de clases hijas
    @Override
    public void calculaVertices(int _radio, double _giro) {
        for (int i = 0; i < numeroLados; i++) {
            this.xpoints[i] = (int) (this.x + _radio * Math.cos((2 * Math.PI * i + _giro) / numeroLados));
            this.xpoints[i+1] = (int) (this.x + (_radio/2) * Math.cos((2 * Math.PI * i + _giro/2) / numeroLados));
            
            this.ypoints[i] = (int) (this.y + _radio * Math.sin((2 * Math.PI * i + _giro)/ numeroLados));
            this.ypoints[i+1] = (int) (this.y + (_radio/2) * Math.sin((2 * Math.PI * i + _giro/2)/ numeroLados));
            i++;
        }
}
}
