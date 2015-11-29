import java.io.File;
import java.io.IOException;

public class MySalesMain {
	
	public static void main(String [] args)throws IOException{
		
		File infill = new File("data11.txt");
		
		MySales11Skel skel = new MySales11Skel();
		
		final int ROWS = 5;
		final int COLUMNS = 4;
		
		int[][] totals = new int[ROWS][COLUMNS];
		
		skel.header();
		skel.populate(infill, totals);
		
		
		skel.arraySums(totals);
		
		skel.printHistos();
		
		
		
	}
	
}