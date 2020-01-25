package com.main;
public class LongestWord {
	/**
	 * Finds the largest word and returns length/largest word
	 * @param - 
	 * 		paragraph 
	 * Assumptions -
	 * 		1.There is distinct longest word in the sentence
	 * 		2.The only word separator should be space character in the sentence 
	 */
	public String getLongestWord(String paragraph) {
			//replacing all the punctuation marks
			String sentence = paragraph.replaceAll("[^a-zA-Z ]", "");
			//split the sentence into words 
	        String [] words = sentence.split(" ");
	        String longestWord = "";
	        for(int i = 0; i < words.length; i++){
	        	if(words[i].length() >= longestWord.length()){
	        		longestWord = words[i];
	        	} 
	        }
			return longestWord.isEmpty()?longestWord:longestWord.length() + " and " + longestWord;
	}
	
}//end class 
