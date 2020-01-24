package jmbg01;

import java.util.Scanner;

public class JMBG01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Unesite jmbg: ");
        String jmbg = input.nextLine();

        System.out.println(datumRodjenja(jmbg));
        System.out.println(polOsobe(jmbg));

    }

    private static String datumRodjenja(String jmbg) {
        if (jmbg.length() == 13) {
            String dan = jmbg.substring(0, 2);
            String mesec = jmbg.substring(2, 4);
            String godina = jmbg.substring(4, 7);
            return "Datum rodjenja je: " + dan + "." + mesec + "." + godina + ".";

        } else {
            return "Uneti jmbg nije ispravan ";

        }
    }

    private static String polOsobe(String jmbg) {
        if (jmbg.length() == 13) {
            String bbb = jmbg.substring(9, 12);
            int pol = Integer.parseInt(bbb);
            if (pol < 500) {
                return "osoba je muskog pola ";
            } else {
                return "osoba je zensokog pola";
            }
        } else {
            return "Uneti jmbg nije validan";
        }
    }
}
