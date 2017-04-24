/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notpad;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author hadi
 */
public class Input {
    public static String readData(String filename){
        FileReader fis;
        try {
            fis = new FileReader(filename);
        } catch (FileNotFoundException ex) {
            ex.getMessage();
            return null;
        }
        BufferedReader bf = new BufferedReader(fis);
        String line, data=null;
        try {
            line = bf.readLine();
            data += line + "\n";
            bf.close();
        } catch (IOException ex) {
            ex.getMessage();
            return null;
        }
        return data;
    }
}