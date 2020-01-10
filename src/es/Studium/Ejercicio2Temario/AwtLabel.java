/**
 * 
 */
package es.Studium.Ejercicio2Temario;

/**
 * @author alvaro
 *
 */
import java.awt.*;

public class AwtLabel extends Frame

{

private static final long serialVersionUID = 1L;

Label lblEtiqueta = new Label("Cervantes"); //Etiqueta que queremos poner.

public AwtLabel()

{

setLayout(new FlowLayout());

setTitle("Etiqueta"); //Etiqueta del cuadro

add(lblEtiqueta);

setLocationRelativeTo(null);

setSize(100,100); //Tamaño

setVisible(true); //Queremos que se muestre

}

public static void main(String[] args)

{

new AwtLabel();

}

}
