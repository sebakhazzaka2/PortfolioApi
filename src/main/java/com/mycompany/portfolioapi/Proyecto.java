/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.portfolioapi;

public class Proyecto {
  private String titulo;
  private String descripcion;
  private String tecnologia; // "js", "java", "html"
  private String urlDemo;
  private String urlRepo;

  public Proyecto() {}

    public Proyecto(String titulo, String descripcion, String tecnologia, String urlDemo, String urlRepo) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tecnologia = tecnologia;
        this.urlDemo = urlDemo;
        this.urlRepo = urlRepo;
    }


    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public String getTecnologia() { return tecnologia; }
    public void setTecnologia(String tecnologia) { this.tecnologia = tecnologia; }

    public String getUrlDemo() { return urlDemo; }
    public void setUrlDemo(String urlDemo) { this.urlDemo = urlDemo; }

    public String getUrlRepo() { return urlRepo; }
    public void setUrlRepo(String urlRepo) { this.urlRepo = urlRepo; }
}
