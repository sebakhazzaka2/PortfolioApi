# Imagen base con Java 17 (compatible con Spring Boot 3.x)
FROM eclipse-temurin:17-jdk

# Crear el directorio del app
WORKDIR /app

# Copiar los archivos del proyecto
COPY . .

# Compilar el proyecto con Maven Wrapper
RUN ./mvnw -DskipTests package

# Exponer el puerto (Render usará 8080 por defecto)
EXPOSE 8080

# Ejecutar el .jar generado
CMD ["java", "-jar", "target/portfolio-api-1.0.0.jar"]