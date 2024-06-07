package com.Shoutdown;

import java.io.IOException;

public class Shoutdown {

	public static void main(String[] args) {
		try {
			//Runtime.getRuntime().exec("Shutdown /s /t 1");
			Runtime.getRuntime().exec("Shutdown /r /t 5");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
