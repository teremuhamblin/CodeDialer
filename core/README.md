📦 CodeDialer — Module core

Le module core constitue le cœur fonctionnel et conceptuel de CodeDialer.  
Il regroupe les abstractions, modèles, règles métier et contrats qui définissent le comportement fondamental de l’application, indépendamment de toute implémentation technique (UI, base de données, frameworks, plateformes).

Ce module est 100% pur Kotlin, sans dépendance Android, afin de garantir :

- 🔁 Reproductibilité  
- 🧩 Modularité forte  
- 🧪 Testabilité maximale  
- 🔒 Isolation des règles métier  
- 🚀 Réutilisabilité dans d’autres modules ou plateformes

---

🧠 Rôle du module core

Le module core sert de source de vérité pour :

- Les entités métier (contacts, favoris, catégories, numéros, etc.)
- Les use cases (logique applicative orchestrée)
- Les interfaces de repository (contrats d’accès aux données)
- Les types utilitaires (résultats, erreurs, validations)
- Les règles métier (formatage, filtrage, normalisation)

Il ne contient aucune dépendance vers l’UI, la base de données, Android ou des frameworks externes.

---

🗂️ Structure interne

`
core/
 ├── domain/
 │    ├── model/          → Entités métier immuables
 │    ├── repository/     → Interfaces des sources de données
 │    ├── usecase/        → Cas d’usage unitaires
 │    └── util/           → Types transverses (Result, validators…)
 └── di/
      └── CoreModule.kt   → Fourniture des dépendances du module
`

📁 domain/model
Contient les entités métier utilisées dans toute l’application :

- Contact
- PhoneNumber
- Category
- Favorite
- DialerEntry
- etc.

Toutes les entités sont :

- immuables (data class)
- validées à la construction
- documentées

---

📁 domain/repository
Définit les contrats que les modules data ou database doivent implémenter :

- ContactRepository
- FavoritesRepository
- DialerRepository
- CategoryRepository

Ces interfaces garantissent :

- une séparation stricte entre logique métier et stockage
- la possibilité de mocker facilement pour les tests
- la stabilité de l’API interne

---

📁 domain/usecase
Chaque use case représente une action métier unique, par exemple :

- SearchContactsUseCase
- AddFavoriteUseCase
- RemoveFavoriteUseCase
- GetDialerHistoryUseCase
- NormalizePhoneNumberUseCase

Caractéristiques :

- une seule responsabilité
- testable indépendamment
- orchestrable par les ViewModels du module presentation

---

📁 domain/util
Contient les types transverses :

- Result<T> (succès/erreur)
- AppError
- PhoneValidator
- StringNormalizer
- Extensions utiles

---

📁 di/
Expose les dépendances du module via Koin ou Hilt (selon ton choix actuel).

Exemple :

`kotlin
val coreModule = module {
    factory { SearchContactsUseCase(get()) }
    factory { NormalizePhoneNumberUseCase() }
}
`

---

🧪 Tests

Le module core est entièrement testable sans instrumentation.  
Les tests couvrent :

- les use cases
- les règles métier
- les validateurs
- les entités (construction, invariants)

Les tests sont écrits en JUnit5 + MockK.

---

🎯 Objectifs du module

- Centraliser la logique métier
- Garantir la cohérence fonctionnelle de CodeDialer
- Permettre une évolution modulaire sans dette technique
- Offrir une API interne stable pour les autres modules

---

🔗 Dépendances

Le module core ne dépend que de :

- Kotlin standard library
- Kotlin coroutines
- (optionnel) Koin/Hilt pour la DI

Aucune dépendance Android.

---

🧭 Bonnes pratiques appliquées

- Clean Architecture
- Domain-Driven Design (DDD léger)
- Séparation stricte des responsabilités
- Code immuable et testable
- Documentation systématique
- Architecture modulaire reproductible

---

📌 Statut

Le module core est stable, versionné et prêt pour l’open‑source.  
Toute modification doit respecter :

- la compatibilité ascendante
- la cohérence métier
- la documentation interne

---
