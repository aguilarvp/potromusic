/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.music.entidades;

import java.util.List;
import mx.itson.music.enums.Genero;

/**
 *
 * @author alumnog
 */
public class Album {
    private String nombre;
    private Artista artista;
    private int lanzamiento;
    private Genero genero;
    private List<Cancion>cancion;
}
