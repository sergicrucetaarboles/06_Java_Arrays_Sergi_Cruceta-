# Exercici 6. Cercar la primera coincidència
 
**Objectiu:** implementar una cerca lineal i representar que un valor no s'ha trobat.
 
## Anàlisi
 
Les entrades són 8 enters que es llegeixen per teclat i es desen en un array de 8 caselles, amb índexs del 0 al 7, i després un novè enter: el valor que es vol cercar. La mida és fixa i no es demana a l'usuari. La sortida és l'índex de la primera casella que conté el valor cercat o, si no hi és, el text `No trobat`. L'array no s'ha d'ordenar ni modificar: només es consulta.
 
Calen dues variables auxiliars de tipus enter. La primera és `valor`, que guarda el número que s'ha de cercar. La segona és `posicio`, que guarda l'índex on s'ha trobat el valor. També cal un índex de recorregut `i`, perquè la cerca es fa amb un bucle `MENTRE` que s'atura quan troba la primera coincidència.
 
La variable `posicio` s'inicialitza amb `-1`. Aquest valor funciona com a senyal que vol dir «encara no trobat», perquè `-1` no és mai un índex vàlid d'un array (els índexs comencen a 0). Això permet saber al final si la cerca ha tingut èxit: si `posicio` continua valent `-1`, el valor no hi era. El `-1` només s'utilitza com a marca i mai per accedir a l'array.
 
## Pseudocodi
 
```
INICI
    dades ← ARRAY DE 8 ENTERS
    posicio ← -1
    i ← 0
 
    escriure("Introdueix 8 enters:")
 
    PER j DES DE 0 FINS A 7
        escriure("Enter de la posició ", j, ":")
        llegir(dades[j])
    FI_PER
 
    escriure("Valor a cercar:")
    llegir(valor)
 
    MENTRE i < 8 I posicio == -1
        SI dades[i] == valor
            posicio ← i
        FI_SI
        i ← i + 1
    FI_MENTRE
 
    SI posicio == -1
        escriure("No trobat")
    SINÓ
        escriure("Índex:", posicio)
    FI_SI
FINAL
```
 
## Explicació
 
El programa comença preparant les variables: l'array de 8 caselles, la variable `posicio` amb el senyal `-1` i l'índex `i` a 0. Després, un primer bucle `PER` omple l'array llegint les vuit dades, de la posició 0 a la 7. Aquest bucle fa servir la lletra `j` perquè la lletra `i` es reserva per al recorregut de la cerca, i així cada bucle té el seu propi índex. A continuació es llegeix el valor que es vol cercar.
 
La cerca lineal és el bucle `MENTRE`. Es repeteix mentre dues condicions es compleixin alhora: que l'índex `i` encara estigui dins de l'array (`i < 8`) i que encara no s'hagi trobat res (`posicio == -1`). A cada volta es compara la casella actual amb el valor cercat. Si són iguals, es guarda l'índex a `posicio`, i com que aleshores `posicio` ja no val `-1`, el bucle s'atura a la volta següent. Així es garanteix que es quedi la primera coincidència, encara que el valor aparegui més vegades més endavant. Si no hi ha cap coincidència, el bucle recorre les vuit caselles i `posicio` continua valent `-1`.
 
Per acabar, una condició decideix què mostrar: si `posicio` encara val `-1`, s'escriu `No trobat`; en cas contrari, s'escriu l'índex guardat.
 
## Traça manual
 
### Cas d'exemple: valor cercat 2
 
Array: `[5, 2, 8, 2, 0, -1, 7, 2]`. Abans del bucle, `posicio = -1` i `i = 0`.
 
| Iteració | Índex i | Valor consultat | Coincideix amb 2? | posicio | Continua el bucle? |
|---|---|---|---|---|---|
| 1 | 0 | 5 | no | -1 | sí |
| 2 | 1 | 2 | sí | 1 | no, posicio ja no és -1 |
 
El bucle s'atura després de la segona iteració i el resultat és l'índex 1, que coincideix amb l'exemple de l'enunciat. Les caselles 3 i 7 també contenen un 2, però no es consulten perquè la cerca ja ha acabat: això garanteix que es mostra la primera coincidència.
 
### Cas sense coincidència: valor cercat 99
 
Amb el mateix array, el bucle ha de recórrer totes les caselles.
 
| Iteració | Índex i | Valor consultat | Coincideix amb 99? | posicio |
|---|---|---|---|---|
| 1 | 0 | 5 | no | -1 |
| 2 | 1 | 2 | no | -1 |
| 3 | 2 | 8 | no | -1 |
| 4 | 3 | 2 | no | -1 |
| 5 | 4 | 0 | no | -1 |
| 6 | 5 | -1 | no | -1 |
| 7 | 6 | 7 | no | -1 |
| 8 | 7 | 2 | no | -1 |
 
En acabar, `i` val 8, el bucle s'atura perquè ja no es compleix `i < 8`, i `posicio` continua valent `-1`. Per tant, el programa mostra `No trobat`. Observa que la sisena casella conté el valor `-1`, però no genera cap confusió: el `-1` de l'array és una dada, i el `-1` de `posicio` és un senyal, i es comparen amb coses diferents.
 
## Comprovació
 
Totes les proves fan servir l'array `[5, 2, 8, 2, 0, -1, 7, 2]`.
 
| Prova | Valor cercat | Resultat esperat | Resultat obtingut |
|---|---|---|---|
| Exemple | 2 | Índex 1 | Índex 1 |
| Primera casella | 5 | Índex 0 | Índex 0 |
| Penúltima casella | 7 | Índex 6 | Índex 6 |
| Valor inexistent | 99 | No trobat | No trobat |
 
La prova amb el 5 comprova que la cerca funciona quan el valor és a la primera casella, i la del 7 que funciona quan és gairebé al final. La del 99 comprova que el senyal `-1` serveix per detectar que no hi ha cap coincidència.
 
