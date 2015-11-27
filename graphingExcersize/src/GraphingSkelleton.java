import java.util.*;
import java.io.*;
public class GraphingSkelleton {
	
	public GraphingSkelleton(){
		
	}
	
	public void populate(int[][] numbers, File infill, Scanner s){
		
		while(s.hasNext()){
			int employee = s.nextInt();
			int product = s.nextInt();
			int totals = s.nextInt();
			
			numbers[employee - 1][product - 1] += totals;
		}
		for(int i = 0; i < numbers.length; i++){
			for(int j = 0; j < numbers[i].length; j++){
				System.out.print(numbers[i][j] + "\t");
			}
		System.out.println();
		}
		
	}

}
