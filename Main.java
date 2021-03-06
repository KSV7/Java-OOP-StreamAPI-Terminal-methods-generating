package com.gmail.kutepov89.sergey;

import java.util.List;
import java.util.Optional;

public class Main {
	
	public static void main(String[] args) {
		ProgrammingLanguage lang1 = new ProgrammingLanguage("Haskell", DifficultyLevel.HARD);
		ProgrammingLanguage lang2 = new ProgrammingLanguage("Python", DifficultyLevel.EASY);
		ProgrammingLanguage lang3 = new ProgrammingLanguage("Java", DifficultyLevel.MEDIUM);
		ProgrammingLanguage lang4 = new ProgrammingLanguage("C++", DifficultyLevel.HARD);
		ProgrammingLanguage lang5 = new ProgrammingLanguage("JS", DifficultyLevel.EASY);
		
		List<ProgrammingLanguage> languages = List.of(lang1, lang2, lang3, lang4, lang5);
		
		System.out.println("Input difficulty level (EASY, MEDIUM, HARD):");
		Scanner sc = new Scanner(System.in);
		String l = sc.nextLine().toUpperCase();
		
		Optional<ProgrammingLanguage> findFirst = languages.stream()
        .filter(e -> e.getComplexity().equals(DifficultyLevel.valueOf(l)))
        .findAny();
		
		System.out.println(findFirst);
	}
	
}
