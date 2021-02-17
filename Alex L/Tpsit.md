# Bash e Dos & Cmd
- Alex Pio Lefosse IV inf.

## Introduzione Bash

Chiunque abbia avuto a che fare con i sistemi Linux, in un modo o nell’altro, si è certamente imbattuto in un terminale e qualche riga di codice. Il software che ci consente di eseguire quel codice è una [shell](https://www.wikiwand.com/it/Shell_(informatica)), ed è in grado di interpretare i comandi permettendoci di gestire un intero sistema operativo. In questo articolo scopriremo quali sono le basi del cosiddetto [Shell script](https://www.wikiwand.com/en/Shell_script)**, e per farlo ci baseremo sulla shell Linux più diffusa, cioè **Bash**.

## La Bash?

Bash è una “Unix shell”, vale a dire un’interfaccia a linea (o riga) di comando che permette l’interazione con sistemi operativi derivati da Unix. È disponibile su gran parte dei sistemi operativi moderni di questo tipo, essendo la shell predefinita di molte distribuzioni GNU/Linux, nonchè di [MacOS](https://www.wikiwand.com/en/MacOS) X. È stata creata verso la fine degli anni ’80 da Brian Fox, un programmatore impiegato nella [Free Software Foundation](https://www.fsf.org/). Lo scopo era quello di fornire un software libero alternativo alla **Bourne shell**, in precedenza una delle principali shell per i sistemi GNU/Linux (di fatto la parola “Bash” è l’acronimo di **B**ourne-**A**gain **Sh**ell), incorporandone tutte le caratteristiche assieme ad alcune valide aggiunte, come l’aritmetica intera e la valutazione delle espressioni regolari.

## Shell Scripting?

In aggiunta alla modalità interattiva, che permette all’utente di eseguire un comando alla volta e ricevere il risultato in tempo reale (molto simile alla modalità interattiva di py), Bash (così come molte altre shell) ha la capacità di eseguire interi [script](https://www.wikiwand.com/it/Script) di comandi, conosciuti come “Bash shell script” (“[Bash script](https://www.wikiwand.com/en/Bash_(Unix_shell))”,“shell script” o più semplicemente “script”). Uno script può contenere una semplice lista di comandi o anche un singolo comando, così come funzioni, cicli, istruzioni condizionali, e tutti gli altri costrutti tipici della[ programmazione imperativa](https://www.wikiwand.com/en/Imperative_programming). In definitiva, un Bash shell script è un programma scritto nel linguaggio di programmazione Bash.

## Creazione di un Bash Shell Script /.sh
Okay ora che conosciamo più o meno le basi della terminologia, cerchiamo di entrare in azione e finalmente mettere mano sul lato progammazione, questo primo script che voglio farti vedere e analizzare non fa altro che stamparti a video la quantità di disco occupata da un determinato argomento. Per creare il nostro primo "file.sh" dobbiamo seguire una serie di istruzioni molto semplici e veloci. 
### Istruzioni
  - >Per prima cosa se non hai una distribuzione linux (Ubuntu,ParrotOS,Linux Mint ecc...) o [UNIX-like](https://www.wikiwand.com/en/Unix-like), ti invito a scaricarne una immediatamente. 

 - >Il prossimo passaggio è aprire un qualsiasi editor di testo, ad esempio `gedit`.

 - >Ora che sei dentro l'editor di testo ti basta scrivere al suo interno questa serie di istruzioni e salvare il file in `Documenti` con il nome `"primo.sh"`.

 ``` bash
 	#!/bin/bash
	echo "di quale file o directory desideri conoscere la dimensione?"
	read filedirectory
	du -hs $filedirectory
	exit 0
 ```
 
 -> Dopo aver scritto e salvato il tutto, possiamo dire che sei già a buon punto; la prossima cosa da fare è dare il permesso di esecuzione al nostro file, per farlo entra dentro la bash e scrivi le istruzioni che sto per darti.
 
 - >`sudo su`: che serve per assegnarti i permessi da aministratore.
 
 - >`cd Documenti:` per entrare dentro la directory Documenti dove è contenuto il nostro **"primo.sh"**.  
 
 - >`chmod +x primo.sh`: ora abbiamo finalmente dato il permesso di esecuzione al nostro primo "file.sh".
 
 - >`./primo.sh`: hai appena lanciato il tuo primo file.sh :) Congratulazioni

## Introduzione MS Dos & MS Windows e differenze

MS DOS e MS Windows sono sistemi operativi sviluppata dalla Microsoft Corporation. I nomi di entrambi i sistemi, "MS" è una forma abbreviata di Microsoft. "DOS" sta per sistema operativo su disco, mentre il nome "Windows" è un riferimento all'interfaccia del sistema operativo quest'ultima visualizzazione di schermate o windows. La differenza principale tra MS DOS e MS Windows è che il primo è un sistema operativo utilitaristico che non supporta il multitasking, mentre il secondo è un sistema operativo più avanzato, facile da usare che supporta il multitasking.

## Ms Dos & CMD 
Anche se il Prompt dei comandi in [Windows](https://www.wikiwand.com/en/Microsoft_Windows) appare e si comporta in modo apparentemente del tutto simile al vecchio [DOS](https://origin-production.wikiwand.com/en/DOS), in realtà bisogna comprendere che non è davvero il DOS originale.

Il prompt dei comandi è un ambiente simulato in stile DOS, ma si basa su Windows per caricare i suoi comandi. Il DOS caricava i programmi utilizzando una serie di [file batch](https://www.wikiwand.com/en/Batch_file) e programmi eseguibili che venivano digitati tramite l’uso della tastiera nella memoria del computer.

Questi comandi non sono però caricati nella memoria nel Prompt dei comandi. Si possono lanciare programmi dal [prompt dei comandi](https://www.wikiwand.com/en/Cmd.exe), ma in realtà tutto ciò che il prompt fa è caricare il programma in Windows per lanciarlo: si tratta in sostanza di una mera interfaccia grafica, non di una completa emulazione del vecchio sistema.

## Script eseguibili /.bat ed esempi
Il file batch viene eseguito dall'interprete dei comandi mandando in [esecuzione](https://it.wikipedia.org/wiki/Esecuzione_(informatica) "Esecuzione (informatica)") i comandi elencati nel file uno dopo l'altro, nello stesso ordine in cui compaiono nel file. Il concetto di file batch è analogo a quello di [shell script](https://it.wikipedia.org/wiki/Script "Script") per i sistemi [Unix](https://it.wikipedia.org/wiki/Unix "Unix") e infatti può essere considerato un rudimentale [linguaggio di scripting](https://it.wikipedia.org/wiki/Linguaggio_di_scripting "Linguaggio di scripting"), anche se i costrutti di [controllo di flusso](https://it.wikipedia.org/wiki/Controllo_di_flusso "Controllo di flusso") a disposizione sono veramente pochi: `if`, `for` e `goto`.

-> Example file.bat: 

```@echo off
title Matrix 
color 0a
mode 1000
goto Greeting
 
:Greeting 
cls 
echo Hello Apprendista
pause 
goto Matrix 


:Matrix
echo %random% 
goto Matrix
``` 

- >  *indicazione* -->`%random%` --> deve essere ripetuto più volte se si vuole riempire completamente la schermata.

Il codice appena descritto consiste nel replicare la famosa scena del film [Matrix](https://www.youtube.com/watch?v=u2oa5smqWHE&t=146s&ab_channel=Horvbali); come possiamo vedere le istruzioni sono molto semplici e intuibili. 
