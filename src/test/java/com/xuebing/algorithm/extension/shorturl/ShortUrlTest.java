package com.xuebing.algorithm.extension.shorturl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ShortUrlTest {

	private ShortUrl su = null;

	@Before
	public void setUp() throws Exception {
		su = new ShortUrl();
	}

	@Test
	public void testGeneraterShortUrl() {
		String url = "http://www.oschina.net/question/59519_82623";
		String shortUrl = su.generaterShortUrl(url);
		System.out.println("Orignal Url : " + url);
		System.out.println("Short Url : " + shortUrl);
		assertEquals(shortUrl.length() > 1, true);
	}

}
