package com.tcs.mou.Java8Handson;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExcercise {
	
	
	
	
	private static void readByLine() throws Exception{
		Files.list(Paths.get(".")).filter(s->s.getFileName().endsWith("src")).
		forEach(s->System.out.println(s.getFileName()));;
	}
	
	private static void usingDirectoryStream() throws Exception {
		Files.newDirectoryStream(Paths.get("."), path -> path.toFile().isFile())
        .forEach(System.out::println);
	}
	
	
	
	
	
	public static void main(String args[]) throws Exception {
		
		readByLine();
		usingDirectoryStream();
	}

}
