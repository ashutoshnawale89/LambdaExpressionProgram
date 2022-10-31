package com.program;

import java.util.function.BiFunction;
import java.util.regex.Pattern;
import javax.naming.InvalidNameException;

public class LambdaExpressionProgram {
	
	public BiFunction<String, String, Boolean> regexExp = (expression, userInput) -> {
		boolean valid=Pattern.compile(expression).matcher(userInput).matches();
		return valid;};

public static void main(String[] args) throws InvalidNameException {
	LambdaExpressionProgram obj=new LambdaExpressionProgram();
	String regex="^[a-zA-Z]+[.+-]?[A-Za-z0-9]*[@#$&][A-Za-z0-9]+[.+-][A-Za-z0-9]{2,}[.]*[A-Za-z]*$";
	String user="abc.100@yahoo.com";
	System.out.println(obj.regexExp.apply(regex, user));
}
}

