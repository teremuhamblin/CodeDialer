###### 📘 markdown — projet open-sources
# CodeDialer

<p align="left">
  <img src="https://github.com/teremuhamblin/CodeDialer/actions/workflows/build.yml/badge.svg" alt="Build" />
</p>

---

## 🎨 Logo du projet

`md

<p align="center">
  <img src="docs/Images/logo.png" alt="CodeDialer Logo" width="200"/>
</p>
`

---

## 📱 Présentation

`CodeDialer` est une application Android moderne permettant :
- de consulter, organiser, rechercher et exécuter des codes secrets (USSD, MMI, manufacturer codes).  
- elle repose sur une architecture Clean Architecture, modulaire, performante et stable, pensée pour évoluer facilement.

---

## 📸 Screenshots

Ajoute tes captures d’écran dans :  
`
Docs/Screenshots/
`

`md

### 🏠 Écran d’accueil
<p align="center">
  <img src="Docs/Screenshots/home_placeholder.png" alt="Home Screen" width="300"/>
</p>

### 📂 Catégories
<p align="center">
  <img src="Docs/Screenshots/categories_placeholder.png" alt="Categories Screen" width="300"/>
</p>

### ⭐ Favoris
<p align="center">
  <img src="Docs/Screenshots/favorites_placeholder.png" alt="Favorites Screen" width="300"/>
</p>

### 📞 Exécution d’un code
<p align="center">
  <img src="Docs/Screenshots/dialer_placeholder.png" alt="Dialer Execution" width="300"/>
</p>
`

---

## 🚀 Fonctionnalités principales

- 🔍 Recherche intelligente  
- 📂 Catégories organisées  
- ⭐ Gestion des favoris  
- 📞 Exécution sécurisée via le dialer  
- 🗄️ Base Room optimisée  
- 🎨 UI moderne (Compose-ready)  
- ⚡ Performance & stabilité renforcées  
- 🧱 Architecture modulaire (Data / Domain / UI / Navigation / Utils)

---

## 🧱 Architecture du projet

Le projet suit une architecture inspirée de Clean Architecture :

- Data Layer  
  - Room Database  
  - DAO  
  - Repository  
  - Mappers  

- Domain Layer  
  - Use Cases  
  - Modèles métier  

- UI Layer  
  - Écrans  
  - Composants  
  - ViewModels  

- Navigation Layer  
  - Graph de navigation centralisé  

- Utils Layer  
  - Outils génériques (exécution de codes, helpers)

---

## 📂 Structure du projet

`
CodeDialer/
│
├── app/
│   ├── build.gradle
│   ├── proguard-rules.pro
│   │
│   └── src/
│       ├── main/
│       │   ├── AndroidManifest.xml
│       │   │
│       │   ├── java/
│       │   │   └── com/
│       │   │       └── codedialer/
│       │   │           └── secretcode/
│       │   │               │
│       │   │               ├── Data/
│       │   │               │   ├── Local/
│       │   │               │   │   ├── AppDatabase.kt
│       │   │               │   │   ├── dao/
│       │   │               │   │   │   ├── SecretCodeDao.kt
│       │   │               │   │   │   └── CategoryDao.kt
│       │   │               │   │   └── entities/
│       │   │               │   │       ├── SecretCodeEntity.kt
│       │   │               │   │       └── CategoryEntity.kt
│       │   │               │   │
│       │   │               │   ├── Repository/
│       │   │               │   │   ├── CodeRepository.kt
│       │   │               │   │   └── CodeRepositoryImpl.kt
│       │   │               │   │
│       │   │               │   └── Mapper/
│       │   │               │       └── EntityMappers.kt
│       │   │               │
│       │   │               ├── Domain/
│       │   │               │   ├── Model/
│       │   │               │   │   ├── SecretCode.kt
│       │   │               │   │   └── Category.kt
│       │   │               │   │
│       │   │               │   └── UseCase/
│       │   │               │       ├── GetAllCodesUseCase.kt
│       │   │               │       ├── SearchCodesUseCase.kt
│       │   │               │       ├── ToggleFavoriteUseCase.kt
│       │   │               │       └── GetCategoriesUseCase.kt
│       │   │               │
│       │   │               ├── UI/
│       │   │               │   ├── Home/
│       │   │               │   ├── Categories/
│       │   │               │   ├── Favorites/
│       │   │               │   ├── Details/
│       │   │               │   └── Components/
│       │   │               │
│       │   │               ├── Navigation/
│       │   │               │   └── AppNavGraph.kt
│       │   │               │
│       │   │               └── Utils/
│       │   │                   └── CodeExecutor.kt
│       │   │
│       │   └── res/
│       │       ├── layout/
│       │       ├── drawable/
│       │       ├── mipmap/
│       │       └── values/
│       │
│       └── test/
│
│
├── Docs/
│   ├── Architecture.md
│   ├── Api_reference.md
│   ├── Api_changelog.md
│   ├── Developer_guide.md
│   ├── Support_policy.md
│   ├── Roadmap.md
│   ├── Maintainers.md
│   │
│   ├── Introduction.md
│   ├── Liste_Codes.md
│   ├── Fonctionnement_USSD_MMI.md
│   ├── Compatibilite_Constructeurs.md
│   ├── Securite.md
│   ├── Limitations.md
│   │
│   ├── Images/
│   │   └── logo.png
│   │
│   └── Screenshots/
│       ├── home_placeholder.png
│       ├── categories_placeholder.png
│       ├── favorites_placeholder.png
│       └── dialer_placeholder.png
│
│
├── .github/
│   ├── CODEOWNERS
│   ├── CODE_OF_CONDUCT.md
│   ├── CONTRIBUTING.md
│   ├── SECURITY.md
│   ├── SECURITY_CONTACTS.md
│   ├── SECURITY_RESPONSE_PROCESS.md
│   ├── SECURITY_ADVISORY_TEMPLATE.md
│   ├── GOVERNANCE.md
│   ├── RELEASE_TEMPLATE.md
│   │
│   ├── ISSUE_TEMPLATE/
│   │   ├── bug_report.md
│   │   └── feature_request.md
│   │
│   ├── PULL_REQUEST_TEMPLATE.md
│   └── SUPPORT.md
│
├── README.md
├── CHANGELOG.md
├── LICENSE
└── .gitignore
`

---

## 📛 Badges supplémentaires

`md
![Android API]()
![Open Source Love]()`


---

## ⚡ Optimisations de performance & stabilité

- DAO indexés et optimisés  
- Repository unique pour éviter les collisions  
- Use cases isolés  
- Dispatchers IO pour les opérations lourdes  
- UI découplée pour limiter les recompositions  
- Navigation centralisée  
- Architecture pensée pour le multi-threading  

---

## 🚀 Installation

`
git clone https://github.com/USERNAME/CodeDialer.git
`

Ouvrir dans Android Studio (Giraffe ou plus récent), compiler et lancer.

---

## 🧭 Roadmap

- Import/export JSON  
- Synchronisation cloud  
- Widgets Android  
- Mode sombre avancé  
- Historique des codes exécutés  
- IA pour expliquer les codes  
- Détection automatique du constructeur  

---

## 📄 Licence

Projet sous licence MIT.

---

# 🎉 Conclusion

> CodeDialer est une application Android moderne, stable et performante, conçue pour offrir une gestion complète des codes secrets et USSD.  
> Grâce à son architecture propre et modulaire, elle est facile à maintenir, enrichir et optimiser.

`

---
