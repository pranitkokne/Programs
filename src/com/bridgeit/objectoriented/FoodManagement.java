/**
 * Purpose :Storing the Inventory Details for Rice,Pulses and Wheats with
 * 			properties name,weight,price per kg.
 * 
 * @author Pranit_Kokne
 * @version 1.0
 * @since 21-03-2018
 *
 */

package com.bridgeit.objectoriented;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgeit.utility.Utility;

public class FoodManagement {

	/**
	 * the function writes the JSON array into a file.
	 * 
	 * @param path of the file
	 * @param array JSON array
	 * @return true if the operation is successful else false
	 */
	public static boolean fileWritingInJSON(String path,JSONArray array) 
	{
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
		fileWriter = new FileWriter(path);
		bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(array.toJSONString());
		return true;
		}catch(IOException io) 
		{
			io.printStackTrace();
		}
		finally 
		{
			try {
				bufferedWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	
	
	
	
	/**
	 *the main function takes the grains name its price and weight as a
	 *input and stores the entire object into a JSON file.
	 */
	public static void main(String[] args) 
	{
		boolean flag = true;
		Utility util = new Utility();
		
		String name;
		double price;
		int weight;
		JSONArray array = new JSONArray();
		
		while(flag) 
		{
			System.out.println("Enter 1 for Rice");
			System.out.println("Enter 2 for Pulses");
			System.out.println("Enter 3 for wheats");
			System.out.println("Enter 4 to exit");
			int choice = util.integerInput();
			
			JSONObject object = new JSONObject();
			
			switch(choice) 
			{
			case 1 :	
				System.out.print("Enter the rice name : ");
				name = util.inputString();
				object.put("Name", name);
				System.out.print("Enter the price per kg : ");
				price = util.doubleInput();
				object.put("Price", price);
				System.out.print("Enter the weight : ");
				weight = util.integerInput();
				object.put("Weight", weight);
				
				array.add(object);
				//fileWritingInJSON("/home/bridgeit/Pranit/Food.json",array);
				break;
				
			case 2 :
				//JSONObject object1 = new JSONObject();
				System.out.print("Enter the Pulses name : ");
				name = util.inputString();
				System.out.print("Enter the price per kg : ");
				price = util.doubleInput();
				System.out.print("Enter the weight : ");
				weight = util.integerInput();
				object.put("Name", name);
				object.put("Price", price);
				object.put("Weight", weight);
				array.add(object);
				
				//fileWritingInJSON("/home/bridgeit/Pranit/Food.json",array);
				break;
				
			case 3 :
				//JSONObject object2 = new JSONObject();
				System.out.print("Enter the rice name : ");
				name = util.inputString();
				System.out.print("Enter the price per kg : ");
				price = util.doubleInput();
				System.out.print("Enter the weight : ");
				weight = util.integerInput();
				object.put("Name", name);
				object.put("Price", price);
				object.put("Weight", weight);
				
				array.add(object);
				//fileWritingInJSON("/home/bridgeit/Pranit/Food.json",array);
				break;
				
			default :
				fileWritingInJSON("/home/bridgeit/Pranit/Food.json",array);
				flag = false;
				
			}	
		}	
	}
}
