/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

/**
 *
 * @author Albertaco
 */
public class VentanaPaint extends javax.swing.JFrame {
    //Variable tipo imagen-buffer que sera la que ponga en el lienzo2 (ste es lo que dibujo)
    BufferedImage buffer = null;
    //Buffer auxiliar que almacena la imagen que tenia dibujada
    BufferedImage buffer2 = null;
    
    //Declaro 3 variables de tipo graphics 2D que almacenan el contexto grafico de cada objeto
    Graphics2D bufferGraphics, buffer2Graphics, lienzoGraphics = null;
    
    Color colorSeleccionado = Color.BLACK;
    
    int formaSeleccionada = 0;
    
    //Creo la elipse y el cuadrado que usaré 
    Circulo miCirculo;
    Cuadrado miCuadrado;
    Triangulo miTriangulo;
    Pentagono miPentagono;
    Hexagono miHexagono;
    Forma miForma;
    
    int numLados = 0;
    
    //Este es el constructor
    public VentanaPaint() {
        initComponents();
        inicializaBuffers();
        jDialog1.setSize(700, 450);
        guardarImagen.setSize(700, 450);
    }

    private void inicializaBuffers(){
        //Cojo lo que tiene el buffer y lo pinto en el JPanel
        lienzoGraphics =(Graphics2D) lienzo.getGraphics();
        
        //Creo una imagen del mismo ancho y alto que el lienzo. 
        //Tengo que castearlo para pasar de imagen a buffered imagen
        buffer = (BufferedImage)lienzo.createImage(lienzo.getWidth(), lienzo.getHeight());

        //Creo un trozo de la memoria en el que puedo hacer cosas (Imagen modificable: me permite trabajar sobre la imagen del buffer)
        bufferGraphics  = buffer.createGraphics();

        //Dibujo un rectangulo blanco del tamaño del lienzo
        bufferGraphics.setColor(Color.white);
        bufferGraphics.fillRect(0,0, lienzo.getWidth(), lienzo.getHeight());
        
        //Inicializo el segundo buffer
        buffer2 = (BufferedImage)lienzo.createImage(lienzo.getWidth(), lienzo.getHeight());
        
        //Creo una imagen modificable
        buffer2Graphics = buffer2.createGraphics();
        
        //Dibujo un rectangulo blanco del tamaño del lienzo
        buffer2Graphics.setColor(Color.white);
        buffer2Graphics.fillRect(0,0, buffer.getWidth(), buffer.getHeight());
               
    }
    //Sobreescribo el metodo paint() ya existente en Java. Para ello uso la instruccion @override
    @Override
    public void paint(Graphics g){
        //Este super ejecuta el codigo del metodo paint de la clase superior. Me garantiza que el paint funciona
        //como funcionaba hasta ahora y además le añado el codigo mio.
        super.paint(g);
        //Dibujo el buffer en la coordenada 0,0 del lienzo
        lienzoGraphics.drawImage(buffer, 0, 0, null);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jFileChooser1 = new javax.swing.JFileChooser();
        Ventana = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        guardarImagen = new javax.swing.JFileChooser();
        lienzo = new javax.swing.JPanel();
        Salir = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jButton2.setText("Aceptar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        jButton3.setText("Cancelar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jButton2)
                        .addGap(34, 34, 34)
                        .addComponent(jButton3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout VentanaLayout = new javax.swing.GroupLayout(Ventana.getContentPane());
        Ventana.getContentPane().setLayout(VentanaLayout);
        VentanaLayout.setHorizontalGroup(
            VentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 892, Short.MAX_VALUE)
        );
        VentanaLayout.setVerticalGroup(
            VentanaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
        );

        guardarImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarImagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 892, Short.MAX_VALUE)
            .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog2Layout.createSequentialGroup()
                    .addGap(134, 134, 134)
                    .addComponent(guardarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(135, Short.MAX_VALUE)))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 484, Short.MAX_VALUE)
            .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog2Layout.createSequentialGroup()
                    .addGap(43, 43, 43)
                    .addComponent(guardarImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(44, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lienzo.setPreferredSize(new java.awt.Dimension(800, 600));
        lienzo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lienzoMouseDragged(evt);
            }
        });
        lienzo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lienzoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lienzoMouseReleased(evt);
            }
        });

        jLabel1.setText("Guardar?");

        jButton11.setText("Si");

        jButton12.setText("No");

        javax.swing.GroupLayout SalirLayout = new javax.swing.GroupLayout(Salir);
        Salir.setLayout(SalirLayout);
        SalirLayout.setHorizontalGroup(
            SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalirLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1))
            .addGroup(SalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton11)
                .addGap(18, 18, 18)
                .addComponent(jButton12))
        );
        SalirLayout.setVerticalGroup(
            SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(SalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addContainerGap())
        );

        javax.swing.GroupLayout lienzoLayout = new javax.swing.GroupLayout(lienzo);
        lienzo.setLayout(lienzoLayout);
        lienzoLayout.setHorizontalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lienzoLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lienzoLayout.setVerticalGroup(
            lienzoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lienzoLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(319, Short.MAX_VALUE))
        );

        jButton1.setText("Color");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jButton4.setText("Circulo");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Cuadrado");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Triangulo");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
        });

        jButton7.setText("Pentagono");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Hexagono");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton8MousePressed(evt);
            }
        });

        jButton9.setText("Estrella");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton9MousePressed(evt);
            }
        });

        jButton10.setText("Guardar");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton10MousePressed(evt);
            }
        });

        jMenu1.setText("File");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenu3);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 892, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                        .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lienzo, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        colorSeleccionado = jColorChooser1.getColor();
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        formaSeleccionada = 0;
        numLados = 1000; //circulo
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        formaSeleccionada = 1;
        numLados = 4; //cuadrado
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
        formaSeleccionada = 2;
        numLados = 3; //triandulo
    }//GEN-LAST:event_jButton6MousePressed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        formaSeleccionada = 3;
        numLados = 5; //pentagono
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MousePressed
        formaSeleccionada = 4;
        numLados = 6; //hexagono
    }//GEN-LAST:event_jButton8MousePressed

    private void jButton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MousePressed
        numLados = 12;
    }//GEN-LAST:event_jButton9MousePressed

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void jButton10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MousePressed
        //Para guardar el archivo
        
        int seleccion = jFileChooser1.showSaveDialog(this);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            //Si entro aqui es porque el usuario le ha dado a aceptar
            
            File fichero = jFileChooser1.getSelectedFile();
            
            //Cojo el nombre del archivo
            String nombre = fichero.getName();
           
            //Busco la extension del archivo
            String extension = nombre.substring(nombre.lastIndexOf('.')+1, nombre.length());
            if(extension.equalsIgnoreCase("jpg")||extension.equalsIgnoreCase("png")){
                try{
                    //Aqui le digo que escriba el buffer con la extension que tenga
                    ImageIO.write(buffer, extension, fichero);
                }
                catch(IOException e){ 
                }
            }
        }
        if(seleccion == JFileChooser.CANCEL_OPTION){
            //si entro aqui es porque el usuario le ha dado a cancelar
        }
    }//GEN-LAST:event_jButton10MousePressed

    private void guardarImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guardarImagenActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
            //Para guardar el archivo
        
        int seleccion = jFileChooser1.showSaveDialog(this);
        if(seleccion == JFileChooser.APPROVE_OPTION){
            //Si entro aqui es porque el usuario le ha dado a aceptar
            
            File fichero = jFileChooser1.getSelectedFile();
            
            //Cojo el nombre del archivo
            String nombre = fichero.getName();
           
            //Busco la extension del archivo
            String extension = nombre.substring(nombre.lastIndexOf('.')+1, nombre.length());
            if(extension.equalsIgnoreCase("jpg")||extension.equalsIgnoreCase("png")){
                try{
                    //Aqui le digo que escriba el buffer con la extension que tenga
                    ImageIO.write(buffer, extension, fichero);
                }
                catch(IOException e){ 
                }
            }
        }
        if(seleccion == JFileChooser.CANCEL_OPTION){
            //si entro aqui es porque el usuario le ha dado a cancelar
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void lienzoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseReleased
        miForma.Dibujate(buffer2Graphics,evt.getX(), evt.getY());

        //Pinta el buffer definitivo en el buffer 2
        //         switch (formaSeleccionada){
            //            case 0:
            //                miCirculo.Dibujate(buffer2Graphics, evt.getX());
            //                break;
            //            case 1:
            //                miCuadrado.Dibujate(buffer2Graphics, evt.getX());
            //                break;
            //            case 2:
            //                miTriangulo.Dibujate(buffer2Graphics, evt.getY());
            //                break;
            //            case 3:
            //                miPentagono.Dibujate(buffer2Graphics, evt.getY());
            //                break;
            //            case 4:
            //                miHexagono.Dibujate(buffer2Graphics, evt.getY());
            //                break;
            //        }

    }//GEN-LAST:event_lienzoMouseReleased

    private void lienzoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMousePressed
        //Para que se vea, dibujo sobre el buffer
        //Apunto al objeto sobre el que ira el dibujo
        switch(numLados){
            case 3: miForma = new Triangulo(evt.getX(), evt.getY(), colorSeleccionado, true);break;
            case 4: miForma = new Cuadrado (evt.getX(), evt.getY(), colorSeleccionado, true);break;
            case 5: miForma = new Pentagono(evt.getX(), evt.getY(), colorSeleccionado, true);break;
            case 6: miForma = new Hexagono(evt.getX(), evt.getY(), colorSeleccionado, true);break;
            case 12: miForma = new Estrella (evt.getX(), evt.getY(), colorSeleccionado, true);break;
            case 500: miForma = new Circulo(evt.getX(), evt.getY(), colorSeleccionado, true);break;
        }

        //Switch para elegir las formas que pintare
        //        switch (formaSeleccionada){
            //            case 0:
            //                miCirculo = new Circulo(evt.getX(), evt.getY(), 1, colorSeleccionado, true);
            //                break;
            //            case 1:
            //                miCuadrado = new Cuadrado(evt.getX(), evt.getY(), 1, colorSeleccionado, true);
            //                break;
            //            case 2:
            //                miTriangulo = new Triangulo(evt.getX(), evt.getY(), 1, colorSeleccionado, true);
            //                break;
            //            case 3:
            //                miPentagono = new Pentagono(evt.getX(), evt.getY(), new int[5], new int[5], colorSeleccionado, true);
            //                break;
            //            case 4:
            //                miHexagono = new Hexagono(evt.getX(), evt.getY(), new int[6], new int[6], colorSeleccionado, true);
            //                break;
            //      }

        //Pinto el circulo sobre el buffer volviendo a llamar al metodo paint
        repaint(0,0,1,1);
    }//GEN-LAST:event_lienzoMousePressed

    private void lienzoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lienzoMouseDragged
        bufferGraphics.drawImage(buffer2, 0,0, null);
        miForma.Dibujate(bufferGraphics, evt.getX(), evt.getY());

        //Este metodo dibuja el "tamaño" del circulo
        //Borro lo que hubiera en el lienzo
        //        bufferGraphics.drawImage(buffer2, 0,0, null);
        //        //Dibujo la forma en el buffer
        //        switch (formaSeleccionada){
            //            case 0:
            //                miCirculo.Dibujate(bufferGraphics, evt.getX());
            //                break;
            //            case 1:
            //                miCuadrado.Dibujate(bufferGraphics, evt.getX());
            //                break;
            //            case 2:
            //                miTriangulo.Dibujate(bufferGraphics, evt.getY());
            //                break;
            //            case 3:
            //                miPentagono.Dibujate(bufferGraphics, evt.getY());
            //                break;
            //            case 4:
            //                miHexagono.Dibujate(bufferGraphics, evt.getY());
            //                break;
            //        }

        //Apunto al lienzo y lo paso al J Panel
        lienzoGraphics.drawImage(buffer, 0, 0, null);

        //Pinto el circulo sobre el buffer volviendo a llamar al metodo paint
        repaint(0,0,1,1);

    }//GEN-LAST:event_lienzoMouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Salir;
    private javax.swing.JDialog Ventana;
    private javax.swing.JFileChooser guardarImagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel lienzo;
    // End of variables declaration//GEN-END:variables
}
