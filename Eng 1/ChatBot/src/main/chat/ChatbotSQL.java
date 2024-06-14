package main.java.chat;

import java.util.Scanner;

public class ChatbotSQL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorSQL conversor = new ConversorSQL();
        
        System.out.println("Bem-vindo ao Chatbot SQL. Digite sua consulta:");
        
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o Chatbot. Até mais!");
                break;
            }
            
            String sqlQuery = conversor.convertToSQL(input);
            System.out.println("Consulta SQL gerada: " + sqlQuery);
        }
        
        scanner.close();
    }
}

class ConversorSQL {
    public String convertToSQL(String input) {
        input = input.toLowerCase();
        String sqlQuery = "";

        if (input.contains("países")) {
            if (input.contains("todos")) {
                sqlQuery = "SELECT * FROM paises;";
            } else if (input.contains("nome")) {
                sqlQuery = "SELECT nome FROM paises;";
            } else {
                sqlQuery = "Desculpe, não entendi sua consulta sobre países.";
            }
        } else if (input.contains("cidades")) {
            if (input.contains("todas")) {
                sqlQuery = "SELECT * FROM cidades;";
            } else if (input.contains("nome")) {
                sqlQuery = "SELECT nome FROM cidades;";
            } else {
                sqlQuery = "Desculpe, não entendi sua consulta sobre cidades.";
            }
        } else {
            sqlQuery = "Desculpe, não entendi sua consulta.";
        }

        return sqlQuery;
    }
}
