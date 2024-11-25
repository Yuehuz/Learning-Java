package java102;


public class Point {
	public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static Point centerOfMass(Point[] points) { 
        double sumX = 0;
        double sumY = 0;
        for (int z = 0; z < points.length; z++) {
            sumX += points[z].x; 
            sumY += points[z].y; 
        }
        return new Point(sumX / points.length, sumY / points.length);
    }

    public double angle() {
        double angleRadians = Math.atan2(y, x);
        double angleDegrees = Math.toDegrees(angleRadians);
        return angleDegrees;
    }

    public Point rotate(double theta) {
        double thetaRadians = Math.toRadians(theta);
        double newX = x * Math.cos(thetaRadians) - y * Math.sin(thetaRadians);
        double newY = x * Math.sin(thetaRadians) + y * Math.cos(thetaRadians);
        return new Point(newX, newY);
    }
	
}

	

		
	
						

				
	














