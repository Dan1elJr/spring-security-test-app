package com.sandaniel.learn_spring_security;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.sandaniel.learn_spring_security.controller.HelloWorldResource;


@DisplayName("Controller response test")
public class HelloWorldResourceTest {
	
	@Test
	@DisplayName("Show a Hello World")
	public void shouldShowHelloWorldWhenMehthodIsCalled() {
		
		//Arrange
		
		HelloWorldResource helloWorldResource = new HelloWorldResource();
	
		//Act
		
		String result = helloWorldResource.HelloWorld();
		String expected = "Hello World";
		
		//Assert
		
		assertEquals(expected.toLowerCase(), result.toLowerCase());
		
	}
	
}
