# Exercicis d'arrays estàtics: del pseudocodi a Java

## Objectiu i coneixements previs

Practicar el disseny d'algorismes amb arrays unidimensionals i traduir-los a Java. Els exercicis introdueixen els arrays a partir dels continguts de les sessions 1 a 5: variables primitives, operadors, entrada i sortida per consola, condicionals i bucles.

En aquest document, **array estàtic** vol dir **array de mida fixa**: les caselles es creen al principi i la quantitat no canvia. No significa que calgui utilitzar la paraula clau `static` per declarar-lo.

Tots els exercicis tenen una mida indicada a l'enunciat; no cal demanar-la a l'usuari. La longitud queda fixada quan es crea l'array.

---

## Què es pot utilitzar?

- Variables `int`, `double` i `boolean`, i arrays unidimensionals d'`int`.
- Assignacions, operadors aritmètics, comparacions i operadors lògics.
- `Scanner` per llegir nombres.
- `System.out.print()` i `System.out.println()` per mostrar resultats.
- `if`, `else`, `for`, `while` i `do-while`.
- Declaració d'arrays, accés per índex i propietat `length`.

---

## Què queda fora d'aquesta pràctica?

No s'han d'utilitzar:

- Matrius.
- Arrays de text.
- Manipulació de `String`.
- `ArrayList` ni altres col·leccions.
- Mètodes propis.
- Recursivitat.
- Fitxers.
- Excepcions.
- Streams.

Tampoc es poden utilitzar funcions que resolguin directament operacions sobre arrays, com ara:

```java
Arrays.sort()
Arrays.toString()
Arrays.copyOf()
System.arraycopy()
clone()
```

Els recorreguts i els càlculs s'han de programar utilitzant bucles.

Cada exercici és un programa independent amb tot l'algorisme dins de `main`.

---

## Com s'ha de treballar cada exercici?

### 1. Anàlisi

Identifica:

- Les entrades.
- Les sortides.
- La mida dels arrays.
- Les variables auxiliars necessàries.

### 2. Pseudocodi

Escriu l'algorisme abans de programar:

- Inicialitza comptadors.
- Inicialitza acumuladors.
- Defineix els límits dels bucles.

### 3. Traça manual

Aplica l'algorisme a l'exemple proposat i anota almenys tres iteracions indicant:

| Índex | Valor consultat | Variables modificades |
| ------- | ------------------ | ----------------------- |
| ... | ... | ... |

### 4. Traducció a Java

Mantén la mateixa lògica del pseudocodi i accedeix a les caselles de l'array mitjançant índexs.

### 5. Comprovació

Executa:

- El cas d'exemple.
- Les proves addicionals.

Anota:

- Entrada.
- Resultat esperat.
- Resultat obtingut.

> Els exemples mostren el resultat que s'ha d'obtenir, però no una possible solució de l'algorisme.

---

## Convenis comuns

- Els índexs comencen a **0**.
- Un array de 5 elements té els índexs **0, 1, 2, 3 i 4**.
- En Java, `vector.length` indica el nombre de caselles.
- L'últim índex és `vector.length - 1`.

Totes les caselles s'han d'omplir abans de processar les dades.

No hi ha arrays buits en aquests exercicis.

Llevat que s'indiqui el contrari, les dades dels arrays seran enters compresos entre **-1000 i 1000**, ambdós inclosos.

Es pot suposar que l'usuari introdueix dades vàlides.

Només cal repetir una lectura per validar el rang quan l'enunciat ho demani explícitament (exercicis 8 i 12).

Una **posició** sempre correspon a un índex començant per 0.

Els arrays escrits entre claudàtors representen les dades introduïdes per teclat, en aquell ordre.

---

## Notació de pseudocodi

S'utilitzen índexs a partir de 0 per facilitar la traducció a Java.

| Pseudocodi | Equivalent en Java |
|------------|-------------------|
| DEFINIR dades COM ARRAY DE 5 ENTERS | `int[] dades = new int[5];` |
| LLEGIR dades[i] | `dades[i] = lector.nextInt();` |
| ESCRIURE dades[i] | `System.out.println(dades[i]);` |
| suma ← 0 | `int suma = 0;` |
| suma ← suma + dades[i] | `suma = suma + dades[i];` |
| PER i DES DE 0 FINS A 4 ... FI_PER | `for (int i = 0; i < dades.length; i++) { ... }` |
| SI condició ... SINÓ ... FI_SI | `if (condició) { ... } else { ... }` |
| MENTRE condició ... FI_MENTRE | `while (condició) { ... }` |

> En aquesta notació, **FINS A** inclou el límit final.

Per a recorreguts descendents:

```text
PER i DES DE 4 FINS A 0 PAS -1
```

Es poden utilitzar les comparacions:

```text
==
!=
<
<=
>
>=
```

I els operadors lògics:

```text
I
O
NO
```

---

# Exercici 05:3. Suma i mitjana

## Objectiu

Utilitzar un acumulador i evitar la divisió entera.

---

## Enunciat

Llegeix **5 enters** i desa'ls en un array de 5 caselles.

Després, recorre l'array per:

1. Calcular la suma de tots els elements.
2. Calcular la mitjana aritmètica.

La mitjana ha de conservar els decimals.

---

## Exemple

### Entrada

```text
[2, 4, 5, 7, 10]
```

### Sortida

```text
Suma: 28
Mitjana: 5.6
```

---

## Proves addicionals

### Cas 1

#### Entrada

```text
[0, 0, 0, 0, 0]
```

#### Resultat esperat

```text
Suma: 0
Mitjana: 0.0
```

---

### Cas 2

#### Entrada

```text
[-5, -4, -3, -2, -1]
```

#### Resultat esperat

```text
Suma: -15
Mitjana: -3.0
```

---

## Recordatori

En Java, dividir dos enters produeix una **divisió entera**:

```java
int resultat = 28 / 5;
System.out.println(resultat);
```

Sortida:

```text
5
```

Per obtenir una divisió decimal:

```java
double mitjana = suma * 1.0 / dades.length;
```

o bé:

```java
double mitjana = (double) suma / dades.length;
```

Resultat:

```text
5.6
```

### Pseudocodigo 

INICI

    suma ← 0

    // Lectura dels 5 enters
    PER i DES DE 0 FINS A 4
        LLEGIR dades[i]
    FI_PER

    // Acumulació de la suma
    PER i DES DE 0 FINS A 4
        suma ← suma + dades[i]
    FI_PER

    // Mitjana amb decimals (evita la divisió entera)
    mitjana ← suma * 1.0 / 5

    ESCRIURE "Suma: ", suma
    ESCRIURE "Mitjana: ", mitjana

FI
