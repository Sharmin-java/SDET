public class LongestWord {
	/**
	 * Finds the largest word and returns length/largest word
	 * @param - 
	 * 		paragraph 
	 * Assumptions -
	 * 		1.There is distinct longest word in the parameter
	 * 		2.There is no punctuation mark in the parameter
	 */
	
	public String getLongestWord(String paragraph) {
		
        	String [] words = paragraph.split(" ");
        	String longestWord = "";
       	 	for(int i = 0; i < words.length; i++){
        		if(words[i].length() >= longestWord.length()){
        			longestWord = words[i];
        		} 
        	}
		return longestWord.length() + " and " + longestWord;
	}
}//end class 
