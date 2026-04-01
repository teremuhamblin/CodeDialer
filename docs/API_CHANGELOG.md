# 📘 API Changelog — CodeDialer

Ce document liste les changements majeurs apportés à l’API interne de CodeDialer (Domain, Repository, Models, Use Cases).

---

## [1.0.0] — Version initiale

### 🧩 Domain Models
- Ajout du modèle `SecretCode`
- Ajout du modèle `Category`

### 🔧 Use Cases
- `GetAllCodesUseCase`
- `SearchCodesUseCase`
- `ToggleFavoriteUseCase`
- `GetCategoriesUseCase`

### 🗄️ Repository
- `CodeRepository` (interface)
- `CodeRepositoryImpl` (implémentation)

### 🧱 Data Layer
- DAO Room : `SecretCodeDao`, `CategoryDao`
- Entités : `SecretCodeEntity`, `CategoryEntity`
- Mappers Entity ↔ Domain

---

## Format du changelog API

- **Added** — Nouveaux modèles, Use Cases, DAO, Repository  
- **Changed** — Modifications de signatures ou comportements  
- **Removed** — Suppressions d’API  
- **Deprecated** — API obsolètes  

---

## Notes

Ce fichier est destiné aux développeurs contribuant à l’architecture interne.  
Voir aussi : `Docs/Api_reference.md`
