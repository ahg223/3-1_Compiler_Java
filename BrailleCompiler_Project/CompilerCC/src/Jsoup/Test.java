package Jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.*;

public class Test{
    public static void main(String[] args) throws Exception{
       File input = new File(
             "C:/Users/user/Desktop/�ٿ�ε�/Debussy_-_Deux_arabesques/lg-204746362.xml");
       Document doc = Jsoup.parse(input, "UTF-8");
       
       System.out.println(doc);
    }
}