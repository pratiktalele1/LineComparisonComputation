import java.util.Scanner;

import com.sun.jdi.Type;

public class LineCalculation {
    public double pointX2;
	public  double pointX1;
	public double pointY2;
	public double pointY1;
	public double lineLength;
	
	public LineCalculation(double pointX2, double pointX1, double pointY2, double pointY1) {
		super();
		this.pointX2 = pointX2;
		this.pointX1 = pointX1;
		this.pointY2 = pointY2;
		this.pointY1 = pointY1;
	}


	public void lengthOfLine() {
		
				lineLength=Math.sqrt(
						(Math.pow((pointX2-pointX1), 2))
						+
						(Math.pow(pointY2-pointY1, 2))
						);
				System.out.println("length of line is - "+lineLength);
		
	}
	
	public void equalLength() {
		
		System.out.print("Enter line x1 cordinate- ");
		Scanner scanValueX1 = new Scanner(System.in);
		pointX1 = scanValueX1.nextDouble();
		
		System.out.print("Enter line x2 cordinate- ");
		Scanner scanValueX2 = new Scanner(System.in);
		pointX2 = scanValueX2.nextDouble();
		
		System.out.print("Enter line y1 cordinate- ");
		Scanner scanValueY1 = new Scanner(System.in);
		pointY1 = scanValueY1.nextDouble();
		
		System.out.print("Enter line y2 cordinate- ");
		Scanner scanValueY2 = new Scanner(System.in);
		pointY2 = scanValueY2.nextDouble();
		
		double newLineLength=Math.sqrt(
				(Math.pow((pointX2-pointX1), 2))
				+
				(Math.pow(pointY2-pointY1, 2))
				);
		
		
		String getUserInput=newLineLength+"";
		String getLength=lineLength+"";
		
		boolean checkEquality=getUserInput.equals(getLength);
		
		if(checkEquality) {
			System.out.println("both line length are equal");
		}else {
			System.out.println("both line length are different");
		}
		
	}
}
