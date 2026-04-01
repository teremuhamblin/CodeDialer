# 📘 API Reference — CodeDialer

Ce document décrit les principales classes, modèles et Use Cases utilisés dans CodeDialer.  
Il sert de référence technique pour les contributeurs.

---

# 🧩 Domain Layer

## 🔹 Models

### `SecretCode`
Représente un code secret.

| Propriété | Type | Description |
|----------|------|-------------|
| id | Int | Identifiant unique |
| code | String | Code USSD/MMI |
| description | String | Description du code |
| categoryId | Int | Catégorie associée |
| isFavorite | Boolean | Indique si le code est favori |

---

### `Category`
Représente une catégorie de codes.

| Propriété | Type | Description |
|----------|------|-------------|
| id | Int | Identifiant unique |
| name | String | Nom de la catégorie |

---

## 🔹 Use Cases

### `GetAllCodesUseCase`
Retourne la liste complète des codes.

### `SearchCodesUseCase`
Recherche un code selon une chaîne de caractères.

### `ToggleFavoriteUseCase`
Active/désactive un favori.

### `GetCategoriesUseCase`
Retourne toutes les catégories disponibles.

---

# 🧱 Data Layer

## 🔹 DAO

### `SecretCodeDao`
- `getAllCodes()`
- `searchCodes(query)`
- `toggleFavorite(id)`
- `insertAll()`

### `CategoryDao`
- `getAllCategories()`
- `insertAll()`

---

## 🔹 Repository

### `CodeRepository`
Interface principale pour accéder aux données.

Méthodes :
- `getAllCodes()`
- `searchCodes(query)`
- `toggleFavorite(id)`
- `getCategories()`

---

# 🎨 UI Layer

## Écrans principaux
- `HomeScreen`
- `CategoriesScreen`
- `FavoritesScreen`
- `DetailsScreen`

## Composants
- `CodeItem`
- `CategoryItem`
- `SearchBar`

---

# 🧭 Navigation

### `AppNavGraph`
Gère :
- Routes
- Transitions
- Navigation entre écrans

---

# 📝 Notes

Cette API évoluera au fil des versions.  
Voir : `Roadmap.md`
