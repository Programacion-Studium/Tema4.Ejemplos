package es.Studium.Ejercicio2Temario;
import java.awt.*;
/**
 * @author alvaro
 *
 */
public class AwtScrollbar extends Frame
{
	private static final long serialVersionUID = 1L;
	Scrollbar scrVertical = new Scrollbar(Scrollbar.VERTICAL);//Establece un scrollbar vertical
	Scrollbar scrHorizontal = new Scrollbar(Scrollbar.HORIZONTAL);////Establece un scrollbar Horizontal
	public AwtScrollbar()
	{
		setLayout(new BorderLayout());
		setTitle("Scrollbar");
		add("East", scrVertical);//Añade el Scrollbar en la derecha
		add("South", scrHorizontal);//Añade el Scrollbar en la parte inferior
		setLocationRelativeTo(null);//pone la ventana en el centro
		setSize(150,150);//Establece el tamaño de la ventana
		setVisible(true);//Pone visible el Scroll
	}
	public static void main(String[] args)
	{
		new AwtScrollbar();//Muestra el Scrollball
	}
}