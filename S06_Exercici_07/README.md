# Exercici 7. Comptar totes les aparicions

**Objectiu:** distingir trobar la primera coincidència de processar-les totes.

## Anàlisi

Llegeix 8 enters en un array i, després, el valor que vols comptar. Recorre totes les caselles, mostra cada índex on el valor coincideix i compta les coincidències. Si no n'hi ha cap, mostra un total de `0` i el missatge `Cap coincidència`. No cal un segon array per desar els índexs.

El comptador s'inicialitza a `0` abans del recorregut. La cerca no s'ha d'aturar quan troba la primera coincidència: cal continuar fins a l'última casella.

## Pseudocodi

```text
INICI
    dades ← ARRAY DE 8 ENTERS
    total ← 0

    PER i DES DE 0 FINS A 7
        llegir(dades[i])
    FI_PER

    llegir(valor)

    PER i DES DE 0 FINS A 7
        SI dades[i] == valor
            escriure(i)
            total ← total + 1
        FI_SI
    FI_PER

    escriure("Total:", total)
    SI total == 0
        escriure("Cap coincidència")
    FI_SI
FINAL
```

## Traça manual

Array: `[4, 1, 4, 0, 4, 2, 3, 4]`. Valor a comptar: `4`.

| Índex | Valor consultat | Coincideix? | Total després |
|---:|---:|:---:|---:|
| 0 | 4 | Sí | 1 |
| 1 | 1 | No | 1 |
| 2 | 4 | Sí | 2 |
| 3 | 0 | No | 2 |
| 4 | 4 | Sí | 3 |
| 5 | 2 | No | 3 |
| 6 | 3 | No | 3 |
| 7 | 4 | Sí | 4 |

Els índexs mostrats són `0, 2, 4, 7` i el total és `4`.

## Comprovació

| Array | Valor | Resultat esperat |
|---|---:|---|
| `[4, 1, 4, 0, 4, 2, 3, 4]` | 4 | Índexs `0, 2, 4, 7`; total 4 |
| `[4, 1, 4, 0, 4, 2, 3, 4]` | 9 | `Cap coincidència`; total 0 |
| `[4, 1, 4, 0, 4, 2, 3, 4]` | 0 | Índex 3; total 1 |
| Vuit valors iguals | valor repetit | Total 8 |
