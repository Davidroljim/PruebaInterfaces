package clases;

public class MiLista implements MiniList{
	
	private Container lista=null;

	@Override
	public boolean add(Object a) throws NullPointerException {
	int contador=0;
	Container aux = new Container();
	boolean retorno = false;
	try {
		Container nuevo =  new Container();
		nuevo.elemento = a;
		if(lista == null) {
			lista = nuevo;
			contador++;
		}
		else {
			Container actual = new Container();
			actual.elemento = a;
			lista.next = actual;
			while(aux.next!=null) {
			//Para imprimir la lista seria:
			//while(aux != null){
			//System.out.println(aux.elemento);
				aux.next=actual;
			}
		}
	} catch (NullPointerException e) {
		System.out.println("No se admiten elementos nulos");
		retorno = false;
	}
		return retorno;
	}
	
	
	@Override
	public boolean contains(Object Elementos) {
		boolean retorno=false;
		int contador=0;
		Container aux = new Container();
		
		if (lista==null) {
			System.out.println("No hay con qué compararlo");
			return false;
		}else {
			aux=lista;
		}
		
		while(aux!=null) {
			
			Container actual = new Container();
			actual.elemento = lista.elemento;
			if (actual.elemento.equals(Elementos)) {
				
			}
			aux=aux.next;
		}
		
		return retorno;
	}
	
	
	private class Container {
		
		private Object elemento = null;
		private Container next = null;
	}

	

	@Override
	public boolean delete(Object Elementos) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean set(int posicion) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public Object get(int posicion) {
		// TODO Auto-generated method stub
		return null;
	}
	

}