package es.Studium.Ejercicio2Temario;
import java.awt.*;
/**
 * @author alvaro
 *
 */

public class AwtCheckbox1 extends Frame
{
	private static final long serialVersionUID = 1L;
	//En este caso, se pueden elegir todas las opciones que queramos
	//Las opciones se mostraran en el orden introducido
	Checkbox chkUno = new Checkbox("Opción Uno");
	Checkbox chkDos = new Checkbox("Opción Dos");
	Checkbox chkTres = new Checkbox("Opción Tres");
	public AwtCheckbox1()
	{
		setLayout(new FlowLayout());
		setTitle("Botones de Opción"); //Titulo de la ventana
		add(chkUno);
		add(chkDos);
		add(chkTres);
		setLocationRelativeTo(null);
		setSize(100,150);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new AwtCheckbox1();//Muestra el Checkbox
	}
}
