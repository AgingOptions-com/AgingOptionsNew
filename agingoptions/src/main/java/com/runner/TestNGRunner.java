package com.runner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.testng.TestNG;

public class TestNGRunner {

	public static void main(String[] args) {
		  TestNG testng = new TestNG();
		  String suite = System.getProperty("user.dir") + File.separator + "testng.xml";
		  testng.setTestSuites(Collections.singletonList(suite));
		  testng.run();
		}

}
