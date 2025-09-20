# API Buses

API para gestionar información de buses. Desarrollada con **Spring Boot** y **PostgreSQL**.

---

## Levantar la API localmente

1. Clonar el repositorio:
```bash
git clone https://github.com/Samuelichu/api-buses.git
```
2. Configurar PostgreSQL y crear la base de datos "prueba_buses".

3. Ajustar credenciales en src/main/resources/application.properties:

```bash
spring.datasource.url=jdbc:postgresql://localhost:5432/prueba_buses
spring.datasource.username=usuario
spring.datasource.password=contraseña
spring.jpa.hibernate.ddl-auto=update
```
4. Ejecutar la API:
```bash
 mvn spring-boot:run
```
