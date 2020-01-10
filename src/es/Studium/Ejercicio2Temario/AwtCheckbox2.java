package es.Studium.Ejercicio2Temario;
import java.awt.*;
/**
 * @author alvaro
 *
 */
public class AwtCheckbox2 extends Frame
{
	private static final long serialVersionUID = 1L;
	//En este caso, primero se define un grupo
	CheckboxGroup chkgrGrupo1 = new CheckboxGroup(); //Creamos un primer grupo de Checkbox	
	// Al crear los checkboxes, se indica la etiqueta, si está o no
	// activo y el grupo al que pertenece. En un grupo, solamente
	// podrá estar activo un checkbox
	Checkbox chkG1Uno = new Checkbox("Opción Uno", false, chkgrGrupo1);
	Checkbox chkG1Dos = new Checkbox("Opción Dos", false, chkgrGrupo1);
	Checkbox chkG1Tres = new Checkbox("Opción Tres", false, chkgrGrupo1);
	CheckboxGroup chkgrGrupo2 = new CheckboxGroup();  //Creamos un segundo grupo de Checkbox
	Checkbox chkG2Uno = new Checkbox("Opción Uno", false, chkgrGrupo2);
	Checkbox chkG2Dos = new Checkbox("Opción Dos", false, chkgrGrupo2);
	Checkbox chkG2Tres = new Checkbox("Opción Tres", false, chkgrGrupo2);
	public AwtCheckbox2()
	{
		setLayout(new FlowLayout());
		setTitle("Botones de Opción excluyentes");
		add(chkG1Uno);
		add(chkG1Dos);
		add(chkG1Tres);
		add(chkG2Uno);
		add(chkG2Dos);
		add(chkG2Tres);
		setLocationRelativeTo(null);
		setSize(400,250);
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new AwtCheckbox2(); //muestra el checkbox
	}
}