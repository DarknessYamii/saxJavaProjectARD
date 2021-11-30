package com.fp.sax.parser;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import com.fp.sax.methods.SaxMethods;

/**
 * Hello world!
 *
 */
public class SaxParserMain {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SaxMethods method = new SaxMethods();
		method.searchAll();
	
	
	}
}
