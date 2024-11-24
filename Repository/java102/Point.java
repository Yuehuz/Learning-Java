package java102;

public class Point {
	public double y;
	public double x;
	public Point(double x, double y) {
		this.x = x;
        this.y = y;
	}
		@Override
    	public String toString() {
        return "(" + x + ", " + y + ")";
    }
	
		public static Point centerOfMass(Point[] points){ 
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
}
	

		
	
						

				
	














