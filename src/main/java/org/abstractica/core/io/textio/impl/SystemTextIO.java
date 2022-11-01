package org.abstractica.core.io.textio.impl;

import org.abstractica.core.io.textio.TextIO;

import java.util.Scanner;

public class SystemTextIO implements TextIO
{
	private static final Scanner scanner = new Scanner(System.in);
	@Override
	public String get()
	{
		return scanner.nextLine();
	}

	@Override
	public void put(String item)
	{
		System.out.print(item);
	}
}
