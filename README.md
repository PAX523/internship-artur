[![Test](https://github.com/PAX523/internship-artur/actions/workflows/maven.yml/badge.svg)](https://github.com/PAX523/internship-artur/actions/workflows/maven.yml)

# Arturs Praktikum 2024

Arturs Code-Repository für sein Praktikum

## Vorbereitung

1. Installiere Java 17 JDK: https://developer.ibm.com/languages/java/semeru-runtimes/downloads/
    * Zur Kompilierung und Ausführung der zu entwickelnden Java-Applikation
1. Installiere Maven: https://maven.apache.org/download.cgi
    * Werkzeug zum Bauen und Verwalten der Projektabhängigkeiten (Dependencies)
1. Installiere Git Bash: https://gitforwindows.org/
    * Versioniertes Source-Code-Verwaltungssystem
1. Installiere eine IDE: https://www.jetbrains.com/
    * Integrierte Entwicklungsumgebung, die bei der Konstruktion der Java-Applikation ganzheitlich unterstützt
1. Zu setzende Umgebungsvariablen:
    * `HOME=%HOMEPATH%`
    * `JAVA_HOME=C:\Program Files\Java\`
    * `MAVEN_HOME=C:\Programme\maven`
    * `M3_HOME=%MAVEN_HOME%`
    * `PATH=...;%JAVA_HOME%\bin;%MAVEN_HOME%\bin;`

## Testen der Installation

1. In einem Verzeichnis Rechtsklick, "Open Git Bash here"
    * Ergebnis: Git Bash-Konsole öffnet sich
1. `java -version` ausführen
    * Ergebnis: Java wird ausgeführt und die installierte Version angezeigt
1. `mvn -version` ausführen
    * Ergebnis: Maven wird ausgeführt und die installierte Version angezeigt

## Code-Repository auschecken

1. SSH-Keys generieren und setzen
    * Git Bash öffnen, folgendes Kommando ausführen und Anweisungen befolgen (Passphrase kann weggelassen
      werden): `ssh-keygen -o`
    * Auf https://github.com/ einloggen, rechts oben Account-Bild, "Settings", "SSH and GPG keys", "New SSH key"
    * Im Benutzerverzeichnis auf dem Computer `.ssh/id_rsa.pub` öffnen (wichtig: Public Key), Inhalt kopieren und im
      Eingabefeld auf GitHub einfügen und speichern
1. https://github.com/PAX523/internship-artur aufsuchen und rechts oben auf den grünen Knopf "Code" klicken, SSH
   klicken, URL kopieren
1. Auf dem Computer in einem Verzeichnis, das später das Projektverzeichnis beinhalten soll, Rechtsklick, Git Bash
   öffnen
1. Projekt herunterladen mit (`<url>` mit kopierter URL ersetzen): `git clone <url>`
    * Ergebnis: Projekt wird erfolgreich heruntergeladen
1. IntelliJ starten und dort das heruntergeladene Projektverzeichnis öffnen
