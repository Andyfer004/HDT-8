/**
 * se importa la clase Comparator para poder comparar los elementos
 */

import java.util.Comparator;

public class Comparador	<Integer> implements Comparator<Integer> {
	/**
	 * Compares its two arguments for order.  Returns a negative integer, zero, or a positive
	 * integer as the first argument is less than, equal to, or greater than the second.<p>
	 * @param o1 the first object to be compared.
	 * @param o2 the second object to be compared.
	 * @return
	 */
	@Override
	public int compare(Integer o1, Integer o2) {
		if ((java.lang.Integer) o1 == (java.lang.Integer) o2)
			return 0;
		else if ((java.lang.Integer)o1 > (java.lang.Integer) o2)
			return 1;
		else 
			return -1;
	}

}