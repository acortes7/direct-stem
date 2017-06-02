package nasapt;

import java.net.InetAddress;

public class Evaluation {

	public static void main(String[] args) {
		try {
			InetAddress inetAddr = InetAddress.getByName("www.ge.com");
			byte[] addr = inetAddr.getAddress();

			String ipAddr = "";
			for (int i = 0; i < addr.length; i++) {
				if (i > 0) {
					ipAddr += ".";
				}
				ipAddr += addr[i] & 0xFF;
			}
			System.out.println("IP Address: " + ipAddr);
		} catch (Exception e) {
			System.out.println("Host not found:" + e.getMessage());
		}
	}
}
