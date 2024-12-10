
package practicalibre;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class login extends javax.swing.JFrame {
private static final String EMAIL= "^[a-zA-Z0-9._-]{1,18}@[a-zA-Z0-9.-]{1,15}\\.(?:[a-zA-Z]{2,6})(?:\\.[a-zA-Z]{2,3})?$";
   


    public login() {
        initComponents();
        jContraseña.setEchoChar((char) 0);
        // Quitar el foco del primer JTextField (o JPasswordField) y ponerlo en un botón
        jBotonIngresar.requestFocusInWindow();// Esto quita el foco del JTextField y lo pone en el botón
        this.setLocationRelativeTo(null);//Hace que la ventana se abra centrada
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel01 = new javax.swing.JPanel();
        jPanel02 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jContraseña = new javax.swing.JPasswordField();
        jBotonIngresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        jPanel01.setBackground(new java.awt.Color(255, 255, 255));
        jPanel01.setPreferredSize(new java.awt.Dimension(380, 373));

        jPanel02.setBackground(new java.awt.Color(236, 238, 251));

        jLabel2.setFont(new java.awt.Font("Nunito Sans SemiBold", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(6, 8, 63));
        jLabel2.setText("Usuario o email");

        jUsuario.setFont(new java.awt.Font("Nunito Sans", 2, 14)); // NOI18N
        jUsuario.setForeground(new java.awt.Color(123, 130, 137));
        jUsuario.setText("Ingresá tu usuario o email");
        jUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jUsuarioFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Nunito Sans SemiBold", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(6, 8, 63));
        jLabel3.setText("Contraseña");

        jContraseña.setFont(new java.awt.Font("Nunito Sans", 2, 14)); // NOI18N
        jContraseña.setForeground(new java.awt.Color(123, 130, 137));
        jContraseña.setText(" Ingresá tu contraseña");
        jContraseña.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jContraseña.setPreferredSize(new java.awt.Dimension(64, 28));
        jContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jContraseñaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jContraseñaFocusLost(evt);
            }
        });
        jContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jContraseñaActionPerformed(evt);
            }
        });

        jBotonIngresar.setBackground(new java.awt.Color(100, 57, 255));
        jBotonIngresar.setFont(new java.awt.Font("Nunito Sans SemiBold", 1, 16)); // NOI18N
        jBotonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jBotonIngresar.setText("Ingresar");
        jBotonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonIngresarActionPerformed(evt);
            }
        });
        jBotonIngresar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jBotonIngresarKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Nunito Sans ExtraLight", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(73, 86, 254));
        jLabel4.setText("¿Te olvidaste tu contraseña?");

        jLabel5.setFont(new java.awt.Font("Nunito Sans", 2, 13)); // NOI18N
        jLabel5.setText("¿No tenés cuenta?");

        jLabel6.setFont(new java.awt.Font("Nunito Sans", 2, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(100, 57, 255));
        jLabel6.setText("Crear Cuenta >");

        javax.swing.GroupLayout jPanel02Layout = new javax.swing.GroupLayout(jPanel02);
        jPanel02.setLayout(jPanel02Layout);
        jPanel02Layout.setHorizontalGroup(
            jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel02Layout.createSequentialGroup()
                .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel02Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel02Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel02Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jBotonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel02Layout.setVerticalGroup(
            jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel02Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(30, 30, 30)
                .addComponent(jBotonIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Nunito Sans SemiBold", 2, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(100, 57, 255));
        jLabel1.setText("Ingresa a tu cuenta");

        javax.swing.GroupLayout jPanel01Layout = new javax.swing.GroupLayout(jPanel01);
        jPanel01.setLayout(jPanel01Layout);
        jPanel01Layout.setHorizontalGroup(
            jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel01Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel01Layout.setVerticalGroup(
            jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel01Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel01, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jContraseñaActionPerformed

    private void jContraseñaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jContraseñaFocusGained
        if(String.valueOf(jContraseña.getPassword()).equals(" Ingresá tu contraseña")){
            jContraseña.setText("");
            jContraseña.setEchoChar('•');
            jContraseña.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jContraseñaFocusGained

    private void jUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jUsuarioFocusGained
        if(String.valueOf(jUsuario.getText()).equals("Ingresá tu usuario o email")){
            jUsuario.setText("");
            jUsuario.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jUsuarioFocusGained

    private void jContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jContraseñaFocusLost
        // Restaurar el texto de placeholder si el campo está vacío
        if (jContraseña.getPassword().length == 0) {
            jContraseña.setText(" Ingresá tu contraseña");
            jContraseña.setEchoChar((char) 0); // Mostrar texto sin enmascarar
            jContraseña.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_jContraseñaFocusLost

    private void jUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jUsuarioFocusLost
        // Restaurar el texto de placeholder si el campo está vacío
        if (jUsuario.getText().isEmpty()) {
            jUsuario.setText("Ingresá tu usuario o email");
            jUsuario.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_jUsuarioFocusLost

    private void jBotonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonIngresarActionPerformed
    // este es el metodo mas importante. Primero tiene que evaluar que no esten vacios ninguno de los dos campos
    // despues tiene que validaar los datos que se ingresan en esos campo como la cantidad de caracteres y 
    // caracteres especiales. En el caso de que sea un email tiene que estar dentro del formato 
    // y cuando suceda el error saber explicarlo con detalle
    // cuando ambos campos sean validos tanto el usuario como la contraseña
    // crear otra ventana que si el ingreso es exitoso se abra y de la bienvenida
    
        String email = jUsuario.getText();
        //String contraseña = String.valueOf(jContraseña.getPassword());
        String contraseña = jContraseña.getText();//funciona
        String usuario = "alumno@ulp.edu.ar";
        String password = "1234";

        if (validarEmail(email)){
            if (email.equals(usuario)&& contraseña.equals(password)) {
                 JOptionPane.showMessageDialog(rootPane,"El usuario : " + email + " y la contraseña son correctas");
            }else{
                JOptionPane.showMessageDialog(rootPane, "El usuario : " + email + " o la contraseña NO son correctas");
                jUsuario.requestFocus();
            }
        }else{
            JOptionPane.showMessageDialog(rootPane, "El email o contraseña no son validos o están mal escritos");
            jUsuario.setText("");
            jUsuarioFocusLost(null);
            jContraseña.setText("");
            jContraseñaFocusLost(null);
        }
    }//GEN-LAST:event_jBotonIngresarActionPerformed

    private void jBotonIngresarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jBotonIngresarKeyPressed
        // Lógica para manejar el evento de pulsación de tecla
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { // Si se presiona la tecla Enter
            jBotonIngresarActionPerformed(null); // Llamada al método de acción del botón
        }
    }//GEN-LAST:event_jBotonIngresarKeyPressed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonIngresar;
    private javax.swing.JPasswordField jContraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel01;
    private javax.swing.JPanel jPanel02;
    private javax.swing.JTextField jUsuario;
    // End of variables declaration//GEN-END:variables
//-----------------------------------------------------------------------------
public boolean validarEmail(String email) {
    // 1. Compilamos el patrón
    Pattern patronEmail = Pattern.compile(EMAIL);

    // 2. Creamos un matcher para comparar el email con el patrón
    Matcher matcher = patronEmail.matcher(email);

    // 3. Verificamos si el email cumple con el patrón
    return matcher.matches();
}


}//
