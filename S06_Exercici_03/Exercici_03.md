# Exercici 3. Suma i mitjana

**Objectiu:** utilitzar un acumulador i evitar la divisió entera.

## Anàlisi

L'entrada són 5 enters que es llegeixen per teclat i es desen en un array de 5 caselles, amb índexs del 0 al 4. La mida és fixa i no es demana a l'usuari. La sortida són dues dades: la suma de tots els valors i la mitjana aritmètica, que ha de conservar els decimals.

Calen dues variables auxiliars. La primera és `suma`, de tipus enter, que fa de acumulador i val 0 abans de començar. La segona és `mitjana`, de tipus decimal (`double`), perquè el resultat d'una mitjana no sempre és un enter. Escollir bé aquests tipus és el centre de l'exercici: si la mitjana es guardés en un enter, es perdrien els decimals.

El programa té dues fases. Primer, un recorregut per llegir i desar les cinc dades. Després, un segon recorregut en què l'acumulador va sumant el valor de cada casella. Un cop acabat el bucle, la mitjana es calcula una sola vegada, dividint la suma entre el nombre de caselles.

## Pseudocodi

```
INICI
    dades ← ARRAY DE 5 ENTERS
    suma ← 0
 
    escriure("Introdueix 5 enters:")
 
    PER i DES DE 0 FINS A 4
        escriure("Enter de la posició ", i, ":")
        llegir(dades[i])
    FI_PER
 
    PER i DES DE 0 FINS A 4
        suma ← suma + dades[i]
    FI_PER
 
    mitjana ← suma * 1.0 / 5
 
    escriure("Suma:", suma)
    escriure("Mitjana:", mitjana)
FINAL
```

## Explicació

El programa comença definint l'array de 5 caselles i inicialitzant l'acumulador `suma` a 0. Això és important perquè l'acumulador ha de començar en un valor neutre per a la suma, i ha d'estar fora del bucle: si es posés a zero dins, es perdria el que s'ha acumulat a cada volta. Un primer bucle de la posició 0 a la 4 llegeix les cinc dades. El límit és 4 perquè `FINS A` inclou l'últim valor i un array de 5 caselles té índexs del 0 al 4.

El segon bucle és el recorregut que fa la suma. A cada volta, l'acumulador es renova amb la instrucció `suma ← suma + dades[i]`, que vol dir «el nou valor de la suma és l'antic més el contingut de la casella actual». Quan el bucle acaba, `suma` conté el total de tots els valors.

La mitjana es calcula fora del bucle amb `suma * 1.0 / 5`. El factor `1.0` és el que converteix el càlcul en decimal. Sense ell, dividir dos enters faria una divisió entera, que descarta la part decimal. Per exemple, `28 / 5` donaria `5` en lloc de `5.6`. En multiplicar primer per `1.0`, la suma passa a ser decimal i la divisió posterior també ho és. En Java, el nombre de caselles es pot escriure com `dades.length`, que dona el mateix resultat que el 5 del pseudocodi.

## Traça manual

Cas d'exemple: `[2, 4, 5, 7, 10]`. Abans del bucle de la suma, `suma = 0`.

| Iteració | Índex i | Valor consultat | Suma abans | Suma després |
|---|---|---|---|---|
| 1 | 0 | 2 | 0 | 2 |
| 2 | 1 | 4 | 2 | 6 |
| 3 | 2 | 5 | 6 | 11 |
| 4 | 3 | 7 | 11 | 18 |
| 5 | 4 | 10 | 18 | 28 |

En acabar el bucle, `suma = 28`. Després es calcula la mitjana: `28 * 1.0 / 5 = 28.0 / 5 = 5.6`. Això coincideix amb l'exemple de l'enunciat. Si s'hagués fet una divisió entera, `28 / 5` hauria donat `5`, i s'haurien perdut els `0.6`.

## Comprovació

| Prova | Entrada | Resultat esperat | Resultat obtingut |
|---|---|---|---|
| Exemple | 2, 4, 5, 7, 10 | Suma 28, mitjana 5.6 | Suma 28, mitjana 5.6 |
| Cinc zeros | 0, 0, 0, 0, 0 | Suma 0, mitjana 0 | Suma 0, mitjana 0.0 |
| Tots negatius | -5, -4, -3, -2, -1 | Suma -15, mitjana -3.0 | Suma -15, mitjana -3.0 |

En la prova dels cinc zeros, Java mostra la mitjana com `0.0` perquè és un nombre decimal, que és el mateix valor que `0` de l'enunciat. La prova dels negatius comprova que l'acumulador funciona igual amb valors negatius: les sumes parcials van baixant fins a `-15`, i dividir-lo entre 5 dona exactament `-3.0`.
 