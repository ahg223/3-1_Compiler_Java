package Braille;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Braille_character {

    public static void main(String[] args) {

        try {
            
            Scanner scanner = new Scanner(new File
            		("C:\\Users\\user\\Desktop\\2018\\2. 성균관대 3학년 1학기\\컴파일러\\Compiler\\CompilerCC\\src\\Test.txt"));
            ArrayList<String> list = new ArrayList<String>();
            
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }

            String[] set1 = new String[list.get(0).length() / 2];
            String[] set2 = new String[list.get(3).length() / 2];
            String[] set3 = new String[list.get(6).length() / 2];
            String[] set4 = new String[list.get(9).length() / 2];
            String[] set5 = new String[list.get(12).length() / 2];

            for (int line = 0; line < 3; line++) {
                
                for (int pair = 0; pair < list.get(line).length() - 1; pair += 2) { 

                    String s = list.get(line).substring(pair, pair + 2); 

                    if (line == 0) set1[pair / 2] = s + ","; 
                    else if (line == 1) set1[pair / 2] += s + ","; 
                    else set1[pair / 2] += s; 
                }
            }
            
            for (int line = 3; line < 6; line++) {
                
                for (int pair = 0; pair < list.get(line).length() - 1; pair += 2) {
                    
                    String s = list.get(line).substring(pair, pair + 2);
                    if (line == 3) set2[pair / 2] = s + ",";
                    else if (line == 4) set2[pair / 2] += s + ",";
                    else set2[pair / 2] += s;
                }
            }
            for (int line = 6; line < 9; line++) {
                
                for (int pair = 0; pair < list.get(line).length() - 1; pair += 2) {
                    
                    String s = list.get(line).substring(pair, pair + 2);
                    if (line == 6) set3[pair / 2] = s + ",";
                    else if (line == 7) set3[pair / 2] += s + ",";
                    else set3[pair / 2] += s;
                }
            }
            for (int line = 9; line < 12; line++) {
                
                for (int pair = 0; pair < list.get(line).length() - 1; pair += 2) {
                    
                    String s = list.get(line).substring(pair, pair + 2);
                    if (line == 9) set4[pair / 2] = s + ",";
                    else if (line == 10) set4[pair / 2] += s + ",";
                    else set4[pair / 2] += s;
                }
            }
            for (int line = 12; line < 15; line++) {
                
                for (int pair = 0; pair < list.get(line).length() - 1; pair += 2) {
                    
                    String s = list.get(line).substring(pair, pair + 2);
                    if (line == 12) set5[pair / 2] = s + ",";
                    else if (line == 13) set5[pair / 2] += s + ",";
                    else set5[pair / 2] += s;
                }
            }


            for (String s : set1) {
                System.out.print(brailleToEnglish(s));
            }
            System.out.println();
            for (String s : set2) {
                System.out.print(brailleToEnglish(s));
            }
            System.out.println();
            for (String s : set3) {
                System.out.print(brailleToEnglish(s));
            }
            System.out.println();
            for (String s : set4) {
                System.out.print(brailleToEnglish(s));
            }
            System.out.println();
            for (String s : set5) {
                System.out.print(brailleToEnglish(s));
            }
            
        } catch (Exception e) {
            System.out.println("Exception");
        }

    }

    public static String brailleToEnglish(String braille) {
        if (braille.equals("xo,oo,oo")) return "a";
        else if (braille.equals("xo,xo,oo")) return "b";
        else if (braille.equals("xx,oo,oo")) return "c";
        else if (braille.equals("xx,ox,oo")) return "d";
        else if (braille.equals("xo,ox,oo")) return "e";
        else if (braille.equals("xx,xo,oo")) return "f";
        else if (braille.equals("xx,xx,oo")) return "g";
        else if (braille.equals("xo,xx,oo")) return "h";
        else if (braille.equals("ox,xo,oo")) return "i";
        else if (braille.equals("ox,xx,oo")) return "j";
        else if (braille.equals("xo,oo,xo")) return "k";
        else if (braille.equals("xo,xo,xo")) return "l";
        else if (braille.equals("xx,oo,xo")) return "m";
        else if (braille.equals("xx,ox,xo")) return "n";
        else if (braille.equals("xo,ox,xo")) return "o";
        else if (braille.equals("xx,xo,xo")) return "p";
        else if (braille.equals("xx,xx,xo")) return "q";
        else if (braille.equals("xo,xx,xo")) return "r";
        else if (braille.equals("ox,xo,xo")) return "s";
        else if (braille.equals("ox,xx,xo")) return "t";
        else if (braille.equals("xo,oo,xx")) return "u";
        else if (braille.equals("xo,xo,xx")) return "v";
        else if (braille.equals("ox,xx,ox")) return "w";
        else if (braille.equals("xx,oo,xx")) return "x";
        else if (braille.equals("xx,ox,xx")) return "y";
        else if (braille.equals("xo,ox,xx")) return "z";
        else if (braille.equals("oo,oo,oo")) return " ";
        else return "ERROR";
    }
}