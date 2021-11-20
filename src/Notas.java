
import java.awt.HeadlessException;
import javax.swing.JOptionPane;



/**
 *
 * @author USRVI-LC3
 */
public class Notas extends javax.swing.JFrame {

    //constructor sin parametros
    public Notas() {
        initComponents();
        this.jtxt_promedio.setEnabled(false);//el promedio esta deshabilitado
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jbtn_calcular = new javax.swing.JButton();
        jbtn_limpiar = new javax.swing.JButton();
        jbtn_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxt_nota1 = new javax.swing.JTextField();
        jtxt_procentajeNota1 = new javax.swing.JTextField();
        jtxt_nota2 = new javax.swing.JTextField();
        jtxt_procentajeNota2 = new javax.swing.JTextField();
        jtxt_nota3 = new javax.swing.JTextField();
        jtxt_procentajeNota3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxt_promedio = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("                                Promedio");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jbtn_calcular.setText("Calcular");
        jbtn_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_calcularActionPerformed(evt);
            }
        });

        jbtn_limpiar.setText("Limpiar");
        jbtn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_limpiarActionPerformed(evt);
            }
        });

        jbtn_salir.setText("Salir");
        jbtn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_salirActionPerformed(evt);
            }
        });

        jLabel1.setText("Nota1");

        jLabel2.setText("Nota 2");

        jLabel3.setText("Nota 3");

        jLabel4.setText("Promedio");

        jLabel6.setText("%");

        jLabel7.setText("%");

        jLabel8.setText("%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jbtn_calcular)
                        .addGap(29, 29, 29)
                        .addComponent(jbtn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jbtn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtxt_nota2, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                        .addComponent(jtxt_nota1))
                                    .addComponent(jtxt_nota3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxt_procentajeNota3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                    .addComponent(jtxt_procentajeNota2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jtxt_procentajeNota1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(jtxt_promedio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtxt_nota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_procentajeNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxt_nota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_procentajeNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxt_nota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_procentajeNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxt_promedio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_calcular)
                    .addComponent(jbtn_limpiar)
                    .addComponent(jbtn_salir))
                .addGap(165, 165, 165))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_salirActionPerformed
        
        //System.exit(0);
        dispose();
        
    }//GEN-LAST:event_jbtn_salirActionPerformed

    private void jbtn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_limpiarActionPerformed
        
        this.jtxt_nota1.setText("");
        this.jtxt_nota2.setText("");
        this.jtxt_nota3.setText("");
        this.jtxt_procentajeNota1.setText("");
        this.jtxt_procentajeNota2.setText("");
        this.jtxt_procentajeNota3.setText("");
        this.jtxt_promedio.setText("");
        this.jtxt_nota1.requestFocus();//indica donde queda el cursor al limpiar
        
        
        
    }//GEN-LAST:event_jbtn_limpiarActionPerformed

    private void jbtn_calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_calcularActionPerformed
        
        //rescatar los valores de los textos del formulario
        // estoy transformando los "textos" a "decimales (double) con Double.parseDouble(String s)"
        try {
            double nota1 = Double.parseDouble(this.jtxt_nota1.getText());
            double nota2 = Double.parseDouble(this.jtxt_nota2.getText());
            double nota3 = Double.parseDouble(this.jtxt_nota3.getText());
            int porcentajeN1 = Integer.parseInt(this.jtxt_procentajeNota1.getText());
            int porcentajeN2 = Integer.parseInt(this.jtxt_procentajeNota2.getText());
            int porcentajeN3 = Integer.parseInt(this.jtxt_procentajeNota3.getText());
            
            int suma = porcentajeN1 +porcentajeN2 + porcentajeN3 ;
            if (suma==100){
                double prom= nota1*porcentajeN1/100+nota2*porcentajeN2/100+nota3*porcentajeN3/100;
                double prome=Math.round(prom*100.0/100.0); //para no dejar pegado al sistema lo hacemos con 2 decimales
                String promedio=String.valueOf(prome);
                this.jtxt_promedio.setText(promedio);
            } else{
                JOptionPane.showMessageDialog(this,"La suma de los porcentajes no es 100", "Error",0);
            }
            
            
            

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error de numero o campos vacios", "Error",0);
        }
   
        
      
        
    }//GEN-LAST:event_jbtn_calcularActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//       
//
//        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Notas().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtn_calcular;
    private javax.swing.JButton jbtn_limpiar;
    private javax.swing.JButton jbtn_salir;
    private javax.swing.JTextField jtxt_nota1;
    private javax.swing.JTextField jtxt_nota2;
    private javax.swing.JTextField jtxt_nota3;
    private javax.swing.JTextField jtxt_procentajeNota1;
    private javax.swing.JTextField jtxt_procentajeNota2;
    private javax.swing.JTextField jtxt_procentajeNota3;
    private javax.swing.JTextField jtxt_promedio;
    // End of variables declaration//GEN-END:variables
}
