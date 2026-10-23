
# Exercicis d'arrays estàtics: del pseudocodi a Java (BLOQUE 06)
Alumno: Sergi Cruceta 

## Objectiu i coneixements previs

Practicar el disseny d'algorismes amb arrays unidimensionals i traduir-los a Java. Els exercicis introdueixen els arrays a partir dels continguts de les sessions 1 a 5: variables primitives, operadors, entrada i sortida per consola, condicionals i bucles.

En aquest document, **array estàtic** vol dir **array de mida fixa**: les caselles es creen al principi i la quantitat no canvia. No significa que calgui utilitzar la paraula clau `static` per declarar-lo. Tots els exercicis tenen una mida indicada a l'enunciat; no cal demanar-la a l'usuari. La longitud queda fixada quan es crea l'array, tal com explica la [documentació oficial de Java sobre arrays](https://dev.java/learn/language/constructs/basics/arrays/).

### Què es pot utilitzar?

- Variables `int`, `double` i `boolean`, i arrays unidimensionals d'`int`.
- Assignacions, operadors aritmètics, comparacions i operadors lògics.
- `Scanner` per llegir nombres i `System.out.print` / `println` per mostrar resultats.
- `if`, `else`, `for`, `while` i `do-while`.
- Declaració d'arrays, accés per índex i propietat `length`.

### Què queda fora d'aquesta pràctica?

No s'han d'utilitzar matrius, arrays de text, manipulació de `String`, `ArrayList`, altres col·leccions, mètodes propis, recursivitat, fitxers, excepcions ni streams. Tampoc funcions que resolguin les operacions sobre arrays, com ara `Arrays.sort`, `Arrays.toString`, `Arrays.copyOf`, `System.arraycopy` o `clone`. Els recorreguts i els càlculs s'han de programar amb bucles.

Cada exercici és un programa independent amb tot l'algorisme dins de `main`. La capçalera habitual `public static void main(String[] args)`, els missatges de text i les crides bàsiques de lectura i escriptura són infraestructura ja coneguda; no es demana estudiar mètodes ni treballar el contingut de cadenes.

## Com s'ha de treballar cada exercici?

1. **Anàlisi:** identifica les entrades, les sortides, la mida dels arrays i les variables auxiliars.
2. **Pseudocodi:** escriu l'algorisme abans de programar, amb la inicialització de comptadors i acumuladors i els límits dels bucles.
3. **Traça manual:** aplica'l al cas d'exemple i anota almenys tres iteracions en una taula amb l'índex, el valor consultat i les variables que canvien.
4. **Traducció a Java:** conserva la lògica del pseudocodi i utilitza bucles amb índex per accedir a les caselles.
5. **Comprovació:** executa el cas d'exemple i les proves addicionals indicades. Anota l'entrada, el resultat esperat i el resultat obtingut.

Els exemples mostren els resultats que cal obtenir, no una solució de l'algorisme. No cal reproduir exactament els textos ni imprimir claudàtors i comes: els arrays es poden mostrar amb un valor per línia o separats per espais.

### Convenis comuns

