package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Course;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] group = { 'A', 'B', 'C' }; // // Definindo as turmas

		Set<Course> set = new HashSet<>(); // para colocar os valores em lista e checar se eles se repetem.

		for (int i = 0; i < group.length; i++) {
			System.out.print("How many studants for a course " + group[i] + "?: ");
			int numberOfStudents = sc.nextInt();
			for (int j = 1; j <= numberOfStudents; j++) {
				System.out.print(": ");
				set.add(new Course(sc.nextInt())); // tbm checa se o id esta repetido.
			}
		}
		System.out.println("Total studants: " + set.size()); // expoem a quantidade de items, levando em conta a repetição.

		sc.close();

	}

}
