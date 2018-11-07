package A05_KDTree;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.RectHV;

/**
 * 
 * @author Gavin Rosenvall & Pace Wasden
 *
 * @param <Value>
 */
public class KdTreeST<Value>
{
	/**
	 * Constructs an empty symbol table of points.
	 */
	public KdTreeST()
	{

	}

	/**
	 * Determines whether the symbol table is empty.
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		return false; // TODO
	}

	/**
	 * Returns the number of points.
	 * 
	 * @return
	 */
	public int size()
	{
		return 0; // TODO
	}

	/**
	 * Associate the value val with point p.
	 * 
	 * @param p
	 * @param val
	 */
	public void put(Point2D p, Value val)
	{

	}

	/**
	 * Returns the value associated with point p.
	 * 
	 * @param p
	 * @return
	 */
	public Value get(Point2D p)
	{
		return null; // TODO
	}

	/**
	 * Determines whether the symbol table contain point p.
	 * 
	 * @param p
	 * @return
	 */
	public boolean contains(Point2D p)
	{
		return false; // TODO
	}

	/**
	 * Iterates through all of the points in the symbol table.
	 * 
	 * @return
	 */
	public Iterable<Point2D> points()
	{
		return null; // TODO
	}

	/**
	 * Iterates through all of the points that are inside the rectangle.
	 * 
	 * @param rect
	 * @return
	 */
	public Iterable<Point2D> range(RectHV rect)
	{
		return null; // TODO
	}

	/**
	 * Determines the nearest neighbor to point p or null if the symbol table is
	 * empty.
	 * 
	 * @param p
	 * @return
	 */
	public Point2D nearest(Point2D p)
	{
		return null; // TODO
	}

	/**
	 * Unit testing.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO or JUnit test cases
	}
}