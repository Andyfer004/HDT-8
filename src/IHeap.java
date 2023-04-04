public interface IHeap<P, V> {
	/**
	 * Inserta un elemento en el heap
	 * @param priority
	 * @param value
	 */
	void Insert(P priority, V value);
	/**
	 * Devuelve el elemento con mayor prioridad
	 * @return
	 */
	V get();
	/**
	 * Elimina el elemento con mayor prioridad
	 * @return
	 */
	V remove();

	/**
	 * Devuelve la cantidad de elementos en el heap
	 * @return
	 */
	int count();
	/**
	 * Devuelve true si el heap esta vacio
	 * @return
	 */
	boolean isEmpty();
	
}