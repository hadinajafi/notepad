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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
            JOptionPane.showMessageDialog(null, "File not Found", "Opening Failed", 2);
            return null;
        }
        BufferedReader bf = new BufferedReader(fis);
        String line, data = "";
        try {
            line = bf.readLine();
            while(line!=null){
            data += line + "\n";
            line = bf.readLine();
            }
            
        } catch (IOException ex) {
            ex.getMessage();
            return null;
        }
        try {
            bf.close();
        } catch (IOException ex) {
            ex.getMessage();
        }
        return data;
    }
}