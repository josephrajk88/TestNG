package com.TestNG;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class MyAnnotationTransformer implements IAnnotationTransformer {
	public void transformer (ITestAnnotation annotation, Class testclass, Constructor testConstructor, Method testMethod)
	{
	annotation.setRetryAnalyzer(RetrySetup.class);

}}
