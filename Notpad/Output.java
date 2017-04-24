/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Notpad;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;


/**
 *
 * @author hadi
 */
public class Output {
    public static void writeData(String filename, String text){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(filename);
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        }
        FileWriter fr = null;
        try {
            fr = new FileWriter(filename);
        } catch (IOException ex) {
            ex.getMessage();
        }
        try {
            fr.write(text);
            fr.close();
        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
