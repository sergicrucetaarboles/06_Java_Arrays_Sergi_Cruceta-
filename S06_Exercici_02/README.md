# Exercici 2. Llegir en un ordre i mostrar en l'ordre contrari

**Objectiu:** fer un recorregut descendent sense modificar dades.

## Anàlisi

L'entrada són 6 enters que es llegeixen per teclat i es desen en un únic array de 6 caselles, amb índexs del 0 al 5. La mida és fixa i no es demana a l'usuari. La sortida són dues llistes dels mateixos valors: primer en ordre invers, de l'última casella a la primera, i després en l'ordre original, per comprovar que el contingut no ha canviat.

L'enunciat remarca que s'ha d'utilitzar un únic array. Això vol dir que no es crea un segon array amb els valors girats ni es canvien de lloc els elements de l'original. Invertir l'ordre en pantalla no requereix modificar res: només cal recórrer les mateixes caselles en sentit contrari. No calen comptadors ni acumuladors; només l'índex del bucle.

El programa té tres fases: primer, un recorregut ascendent per llegir i desar les sis dades; després, un recorregut descendent per mostrar-les al revés; i finalment, un recorregut ascendent per mostrar-les en l'ordre original. Com que cap d'aquests recorreguts escriu a l'array, després del recorregut descendent el contingut és exactament el mateix que abans.

## Pseudocodi

```
INICI
    dades ← ARRAY DE 6 ENTERS
 
    escriure("Introdueix 6 enters:")
 
    PER i DES DE 0 FINS A 5
        escriure("Enter de la posició ", i, ":")
        llegir(dades[i])
    FI_PER
 
    escriure("Ordre invers:")
 
    PER i DES DE 5 FINS A 0 PAS -1
        escriure(dades[i])
    FI_PER
 
    escriure("Ordre original:")
 
    PER i DES DE 0 FINS A 5
        escriure(dades[i])
    FI_PER
FINAL
```

## Explicació

El programa comença definint l'array de 6 caselles. Un primer bucle ascendent, de la posició 0 a la 5, demana cada enter i el desa a la seva casella. El límit és 5 perquè `FINS A` inclou l'últim valor i un array de 6 caselles té índexs del 0 al 5.

El segon bucle és el recorregut descendent, i és el punt més important de l'exercici. Comença a l'índex 5, que és l'última casella, i acaba a l'índex 0, que és la primera. El `PAS -1` indica que a cada volta l'índex baixa una unitat en lloc de pujar. Com que `FINS A` inclou el límit final, el bucle arriba a processar la casella 0.

El tercer bucle torna a recórrer l'array en l'ordre normal, de 0 a 5, per mostrar que els valors continuen igual que al principi. Això demostra que el recorregut descendent només ha consultat les dades i no les ha modificat.

### Revisió dels límits del bucle descendent

L'enunciat demana revisar especialment els índexs inicial i final, perquè són el lloc on és més fàcil equivocar-se. L'índex inicial ha de ser 5, és a dir, `longitud - 1`. Si es comencés a 6, el programa intentaria accedir a una casella que no existeix i en Java produiria un error d'índex fora de rang. L'índex final ha de ser 0, i ha d'estar inclòs. Si el bucle s'aturés a 1, la primera casella quedaria sense mostrar, i només es veurien cinc valors en lloc de sis. En Java això es tradueix en una condició `i >= 0`, i no `i > 0`.

## Traça manual

Cas d'exemple: `[4, 9, -2, 0, 7, 1]`. Recorregut descendent, començant a l'índex 5.

| Iteració | Índex i | Valor consultat | Valor mostrat |
|---|---|---|---|
| 1 | 5 | 1 | 1 |
| 2 | 4 | 7 | 7 |
| 3 | 3 | 0 | 0 |
| 4 | 2 | -2 | -2 |
| 5 | 1 | 9 | 9 |
| 6 | 0 | 4 | 4 |

El recorregut invers mostra `[1, 7, 0, -2, 9, 4]`, que coincideix amb l'enunciat. Després, el recorregut ascendent de l'índex 0 al 5 mostra `[4, 9, -2, 0, 7, 1]`, que és l'ordre original. Això confirma que l'array no ha canviat.

## Comprovació

| Prova | Entrada | Recorregut invers esperat | Recorregut original esperat | Resultat obtingut |
|---|---|---|---|---|
| Exemple | 4, 9, -2, 0, 7, 1 | 1, 7, 0, -2, 9, 4 | 4, 9, -2, 0, 7, 1 | Coincideix |
| Seqüència | 1, 2, 3, 4, 5, 6 | 6, 5, 4, 3, 2, 1 | 1, 2, 3, 4, 5, 6 | Coincideix |
| Sis valors iguals | 3, 3, 3, 3, 3, 3 | 3, 3, 3, 3, 3, 3 | 3, 3, 3, 3, 3, 3 | Coincideix |

La prova de la seqüència de l'1 al 6 és la més clara per revisar els límits, perquè el primer valor que es mostra ha de ser el 6 (casella 5) i l'últim ha de ser l'1 (casella 0). Si apareix un error d'índex, el bucle comença massa amunt; si falta l'1, el bucle s'atura massa aviat. La prova dels sis valors iguals no permet distingir l'ordre, però comprova que es mostren exactament sis valors.