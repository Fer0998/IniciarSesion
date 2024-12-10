/*Ejercicio 1:
Crea una aplicación GUI en Java que simule un formulario de login. La interfaz debe contener los 
siguientes elementos:
1. Un campo de texto (JTextField) para que el usuario pueda ingresar su mail.
2. Un campo de texto (JTextField) para que el usuario pueda ingresar su password.
3. Un botón (JButton) con el texto "Registrar".
Cuando el usuario haga clic en el botón "Registrar", la aplicación debe mostrar un diálogo
emergente (JOptionPane) con un mensaje de bienvenida si el mail es igual a alumno@ulp.edu.ar
y el password es igual a “12345678”, caso contrario el mensaje debe decir “Usuario y/o contraseña 
incorrectos” .
Recuerda que debes utilizar la biblioteca de componentes gráficos de Java (Swing) para crear la 
interfaz y gestionar los eventos del botón.
*/
package practicalibre;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class PracticaLibre {

  
    public static void main(String[] args) {
       /*Este código intenta establecer el Look and Feel llamado "Nimbus", 
          que es un estilo visual moderno incluido en Java. Puedes probar 
          también con otros nombres de estilos, como:*/

        try {
            // Cambia "Nimbus" por el estilo que prefieras
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            ex.printStackTrace();
        }
       
 
        login cuadroInicial = new login();
        cuadroInicial.setVisible(true);
        cuadroInicial.setVisible(true);
        cuadroInicial.repaint();
        
       
        
    }
    
}
