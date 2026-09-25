# 📱 Agenda Telefónica — API REST

Proyecto desarrollado con **Spring Boot** que permite gestionar una agenda de contactos.

## 🛠️ Tecnologías utilizadas
- Java 21
- Spring Boot 3
- Spring Data JPA
- Base de datos H2
- Maven

## ✅ Funcionalidades
- 📋 Listar todos los contactos
- ➕ Crear nuevos contactos
- 🚫 Validación de emails duplicados

## 📡 Endpoints
| Método | Ruta | Descripción |
|--------|------|-------------|
| GET | `/api/contactos` | Obtener todos los contactos |
| POST | `/api/contactos` | Crear un contacto nuevo |

## 🚀 Cómo ejecutar el proyecto
```bash
# Clonar el repositorio
git clone https://github.com/pepelorenzo100/agenda-telefonica.git

# Entrar al proyecto
cd agenda-telefonica

# Compilar
mvn clean compile

# Ejecutar
mvn spring-boot:run

agenda-telefonica/
├── src/main/java/com/agenda/agenda_telefonica/
│   ├── controller/      # Controladores REST
│   ├── dto/             # Objetos de transferencia de datos
│   ├── entity/          # Entidades de la base de datos
│   ├── exception/       # Excepciones personalizadas
│   ├── repository/      # Capa de acceso a datos
│   └── service/         # Lógica de negocio
└── src/main/resources/  # Configuración