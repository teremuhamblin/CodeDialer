val initialCodes = listOf(

    // UNIVERSAL
    SecretCodeEntity("*#06#", "Afficher l'IMEI", "Universel"),
    SecretCodeEntity("*#07#", "Informations réglementaires", "Universel"),

    // ANDROID
    SecretCodeEntity("*#*#4636#*#*", "Infos téléphone", "Android"),
    SecretCodeEntity("*#*#225#*#*", "Agenda", "Android"),
    SecretCodeEntity("*#*#426#*#*", "Diagnostics réseau", "Android"),

    // OPERATEUR / USSD
    SecretCodeEntity("*100#", "Solde opérateur", "Opérateur"),
    SecretCodeEntity("#123#", "Menu opérateur", "Opérateur"),

    // SAMSUNG
    SecretCodeEntity("*#0*#", "Menu de test matériel", "Samsung"),
    SecretCodeEntity("*#1234#", "Infos firmware", "Samsung"),

    // XIAOMI
    SecretCodeEntity("*#*#6484#*#*", "Menu de test matériel", "Xiaomi"),

    // HUAWEI
    SecretCodeEntity("*#*#2846579#*#*", "ProjectMenu", "Huawei"),

    // ONEPLUS
    SecretCodeEntity("*#808#", "Tests matériels", "OnePlus"),

    // TECHNIQUE
    SecretCodeEntity("*#*#232339#*#*", "Test WiFi", "Réseau"),
    SecretCodeEntity("*#*#2664#*#*", "Test écran tactile", "Matériel"),
    SecretCodeEntity("*#*#232331#*#*", "Test Bluetooth", "Matériel"),

    // DANGEREUX
    SecretCodeEntity("*#*#7780#*#*", "Reset paramètres", "Danger", isDangerous = true),
    SecretCodeEntity("*2767*3855#", "Factory reset complet", "Danger", isDangerous = true)
)
