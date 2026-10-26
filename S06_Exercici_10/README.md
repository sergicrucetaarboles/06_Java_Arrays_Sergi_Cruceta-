# Exercici 10. Sumar dos arrays casella a casella

**Objectiu:** relacionar elements de diversos arrays mitjançant un mateix índex.

## Anàlisi

Llegeix 5 enters en cadascun dels arrays `a` i `b`. Crea un tercer array `resultat`, també de 5 caselles. Per a cada índex, desa a `resultat[i]` la suma de `a[i]` i `b[i]`. Mostra els tres arrays sense modificar els dos primers.

Els tres arrays tenen la mateixa longitud, així que un mateix índex assenyala les caselles que s'han de relacionar.

## Pseudocodi

```text
INICI
    a ← ARRAY DE 5 ENTERS
    b ← ARRAY DE 5 ENTERS
    resultat ← ARRAY DE 5 ENTERS

    PER i DES DE 0 FINS A 4
        llegir(a[i])
    FI_PER

    PER i DES DE 0 FINS A 4
        llegir(b[i])
    FI_PER

    PER i DES DE 0 FINS A 4
        resultat[i] ← a[i] + b[i]
    FI_PER

    escriure(a)
    escriure(b)
    escriure(resultat)
FINAL
```

## Traça manual

`a = [1, 2, 3, 4, 5]` i `b = [5, -2, 0, 6, 1]`.

| Índex | `a[i]` | `b[i]` | `resultat[i]` |
|---:|---:|---:|---:|
| 0 | 1 | 5 | 6 |
| 1 | 2 | -2 | 0 |
| 2 | 3 | 0 | 3 |
| 3 | 4 | 6 | 10 |
| 4 | 5 | 1 | 6 |

El resultat és `[6, 0, 3, 10, 6]`; els arrays `a` i `b` no han canviat.

## Comprovació

| `a` | `b` | Resultat esperat |
|---|---|---|
| `[1, 2, 3, 4, 5]` | `[5, -2, 0, 6, 1]` | `[6, 0, 3, 10, 6]` |
| `[1, -2, 3, 4, 5]` | `[0, 0, 0, 0, 0]` | `[1, -2, 3, 4, 5]` |
| `[1, -2, 3, 4, 5]` | `[-1, 2, -3, -4, -5]` | `[0, 0, 0, 0, 0]` |
