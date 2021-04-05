package clases;

import com.sun.tools.javac.util.List;

public interface MiniList {
		
	
	/**
	 * El metodo introduce un elemento al final de la lista
	 * se pasa elemento a introducir
	 * indica true si el elemento fue insertado
	 * lanza NullPointerException en caso de intentar insertar un valor nulo
	 */
	
	public boolean add(Object Elementos) throws NullPointerException;
	
	
	/**
	 * Metodo que comprueba la existencia de un elemento en la lista
	 * se pasa elemento a buscar
	 * indica verdadero si esta, falso si no esta
	 */

	
	
	public boolean contains (Object Elementos);
	
	
	/**
	 * Elimina el elemento que ocupe la posición que se indica como parámetro
	 * se pasa posición del elemento a eliminar
	 * indica verdadero si se elimino, falso si no
	 */

	
	public boolean delete (Object Elementos);
	
	
	/**
	 * Cambia el elemento que está en la posición que se pasa como parametro
	 * se indica posición a cambiar
	 * se pasa elemento a introducir
	 * verdadero si se cambió, falso si no
	 */

	
	public boolean set (int posicion);
	
}
