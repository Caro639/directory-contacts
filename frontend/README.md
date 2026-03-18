# React + Vite

## Lancer le projet

### Backend (Spring Boot)

Depuis la racine du projet :

```powershell
.\mvnw spring-boot:run
```

L'API sera disponible sur : http://localhost:8080

### Frontend (React / Vite)

```powershell
cd frontend
npm run dev
```

L'application sera disponible sur : <http://localhost:5173>

---

### Base de données

<http://localhost:8080/api/test>
L'application utilise une base de données H2 en mémoire. Les données seront perdues à chaque redémarrage de l'application. Vous pouvez accéder à la console H2 à l'adresse suivante : <http://localhost:8080/h2-console>

This template provides a minimal setup to get React working in Vite with HMR and some ESLint rules.

Currently, two official plugins are available:

- [@vitejs/plugin-react](https://github.com/vitejs/vite-plugin-react/blob/main/packages/plugin-react) uses [Oxc](https://oxc.rs)
- [@vitejs/plugin-react-swc](https://github.com/vitejs/vite-plugin-react/blob/main/packages/plugin-react-swc) uses [SWC](https://swc.rs/)

## React Compiler

The React Compiler is not enabled on this template because of its impact on dev & build performances. To add it, see [this documentation](https://react.dev/learn/react-compiler/installation).

## Expanding the ESLint configuration

If you are developing a production application, we recommend using TypeScript with type-aware lint rules enabled. Check out the [TS template](https://github.com/vitejs/vite/tree/main/packages/create-vite/template-react-ts) for information on how to integrate TypeScript and [`typescript-eslint`](https://typescript-eslint.io) in your project.
