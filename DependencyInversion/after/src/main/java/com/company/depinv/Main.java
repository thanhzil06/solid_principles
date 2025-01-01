package com.company.depinv;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Message msg = new Message("This is a message.");
		MessagePrinter printer = new MessagePrinter();
		try(PrintWriter writer = new PrintWriter(new FileWriter("test_msg.txt"))){
			printer.writeMessage(msg, new JSONFormatter(), writer);
		}
		
	}

}
