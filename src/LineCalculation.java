import java.util.Scanner;

import com.sun.jdi.Type;

public class LineCalculation {
	//variables
    
	public double pointX2;
	public  double pointX1;
	public double pointY2;
	public double pointY1;
	public double lineLength;
	public double newLineLength;

	//constructor initializing variables
	
	public LineCalculation(double pointX2, double pointX1, double pointY2, double pointY1) {
		super();
		this.pointX2 = pointX2;
		this.pointX1 = pointX1;
		this.pointY2 = pointY2;
		this.pointY1 = pointY1;
	}

	//lengthOfLine function is added for calculating length of line
	
	public void lengthOfLine() {
				// using Math.pow and Math.sqrt method
				lineLength=Math.sqrt(
						(Math.pow((pointX2-pointX1), 2))
						+
						(Math.pow(pointY2-pointY1, 2))
						);
				System.out.println("--------------------------------------");
				System.out.println("length of line is - "+lineLength);
				System.out.println("--------------------------------------");

		
	}
	
	//equalLength function is added for checking two lines are equal or not using equals method
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
		
		// using Math.pow and Math.sqrt method	
		 double newLineLength=Math.sqrt(
				(Math.pow((pointX2-pointX1), 2))
				+
				(Math.pow(pointY2-pointY1, 2))
				);
		
		
		String getUserInput=newLineLength+"";
		String getLength=lineLength+"";
		
		boolean checkEquality=getUserInput.equals(getLength);
		System.out.println("--------------------------------------");

		if(checkEquality) {
			System.out.println("both line length are equal");
		}else {
			System.out.println("both line length are different");
		}
		System.out.println("--------------------------------------");

			
	}
	
	//compareLength function is added for comparing 2 lines using compareTo method 
	
	public void compareLength() {
		System.out.println("first line inputs");
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
		
		// using Math.pow and Math.sqrt method
		 double firstLineLength=Math.sqrt(
				(Math.pow((pointX2-pointX1), 2))
				+
				(Math.pow(pointY2-pointY1, 2))
				);
		
		//type casting from double to string 
		String getUser1Input=firstLineLength+"";
		
		System.out.println("second line inputs");
		System.out.print("Enter line x1 cordinate- ");
		Scanner scanValueX1for2 = new Scanner(System.in);
		pointX1 = scanValueX1for2.nextDouble();
		
		System.out.print("Enter line x2 cordinate- ");
		Scanner scanValueX2for2 = new Scanner(System.in);
		pointX2 = scanValueX2for2.nextDouble();
		
		System.out.print("Enter line y1 cordinate- ");
		Scanner scanValueY1for2 = new Scanner(System.in);
		pointY1 = scanValueY1for2.nextDouble();
		
		System.out.print("Enter line y2 cordinate- ");
		Scanner scanValueY2for2 = new Scanner(System.in);
		pointY2 = scanValueY2for2.nextDouble();
		
		// using Math.pow and Math.sqrt method
		 double secondLineLength=Math.sqrt(
				(Math.pow((pointX2-pointX1), 2))
				+
				(Math.pow(pointY2-pointY1, 2))
				);
		
		//type casting from double to string 
		String getUser2Input=secondLineLength+"";
		
		//compareTo method
		double firstValue=(getUser1Input.compareTo(getUser2Input));
		double secondValue=(getUser2Input.compareTo(getUser1Input));
		
		System.out.println("--------------------------------------");

		if(firstValue>secondValue) {
			System.out.println("first line is greater");
		}
		else { 
			if(firstValue<secondValue){
			System.out.println("second line is greater");
			}else {
				System.out.println("both first and second lines are equal");
			}
		}
		System.out.println("--------------------------------------");

	}
	
	
	
}
