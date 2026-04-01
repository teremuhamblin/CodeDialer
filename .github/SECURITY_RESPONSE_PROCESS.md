# 🔐 Security Response Process — CodeDialer

Ce document décrit le processus officiel de gestion des vulnérabilités dans **CodeDialer**.

---

# 🚨 1. Signalement

Les vulnérabilités doivent être signalées via :

security@codedialer.dev

Ne créez **jamais** d’issue publique.

Voir : `.github/SECURITY.md`

---

# 🛡️ 2. Accusé de réception

Le mainteneur répondra sous **72 heures** pour confirmer :
- la réception du rapport  
- la validité du problème  
- la priorité de traitement  

---

# 🔍 3. Analyse

Le mainteneur :
- reproduit la vulnérabilité  
- évalue la gravité  
- identifie les zones impactées  
- détermine un correctif  

---

# 🛠️ 4. Développement du correctif

Le correctif est développé en interne dans une branche privée.

Aucune information publique n’est publiée avant la résolution.

---

# 🧪 5. Tests

Le correctif est testé :
- sur plusieurs appareils  
- sur plusieurs versions Android  
- avec différents scénarios d’usage  

---

# 🚀 6. Publication du patch

Une nouvelle version est publiée :
- Mise à jour du `CHANGELOG.md`
- Publication d’un **Security Advisory**
- Mise à jour de la documentation

---

# 📢 7. Communication

Les utilisateurs sont informés via :
- GitHub Releases  
- Security Advisory  
- README (si nécessaire)

---

# ❤️ Merci

Merci de contribuer à la sécurité de CodeDialer.  
Voir aussi : `.github/SECURITY_CONTACTS.md`
