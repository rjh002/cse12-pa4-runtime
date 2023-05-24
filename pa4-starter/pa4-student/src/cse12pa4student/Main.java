package cse12pa4student;
public class Main {
	
	public static void main(String[] args) {

		List<Measurement> mOne = Measure.measure(new String[] {"A","B","C","D","E","F"},0,20);
		List,Measurement> mTwo = Measure.measure(new String[] {"A","B","C","D","D","E","F"},1000,1020);
		List<Measurement> mThree = Measure.measure(new String[] {"A","B","C","D","E","F"},10000,10010);
		
		System.out.println(Measure.measurementsToCSV(mOne));
		System.out.println(Measure.measurementsToCSV(mTwo));
		System.out.println(Measure.measurementsToCSV(mThree));
		
	}
}
