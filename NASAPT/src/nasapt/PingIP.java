package nasapt;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PingIP {

  public static void runSystemCommand(String command) {

		try {
			Process p = Runtime.getRuntime().exec(command);
			BufferedReader inputStream = new BufferedReader(
					new InputStreamReader(p.getInputStream()));

			String s = "";
			// reading output stream of the command
			while ((s = inputStream.readLine()) != null) {
				System.out.println(s);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a website to find the IP address: ");
		Scanner input = new Scanner(System.in);
		String ip = input.next();
		//String ip = "google.com";
		runSystemCommand("ping " + ip);
		input.close();
	
	}
}