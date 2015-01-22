package model.herencia;


/**
 * Clase padre... esta clase tiene 2 atributos los cuales son nombre y sueldo; y 2 metodos que son visualizar datos y calcular sueldo&nbsp;
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class Trabajador
{
	/**
	 * nombre del trabajador
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	private String nombre;
	
	/**
	 * contiene el salario del trabajador
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public float salario;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public Trabajador(){
		super();
	}

	/**
	 * metodo que permite obtener en forma de string los datos del objeto
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String visualizardatos() {
		// TODO implement me
		return "";	
	}
	
	/**
	 * calcula el sueldo del trabajador
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
         * @return 
	 * @generated
	 * @ordered
	 */
	
	public float calcularSueldo() {
		// TODO implement me
		return 0.0f;	
	}
	
}

