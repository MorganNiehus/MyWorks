import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class Main {
	
	public static void main(String[] args) throws IOException{
		
		File infill = new File("/home/morgan/Documents/MyWorks/data.txt");
		Scanner s = new Scanner(infill);
		
		final int ROWS = 4;
		final int COLS = 5;
		
		int [][] numbers = new int[ROWS][COLS];
		
		GraphingSkelleton skel = new GraphingSkelleton();
		
		skel.populate(numbers, infill, s);
		
		
	}

}
