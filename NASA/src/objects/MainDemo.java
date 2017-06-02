package objects;

public class MainDemo {

	public static void main(String[] args) {
		ParseResults parse = new ParseResults();
		try{
			parse.readFile();
		}catch(Exception e){
			e.printStackTrace();
		}
		parse.showURL();
	}

}
