package A05_KDTree;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.RectHV;
import edu.princeton.cs.algs4.RedBlackBST;
import edu.princeton.cs.algs4.Stack;

/**
 * 
 * @author Gavin Rosenvall & Pace Wasden
 *
 * @param <Value>
 */
public class PointST<Value>
{
	private RedBlackBST<Point2D, Value> bst;

	/**
	 * Constructs an empty symbol table of points.
	 */
	public PointST()
	{
		bst = new RedBlackBST<>();
	}

	/**
	 * Determines whether the symbol table is empty.
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		return size() == 0;
	}

	/**
	 * Returns the number of points.
	 * 
	 * @return
	 */
	public int size()
	{
		return bst.size();

	}

	/**
	 * Associate the value val with point p.
	 * 
	 * @param p
	 * @param val
	 */
	public void put(Point2D p, Value val)
	{
		if (p == null)
		{
			throw new NullPointerException("The point passed may not be null");
		}
		bst.put(p, val);
	}

	/**
	 * Returns the value associated with point p.
	 * 
	 * @param p
	 * @return
	 */
	public Value get(Point2D p)
	{
		if (p == null)
		{
			throw new NullPointerException("The point passed may not be null");
		}
		return bst.get(p);

	}

	/**
	 * Determines whether the symbol table contain point p.
	 * 
	 * @param p
	 * @return
	 */
	public boolean contains(Point2D p)
	{
		if (p == null)
		{
			throw new NullPointerException("The point passed may not be null");
		}
		return bst.contains(p);

	}

	/**
	 * Iterates through all of the points in the symbol table.
	 * 
	 * @return
	 */
	public Iterable<Point2D> points()
	{
		return bst.keys();

	}

	/**
	 * Iterates through all of the points that are inside the rectangle.
	 * 
	 * @param rect
	 * @return
	 */
	public Iterable<Point2D> range(RectHV rect)
	{
		if (rect == null)
		{
			throw new NullPointerException("the rectangle passed may not be null");
		}

		// Creates a stack to hold all of the points within the rectangle.
		Stack<Point2D> points = new Stack<>();
		for (Point2D el : bst.keys())
		{
			if (rect.contains(el))
			{
				points.push(el);
			}
		}
		return points;
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
		if (p == null)
		{
			throw new NullPointerException("The point passed may not be null");
		}

		// Starts with the smallest point and compares p against each point
		// until the nearest point is reached.
		Point2D nextPoint = bst.min();
		for (Point2D el : bst.keys())
		{
			if (p.distanceSquaredTo(el) < p.distanceSquaredTo(nextPoint))
			{
				nextPoint = el;
			}
		}
		return nextPoint;
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
