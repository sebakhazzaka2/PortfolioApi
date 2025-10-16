# -------- Stage 1: Build con Maven (sin usar mvnw) --------
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
# Compilar sin tests
RUN mvn -DskipTests package

# -------- Stage 2: Runtime (más liviano) --------
FROM eclipse-temurin:17-jdk
WORKDIR /app
# Copiamos el .jar construido
COPY --from=build /app/target/*.jar app.jar

# Render expone PORT; Spring lo toma con server.port=${PORT:8080}
EXPOSE 8080
CMD ["java","-jar","app.jar"]