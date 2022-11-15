package hashtable;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import shapes.Circle;
import shapes.GeometricObject;
import shapes.Rectangle;
import shapes.Square;

public class test{
	
	public static ArrayList<Integer> getNumbers(String filename) {

		ArrayList<Integer> ar = new ArrayList<Integer>();
				FileReader fr = null;
				try {
					fr = new FileReader(filename);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				BufferedReader fileInput = new BufferedReader(fr);
				String inLine = null;
				try {
					inLine = fileInput.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				int countedChars = 0;
				while (inLine != null) {
					Integer myInt = Integer.parseInt(inLine);
					ar.add(myInt);
					try {
						inLine = fileInput.readLine();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				return ar;
			}
	
    	public static void main(String[] args) {
    		 getNumbers("dogs.txt");
    	}

}