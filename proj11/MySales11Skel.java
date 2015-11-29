import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Date;

public class MySales11Skel {
	
	private int totals[][];
	private int pTotals[] = new int[5];
	private int eTotals[] = new int[4];
	
	public MySales11Skel() {
		
	}
	
	public void header() {
		Date date = new Date();
		System.out
		.print("**********************MySalesReport************************");
		System.out.printf("\n%10s\t%30s", "Name:", "Morgan Niehus & William Sparks");
		System.out.printf("\n%10s\t%30s", "Class:", "CS1301");
		System.out.printf("\n%10s\t%30s", "Date:", date);
		System.out
		.print("\n***********************************************************\n");
	}
	
	public int[][] populate(File infill, int[][] totals)
	throws FileNotFoundException {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(infill);
		
		while (scan.hasNext()) {
			int emp = scan.nextInt();
			int product = scan.nextInt();
			int total = scan.nextInt();
			
			totals[product - 1][emp - 1] += total;
		}
		
		for (int i = 0; i < totals[0].length; i++) {
			System.out.print("\t E " + (i + 1));
		}
		int sum = 0;
		for (int i = 0; i < totals.length; i++) {
			System.out.print("\nProduct " + (i + 1) + "|");
			for (int j = 0; j < totals[i].length; j++) {
				System.out.print(totals[i][j] + "\t ");
				sum += totals[i][j];
			}
			System.out.println("|" + sum);
			pTotals[i] = sum;
			
			// Reset sum for next row
			sum = 0;
		}
		
		return totals;
		
	}
	
	public void arraySums(int[][] totals) {
		this.totals = totals;
		int columnSum = 0;
		
		System.out.println("------------------------------------");
		// Loop over all columns (totals[0].length gives number of cols)
		for (int i = 0; i < totals[0].length; i++) {
			columnSum = 0;
			// Loop over all rows
			for(int j = 0; j < totals.length; j++)
			{
				columnSum += totals[j][i];
			}
			
			System.out.print("\t" + columnSum);
			eTotals[i] = columnSum;
		}
	}
	
	public void printHistos(){
		System.out.println("\n\nHISTO GUIDE");
		System.out.println(" * = 10, # = 5, $ = 1");
		System.out.println("----------------------");
		for (int i = 0; i < pTotals.length; i++){
			int pNum = i+1;
			int total = pTotals[i];
			
			int numAsk = total / 10;
			int askRem = total % 10;
			
			int numHash = askRem / 5;
			int numDoll = askRem % 5;
			
			System.out.print("Product "+ pNum +": ");
			for (int a = 0; a < numAsk; a++){
				System.out.print("*");
			}
			for (int h = 0; h < numHash; h++){
				System.out.print("#");
			}
			for (int d = 0; d < numDoll; d++){
				System.out.print("$");
			}
			System.out.println(" = " + total);
		}
		
		System.out.println("");
		
		for (int j = 0; j < eTotals.length; j++){
			int eNum = j+1;
			int total = eTotals[j];
			
			int numAsk = total / 10;
			int askRem = total % 10;
			
			int numHash = askRem / 5;
			int numDoll = askRem % 5;
			
			System.out.print("Employee "+ eNum +": ");
			for (int a = 0; a < numAsk; a++){
				System.out.print("*");
			}
			for (int h = 0; h < numHash; h++){
				System.out.print("#");
			}
			for (int d = 0; d < numDoll; d++){
				System.out.print("$");
			}
			System.out.println(" = " + total);
		}
	}
	
	
}
