# Exercici 1. Desar i mostrar cinc nombres

**Objectiu:** declarar un array, omplir-lo i distingir índex i valor.

## Anàlisi

L'entrada són 5 enters que es llegeixen per teclat i es desen en un array de 5 caselles, amb índexs del 0 al 4. La mida és fixa i no es demana a l'usuari. La sortida té dues parts: primer, cada casella mostrada amb el seu índex i el seu valor, i després tres dades finals, que són la longitud de l'array, el primer valor i l'últim valor.

Aquest exercici serveix per entendre la diferència entre dues idees que sovint es confonen. L'índex és la posició de la casella i sempre comença a 0, mentre que el valor és el nombre que hi ha guardat a dins. Per exemple, a la casella amb índex 3 pot haver-hi el valor 12. Per això, quan es mostra cada línia, s'escriuen les dues coses separades, com a `3: 12`.

No calen acumuladors ni comptadors, perquè només es guarda i es mostra. Només cal una variable `longitud` per a la mida de l'array. El programa té dues fases ben separades: primer es llegeixen i es desen les cinc dades, i després, amb un segon bucle, es recorre l'array per mostrar-lo. L'enunciat demana expressament que la lectura acabi del tot abans de mostrar res.

## Pseudocodi

```
INICI
    dades ← ARRAY DE 5 ENTERS
    longitud ← 5

    escriure("Introdueix 5 enters:")

    PER i DES DE 0 FINS A 4
        escriure("Enter de la posició ", i, ":")
        llegir(dades[i])
    FI_PER

    escriure("Contingut de l'array:")

    PER i DES DE 0 FINS A 4
        escriure(i, ":", dades[i])
    FI_PER

    escriure("Longitud:", longitud)
    escriure("Primer valor:", dades[0])
    escriure("Últim valor:", dades[longitud - 1])
FINAL
```

## Explicació

El programa comença definint l'array de 5 caselles i guardant la seva mida a la variable `longitud`. Després, un primer bucle `PER` va de la posició 0 a la 4 i, a cada volta, demana un enter i el desa a la casella corresponent. El límit és 4 perquè `FINS A` inclou l'últim valor i un array de 5 caselles té índexs del 0 al 4.

Quan el primer bucle ha acabat, totes les caselles ja estan omplertes. Llavors un segon bucle, independent del primer, recorre l'array de nou i mostra a cada volta l'índex `i` seguit del valor `dades[i]`. Fer-ho en dos bucles separats és el que demana l'enunciat i també és una bona pràctica: primer es recullen totes les dades i només després es processen.

Per acabar, es mostren tres dades. La longitud és 5, el primer valor és el de la casella 0 i l'últim valor és el de la casella `longitud - 1`, és a dir, la 4. Aquest càlcul és important perquè l'últim índex d'un array sempre és una unitat menys que la seva longitud: accedir a `dades[longitud]` seria un error, perquè la casella 5 no existeix.

## Traça manual

Cas d'exemple: `[8, -3, 0, 12, 5]`. Durant la lectura, cada valor s'escriu a la casella indicada, i després el segon bucle les mostra una a una.

| Iteració | Índex i | Valor consultat | Línia mostrada |
|---|---|---|---|
| 1 | 0 | 8 | `0: 8` |
| 2 | 1 | -3 | `1: -3` |
| 3 | 2 | 0 | `2: 0` |
| 4 | 3 | 12 | `3: 12` |
| 5 | 4 | 5 | `4: 5` |

Un cop acabat el recorregut, el programa escriu la longitud, que és 5, el primer valor, que és `dades[0] = 8`, i l'últim valor, que és `dades[longitud - 1] = dades[4] = 5`. Tot coincideix amb la sortida de l'exemple de l'enunciat.

## Comprovació

| Prova | Entrada | Resultat esperat | Resultat obtingut |
|---|---|---|---|
| Exemple | 8, -3, 0, 12, 5 | `0: 8`, `1: -3`, `2: 0`, `3: 12`, `4: 5`. Longitud 5, primer 8, últim 5 | `0: 8`, `1: -3`, `2: 0`, `3: 12`, `4: 5`. Longitud 5, primer 8, últim 5 |
| Cinc zeros | 0, 0, 0, 0, 0 | `0: 0`, `1: 0`, `2: 0`, `3: 0`, `4: 0`. Longitud 5, primer 0, últim 0 | `0: 0`, `1: 0`, `2: 0`, `3: 0`, `4: 0`. Longitud 5, primer 0, últim 0 |
| Cinc valors 7 | 7, 7, 7, 7, 7 | `0: 7`, `1: 7`, `2: 7`, `3: 7`, `4: 7`. Longitud 5, primer 7, últim 7 | `0: 7`, `1: 7`, `2: 7`, `3: 7`, `4: 7`. Longitud 5, primer 7, últim 7 |

En les dues proves amb valors repetits es mostren igualment cinc índexs diferents, del 0 al 4. Això demostra que l'índex i el valor són coses independents: els valors poden coincidir, però cada casella té sempre la seva pròpia posició.