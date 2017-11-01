package com.schoolofnet;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        /*Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(0, "Felipe");
        map.put(1,"Guerra");
        map.put(2, "Gabriel");

        System.out.println(map.toString());
        System.out.println(map.values());*/


        /*List<String> list = new ArrayList<String>();
        for(Integer i = 0; i < 200; i++){
            list.add(i,"String " + i.toString());
        }

        System.out.println(list.toString());*/

        //Java IO
        /*File file;
        FileOutputStream fop = null;
        BufferedReader br = null;
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        try {
             file = new File("test.txt");
            if(file.createNewFile()){
                System.out.println("File is created");
            } else {
                System.out.println("File already exists");
            }

             fop = new FileOutputStream(file);

            if(!file.exists()){
                file.createNewFile();
            }

            String text = "Hello. My name is Felipe and I'm studying at IFB";

            byte[] textBytes = text.getBytes();

            fop.write(textBytes);
            fop.flush();
            fop.close();

            System.out.println("Done");
            System.out.println("Preparing to read...");

            fis = new FileInputStream(file);

            bis = new BufferedInputStream(fis);

            DataInputStream dis = new DataInputStream(bis);

            while(dis.available() != 0){
                System.out.println(dis.readLine());
            }

            fis.close();
            bis.close();
            dis.close();
        } catch (IOException ex){
            ex.printStackTrace();
        }*/

        /*try {
            String currentLine;
            br = new BufferedReader(new FileReader("test.txt"));
            while((currentLine = br.readLine()) != null){
                System.out.println(currentLine);
            }

            if(br != null){
                br.close();
            }
        } catch (IOException ex1){
            ex1.printStackTrace();
        }*/
        //Classes Wrappers (tem para todos os tipos primitivos, trocando char por String)
        /*Integer one = 0;
        int two = 0;

        Double d1 = 0.0;

        String srt = d1.toString();

        Double d2 = new Double();*/

        //Por todos terem herança da classe Object, todos os objetos possuem esses atributos.
        /*Object obj = new Object();
        obj.toString();
        obj.equals();
        obj.hashCode();
        obj.getClass();
        obj.notify();
        obj.notifyAll();
        obj.wait();*/

        System.out.println( "Hello World!" );
    }
}
