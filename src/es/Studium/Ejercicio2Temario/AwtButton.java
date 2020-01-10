package es.Studium.Ejercicio2Temario;

/**
 * @author alvaro
 *
 */
import java.awt.*;
public class AwtButton extends Frame
{
	private static final long serialVersionUID = 1L;
	Button btnBoton = new Button("Ahora");
	public AwtButton()
	{
		setLayout(new FlowLayout());
		setTitle("Botón");
		add(btnBoton);
		setLocationRelativeTo(null);
		setSize(100,100);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new AwtButton();
	}
}