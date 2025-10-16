# Java 17, compatible con Spring Boot 3.x
FROM eclipse-temurin:17-jdk

# Carpeta de trabajo
WORKDIR /app

# Copiar todo el proyecto
COPY . .

# 🔧 Arreglar fin de línea de Windows y dar permiso de ejecución al mvnw
RUN sed -i 's/\r$//' mvnw && chmod +x mvnw

# Compilar (sin tests)
RUN ./mvnw -DskipTests package

# Render setea PORT; Spring lo toma con server.port=${PORT:8080}
EXPOSE 8080

# Ejecutar el .jar generado (cualquiera)
CMD ["sh","-c","java -jar target/*.jar"]