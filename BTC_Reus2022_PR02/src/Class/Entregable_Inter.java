package Class;

public interface Entregable_Inter {
	
	public abstract boolean entregar(); 			// Will change the state to true
	public abstract boolean devolver(); 			// Will change the state to false
	public abstract boolean isEntregado(); 			// Will return the actual state
	public abstract boolean compareTo(Object a); 	// Will compare diferent objects

}
