package es.Studium.Ejercicio2Temario;
import java.awt.*;
/**
 * @author alvaro
 *
 */
public class AwtList extends Frame
{
	private static final long serialVersionUID = 1L;
	// Creación de una lista con 4 elementos visibles y que no
	// permite multiselección
	List choLista = new List(4, false); //Esto indica la cantidad de elementos que seran visibles, el false indica si podemos o no marcar mas de un elemento de la lista.
	public AwtList()
	{
		setLayout(new FlowLayout());
		setTitle("Lista"); //Titulo de la ventana
		//Añadimos los elementos de la lista
		choLista.add("Blanco");
		choLista.add("Rojo");
		choLista.add("Azul");
		choLista.add("Verde");
		choLista.add("Amarillo");
		choLista.add("Naranja");
		add(choLista); //Añadimos la lista
		setLocationRelativeTo(null);
		setSize(150,150);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new AwtList(); //Mostramos la lista
	}
}