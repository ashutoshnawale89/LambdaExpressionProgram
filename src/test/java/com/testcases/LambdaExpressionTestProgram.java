package com.testcases;

import org.junit.Assert;
import org.junit.Test;
import com.program.LambdaExpressionProgram;

public class LambdaExpressionTestProgram {
	@Test
   public void firstNameTest() {
		LambdaExpressionProgram obj=new LambdaExpressionProgram();
	   String regex="^[A-Z]+[a-z]{2,}";
	   String user="Ashu";
	   Assert.assertEquals(true,obj.regexExp.apply(regex, user));
   }
	@Test
	   public void lastNameTest() {
		LambdaExpressionProgram obj=new LambdaExpressionProgram();
		   String regex="^[A-Z]{1}[A-Za-z]{2,}";
		   String user="Nawale";
		   Assert.assertEquals(true,obj.regexExp.apply(regex, user));
	   }
	@Test
	   public void mobileNumberTest() {
		LambdaExpressionProgram obj=new LambdaExpressionProgram(); 
		   String regex="^[9]{1}[1]{1}[ ]{1}[0-9]{10}$";
		   String user="91 7776042800";
		   Assert.assertEquals(true,obj.regexExp.apply(regex, user));
	   }
	@Test
	   public void emailIDTest() {
		LambdaExpressionProgram obj=new LambdaExpressionProgram();		   String regex="^[a-z]{3}[.]?[a-z]?[@#$&]{1}[a-z]{2}[.]{1}[a-z]{2}[.]{1}[a-z]{2}$";
		   String user="abc@bi.co.in";
		   Assert.assertEquals(true,obj.regexExp.apply(regex, user));
	   }
}
