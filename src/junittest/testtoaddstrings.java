package junittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class testtoaddstrings {

	@Test
	public void test() {
		junitfunction jstr= new junitfunction();
        String result= jstr.addstring("abc", "cda");
        assertEquals("abccda", result);
	}

}
