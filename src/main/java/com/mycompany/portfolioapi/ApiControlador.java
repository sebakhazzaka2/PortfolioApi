/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.portfolioapi;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class ApiControlador {

    private final List<Proyecto> proyectos = new ArrayList<>();
    private final List<Contacto> mensajes = new ArrayList<>();
    private final AtomicInteger visitas = new AtomicInteger(0);

     public ApiControlador() {
        Proyecto p1 = new Proyecto();
        p1.setTitulo("Gestión de Corredores");
        p1.setDescripcion("Web para registrar corredores y tiempos.");
        p1.setTecnologia("html"); // o "js"
        p1.setUrlDemo("https://sebakhazzaka2.github.io/Gestion-Corredores/");
        p1.setUrlRepo("https://github.com/sebakhazzaka2/Gestion-Corredores");
        proyectos.add(p1);

        Proyecto p2 = new Proyecto();
        p2.setTitulo("Mercado de Frutas");
        p2.setDescripcion("App para administrar frutas, precios y stock.");
        p2.setTecnologia("java"); // cambia a "js" si es front
        p2.setUrlDemo(null);
        p2.setUrlRepo("https://github.com/sebakhazzaka2/Mercado-Frutas");
        proyectos.add(p2);

        Proyecto p3 = new Proyecto();
        p3.setTitulo("Juego Autitos");
        p3.setDescripcion("Pequeño juego con listado y acciones básicas.");
        p3.setTecnologia("java"); // o "js"
        p3.setUrlDemo(null);
        p3.setUrlRepo("https://github.com/sebakhazzaka2/Juego-Autitos");
        proyectos.add(p3);

        Proyecto p4 = new Proyecto();
        p4.setTitulo("Juego Gatitos");
        p4.setDescripcion("Mini juego temática gatitos. Favoritos y filtros.");
        p4.setTecnologia("java"); // o "js"
        p4.setUrlDemo(null);
        p4.setUrlRepo("https://github.com/sebakhazzaka2/Juego-Gatitos");
        proyectos.add(p4);

        Proyecto p5 = new Proyecto();
        p5.setTitulo("Juego Tic-Tac-Toe");
        p5.setDescripcion("Ta-Te-Ti con detección de ganador y reinicio.");
        p5.setTecnologia("java"); // o "js"
        p5.setUrlDemo(null);
        p5.setUrlRepo("https://github.com/sebakhazzaka2/Juego-TicTacToe");
        proyectos.add(p5);

        Proyecto p6 = new Proyecto();
        p6.setTitulo("Gestión de Librería");
        p6.setDescripcion("Consola Java con POO y CRUD básico.");
        p6.setTecnologia("java");
        p6.setUrlDemo(null);
        p6.setUrlRepo("https://github.com/sebakhazzaka2/Gestion-Libros");
        proyectos.add(p6);

        Proyecto p7 = new Proyecto();
        p7.setTitulo("Portfolio Sebastián Khazzaka");
        p7.setDescripcion("Portfolio web (HTML/CSS/JS).");
        p7.setTecnologia("html");
        p7.setUrlDemo("https://sebakhazzaka2.github.io/portfolio-sk/");
        p7.setUrlRepo("https://github.com/sebakhazzaka2/portfolio-sk");
        proyectos.add(p7);
    }

    @GetMapping("/proyectos")
    public List<Proyecto> obtenerProyectos() { return proyectos; }

    @PostMapping("/contacto")
    public Map<String, String> guardarMensaje(@RequestBody Contacto contacto) {
        mensajes.add(contacto);
        return Map.of("estado", "ok");
    }

    @PostMapping("/visitas")
    public Map<String, Integer> sumarVisita() {
        return Map.of("total", visitas.incrementAndGet());
    }

    @GetMapping("/visitas")
    public Map<String, Integer> obtenerVisitas() {
        return Map.of("total", visitas.get());
    }
}