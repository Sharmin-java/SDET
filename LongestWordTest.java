package com.test;
import com.main.LongestWord;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class LongestWordTest {

	LongestWord obj;
	@BeforeEach
	void setUp() throws Exception {
		 obj = new LongestWord();
	}

	@Test
	void testGetLongestWord() {
		Assert.assertEquals("6 and jumped", obj.getLongestWord("The cow jumped over the moon"));
		Assert.assertEquals("4 and moon", obj.getLongestWord("The cow over the moon"));
	}

}
