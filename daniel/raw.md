# Scripting

> Daniel Falbo --- <danielfalbo@engineer.com>

## Introduzione

A nessuno piace svolgere **compiti noiosi e ripetitivi**. Mentre alcuni di questi compiti ancora necessitano di essere ripetuti manualmente, altri, sopratutto se ci sono **macchine** coinvolte, sono **automatizzabili**. Al giorno d'oggi, tra remote working e smart learning, molti di noi potrebbero **salvare tempo prezioso quotidianamente** automatizzando compiti che ripetutamente svolgono con i propri **computers**.

> 1. **Esercizio per il lettore**: _elenca almeno 3 procedure che svolgi quotidianamente con il tuo telefono o computer, pensa (anche solo intuitivamente, ignorando per ora l'implementazione pratica) a come potrebbero essere automatizzate e stima quanto tempo risparmieresti ogni giorno._

Se parliamo di programmatori, uno degli strumenti con il quale passano più del loro tempo è il terminale **[1]**. L'automatizzazione di comandi ripetuti al prompt di un terminale, è detta **shell scripting**, e consiste nel creare (ed eventualmente eseguire) file contenenti le istruzioni che si vogliono automatizzare e l'interprete che dovrebbe eseguire queste operazioni.

> 2. **Esercizio per il lettore programmatore**: _svolgi l'_ esercizio 1 _ma limitati ad elencare solo procedure ripetitive che svolgi nel tuo terminale o nel tuo IDE._

L'implementazione di questi **scripts** è leggermente differente in base al sistema operativo del computer sul quale si sta operando. Quando si tratta di shell scripting, possiamo dividere i sistemi operativi in 2 grandi categorie:

- i sistemi operativi **[UNIX-like](https://www.wikiwand.com/en/Unix-like)**, ispirati al sistema operativo [UNIX](https://www.wikiwand.com/en/Unix), come ad esempio [macOS](https://www.wikiwand.com/en/MacOS),
- e i sistemi operativi **DOS-like**, ispirati al **[DOS](https://www.wikiwand.com/en/DOS)**, come ad esempio [Windows](https://www.wikiwand.com/en/Microsoft_Windows).

---

**[1]** Bisogna fare distinzione tra i terminali e le shell: i terminali sono gli emulatori che permettono all'utente di visualizzare graficamente i messaggi e gli errori della shell ([stdout](<https://www.wikiwand.com/en/Standard_streams#/Standard_output_(stdout)>) ed [stderr](<https://www.wikiwand.com/en/Standard_streams#/Standard_error_(stderr)>) nei sistemi unix-like) e rispondere inviando altro testo ([stdin](<https://www.wikiwand.com/en/Standard_streams#/Standard_input_(stdin)>) nei sistemi unix-like), mentre le shell sono interfacce fra l'utente e i servizi del sistema operativo. [Questo articolo](https://github.com/labuladong/fucking-algorithm/blob/english/common_knowledge/linuxProcess.md) approfondisce riguardo stdin, stdout ed stderr con riferimenti al codice sorgente del kernel di linux.

## Sistemi UNIX-like

### Storicamente

Nel 1979 la [settima versione di unix](https://www.wikiwand.com/en/Version_7_Unix) fu rilasciata con, come shell predefinita, la [Bourne shell](https://www.wikiwand.com/en/Bourne_shell), spesso chiamata semplicemente "sh". Da quel giorno sh rimase una shell di riferimento per i sistemi unix-like e ancora oggi è inclusa in molti sistemi.

> 3. **Esercizio per il lettore**: se possiedi un computer con un sistema operativo unix-like, come macOS o tutte le distribuzioni linux, verifica se `sh` è presente nel tuo sistema eseguendo `which sh` nel terminale (se vuoi, puoi leggere il manuale di istruzioni del comando `which` lanciando `man which`).

La Bourne shell è una shell molto semplice, basilare. Tra i comandi disponibili **[2]** abbiamo `cd`, che prende come argomento il percorso di una directory e si sposta in quella directory, `pwd`, che stampa a video il percorso completo della directory corrente, `echo`, che stampa a video tutti gli argomenti che riceve, ma anche blocchi condizionali come i `while`, i `for` loops o gli `if ; then` statements.

Nei sistemi unix-like, in genere gli script iniziano con una linea che contiene un asterisco (hashtag), un punto esclamativo (bang) e il percorso all'interprete dello script, chiamata comunemente [shebang line](<https://www.wikiwand.com/en/Shebang_(Unix)>). Per convenzione, su tutti i sistemi unix-like il percorso della bourne shell è `/bin/sh`, quindi la prima riga di un nostro shell script sarebbe

```sh
#! /bin/sh
```

mentre per altri interpreti dei quali non siamo sicuri del percorso, si utilizza

```sh
#! /usr/bin/env <interprete>
```

assumendo che `env` sia in `/usr/bin/` come da convenzione.

> 4. **Esercizio per il lettore**: come mai? Utilizza `man env` per capire cos'è `env` e perchè utilizzare `#! /usr/bin/env <interprete>` come shebang line ha senso.

Anche se nel caso della sh l'`#` corrisponde al carattere che inizia i commenti, la shebang line è valida e non comporta problemi neanche per i linguaggi dove i commenti non iniziano per `#` finchè è esattamente la prima linea del file.

Tra le migliaia di linee di codice del kernel di linux, open-source e disponible all'indirizzo github.com/torvalds/linux, possiamo osservare che [la prima linea di codice](https://github.com/torvalds/linux/blob/e0756cfc7d7cd08c98a53b6009c091a3f6a50be6/fs/binfmt_script.c#L41) eseguita quando viene caricato uno script

```c
if ((bprm->buf[0] != '#') || (bprm->buf[1] != '!'))
    return -ENOEXEC;
```

controlla i primi due byte, o caratteri del file e si assicura che il primo non sia diverso da `'#'` ed il secondo non sia diverso da `'!'`.

### Scripting moderno

In realtà con l'esercizio 3 ho mentito: anche se `which sh` mostra con successo il percorso che porta ad `sh` sulla tua macchina, probabilmente non hai la vera `sh`. È comune infatti al giorno d'oggi rimpiazzare `sh` con un collegamento ad una shell più moderna ma retrocompatibile, come la [Bourne again shell](<https://www.wikiwand.com/en/Bash_(Unix_shell)>) ("shell rinata"), spesso chiamata semplicemente "bash".

<!-- TODO: scriviamo ed eseguiamo insieme il nostro primo script -->

<!-- TODO: a differenza della bash e della zsh, python è un buon linguaggio di scripting ma utilizzarlo come login shell porterebbe a delle restrinzioni e/o complicazioni -->

---

**[2]** Per i più curiosi, il comando `help` stampa a video tutti i comandi built-in ed il comando `man` prende come argomento un altro comando e stampa a video il manuale delle istruzioni di quel comando (ad esempio `man echo` stampa a video le istruzioni del comando `echo`).
