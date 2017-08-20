package com.schoolofnet;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.List;

public class HelloWorld {
	private static Scanner reader;

	public static void main(String[] args) {
		
		String age = "";	
		age = JOptionPane.showInputDialog("What is your age? ");
		
		Integer ageInt = Integer.parseInt(age);
		
		JOptionPane.showConfirmDialog(null, "Your age is " + age);
		//Array
		/*int[] ages = new int[10000];
		
		ages[0] = 10;
		ages[1] = 30;
		ages[1] = 0;*/
		
		//List
		/*List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(30);*/
		//list.remove(list.indexOf(30));
		
		/*for(int i = 0; i < list.size(); i++) {
			Integer number = list.get(i);
			if(number > 1) {
				System.out.println("Is greater then one");
			}
			System.out.println(number);
		}*/
		
		/*int index = 0;
		do {
			Integer number = list.get(index);
			index++;
			System.out.println(number);
		} while(index < list.size());
		*/
		
		/*int index = 0;
		while(index < list.size()) {
			Integer number = list.get(index);
			index++;
			System.out.println(number);
		}*/
		
		//Calculadora
		
		/*reader = new Scanner(System.in);
		
		System.out.print("Write a number 1: ");
		Double num1 = reader.nextDouble();
		System.out.print("Select a operation 1) +, 2) -, 3) *, 4) /");
		String operation = reader.next();
		System.out.print("Write a number 2: ");
		Double num2 = reader.nextDouble();
		Double result = 0.0;
		
		if(operation.equals("1")) {
			result = sum(num1, num2);
		}
		if(operation.equals("2")) {
			result = sub(num1, num2);
		}
		if(operation.equals("3")) {
			result = mult(num1, num2);
		}
		if(operation.equals("4")) {
			result = div(num1, num2);
		}
		
		System.out.println(result);
}

	private static double div(Double num1, Double num2) {
		return num1 / num2;
		
	}

	private static double mult(Double num1, Double num2) {
		return num1 * num2;
		
	}

	private static double sub(Double num1, Double num2) {
		return num1 - num2;
		
	}

	private static double sum(Double num1, Double num2) {
		return num1 + num2;
		
	}*/

	}
	}