package a05;
/**
 * 
 * @author Pace Wasden & Gavin Rosenvall
 * 
 * This class finds the max and min of the y value and the max and min of the x value
 * Takes the values and then throws them into a rectangle.
 * 
 *
 */
public class RectHV {
	private double xmin, ymin;
	private double xmax, ymax;

	public RectHV(double xmin, double ymin, // construct the rectangle [xmin, xmax] x [ymin, ymax]
			double xmax, double ymax) {
		if (Double.isNaN(xmin) || Double.isNaN(xmin))
			throw new IllegalArgumentException("X value isnt valid");
		if (Double.isNaN(ymin) || Double.isNaN(ymax))
			throw new IllegalArgumentException("Y is not a valid number");
		if (ymax < ymin || xmax < xmin)
			throw new IllegalArgumentException("Ymax or Xmax is less than their minimum values");
		this.xmax = xmax;
		this.xmin = xmin;
		this.ymax = ymax;
		this.ymin = ymin;
	}

	// Minimum x-coordinate of rectangle
	public double xmin() {
		return xmin();
	}

	// Minimum y-coordinate of rectangle
	public double ymin() {
		return ymin();
	}

	// Maximum x-coordinate of rectangle
	public double xmax() {
		return xmax();
	}

	// Maximum y-coordinate of rectangle
	public double ymax() {
		return ymax();
	}

	// Does this rectangle contain the point p (either inside or on boundary)?
	public boolean contains(Point2D p) {
		return p.x() >= xmin && p.x() <= xmax && p.y() >= ymin && p.y() <= ymax;
	}

	// does this rectangle intersect that rectangle (at one or more points)?
	public boolean intersects(RectHV that) {
		return this.xmax >= that.xmin && this.ymax >= that.ymin && that.xmax >= this.xmin && that.ymax >= this.ymin;
	}

	// Square of Euclidean distance from point p to closest point in rectangle
	public double distanceSquaredTo(Point2D p) {
		return Math.sqrt(this.squaredTo(p));
	}
	private double squaredTo (Point2D p) {
		double x=0.0;
		double y=0.0;
		if (p.x()<xmin) 
			x=p.x()-xmin;
		else
			if (p.x()>xmax)
				x=p.x()-xmax;
		if (p.y()<ymin)
			y=p.y()-ymin;
		else
			if (p.y()>ymax)
				y=p.y()-ymax;
		return x*x+y*y;
		
	}

	// Checks to see if the object is equal to the object.
	public boolean equals(Object that) {
		if (that == null)
			return false;
		if (that.getClass() != this.getClass())
			return false;
		RectHV other = (RectHV) that;
		if ((other.xmin != this.xmin) || (other.xmax != this.xmax) || (other.ymin != this.ymin)
				|| (other.ymax != this.ymax))
			return false;
		return true;
	}

	// string representation
	public String toString() {
		return "[ " + xmin() + " , " + xmax() + " ] " + " x " + " [ " + ymin() + " , " + ymax() + " ] ";
	}
}
