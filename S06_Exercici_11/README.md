# Exercici 11. Invertir el contingut de l'array

**Objectiu:** intercanviar valors utilitzant una variable auxiliar.

## Anàlisi

Llegeix 7 enters en un únic array i modifica'l perquè els valors quedin en ordre contrari. Intercanvia la primera casella amb l'última, la segona amb la penúltima i així successivament. Després mostra l'array de principi a fi.

Per intercanviar dues caselles cal una variable auxiliar. Només cal fer `dades.length / 2` intercanvis; la casella central d'un array amb longitud senar es queda al mateix lloc.

## Pseudocodi

```text
INICI
    dades ← ARRAY DE 7 ENTERS

    PER i DES DE 0 FINS A 6
        llegir(dades[i])
    FI_PER

    PER i DES DE 0 FINS A 2
        temporal ← dades[i]
        dades[i] ← dades[6 - i]
        dades[6 - i] ← temporal
    FI_PER

    PER i DES DE 0 FINS A 6
        escriure(dades[i])
    FI_PER
FINAL
```

En Java, el bucle d'intercanvi es pot limitar amb `i < dades.length / 2`, i la casella oposada és `dades.length - 1 - i`.

## Traça manual

Entrada: `[1, 2, 3, 4, 5, 6, 7]`.

| Intercanvi | Índexs | Array després de l'intercanvi |
|---:|---|---|
| 1 | 0 i 6 | `[7, 2, 3, 4, 5, 6, 1]` |
| 2 | 1 i 5 | `[7, 6, 3, 4, 5, 2, 1]` |
| 3 | 2 i 4 | `[7, 6, 5, 4, 3, 2, 1]` |

La casella central, índex 3, no s'intercanvia. Si es continués més enllà de la meitat, es desfarien els intercanvis ja fets.

## Comprovació

| Entrada | Resultat esperat |
|---|---|
| `[1, 2, 3, 4, 5, 6, 7]` | `[7, 6, 5, 4, 3, 2, 1]` |
| `[2, 4, 6, 8, 6, 4, 2]` | `[2, 4, 6, 8, 6, 4, 2]` |
| `[-3, 0, 5, 2, -1, 8, 4]` | `[4, 8, -1, 2, 5, 0, -3]` |
