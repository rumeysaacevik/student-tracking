/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cp2projectt;

import java.util.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Rümeysa
 */
public class FileManager {

    public static void main(String[] args) {
        String filePath = "data.txt";
        List<String> dataToWrite = new ArrayList<>();
        dataToWrite.add("John,Doe,25,example@example.com");
        dataToWrite.add("Jane,Smith,30,jane@example.com");

        writeToFile(filePath, dataToWrite);
        List<String> readData = readFromFile(filePath);

        if (readData != null) {
            for (String line : readData) {
                System.out.println(line);
            }
        }
    }

    public static void writeToFile(String filePath, List<String> data) {
        try {
            File file = new File(filePath);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            for (String line : data) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }

    public static List<String> readFromFile(String filePath) {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
            System.out.println("Data has been read from the file.");
            return lines;
        } catch (IOException e) {
            System.err.println("Error reading from the file: " + e.getMessage());
        }
        return null;
    

    }

}
