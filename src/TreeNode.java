
public class TreeNode<P, V> {

	private P _priority;
	private V _value;
	TreeNode<P, V> _parent;
	TreeNode<P, V> _left;
	TreeNode<P, V> _right;
	/**
	 * returns the parent of the node
	 * @param _priority
	 * @param _value
	 * @param _parent
	 * @param _left
	 * @param _right
	 */
	public TreeNode(P priority, V value) {
		set_priority(priority);
		set_value(value);
		set_parent(null);
		set_left(null);
		set_right(null);
	}

	/**
	 *devuelve la prioridad del nodo
	 * @return
	 */
	public P get_priority() {
		return _priority;
	}
	/**
	 * establece la prioridad del nodo
	 * @param _priority
	 */
	public void set_priority(P _priority) {
		this._priority = _priority;
	}
	/**
	 * devuelve el valor del nodo
	 * @return
	 */
	public V get_value() {
		return _value;
	}
	/**
	 * establece el valor del nodo
	 * @param _value
	 */
	public void set_value(V _value) {
		this._value = _value;
	}
	/**
	 * devuelve el padre del nodo
	 * @return
	 */
	public TreeNode<P, V> get_parent() {
		return _parent;
	}

	/**
	 *
	 * @param _parent
	 */
	public void set_parent(TreeNode<P, V> _parent) {
		this._parent = _parent;
	}
	/**
	 * devuelve el hijo izquierdo del nodo
	 * @return
	 */
	public TreeNode<P, V> get_left() {
		return _left;
	}
	/**
	 * establece el hijo izquierdo del nodo
	 * @param _left
	 */
	public void set_left(TreeNode<P, V> _left) {
		this._left = _left;
	}
	/**
	 * devuelve el hijo derecho del nodo
	 * @return
	 */
	public TreeNode<P, V> get_right() {
		return _right;
	}
	/**
	 * establece el hijo derecho del nodo
	 * @param _right
	 */
	public void set_right(TreeNode<P, V> _right) {
		this._right = _right;
	}

	
	
}
