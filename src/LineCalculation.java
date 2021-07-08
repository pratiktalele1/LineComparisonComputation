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
		
		System.out.print("Enter line length- ");
		Scanner scanValue = new Scanner(System.in);
		double userInput = scanValue.nextDouble();

		String getUserInput=userInput+"";
		String getLength=lineLength+"";
		
		boolean checkEquality=getUserInput.equals(getLength);
		
		if(checkEquality) {
			System.out.println("both line length are equal");
		}else {
			System.out.println("both line length are different");
		}
		
	}
}
