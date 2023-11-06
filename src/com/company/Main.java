package com.company;
import java.util.Scanner;
import java.util.ArrayList
public class Main {

    public static void main(String[] args) {
        Scanner numar= new Scanner(System.in);
        System.out.print("Introduceti nr de angajati: ");
        int nr= numar.nextInt();
        numar.nextLine();
        ArrayList<Employee> employees= new ArrayList<Employee>();
        for(int i=1;i<=nr;i++){
            System.out.println("Introduceti numele angajatului: ");
            String nume;
            nume=numar.nextLine();
            String email=numar.nextLine();
            double hourRate;
            hourRate=numar.nextDouble();
            

            Employee employee= new Employee();

        }
    }
}
