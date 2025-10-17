# 🧩 Portfolio API – Backend (Spring Boot)

**Autor:** Sebastián Khazzaka  
**Lenguaje:** Java 17  
**Framework:** Spring Boot 3.3.4  

---

## 📋 Descripción

Este proyecto es el **backend del portfolio personal** [Portfolio SK](https://sebakhazzaka2.github.io/portfolio-sk/).  
Expone una API REST simple desarrollada en **Spring Boot**, que provee información sobre los proyectos del portfolio, cuenta las visitas al sitio y gestiona mensajes de contacto.

El objetivo de este backend es demostrar conocimientos en:
- Desarrollo de APIs REST en Java.
- Estructura básica de un proyecto Spring Boot.
- Integración con un frontend desplegado en GitHub Pages.

---

## 🚀 Funcionalidades principales

| Método | Endpoint | Descripción |
|--------|-----------|-------------|
| `GET` | `/api/proyectos` | Devuelve la lista de proyectos con título, descripción, tecnología y enlaces a demo/repositorio. |
| `POST` | `/api/contacto` | Recibe mensajes del formulario de contacto. |
| `POST` | `/api/visitas` | Incrementa el contador de visitas. |
| `GET` | `/api/visitas` | Devuelve la cantidad total de visitas registradas. |

---

## 🧱 Estructura básica del código

- `Proyecto.java` → Clase modelo que representa un proyecto.
- `Contacto.java` → Clase modelo para el formulario de contacto.
- `ApiControlador.java` → Controlador principal con los endpoints REST.
- `PortfolioApiApplication.java` → Clase principal que levanta el servidor.

---

## ⚙️ Tecnologías usadas

- **Java 17**
- **Spring Boot 3.3.4**
- **Maven Wrapper**
- **Render.com** (para despliegue)
- **CORS habilitado** → Permite conexión desde el frontend en GitHub Pages.

---

## 🌐 URL del Backend desplegado

> 🔗 [https://portfolioapi-uj2a.onrender.com](https://portfolioapi-uj2a.onrender.com)

Ejemplo de endpoint:
```bash
GET https://portfolioapi-uj2a.onrender.com/api/proyectos
