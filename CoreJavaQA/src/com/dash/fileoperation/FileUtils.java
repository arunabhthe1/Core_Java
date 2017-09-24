package com.dash.fileoperation;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FileUtils {
	public static void main(String ar[]) {
		if (ar.length < 2) {
			throw new RuntimeException("Please enter the file name and the word to be searched.");
		}
		try {
			File file = new File(ar[0]);
			Map wordIndex=getWordIndexInSentence(file, ar[1]);
			Map wordCount=getRepeableWordInSentence(file);			
			System.out.println("THIS IS THE WORDINDEX MAP :"+wordIndex);
			System.out.println("THIS IS THE wordCount MAP :"+wordCount);
		} catch (FileNotFoundException ex) {
			System.out.println("File not found in the specified location.");
		}

	}

	private static Map<String, Integer> getWordIndexInSentence(File file, String word) throws FileNotFoundException {
		Map<String, Integer> wordIndex = new LinkedHashMap<String, Integer>();
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			String nextToken = scanner.nextLine();
			String fileWord[] = nextToken.split(" ");
			for (int count = 0; count < fileWord.length; count++) {
				if (fileWord[count].equalsIgnoreCase(word)) {
					wordIndex.put(nextToken, count+1);
				}
			}
		}
		scanner.close();
		return wordIndex;
	}
	private static Map<String, Integer> getRepeableWordInSentence(File file) throws FileNotFoundException {
		Map<String, Integer> wordIndex = new LinkedHashMap<String, Integer>();
		Scanner scanner = new Scanner(file);
		while (scanner.hasNextLine()) {
			String nextToken = scanner.nextLine();
			String fileWord[] = nextToken.split(" ");
			for (int count = 0; count < fileWord.length; count++) {
				if(wordIndex.containsKey(fileWord[count])){
					wordIndex.replace(fileWord[count], (wordIndex.get(fileWord[count])+1));
				}
				else{
					wordIndex.put(fileWord[count], 1);
				}
								
			}
		}
		scanner.close();
		return wordIndex;
	}

}
