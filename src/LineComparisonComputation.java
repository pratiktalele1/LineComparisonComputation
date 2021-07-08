
public class LineComparisonComputation {
public static void main(String[] args) {
	double pointX1=1;
	double pointX2=3;
	double pointY1=2;
	double pointY2=1;
	
	LineCalculation calculateLength = new LineCalculation(pointX2, pointX1, pointY2, pointY1);
	calculateLength.lengthOfLine();
	calculateLength.equalLength();
	
}
}	
