import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyClass {

	public static File file;
	public static Scanner scn;
	public static String s = "" ;
	public static String filePathRead = "D:/JAVA Dev/1.txt";
	public static String filePathSave = "D:/JAVA Dev/2.txt";
	public static FileWriter wrt;
	
	public static void main(String[]args) throws IOException{
		Openfile();
		ReadFile();
	}

	public static void MaxAmount(String s) throws IOException {
		
		int max=0;
		int unchanged = 0;
		int count = 0;
		int compare = 49;
		
		System.out.println(s);
				
		while(count != s.length()){
			if(compare == (int)(s.charAt(count)) ){
				
				unchanged+=1;	
				
			}else{
			
			if(unchanged != 0){
				if(max < unchanged) max = unchanged;
			}
			
			unchanged = 0;
				
			}
		count+=1;
		}
		//check on last values
		if(max < unchanged) max = unchanged;
		
	System.out.println(max);
	WriteFile(max);
	
	}

	private static void WriteFile(int max) throws IOException {
		
		file = new File(filePathSave);
		
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			wrt = new FileWriter(file.getAbsolutePath());
					wrt.write("" + max);
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally{
			wrt.close();
		}
		
	}

	public static void Openfile() {
		
		file = new File(filePathRead);
		
		try {
			scn = new Scanner(file);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
	}
	
	public static void ReadFile() throws IOException {
		String s = "" ;
		while(scn.hasNext()){
			s = s + scn.next();	
		}
		
		MaxAmount(s);
		scn.close();
		
	}
}