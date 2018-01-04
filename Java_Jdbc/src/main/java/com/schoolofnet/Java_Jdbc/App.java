package com.schoolofnet.Java_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) throws SQLException{
      Scanner scanner = new Scanner(System.in);
      System.out.println("---------- MENU ---------");
      System.out.println("1 - Adicionar novo filme");
      System.out.println("2 - Listar Filmes");
      System.out.println("3 - Atualizar um filme");
      System.out.println("4 - Excluir um filme");
      int choice = scanner.nextInt();
      switch (choice) {
      	case 1:
      		System.out.println("Adicionado");
      		Connection con = new ConnectionFactory().getConnection();
      		break;
      	case 2:
      		System.out.println("Filmes: ");
      		break;
      	case 3:
      		System.out.println("Atualizado");
      		break;
      	case 4:
      		System.out.println("Excluído");
      		break;

      	default:
      		System.out.println("Opção inválida");
		break;
	}
    }
}
