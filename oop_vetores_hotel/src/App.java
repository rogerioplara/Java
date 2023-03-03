package oop_vetores_hotel.src;

import java.util.Locale;
import java.util.Scanner;

import oop_vetores_hotel.entities.Hotel;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Hotel[] rooms = new Hotel[10];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        int rent = 1;

        for (int i = 0; i < n; i++) {
            System.out.printf("Rent #%d%n", rent);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            rent++;

            rooms[room] = new Hotel(name, email, room);
        }

        System.out.println("Busy rooms:");
        for (Hotel room : rooms) {
            if (room != null) {
                System.out.println(room);
            }
        }

        sc.close();
    }

}
