🧑‍💻 Developer Guide — CodeDialer

Ce guide aide les développeurs à comprendre, modifier et étendre le projet CodeDialer.

---

🏗️ Architecture générale

CodeDialer utilise une architecture modulaire inspirée de Clean Architecture :

- Data Layer — DAO, Room, Repository, Mappers  
- Domain Layer — Use Cases, modèles métier  
- UI Layer — Écrans, ViewModels, composants  
- Navigation Layer — Graph de navigation  
- Utils Layer — Outils génériques  

Voir : Docs/Architecture.md

---

📦 Installation du projet

1. Cloner le dépôt
`
git clone https://github.com/USERNAME/CodeDialer.git (github.com in Bing)
`

2. Ouvrir dans Android Studio
Version recommandée : Giraffe ou plus récent

3. Compiler
Gradle gère automatiquement les dépendances.

---

🧱 Structure du code

`
app/src/main/java/com/codedialer/secretcode/
│
├── Data/
├── Domain/
├── UI/
├── Navigation/
└── Utils/
`

---

🔧 Développement

Ajouter un nouvel écran
1. Créer un dossier dans UI/
2. Ajouter un Screen.kt
3. Ajouter un ViewModel.kt
4. Ajouter la route dans AppNavGraph.kt

---

Ajouter un nouveau Use Case
1. Créer un fichier dans Domain/UseCase
2. Injecter le repository
3. Appeler le Use Case depuis un ViewModel

---

Ajouter une nouvelle table Room
1. Ajouter une entité dans Data/Local/entities
2. Ajouter un DAO
3. Ajouter les méthodes dans le Repository
4. Mettre à jour les Use Cases

---

🧪 Tests

- Domain : tests unitaires  
- Data : tests DAO + Repository  
- UI : tests ViewModel  

---

📝 Bonnes pratiques

- Respecter la séparation des couches  
- Pas de logique métier dans les ViewModels  
- Pas de dépendances circulaires  
- Utiliser des noms explicites  
- Documenter les Use Cases  

---

❤️ Merci

Merci de contribuer au développement de CodeDialer !
`

---
