# Exercici 8. Modificar una casella amb un índex vàlid

**Objectiu:** comprovar els límits abans d'accedir a una casella.

## Anàlisi

Llegeix 5 enters en un array. Demana l'índex que es vol modificar i comprova que sigui dins del rang vàlid, de `0` a `4`. Si és invàlid, mostra `Índex no vàlid` i torna'l a demanar. Només quan l'índex sigui correcte es demana el nou valor, es modifica la casella i es mostra l'array.

La condició de validesa és `index >= 0 I index < dades.length`. La comprovació s'ha de fer abans d'accedir a `dades[index]`.

## Pseudocodi

```text
INICI
    dades ← ARRAY DE 5 ENTERS

    PER i DES DE 0 FINS A 4
        llegir(dades[i])
    FI_PER

    llegir(index)
    MENTRE index < 0 O index >= 5
        escriure("Índex no vàlid")
        llegir(index)
    FI_MENTRE

    llegir(nouValor)
    dades[index] ← nouValor

    PER i DES DE 0 FINS A 4
        escriure(dades[i])
    FI_PER
FINAL
```

## Traça manual

Array inicial: `[10, 20, 30, 40, 50]`. Índexs introduïts: `-1`, `5`, `2`. Nou valor: `99`.

| Índex introduït | Comprovació | Acció |
|---:|---|---|
| -1 | És menor que 0 | Es rebutja i es torna a demanar |
| 5 | És igual a la longitud | Es rebutja i es torna a demanar |
| 2 | És entre 0 i 4 | Es llegeix el nou valor i es modifica la casella |

El resultat final és `[10, 20, 99, 40, 50]`. No s'accedeix a l'array amb cap dels índexs rebutjats.

## Comprovació

| Array inicial | Índexs introduïts | Nou valor | Resultat esperat |
|---|---|---:|---|
| `[10, 20, 30, 40, 50]` | `-1`, `5`, `2` | 99 | `[10, 20, 99, 40, 50]` |
| `[10, 20, 30, 40, 50]` | `0` | 7 | `[7, 20, 30, 40, 50]` |
| `[10, 20, 30, 40, 50]` | `4` | 7 | `[10, 20, 30, 40, 7]` |
