package java.feq.questions;

import java.net.MalformedURLException;

public class URLCompare_20 {
	public static void main(String[] args) throws MalformedURLException {
		String url = "https://www.example.com";
		String ipAddress = "93.184.216.34"; // This is an example IP address for www.example.com
		if (url.equals(ipAddress)) {
			System.out.println("The URL and IP address are the same.");
		} else {
			System.out.println("The URL and IP address are not the same.");
		}
	}
}
