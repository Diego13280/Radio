package radio;

import javax.swing.JOptionPane;

public class Grafico extends javax.swing.JFrame {

    private double  a;
    private double b;
    private int c, posFM, posAM;
    Radio miRadio = new Radio();
    
    public Grafico() {
        initComponents();        
        Apagar.setVisible(false);
        EstacionUno.setEnabled(false);
        EstacionDos.setEnabled(false);
        EstacionTres.setEnabled(false);
        EstacionCuatro.setEnabled(false);
        EstacionCinco.setEnabled(false);
        EstacionSeis.setEnabled(false);
        EstacionSiete.setEnabled(false);
        EstacionOcho.setEnabled(false);
        EstacionNueve.setEnabled(false);
        EstacionDiez.setEnabled(false);
        EstacionOnce.setEnabled(false);
        EstacionDoce.setEnabled(false);
        CambiarFrecuencia.setEnabled(false);
        Subir.setEnabled(false);
        Bajar.setEnabled(false);
        GuardarEstacion.setEnabled(false);
        a = 87.9; 
        b = 530;
        c=0;
        posAM = 0;
        posFM = 0;
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Encender = new javax.swing.JButton();
        Apagar = new javax.swing.JButton();
        EstacionUno = new javax.swing.JButton();
        EstacionDos = new javax.swing.JButton();
        EstacionCuatro = new javax.swing.JButton();
        EstacionTres = new javax.swing.JButton();
        EstacionOcho = new javax.swing.JButton();
        EstacionSeis = new javax.swing.JButton();
        EstacionCinco = new javax.swing.JButton();
        EstacionSiete = new javax.swing.JButton();
        EstacionDoce = new javax.swing.JButton();
        EstacionDiez = new javax.swing.JButton();
        EstacionNueve = new javax.swing.JButton();
        EstacionOnce = new javax.swing.JButton();
        Bajar = new javax.swing.JButton();
        Subir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CambiarFrecuencia = new javax.swing.JButton();
        GuardarEstacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Encender.setText("Encender");
        Encender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncenderActionPerformed(evt);
            }
        });

        Apagar.setText("Apagar");
        Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApagarActionPerformed(evt);
            }
        });

        EstacionUno.setText("1");
        EstacionUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstacionUnoActionPerformed(evt);
            }
        });

        EstacionDos.setText("2");

        EstacionCuatro.setText("4");

        EstacionTres.setText("3");
        EstacionTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstacionTresActionPerformed(evt);
            }
        });

        EstacionOcho.setText("8");

        EstacionSeis.setText("6");

        EstacionCinco.setText("5");
        EstacionCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstacionCincoActionPerformed(evt);
            }
        });

        EstacionSiete.setText("7");
        EstacionSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstacionSieteActionPerformed(evt);
            }
        });

        EstacionDoce.setText("12");

        EstacionDiez.setText("10");

        EstacionNueve.setText("9");
        EstacionNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstacionNueveActionPerformed(evt);
            }
        });

        EstacionOnce.setText("11");
        EstacionOnce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstacionOnceActionPerformed(evt);
            }
        });

        Bajar.setText("<");
        Bajar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BajarActionPerformed(evt);
            }
        });

        Subir.setText(">");
        Subir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubirActionPerformed(evt);
            }
        });

        jLabel1.setText("Fm: ");

        jLabel2.setText("97.5");

        CambiarFrecuencia.setText("Cambiar Frecuencia");
        CambiarFrecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CambiarFrecuenciaActionPerformed(evt);
            }
        });

        GuardarEstacion.setText("Guardar Estacion ");
        GuardarEstacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarEstacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Encender)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Apagar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 108, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(EstacionUno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EstacionSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EstacionOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(EstacionNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(EstacionDiez, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(EstacionOnce, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(EstacionDoce, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EstacionDos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(EstacionTres, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(EstacionCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(EstacionCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(EstacionSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Bajar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(CambiarFrecuencia)
                                .addGap(34, 34, 34)
                                .addComponent(Subir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(151, 151, 151))))
            .addGroup(layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addComponent(GuardarEstacion)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Apagar)
                    .addComponent(Encender))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Bajar)
                    .addComponent(CambiarFrecuencia)
                    .addComponent(Subir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EstacionUno)
                    .addComponent(EstacionDos)
                    .addComponent(EstacionTres)
                    .addComponent(EstacionCuatro)
                    .addComponent(EstacionCinco)
                    .addComponent(EstacionSeis))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EstacionSiete)
                    .addComponent(EstacionOcho)
                    .addComponent(EstacionNueve)
                    .addComponent(EstacionDiez)
                    .addComponent(EstacionOnce)
                    .addComponent(EstacionDoce))
                .addGap(18, 18, 18)
                .addComponent(GuardarEstacion)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EncenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EncenderActionPerformed
       Encender.setVisible(false);
       JOptionPane.showMessageDialog(null, "Se ha encendido la Radio", "Radio", JOptionPane.INFORMATION_MESSAGE);
       Apagar.setVisible(true);
       EstacionUno.setEnabled(true);
       EstacionDos.setEnabled(true);
        EstacionTres.setEnabled(true);
        EstacionCuatro.setEnabled(true);
        EstacionCinco.setEnabled(true);
        EstacionSeis.setEnabled(true);
        EstacionSiete.setEnabled(true);
        EstacionOcho.setEnabled(true);
        EstacionNueve.setEnabled(true);
        EstacionDiez.setEnabled(true);
        EstacionOnce.setEnabled(true);
        EstacionDoce.setEnabled(true);
        CambiarFrecuencia.setEnabled(true);
        Subir.setEnabled(true);
        Bajar.setEnabled(true);
        GuardarEstacion.setEnabled(true);
      

    }//GEN-LAST:event_EncenderActionPerformed

    private void ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApagarActionPerformed
       Apagar.setVisible(false);
       JOptionPane.showMessageDialog(null, "Se ha apagado la Radio", "Radio", JOptionPane.INFORMATION_MESSAGE);
       Encender.setVisible(true);
       EstacionUno.setEnabled(false);
       EstacionDos.setEnabled(false);
        EstacionTres.setEnabled(false);
        EstacionCuatro.setEnabled(false);
        EstacionCinco.setEnabled(false);
        EstacionSeis.setEnabled(false);
        EstacionSiete.setEnabled(false);
        EstacionOcho.setEnabled(false);
        EstacionNueve.setEnabled(false);
        EstacionDiez.setEnabled(false);
        EstacionOnce.setEnabled(false);
        EstacionDoce.setEnabled(false);
        CambiarFrecuencia.setEnabled(false);
        Subir.setEnabled(false);
        Bajar.setEnabled(false);
        GuardarEstacion.setEnabled(false);
        
      
       
    }//GEN-LAST:event_ApagarActionPerformed

    private void EstacionUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstacionUnoActionPerformed
        if (c == 0) {
            a = miRadio.sacar(posFM);
            jLabel2.setText(""+a) ;            
        } else {
           b = miRadio.sacar(posAM);
           jLabel2.setText(""+b) ; 
        }    
    }//GEN-LAST:event_EstacionUnoActionPerformed

    private void EstacionTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstacionTresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstacionTresActionPerformed

    private void EstacionCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstacionCincoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstacionCincoActionPerformed

    private void EstacionSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstacionSieteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstacionSieteActionPerformed

    private void EstacionNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstacionNueveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstacionNueveActionPerformed

    private void EstacionOnceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstacionOnceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstacionOnceActionPerformed

    private void SubirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubirActionPerformed
       
       if (c == 0){
            a= miRadio.subirEstacion(c,a);
            jLabel2.setText(""+a) ;        
        }
        else {
            b= miRadio.subirEstacion(c,b);
            jLabel2.setText(""+b) ;
       }
       
       
    }//GEN-LAST:event_SubirActionPerformed

    private void BajarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BajarActionPerformed
      if (c == 0){
            a= miRadio.bajarEstacion(c,a);
            jLabel2.setText(""+a) ;        
        }
        else {
            b= miRadio.bajarEstacion(c,b);
            jLabel2.setText(""+b) ;
       }
        
    }//GEN-LAST:event_BajarActionPerformed

    private void CambiarFrecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CambiarFrecuenciaActionPerformed
        if (c == 0){
            jLabel1.setText("AM");
            jLabel2.setText(""+b) ;
            c=1;
        }
        else {
            jLabel1.setText("FM");
            jLabel2.setText(""+a) ;
            c=0;
        }
       //c=0;
        
    }//GEN-LAST:event_CambiarFrecuenciaActionPerformed

    private void GuardarEstacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarEstacionActionPerformed
        
        if (c==0) {
            miRadio.Guardar(posFM, a);   
            posFM++;
        } else {
            miRadio.Guardar(posAM, b);   
            posAM++;  
        }       
       
        if (posFM > 11) {
            posFM = 0;
        }
        if (posAM > 11) {
            posAM = 0;
        }
        
        JOptionPane.showMessageDialog(null, "Su estacion se Ha guardado", "Radio", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_GuardarEstacionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Apagar;
    private javax.swing.JButton Bajar;
    private javax.swing.JButton CambiarFrecuencia;
    private javax.swing.JButton Encender;
    private javax.swing.JButton EstacionCinco;
    private javax.swing.JButton EstacionCuatro;
    private javax.swing.JButton EstacionDiez;
    private javax.swing.JButton EstacionDoce;
    private javax.swing.JButton EstacionDos;
    private javax.swing.JButton EstacionNueve;
    private javax.swing.JButton EstacionOcho;
    private javax.swing.JButton EstacionOnce;
    private javax.swing.JButton EstacionSeis;
    private javax.swing.JButton EstacionSiete;
    private javax.swing.JButton EstacionTres;
    private javax.swing.JButton EstacionUno;
    private javax.swing.JButton GuardarEstacion;
    private javax.swing.JButton Subir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
