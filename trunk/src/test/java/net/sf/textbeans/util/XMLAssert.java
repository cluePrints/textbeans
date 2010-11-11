package net.sf.textbeans.util;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;

import com.google.common.base.Charsets;
import com.google.common.io.Files;

public class XMLAssert {
	public static void assertEquals(String expected, String actual) {
		try {
			if (!expected.equals(actual)) {
				Files.write(expected, new File(
						"src/test/java/net/sf/textbeans/util/expected"),
						Charsets.UTF_8);
				Files.write(actual, new File(
						"src/test/java/net/sf/textbeans/util/actual"),
						Charsets.UTF_8);
			}
			Assert.assertEquals(expected, actual);
		} catch (IOException ex) {
			throw new RuntimeException(ex);
		}
	}
}
