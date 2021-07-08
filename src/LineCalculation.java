
public class LineCalculation {
    public double pointX2;
	public  double pointX1;
	public double pointY2;
	public double pointY1;
	
	
	public LineCalculation(double pointX2, double pointX1, double pointY2, double pointY1) {
		super();
		this.pointX2 = pointX2;
		this.pointX1 = pointX1;
		this.pointY2 = pointY2;
		this.pointY1 = pointY1;
	}


	public void LengthOfLine() {
		System.out.println("length of line is - "+
				Math.sqrt(
						(Math.pow((pointX2-pointX1), 2))
						+
						(Math.pow(pointY2-pointY1, 2))
						)
				);
	}
}
