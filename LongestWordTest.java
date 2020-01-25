package com.unit.test;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.main.LongestWord;

class LongestWordsTest {

	LongestWord obj;
	@BeforeEach
	void setUp() throws Exception {
		 obj = new LongestWord();
	}

	@Test
	void testGetLongestWord() {
		Assert.assertEquals("6 and jumped", obj.getLongestWord("The cow jumped over the moon."));
		Assert.assertEquals("4 and moon", obj.getLongestWord("The cow over the moon."));
	}
	
	@Test
	//test for empty parameter 
	void testForEmpltyParameter(){
		Assert.assertEquals("", obj.getLongestWord(""));
	}
	
	@Test
	//test for parameter which has single word only
	void testSingleWordParameter() {
		Assert.assertEquals("4 and moon", obj.getLongestWord("moon"));
	}
}
