package com.add.java;

import java.io.*;

public class AddNumbers{
	
  public String supportAddFunctionality(int num1,int num2){
	  try {
			
			int temp =  Math.addExact(num1, num2);
			return String.valueOf(temp);
			
		} catch (Exception e) {

			return e.getMessage();
		}

	}

}
