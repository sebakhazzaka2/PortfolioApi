/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.portfolioapi; // asegurate que sea el mismo package que tus otras clases

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // marca esta clase como el punto de inicio del backend
public class App {

    public static void main(String[] args) {
        // Arranca el servidor Spring Boot
        SpringApplication.run(App.class, args);

        
        System.out.println("🚀 Servidor iniciado en http://localhost:8080");
        System.out.println("📡 Endpoints disponibles:");
        System.out.println("   → GET  /api/proyectos");
        System.out.println("   → POST /api/contacto");
        System.out.println("   → GET  /api/visitas");
        System.out.println("   → POST /api/visitas");
    }
}