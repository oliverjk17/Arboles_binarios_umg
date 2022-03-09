/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generar;

import Arboles.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author OLIVER
 */
public class Generar_numeros {
    
    public Arbol Generar() throws IOException {
        Arbol arbol = new Arbol();
        for (int i =0; i<1000000;i++)
        {
            int random = ThreadLocalRandom.current().nextInt(10000000+1);
            arbol.insertar(random);
        }
        return arbol;
    }
    
    
}
