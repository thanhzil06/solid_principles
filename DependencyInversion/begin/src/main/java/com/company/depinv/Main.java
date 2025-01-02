package com.company.depinv;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Message msg = new Message("This is a message.");
		MessagePrinter printer = new MessagePrinter();
		// Write msg into file test_msg
		printer.writeMessage(msg, "test_msg.txt");
		// But what if we want to print it into the console, or in HTML format?
	}

}
