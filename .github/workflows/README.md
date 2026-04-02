---

📘 README.md — Documentation des Workflows GitHub Actions
(Version adaptée à ton dépôt CodeDialer)

`md

🚀 CodeDialer — Documentation des Workflows GitHub Actions

Ce dossier contient l’ensemble des workflows CI/CD utilisés par CodeDialer.  
Ils assurent la qualité, la stabilité, la sécurité et la livraison continue du projet.

Chaque fichier .yml correspond à un pipeline automatisé exécuté par GitHub Actions.

---

📂 Liste des workflows

Voici les workflows actuellement présents dans ce dossier :

| Fichier | Rôle principal |
|--------|----------------|
| build.yml | Compilation du projet (Debug/Release) |
| tests.yml | Exécution des tests unitaires |
| lint.yml | Analyse statique Android Lint |
| instrumented-tests.yml | Tests instrumentés AndroidTest via AVD |
| ci-cf_ultimate.yml | Pipeline CI/CD complet (build + tests + lint + AVD + release + sécurité) |

---

🧱 1. build.yml

🎯 Objectif
Compiler le projet CodeDialer en mode Debug (et parfois Release selon configuration).

🔍 Ce que fait ce workflow
- Configure Java 17  
- Met en cache Gradle  
- Exécute :  
  `
  ./gradlew assembleDebug
  `

📌 Utilité
Permet de vérifier que le projet compile correctement à chaque commit ou pull request.

---

🧪 2. tests.yml

🎯 Objectif
Exécuter les tests unitaires du module app.

🔍 Ce que fait ce workflow
- Configure Java 17  
- Met en cache Gradle  
- Exécute :  
  `
  ./gradlew testDebugUnitTest
  `

📌 Utilité
Garantit que la logique métier (UseCases, Repository, Utils…) reste stable.

---

🔍 3. lint.yml

🎯 Objectif
Analyser la qualité du code via Android Lint.

🔍 Ce que fait ce workflow
- Configure Java 17  
- Met en cache Gradle  
- Exécute :  
  `
  ./gradlew lintDebug
  `

📌 Utilité
Détecte les erreurs de ressources, de compatibilité, d’API, de performance, etc.

---

📱 4. instrumented-tests.yml

🎯 Objectif
Exécuter les tests instrumentés AndroidTest sur un émulateur Android.

🔍 Ce que fait ce workflow
- Installe le SDK Android  
- Crée un AVD Pixel (Android 30)  
- Lance un émulateur headless  
- Attend le boot complet  
- Exécute :  
  `
  ./gradlew connectedDebugAndroidTest
  `

📌 Utilité
Valide le comportement réel de l’application sur un environnement Android complet.

---

🏆 5. ci-cf_ultimate.yml

🎯 Objectif
Pipeline CI/CD complet, regroupant toutes les étapes essentielles.

🔍 Ce que fait ce workflow
Selon la configuration, il peut inclure :

- Build Debug + Release  
- Tests unitaires  
- Lint Android  
- Tests instrumentés (AVD)  
- Analyse de sécurité (CodeQL)  
- Analyse qualité (SonarCloud)  
- Release automatique GitHub  
- Publication Play Store  
- Distribution Firebase  
- Nightly builds  
- Auto-merge Dependabot  

📌 Utilité
C’est le workflow principal pour garantir la qualité et la livraison continue du projet.

---

🔐 Secrets nécessaires

Certains workflows nécessitent des secrets GitHub.  
Voici la liste complète :

| Secret | Utilisé pour | Description |
|--------|--------------|-------------|
| GITHUB_TOKEN | Releases, auto-merge | Automatique, fourni par GitHub |
| PLAYSTOREJSON | Publication Play Store | JSON du service account Google Play |
| FIREBASE_TOKEN | Firebase App Distribution | Token généré via firebase login:ci |
| FIREBASEAPPID | Firebase App Distribution | ID de l’app Firebase |
| SONAR_TOKEN | SonarCloud | Token d’analyse statique |
| SIGNING_KEYSTORE (optionnel) | Signature APK | Keystore encodé en base64 |
| SIGNING_PASSWORD (optionnel) | Signature APK | Mot de passe du keystore |

---

🧩 Structure recommandée

`
.github/
 └── workflows/
      ├── build.yml
      ├── tests.yml
      ├── lint.yml
      ├── instrumented-tests.yml
      ├── ci-cf_ultimate.yml
      └── README.md   ← ce fichier
scripts/
 └── versioning.sh
version.properties
`

---

🛠️ Script de versioning automatique (SemVer)

Le script versioning.sh permet d’incrémenter automatiquement la version :

`
./scripts/versioning.sh patch
./scripts/versioning.sh minor
./scripts/versioning.sh major
`

Il met à jour version.properties et crée un tag Git correspondant.

---

🎉 Conclusion

Ce dossier contient l’ensemble des pipelines nécessaires pour assurer :

- la qualité du code  
- la stabilité du projet  
- la sécurité  
- la livraison continue  
- la publication automatisée  

CodeDialer dispose désormais d’une infrastructure CI/CD professionnelle, prête pour un projet open-source de haut niveau.

`

---
