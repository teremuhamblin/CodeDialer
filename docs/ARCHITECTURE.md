🧱 Architecture — CodeDialer

Ce document décrit l’architecture complète du projet CodeDialer, basée sur une approche modulaire inspirée de Clean Architecture.

---

🏛️ Vision générale

CodeDialer est structuré en plusieurs couches indépendantes :

- Data Layer  
- Domain Layer  
- UI Layer  
- Navigation Layer  
- Utils Layer

Cette séparation garantit :

- Une meilleure testabilité  
- Une maintenance simplifiée  
- Une évolutivité naturelle  
- Une réduction des dépendances circulaires  

---

📦 Structure détaillée

`
app/src/main/java/com/codedialer/secretcode/
│
├── Data/
│   ├── Local/ (Room)
│   │   ├── AppDatabase.kt
│   │   ├── dao/
│   │   └── entities/
│   │
│   ├── Repository/
│   └── Mapper/
│
├── Domain/
│   ├── Model/
│   └── UseCase/
│
├── UI/
│   ├── Home/
│   ├── Categories/
│   ├── Favorites/
│   ├── Details/
│   └── Components/
│
├── Navigation/
│   └── AppNavGraph.kt
│
└── Utils/
    └── CodeExecutor.kt
`

---

🧩 Description des couches

🔹 Data Layer
Responsable de :
- La base de données Room  
- Les DAO  
- Les entités locales  
- Les Repository + implémentations  
- Les mappers Entity ↔ Domain  

Elle ne contient aucune logique métier.

---

🔹 Domain Layer
Cœur de l’application :
- Modèles métier  
- Use Cases  
- Règles métier  

Elle ne dépend d’aucune autre couche.

---

🔹 UI Layer
Contient :
- Écrans (Compose ou XML)  
- ViewModels  
- Composants UI  

Elle dépend uniquement du Domain Layer.

---

🔹 Navigation Layer
- Graph de navigation centralisé  
- Routes  
- Transitions  

---

🔹 Utils Layer
Outils génériques :
- Exécution de codes USSD/MMI  
- Helpers  
- Extensions  

---

🔄 Flux de données

`
UI → UseCase → Repository → DAO → Database
`

Le flux inverse n’est jamais autorisé.

---

🧪 Testabilité

- Domain : 100 % testable  
- Data : testable via DAO + Repository  
- UI : testable via ViewModels  

---

🚀 Évolutivité

L’architecture permet d’ajouter facilement :

- Nouvelles fonctionnalités  
- Nouveaux écrans  
- Nouveaux Use Cases  
- Nouvelles sources de données  
- Synchronisation cloud  
- IA pour expliquer les codes  

---

📝 Conclusion

L’architecture de CodeDialer est conçue pour être :

- Stable  
- Modulaire  
- Testable  
- Facile à maintenir  
- Prête pour évoluer  

Elle suit les bonnes pratiques Android modernes et garantit une base solide pour le futur du projet.
`

---
