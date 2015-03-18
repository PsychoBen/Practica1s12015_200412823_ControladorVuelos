/**
 * Universidad de San Carlos de Guatemala
 * Facultad de Ingenieria
 * Ingenieria en Ciencias y Sistemas
 * Esdras Benjamin Cotto Revolorio
 * Carnet: 200412823
 */

package Principal;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import org.json.*;

/**
 *
 * @author Ben
 */
public class Principal extends Mi_Ventana_200412823 {

    public static OkHttpClient webClient = new OkHttpClient();
    ConectarWebService miConexion;
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        miConexion = new ConectarWebService();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogo_NewAeropuerto = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        text_NewAeropuertoNombreAero = new javax.swing.JTextField();
        text_NewAeropuertoPassword = new javax.swing.JPasswordField();
        text_NewAeropuertoPais = new javax.swing.JTextField();
        boton_NewAeropuertoGuardar = new javax.swing.JButton();
        boton_NewAeropuertoCancelar = new javax.swing.JButton();
        boton_LoginIniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        text_LoginClaveAeropuerto = new javax.swing.JPasswordField();
        text_LoginNombreAeropuerto = new javax.swing.JTextField();
        boton_LoginSignUp = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        dialogo_NewAeropuerto.setTitle("Nuevo Aeropuerto");
        dialogo_NewAeropuerto.setIconImage(getIconImage());
        dialogo_NewAeropuerto.setMaximumSize(new java.awt.Dimension(457, 300));
        dialogo_NewAeropuerto.setMinimumSize(new java.awt.Dimension(457, 300));
        dialogo_NewAeropuerto.setModal(true);
        dialogo_NewAeropuerto.setResizable(false);
        dialogo_NewAeropuerto.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                dialogo_NewAeropuertoWindowOpened(evt);
            }
        });

        jLabel5.setBackground(java.awt.Color.black);
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ingrese los datos");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 204, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Nombre Aeropuerto");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 204, 204));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Password");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 204, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("País");

        text_NewAeropuertoNombreAero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_NewAeropuertoNombreAero.setToolTipText("Nombre Aeropuerto");

        text_NewAeropuertoPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_NewAeropuertoPassword.setToolTipText("Password");

        text_NewAeropuertoPais.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_NewAeropuertoPais.setToolTipText("Pais");

        boton_NewAeropuertoGuardar.setBackground(java.awt.Color.green);
        boton_NewAeropuertoGuardar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        boton_NewAeropuertoGuardar.setForeground(java.awt.Color.black);
        boton_NewAeropuertoGuardar.setText("Guardar");
        boton_NewAeropuertoGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boton_NewAeropuertoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_NewAeropuertoGuardarActionPerformed(evt);
            }
        });

        boton_NewAeropuertoCancelar.setBackground(java.awt.Color.red);
        boton_NewAeropuertoCancelar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        boton_NewAeropuertoCancelar.setForeground(new java.awt.Color(0, 0, 0));
        boton_NewAeropuertoCancelar.setText("Cancelar");
        boton_NewAeropuertoCancelar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boton_NewAeropuertoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_NewAeropuertoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogo_NewAeropuertoLayout = new javax.swing.GroupLayout(dialogo_NewAeropuerto.getContentPane());
        dialogo_NewAeropuerto.getContentPane().setLayout(dialogo_NewAeropuertoLayout);
        dialogo_NewAeropuertoLayout.setHorizontalGroup(
            dialogo_NewAeropuertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogo_NewAeropuertoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dialogo_NewAeropuertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(dialogo_NewAeropuertoLayout.createSequentialGroup()
                        .addGroup(dialogo_NewAeropuertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dialogo_NewAeropuertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(text_NewAeropuertoNombreAero)
                            .addComponent(text_NewAeropuertoPassword)
                            .addComponent(text_NewAeropuertoPais))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogo_NewAeropuertoLayout.createSequentialGroup()
                .addContainerGap(133, Short.MAX_VALUE)
                .addComponent(boton_NewAeropuertoGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(boton_NewAeropuertoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );
        dialogo_NewAeropuertoLayout.setVerticalGroup(
            dialogo_NewAeropuertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogo_NewAeropuertoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dialogo_NewAeropuertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(text_NewAeropuertoNombreAero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogo_NewAeropuertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(text_NewAeropuertoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dialogo_NewAeropuertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(text_NewAeropuertoPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(dialogo_NewAeropuertoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_NewAeropuertoGuardar)
                    .addComponent(boton_NewAeropuertoCancelar))
                .addContainerGap(96, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controlador de Vuelos");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(400, 300));
        setResizable(false);

        boton_LoginIniciar.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        boton_LoginIniciar.setForeground(new java.awt.Color(0, 102, 51));
        boton_LoginIniciar.setText("Login");
        boton_LoginIniciar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boton_LoginIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_LoginIniciarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NickName");

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password");

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGIN");

        text_LoginClaveAeropuerto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_LoginClaveAeropuerto.setToolTipText("Password");

        text_LoginNombreAeropuerto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        text_LoginNombreAeropuerto.setToolTipText("NickName");
        text_LoginNombreAeropuerto.setName(""); // NOI18N

        boton_LoginSignUp.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        boton_LoginSignUp.setForeground(java.awt.Color.blue);
        boton_LoginSignUp.setText(" Sign Up");
        boton_LoginSignUp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        boton_LoginSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_LoginSignUpActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login2.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_LoginNombreAeropuerto))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(text_LoginClaveAeropuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(boton_LoginIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boton_LoginSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_LoginNombreAeropuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(text_LoginClaveAeropuerto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_LoginIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_LoginSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_LoginIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_LoginIniciarActionPerformed
        try {
            miConexion.holaMundo(text_LoginNombreAeropuerto);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_boton_LoginIniciarActionPerformed

    private void boton_LoginSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_LoginSignUpActionPerformed
        dialogo_NewAeropuerto.setLocationRelativeTo(null);
        dialogo_NewAeropuerto.show();
    }//GEN-LAST:event_boton_LoginSignUpActionPerformed

    private void dialogo_NewAeropuertoWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_dialogo_NewAeropuertoWindowOpened
        dialogo_NewAeropuerto.getContentPane().setBackground(new Color(0,0,0));
    }//GEN-LAST:event_dialogo_NewAeropuertoWindowOpened

    private void boton_NewAeropuertoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_NewAeropuertoCancelarActionPerformed
        limpiarTextosNewAeropuerto();
        dialogo_NewAeropuerto.dispose();
    }//GEN-LAST:event_boton_NewAeropuertoCancelarActionPerformed

    private void boton_NewAeropuertoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_NewAeropuertoGuardarActionPerformed
        if (!text_NewAeropuertoNombreAero.getText().isEmpty()&& !text_NewAeropuertoPassword.getText().isEmpty()&&! text_NewAeropuertoPais.getText().isEmpty()){
            int n = JOptionPane.showConfirmDialog(dialogo_NewAeropuerto, "Los datos son correctos?", "Confirme los datos",	JOptionPane.YES_NO_OPTION);
            if (n==JOptionPane.YES_OPTION){
                datosNewAeropuerto(text_NewAeropuertoNombreAero.getText(), text_NewAeropuertoPassword.getText(), text_NewAeropuertoPais.getText());
            }
            else if(n==JOptionPane.NO_OPTION){
                limpiarTextosNewAeropuerto();
            }
            else {
                System.out.println("No se que paso");
            }
        }
        else {
            String message = "Todos los datos son obligatorios";
            JOptionPane.showMessageDialog(dialogo_NewAeropuerto, message, "Warning", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_boton_NewAeropuertoGuardarActionPerformed

    private void limpiarTextosLoginAeropuerto(){
        text_LoginNombreAeropuerto.setText("");
        text_LoginClaveAeropuerto.setText("");
    }
    
    private void limpiarTextosNewAeropuerto(){
        text_NewAeropuertoNombreAero.setText("");
        text_NewAeropuertoPais.setText("");
        text_NewAeropuertoPassword.setText("");
    }
    
    private boolean datosNewAeropuerto(String nombre, String Passw, String Pais){
        if (!nombre.isEmpty()&&!Passw.isEmpty()&&!Pais.isEmpty()){
            try {
                miConexion.crearAeropuerto(nombre, Passw, Pais);
                limpiarTextosNewAeropuerto();
                return true;
            } 
            catch (IOException ex) {                
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);                
                limpiarTextosNewAeropuerto();
                return false;
            }            
        }
        else{
            return false;
        }
    }
    
    private boolean datosLoguear(String NombreAero, String Passs){
        if(!NombreAero.isEmpty()&&!Passs.isEmpty()){
            return true;
        }
        else{
            return false;
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Mi_Ventana_200412823 jf = new Principal();
                jf.setLocationRelativeTo(null);                
                jf.setVisible(true);
            }
        });
    }

    /**
     * Sobrecarga del metodo para utilizar un icono personalizado para la aplicacion
     */
    @Override
     public Image getIconImage() 
    {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Images/icono.png"));
        return retValue;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_LoginIniciar;
    private javax.swing.JButton boton_LoginSignUp;
    private javax.swing.JButton boton_NewAeropuertoCancelar;
    private javax.swing.JButton boton_NewAeropuertoGuardar;
    private javax.swing.JDialog dialogo_NewAeropuerto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField text_LoginClaveAeropuerto;
    private javax.swing.JTextField text_LoginNombreAeropuerto;
    private javax.swing.JTextField text_NewAeropuertoNombreAero;
    private javax.swing.JTextField text_NewAeropuertoPais;
    private javax.swing.JPasswordField text_NewAeropuertoPassword;
    // End of variables declaration//GEN-END:variables
}
