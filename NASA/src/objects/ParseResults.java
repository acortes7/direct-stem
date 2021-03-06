package objects;

import java.io.*;
import java.util.*;

public class ParseResults {
	private List<Results> results;
	
	public ParseResults(){
		results = new ArrayList<Results>();
	}
	
	public void showURL(){
		for(Results r: results){
			System.out.println(r.toString());
		}
	}
	
	public void readFile() throws IOException{
		try{
			System.out.println("Enter a filepath to read from ");
			Scanner in = new Scanner(System.in);
			File inFile = new File(in.next()); //file to read from
			Scanner freader = new Scanner(inFile);
			
			freader.nextLine(); // skip the header
			
			String line;
			String[] fields;
			String url;
			double time;
			
			while(freader.hasNextLine()){
				line = freader.nextLine();
				fields = line.split(",");
				url = fields[0];
				time = Double.parseDouble(fields[1]);
				results.add(new Results(url,time));	
			}
			freader.close();
			in.close();
		}catch(IOException e){
			System.err.println(e);
			System.exit(1);
		}
	}
	
}
