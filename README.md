# Directory Contacts

Application de gestion de contacts avec un backend Spring Boot et un frontend React/Vite.

## Prérequis

- Java 21+
- Maven
- Node.js 18+
- MySQL (via XAMPP, WAMP ou autre)

## 1. Base de données

1. Démarrez votre serveur MySQL (ex: XAMPP → Apache + MySQL)
2. Ouvrez **PHPMyAdmin** (`http://localhost/phpmyadmin`)
3. Créez une nouvelle base de données nommée `directory_contacts_db` avec l'interclassement `utf8mb4_unicode_ci`
4. Copiez le fichier de configuration et renseignez vos identifiants :
   ```bash
   cp backend/src/main/resources/application-mysql.properties.example backend/src/main/resources/application-mysql.proporties
   ```
5. Editez `application-mysql.proporties` et remplissez `spring.datasource.password=` avec votre mot de passe MySQL

## 2. Backend (Spring Boot)

Depuis la racine du projet :

```bash
.\mvnw spring-boot:run
```

Le serveur démarre sur **http://localhost:8080**.

Les tables sont créées automatiquement dans la base de données au premier démarrage.

## 3. Frontend (React + Vite)

Dans un autre terminal :

```bash
cd frontend
npm install
npm run dev
```

L'application est accessible sur **http://localhost:5173**.

## Structure du projet

```
directory-contacts/
├── backend/          # API REST Spring Boot
│   └── src/
│       ├── main/java/com/
│       │   ├── controller/
│       │   ├── model/
│       │   ├── repository/
│       │   └── service/
│       └── main/resources/
│           ├── application.properties
│           └── application-mysql.proporties  ← ignoré par Git
├── frontend/         # Interface React/Vite
│   └── src/
└── pom.xml
```
