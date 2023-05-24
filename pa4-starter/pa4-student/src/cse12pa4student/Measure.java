package cse12pa4student;

import java.util.List;
import static cse12pa4mysteries.Mysteries.*;

public class Measure {


	public static List<Measurement> measure(String[] toRun, int startN, int stopN) {
		/** TODO **/
		
		//Example call to mystery method
		List<Measurement> finalList = new ArrayList<Measurement>();
			for(int i = 0; i< toRun.length; i++) {
				
				String s = toRun[i];
				
				for(int n = start N; n <= stopN; n++) {
					
					long startTime = System.nanoTime();
					long nanoSecondsToRun = 0;
					
					if(s.equals("A"))
					{
						mysteryA(n);
						nanoSecondsToRun = System.nanoTime() - startTime;
					}
					else if(s.equals("B"))
					{
						mysteryB(n);
						nanoSecondsToRun = System.nanoTime() - startTime;
					}
					else if(s.equals("C"))
					{
						mysteryB(n);
						nanoSecondsToRun = System.nanoTime() - startTime;
					}
					else if(s.equals("D"))
					{
						mysteryB(n);
						nanoSecondsToRun = System.nanoTime() - startTime;
					}
					else if(s.equals("E"))
					{
						mysteryB(n);
						nanoSecondsToRun = System.nanoTime() - startTime;
					}
					else if(s.equals("F"))
					{
						mysteryB(n);
						nanoSecondsToRun = System.nanoTime() - startTime;
					}
					
					Measurement m = new Measurements(s, n, nanoSecondsToRun);
					
					finalist.add(m);
				}
			}
			return finalist;
	}
	

	public static String measurementsToCSV(List<Measurement> toConvert) {
		/** TODO **/
		
		String returnVal = "name,n,nanoseconds\n";
		
		for (int i = 0; i < toConvert.size(); i++)
		{
			returnVal += toConvert.get(i).name + "," + toConvert.get(i).valueOfN + "," + toConvert.get(i).nanosecondsToRun +"\n";
		}
		
		return returnVal;
		
	}
	
	/* Add any helper methods you find useful */
		
}

