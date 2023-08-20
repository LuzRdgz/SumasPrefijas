package org.example;

import com.opencsv.CSVWriter;

import java.io.*;
import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        String archivoCSV = "C:\\Users\\LuzRd\\Desktop\\car_sales.csv";
        BufferedReader lee = null;


        // lectura de archivo CSV
        try {
            lee = new BufferedReader(new FileReader(archivoCSV));
        }catch (FileNotFoundException e){
            System.out.println("No se encuentra el nombre del archivo");
        }

        String lineaTxt = null;
        String num;
        Double valor;
        Double vent[] = new Double[1000];

        try{
            while ((lineaTxt = lee.readLine()) != null){
                num = lineaTxt.substring(lineaTxt.indexOf('$')).trim();
                valor = Double.parseDouble(num.trim());
                for (int i = 0; i< vent.length; i++){
                    vent[i] = valor;
                }
            }
        }catch(IOException e){
            System.out.println("Error en la lectura del archivo");
        }

        Double sumP = null;
        Double ventas[] = new Double[1000];


        for (int i = 0; i< vent.length; i++){
            sumP = sumP + vent[i];
            ventas[i] = sumP;
        }
        for (int i = 0; i< vent.length; i++){
            System.out.println(ventas[i]);
        }
    }
}