/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.iu;

import java.util.ArrayList;
import java.util.List;
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

        
    }
}
