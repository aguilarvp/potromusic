/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.iu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import mx.itson.music.entidades.Album;
import mx.itson.music.entidades.Artista;
import mx.itson.music.entidades.Cancion;
import mx.itson.music.enums.Genero;

/**
 *
 * @author alumnog
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner scan =new Scanner (System.in);
        
        Artista art = new Artista();
        art.setNombre("Bad Bunny");
        art.setSitioWeb("www.badbunnybeibe.com");
        art.setDescripcion("juajuas");
        
        Album alb = new Album ();
        alb.setNombre("DtMF");
        alb.setLanzamiento(2025);
        alb.setArtista(art);
        alb.setGenero(Genero.OTRO);
        
        List<Cancion> canciones = new ArrayList<>();

            Cancion cancion1 = new Cancion();
            cancion1.setNombre("DtFM");
            cancion1.setOrden(0);
            cancion1.setDuracion(244);
            
            Cancion cancion2 = new Cancion();
            cancion2.setNombre("Mudanza");
            cancion2.setOrden(1);
            cancion2.setDuracion(234);
            
            canciones.add(cancion1);
            canciones.add(cancion2);
            alb.setCancion(canciones);
            
            System.out.print("nombre del artista ");
            art.setNombre(scan.nextLine());
            
            System.out.print("sitio web del artista ");
            art.setSitioWeb(scan.nextLine());
            
            System.out.println("descripcion breve (opcional)");
            art.setDescripcion(scan.nextLine());
            
            System.out.print("nombre del album ");
            alb.setNombre(scan.nextLine());
            
            System.out.println("año de lanzamiento ");
            alb.setLanzamiento(scan.nextInt());
            
            alb.setArtista(art);
            
            
            alb.setGenero(Genero.OTRO);
            
            
            Cancion cancion = new Cancion();
            
        
        String decision;

        do {
           
            System.out.println("nombre de cancion ");
            cancion.setNombre(scan.nextLine());
            scan.nextLine();
            
            System.out.println("numero de la cancion en el album ");
            cancion.setOrden(scan.nextInt());
            scan.nextLine();
            
            System.out.println("duracion de la cancion en segundos ");
            cancion.setDuracion(scan.nextInt());
            scan.nextLine();
            
            canciones.add (cancion);
            
            
            System.out.print("¿Deseas agregar otra cancion? (escribe 'no' para detenerte): ");
            decision = scan.nextLine();

        } while (!decision.equalsIgnoreCase("no")); // El ciclo continúa hasta que el usuario escriba "no"

        System.out.println(". . . Album . . . ");
        System.out.println("nombre: " + alb.getNombre());
        System.out.println("lanzamiento: "+ alb.getLanzamiento());
        System.out.println("Artista: "+ alb.getArtista().getNombre());
        System.out.println("descripcion de artista "+ alb.getArtista().getDescripcion());
        
        System.out.println(". . . Canciones . . . ");
        for (Iterator<Cancion> it = alb.getCancion().iterator(); it.hasNext();) {
            cancion = it.next();
            System.out.println("Cancion: " + cancion.getNombre() + " / Orden: " + cancion.getOrden() + " / Duracion: " + cancion.getDuracion() + " segundos");
        }
        
        
        System.out.println("Ciclo terminado. ¡Hasta pronto!");
        scan.close();
        
        
    }
}

            /*
            for (Cancion : cancion){
                
            System.out.println("nombre de cancion ");
            cancion.setNombre(scan.nextLine());
            
            System.out.println("numero de la cancion en el album ");
            cancion.setOrden(scan.nextInt());
            scan.nextLine();
            
            System.out.println("duracion de la cancion en segundos ");
            cancion.setDuracion(scan.nextInt());
            scan.nextLine();
            
            canciones.add(cancion);
            
            }*/
            
            /* 
            System.out.println("agrega una cancion (si, no)");
            String agregar = scan.nextLine();
            
            if (null ==agregar){
                System.out.println("respuesta no valida ");}
            else switch (agregar) {
                case "si" -> {
                }
                case "no" -> {
                }
                default -> System.out.println("respuesta no valida "); */

   


            
            
             
            