- Els índexs comencen a **0**. Un array de 5 elements té índexs de **0 a 4**.
- En Java, `vector.length` és el nombre de caselles i s'escriu **sense parèntesis**. L'últim índex és `vector.length - 1`. Aquests convenis es descriuen al [tutorial d'Oracle sobre arrays](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html).
- Totes les caselles s'han d'omplir abans de processar les dades. No hi ha arrays buits en aquests exercicis.
- Llevat que s'indiqui un altre interval, les dades dels arrays seran enters entre **-1000 i 1000**, inclosos. Es pot suposar que l'usuari respecta aquest interval i introdueix dades numèriques del tipus demanat.
- Només cal repetir una lectura per validar-ne el rang quan l'enunciat ho demani explícitament: exercicis 8 i 12. No cal gestionar entrades de text.
- Una posició sempre significa un índex començant per 0, també quan es mostra per pantalla.
- Els arrays escrits entre claudàtors als exemples representen les dades que s'introdueixen per teclat, en aquell ordre.

### Notació de pseudocodi

Utilitza índexs des de 0 també al pseudocodi, per facilitar la traducció.

| Pseudocodi | Significat o equivalent en Java |
| --- | --- |
| `DEFINIR dades COM ARRAY DE 5 ENTERS` | `int[] dades = new int[5];` |
| `LLEGIR dades[i]` | `dades[i] = lector.nextInt();` |
| `ESCRIURE dades[i]` | `System.out.println(dades[i]);` |
| `suma ← 0` | `int suma = 0;` si es declara aquí |
| `suma ← suma + dades[i]` | `suma = suma + dades[i];` |
| `PER i DES DE 0 FINS A 4 ... FI_PER` | `for (int i = 0; i < dades.length; i++) { ... }` per a aquest array |
| `SI condició ... SINÓ ... FI_SI` | `if (condició) { ... } else { ... }` |
| `MENTRE condició ... FI_MENTRE` | `while (condició) { ... }` |

En aquesta notació, `FINS A` inclou el límit final. Per a un recorregut descendent, indica `PAS -1`. Pots expressar les comparacions amb `==`, `!=`, `<`, `<=`, `>` i `>=`, i les combinacions lògiques amb `I`, `O` i `NO`.

## Exercicis

### 1. Desar i mostrar cinc nombres

**Objectiu:** declarar un array, omplir-lo i distingir índex i valor.

Llegeix 5 enters i desa'ls en un array de 5 caselles. Quan hagis acabat de llegir-los tots, recorre l'array amb un altre bucle i mostra cada índex amb el valor corresponent. Finalment, mostra la longitud de l'array, el primer valor i l'últim.

**Exemple**

- Entrada: `[8, -3, 0, 12, 5]`.
- Sortida: `0: 8`, `1: -3`, `2: 0`, `3: 12`, `4: 5`.
- Longitud: `5`. Primer valor: `8`. Últim valor: `5`.

**Proves addicionals:** cinc zeros; cinc valors iguals a `7`. En tots dos casos s'han de mostrar cinc índexs diferents, encara que els valors es repeteixin.

### 2. Llegir en un ordre i mostrar en l'ordre contrari

**Objectiu:** fer un recorregut descendent sense modificar dades.

Llegeix 6 enters i desa'ls en un array de 6 caselles. Mostra'ls des de l'última casella fins a la primera. Després torna'ls a mostrar en l'ordre original per comprovar que el contingut no ha canviat. Utilitza un únic array.

**Exemple**

- Entrada: `[4, 9, -2, 0, 7, 1]`.
- Recorregut invers: `[1, 7, 0, -2, 9, 4]`.
- Recorregut original posterior: `[4, 9, -2, 0, 7, 1]`.

**Proves addicionals:** `[1, 2, 3, 4, 5, 6]`; sis valors iguals. Revisa especialment els índexs inicial i final del bucle descendent.

### 3. Suma i mitjana

**Objectiu:** utilitzar un acumulador i evitar la divisió entera.

Llegeix 5 enters i desa'ls en un array de 5 caselles. Després, recorre l'array per calcular la suma i la mitjana aritmètica. La mitjana ha de conservar els decimals.

**Exemple**

- Entrada: `[2, 4, 5, 7, 10]`.
- Suma: `28`.
- Mitjana: `5.6`.

**Proves addicionals:** cinc zeros, amb suma i mitjana `0`; `[-5, -4, -3, -2, -1]`, amb suma `-15` i mitjana `-3.0`.

**Recordatori:** en Java, dividir dos enters produeix una divisió entera. Pots fer que el càlcul sigui decimal amb `suma * 1.0 / dades.length`.

### 4. Positius, negatius i zeros

**Objectiu:** combinar un recorregut amb condicionals i comptadors.

Llegeix 8 enters i desa'ls en un array de 8 caselles. En un recorregut posterior, compta quants són positius, quants són negatius i quants són zero. Mostra els tres recomptes.

**Exemple**

- Entrada: `[3, -1, 0, 8, -4, 0, 2, -7]`.
- Positius: `3`. Negatius: `3`. Zeros: `2`.

**Proves addicionals:** vuit zeros; vuit nombres negatius. La suma dels tres comptadors ha de ser sempre `8`. El zero té la seva pròpia categoria.

### 5. Màxim, mínim i primera posició

**Objectiu:** conservar un valor extrem i l'índex on s'ha trobat.

Llegeix 7 enters i desa'ls en un array de 7 caselles. Troba el valor màxim i el mínim, i mostra també l'índex de cadascun. Si un extrem apareix diverses vegades, mostra **la primera posició** on apareix.

**Exemple**

- Entrada: `[-4, 9, 2, 9, -6, 3, -6]`.
- Màxim: `9`, a l'índex `1`.
- Mínim: `-6`, a l'índex `4`.

**Proves addicionals:** `[-8, -3, -10, -1, -5, -6, -2]`, amb màxim `-1` a l'índex `3` i mínim `-10` a l'índex `2`; set valors iguals a `4`, amb tots dos extrems a l'índex `0`.

**Pregunta per al pseudocodi:** per què inicialitzar el màxim a `0` no serviria si tots els nombres fossin negatius?

### 6. Cercar la primera coincidència

**Objectiu:** implementar una cerca lineal i representar que un valor no s'ha trobat.

Llegeix 8 enters en un array de 8 caselles. Després llegeix un altre enter: el valor que vols cercar. Mostra l'índex de la primera coincidència. Si no hi és, mostra `No trobat`. No ordenis ni modifiquis l'array.

**Exemple**

- Array: `[5, 2, 8, 2, 0, -1, 7, 2]`. Valor cercat: `2`.
- Resultat: índex `1`.

**Proves addicionals amb el mateix array:** cercar `5` dona `0`; cercar `7` dona `6`; cercar `99` dona `No trobat`.

**Recordatori:** `-1` pot representar una posició no trobada perquè no és un índex vàlid. No s'ha d'utilitzar per accedir a l'array.

### 7. Comptar totes les aparicions

**Objectiu:** distingir trobar la primera coincidència de processar-les totes.

Llegeix 8 enters en un array de 8 caselles i, després, un valor que vols comptar. Mostra tots els índexs on apareix i el nombre total d'aparicions. Si no apareix, mostra un total de `0` i el missatge `Cap coincidència`. No cal guardar els índexs en un altre array.

**Exemple**

- Array: `[4, 1, 4, 0, 4, 2, 3, 4]`. Valor a comptar: `4`.
- Índexs: `0, 2, 4, 7`. Total: `4`.

**Proves addicionals amb el mateix array:** comptar `9` dona total `0`; comptar `0` dona només l'índex `3` i total `1`. Prova també un array amb vuit valors iguals al valor cercat: el total ha de ser `8`.

### 8. Modificar una casella amb un índex vàlid

**Objectiu:** comprovar els límits abans d'accedir a una casella.

Llegeix 5 enters en un array de 5 caselles. Demana l'índex de la casella que es vol modificar. Si és menor que `0` o més gran o igual que la longitud, mostra `Índex no vàlid` i torna a demanar-lo fins que sigui correcte. Només llavors demana el nou valor, modifica aquella casella i mostra l'array complet.

**Exemple**

- Array inicial: `[10, 20, 30, 40, 50]`.
- Índexs introduïts successivament: `-1`, `5`, `2`.
- Els dos primers es rebutgen. Per a l'índex `2`, s'introdueix el nou valor `99`.
- Array final: `[10, 20, 99, 40, 50]`.

**Proves addicionals:** modificar l'índex `0`; modificar l'índex `4`. Comprova que en cada cas només canvia la casella seleccionada.

### 9. Copiar i transformar sense perdre l'original

**Objectiu:** copiar elements entre dos arrays diferents.

Llegeix 5 enters en un array `original`. Crea un segon array `copia` de 5 caselles i copia-hi els elements amb un bucle. Després, en un altre recorregut, multiplica per `2` cada element de `copia`. Mostra els dos arrays: `original` ha de conservar les dades llegides.

**Exemple**

- Entrada: `[1, -2, 0, 4, 5]`.
- `original` al final: `[1, -2, 0, 4, 5]`.
- `copia` al final: `[2, -4, 0, 8, 10]`.

**Proves addicionals:** cinc zeros; `[1000, -1000, 1, -1, 0]`, amb còpia final `[2000, -2000, 2, -2, 0]`.

**Recordatori:** `copia = original` no copia les caselles: fa que les dues variables es refereixin al mateix array. Per a aquest exercici, crea els dos arrays amb `new` i copia els valors un a un.

### 10. Sumar dos arrays casella a casella

**Objectiu:** relacionar elements de diversos arrays mitjançant un mateix índex.

Llegeix 5 enters en un array `a` i, després, 5 enters en un array `b`. Crea un tercer array `resultat`, també de 5 caselles. Cada casella de `resultat` ha de contenir la suma dels valors de `a` i `b` que tenen aquell mateix índex. Mostra els tres arrays sense modificar els dos primers.

**Exemple**

- `a`: `[1, 2, 3, 4, 5]`.
- `b`: `[5, -2, 0, 6, 1]`.
- `resultat`: `[6, 0, 3, 10, 6]`.

**Proves addicionals:** un dels arrays conté només zeros, de manera que el resultat coincideix amb l'altre; els valors de `b` són els oposats dels de `a`, de manera que el resultat conté només zeros.

### 11. Invertir el contingut de l'array

**Objectiu:** intercanviar valors utilitzant una variable auxiliar.

Llegeix 7 enters en un array de 7 caselles. Modifica aquest mateix array perquè els valors quedin en l'ordre contrari: el primer passa a ser l'últim, el segon passa a ser el penúltim, etc. Mostra el contingut final recorrent-lo des de l'índex `0` fins a l'últim.

Utilitza un únic array i una variable auxiliar per als intercanvis. No n'hi ha prou amb imprimir-lo al revés com a l'exercici 2: han de canviar els valors de les caselles.

**Exemple**

- Entrada: `[1, 2, 3, 4, 5, 6, 7]`.
- Contingut final: `[7, 6, 5, 4, 3, 2, 1]`.

**Proves addicionals:** `[2, 4, 6, 8, 6, 4, 2]` queda igual; `[-3, 0, 5, 2, -1, 8, 4]` passa a `[4, 8, -1, 2, 5, 0, -3]`.

**Preguntes per al pseudocodi:** què passa amb la casella central? Què passaria si continuessis intercanviant després d'arribar a la meitat?

### 12. Informe de notes del grup

**Objectiu:** combinar validació, emmagatzematge, acumulació, comparació i recompte.

Llegeix les notes enteres de 10 alumnes i desa-les en un array de 10 caselles. Cada nota ha d'estar entre `0` i `10`, inclosos. Si una nota és fora de rang, mostra `Nota no vàlida` i repeteix la lectura **per al mateix alumne**. Una nota rebutjada no ha d'ocupar cap casella ni fer avançar a l'alumne següent.

Quan s'hagin desat les 10 notes vàlides, recorre l'array i mostra:

- La mitjana del grup amb decimals.
- El nombre d'aprovats, amb nota més gran o igual que `5`, i de suspesos.
- La nota màxima i la mínima.
- Els índexs dels alumnes amb nota **estrictament superior** a la mitjana. Si no n'hi ha cap, mostra `Cap nota supera la mitjana`.

Cada alumne s'identifica pel seu índex, de `0` a `9`; no cal demanar noms. Pots fer diversos recorreguts: la mitjana ha d'estar calculada abans de comparar-hi les notes.

**Exemple**

- Notes vàlides: `[4, 5, 7, 8, 3, 10, 6, 5, 2, 10]`.
- Mitjana: `6.0`.
- Aprovats: `7`. Suspesos: `3`.
- Màxim: `10`. Mínim: `2`.
- Índexs amb nota superior a la mitjana: `2, 3, 5, 9`. La nota `6` no s'hi inclou perquè és igual a la mitjana.

**Proves addicionals:** deu notes iguals a `5` donen mitjana `5.0`, deu aprovats i cap nota superior a la mitjana; deu zeros donen deu suspesos. Introdueix també `-1`, després `11` i després `7` per al primer alumne: només el `7` s'ha de desar a l'índex `0` i encara han de faltar nou notes vàlides.

## Revisió abans de lliurar

- El pseudocodi i el programa resolen el mateix problema i utilitzen les mides indicades.
- La traça mostra com evolucionen els índexs i les variables auxiliars.
- Els bucles no accedeixen a índexs negatius ni a l'índex `length`.
- Els acumuladors i comptadors s'inicialitzen abans del recorregut que els utilitza.
- Els màxims i mínims funcionen amb nombres negatius i amb valors repetits.
- Les cerques contemplen el cas de cap coincidència.
- Les mitjanes conserven els decimals.
- S'han executat els casos d'exemple i les proves addicionals.
- La solució només utilitza els continguts permesos d'aquesta pràctica.

## Material de referència

- [Sessió 1: variables primitives](../01_Java_Introduccio/01_02_Java_Variables_Primitives/readme.md).
- [Sessió 2: operadors](../02_Java_Operadors_Logics_Aritmetics/readme.md).
- [Sessió 3: entrada i sortida](../03_Java_Input_Output/readme.md).
- [Sessió 4: condicionals](../04_Java_Condicionals/readme.md).
- [Sessió 5: iteracions](../05_Java_Interacions/README.md).
- [06_01: operacions bàsiques amb arrays](06_01_Arrays_Operacions_Basiques/README.md).
- [06_02: cerca i operacions amb arrays](06_02_Arrays_Cerca_Operacions/README.md).

Els apunts de `06_01` i `06_02` també contenen exemples amb cadenes, mètodes i altres ampliacions. Per a aquesta pràctica només cal consultar-hi declaració, índexs, recorreguts, modificació, suma, cerca, màxim, mínim, mitjana i recompte.

Les fonts oficials enllaçades més amunt s'han consultat el 22 d'octubre de 2026 per contrastar mida fixa, índexs i `length`. Inclouen apartats avançats que no formen part dels requisits d'aquests exercicis. Els enunciats i els casos de prova s'han elaborat per a aquesta pràctica.
