package ru.lizaminakova.JAVA1.Pr17;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        //File file = new File("text.txt");
        //String a = new Scanner(System.in).nextLine();
        try  (FileWriter writer_1 = new FileWriter("text.txt",false)) {
            Scanner scan = new Scanner(System.in);
            String a = scan.nextLine();
            writer_1.write(a);
            writer_1.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (FileReader reader = new FileReader("text.txt")){
            System.out.println("Записи в text.txt:");
            Scanner scanner_2 = new Scanner(reader);
            while (scanner_2.hasNextLine()){
                System.out.println(scanner_2.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (FileWriter writer_2 = new FileWriter ("text.txt", false)){
            System.out.println("Введите новый текст:");
            Scanner scanner = new Scanner(System.in);
            String a = scanner.nextLine();
            writer_2.write(a);
            writer_2.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (FileWriter writer_3 = new FileWriter ("text.txt", true)){
            System.out.println("Введите новый тест еще раз:");
            Scanner scanner = new Scanner(System.in);
            String a = scanner.nextLine();
            writer_3.write(a);
            writer_3.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (FileReader reader_2 = new FileReader("text.txt")){
            System.out.println("Ваши записи:");
            Scanner scanner_2 = new Scanner(reader_2);
            while (scanner_2.hasNextLine()){
                System.out.println(scanner_2.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
