package com.schoolofnet.Java_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class App 
{

    public static void main( String[] args ) throws SQLException{
      Scanner scanner = new Scanner(System.in);
      
      MovieDAO dao = new MovieDAO();
      
      System.out.println("---------- MENU ---------");
      System.out.println("1 - Listar Filmes");
      System.out.println("2 - Adicionar novo filme");
      System.out.println("3 - Atualizar um filme");
      System.out.println("4 - Excluir um filme");
      int choice = scanner.nextInt();
      switch (choice) {
      	case 1:
      		ArrayList<Movie> data = (ArrayList<Movie>) dao.findAll();
      		for(Movie movie : data) {
      			System.out.println("Id: " + movie.getId());
      			System.out.println("Nome: " + movie.getName());
      		}
      		break;
      	case 2:
      		System.out.println("Digite o nome: ");
      		String name = scanner.next();
      		dao.insert(new Movie(name));
      		break;
      	case 3:
      		System.out.println("Digite o id do filme: ");
      		Integer id = scanner.nextInt();
      		Movie movieExist = dao.findById(id);
      		if(movieExist != null) {
      			System.out.println("Digite o novo nome: ");
      			String movieName = scanner.next();
      			
      			Movie movieNew = new Movie(movieExist.getId(),movieName);
      			
      			dao.update(movieExist, movieNew);
      		} else {
      			System.out.println("Este filme não está na sua lista!");
      		}
      		break;
      	case 4:
      		System.out.println("Digite o id do filme: ");
      		Integer idDelete = scanner.nextInt();
      		Movie movieExistDelete = dao.findById(idDelete);
      		
      		if(movieExistDelete != null) {
      			dao.remove(movieExistDelete);
      		} else {
      			System.out.println("Este filme não está na sua lista!");
      		}
      		break;

      	default:
      		System.out.println("Opção inválida");
		break;
	}
    }
}
