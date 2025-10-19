Badge status: [![CI Pipeline for QA Final Project (Tema 3)](https://github.com/DeathArrow3/qa-final-project-java/actions/workflows/ci.yml/badge.svg)](https://github.com/DeathArrow3/qa-final-project-java/actions/workflows/ci.yml)

Scopul acestui proiect a fost de a verifica un endpoint al unui API folosindu-ne de un pipeline configurat de noi si de Docker

Pentru a rula testele local trebuie sa ne asiguram ca avem Java si Maven instalate, iar apoi deschidem un CMD Terminal in folderul proiectului si rulam comanda mvn test.

Din folderul proiectului deschidem un terminal PowerShell si rulam comenzile:

docker build -t qa-final-proiect-java .

docker run --rm qa-final-proiect-java