> # Android Secret Codes Manager
- Application Android permettant d’afficher, comprendre, tester et exécuter les codes secrets du type #1234#, #06#, #0#, etc.  
> Ces codes : `appelés codes MMI, codes USSD ou codes secrets constructeur`
- Donnent accès à des menus techniques, des informations système ou des fonctions cachées selon les appareils.

Ce projet fournit une interface simple, une base documentaire complète et une architecture modulaire pour explorer et analyser ces codes sur smartphone Android.

---

📱 Fonctionnalités principales
- Affichage d’une liste de codes secrets classés par catégories  
- Explication de la fonction de chaque code  
- Test de compatibilité selon l’appareil  
- Exécution des codes supportés  
- Documentation intégrée sur les codes MMI/USSD  
- Architecture modulaire permettant d’ajouter facilement de nouveaux codes  
- Préparation pour une future intégration d’un assistant IA  

---

🎯 Objectifs du projet
- Centraliser les codes secrets Android dans une interface claire  
- Permettre aux utilisateurs de comprendre les fonctions associées  
- Tester la compatibilité selon les constructeurs (Samsung, Xiaomi, Huawei…)  
- Offrir une base technique solide pour des analyses système  
- Fournir une documentation fiable et reproductible  

---

📂 Structure du projet

`
android-secret-codes/
│
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/teremu/secretcodes/
│   │   │   │   ├── MainActivity.kt
│   │   │   │   ├── CodeListAdapter.kt
│   │   │   │   ├── CodeExecutor.kt
│   │   │   │   └── models/SecretCode.kt
│   │   │   └── res/
│   │   └── AndroidManifest.xml
│
└── docs/
    ├── introduction.md
    ├── liste_codes.md
    ├── fonctionnementussdmmi.md
    ├── compatibilite_constructeurs.md
    ├── securite.md
    └── limitations.md
`

---

📖 Documentation
La documentation complète se trouve dans le dossier docs/.

Elle inclut :

- introduction.md — Présentation du projet  
- liste_codes.md — Liste des codes secrets classés par catégories  
- fonctionnementussdmmi.md — Explication technique des codes MMI/USSD  
- compatibilite_constructeurs.md — Différences selon les marques  
- securite.md — Restrictions Android, risques, permissions  
- limitations.md — Codes non supportés, restrictions Google  

---

⚠️ Sécurité & limitations
- Certains codes peuvent être bloqués par Android (sécurité Google)  
- Certains codes peuvent être spécifiques à un constructeur  
- Certains codes peuvent modifier des paramètres sensibles  
- L’application n’exécute pas automatiquement les codes dangereux  
- L’utilisateur est responsable de l’usage des codes  

---

🚀 Installation
1. Cloner le dépôt  
2. Ouvrir le projet dans Android Studio  
3. Compiler et déployer sur un appareil physique (recommandé)  
4. Accorder les permissions nécessaires (appel, téléphone)  

---

🛠️ Technologies utilisées
- Kotlin  
- Android SDK  
- RecyclerView  
- Intents Android (ACTIONDIAL / ACTIONCALL)  
- Architecture modulaire  

---

📌 Roadmap

v0.1.0 — Alpha
- Liste statique de codes  
- Interface simple  
- Documentation de base  

v0.9.0 — Beta
- Exécution des codes  
- Détection de compatibilité  
- Documentation avancée  
- Amélioration UI  

v1.0.0 — Stable
- Base de données complète  
- Tests multi‑constructeurs  
- Optimisation sécurité  
- Intégration IA (optionnelle)  

---

📜 Licence
À définir selon ton choix : MIT, Apache 2.0, GPL, etc.

---

👤 Auteur
Projet développé par The MadDoG
tmdg, basé à Toulouse, passionné par les systèmes Android, l’ingénierie modulaire et les outils opérationnels.

---
