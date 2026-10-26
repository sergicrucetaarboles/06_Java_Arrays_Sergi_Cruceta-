# Exercici 9. Copiar i transformar sense perdre l'original

**Objectiu:** copiar elements entre dos arrays diferents.

## Anàlisi

Llegeix 5 enters en un array `original`. Crea un segon array `copia` de 5 caselles i copia-hi els valors un per un amb un bucle. En un altre recorregut, multiplica per `2` els valors de `copia`. Mostra els dos arrays: `original` ha de conservar els valors llegits.

Assignar `copia ← original` no és una còpia de les caselles. S'han de crear dos arrays independents i copiar els valors amb índexs.

## Pseudocodi

```text
INICI
    original ← ARRAY DE 5 ENTERS
    copia ← ARRAY DE 5 ENTERS

    PER i DES DE 0 FINS A 4
        llegir(original[i])
    FI_PER

    PER i DES DE 0 FINS A 4
        copia[i] ← original[i]
    FI_PER

    PER i DES DE 0 FINS A 4
        copia[i] ← copia[i] * 2
    FI_PER

    escriure(original)
    escriure(copia)
FINAL
```

## Traça manual

Entrada: `[1, -2, 0, 4, 5]`.

| Índex | `original[i]` copiat | `copia[i]` després de multiplicar per 2 |
|---:|---:|---:|
| 0 | 1 | 2 |
| 1 | -2 | -4 |
| 2 | 0 | 0 |
| 3 | 4 | 8 |
| 4 | 5 | 10 |

En acabar, `original` continua sent `[1, -2, 0, 4, 5]` i `copia` és `[2, -4, 0, 8, 10]`.

## Comprovació

| Entrada | `original` esperat | `copia` esperada |
|---|---|---|
| `[1, -2, 0, 4, 5]` | `[1, -2, 0, 4, 5]` | `[2, -4, 0, 8, 10]` |
| `[0, 0, 0, 0, 0]` | `[0, 0, 0, 0, 0]` | `[0, 0, 0, 0, 0]` |
| `[1000, -1000, 1, -1, 0]` | `[1000, -1000, 1, -1, 0]` | `[2000, -2000, 2, -2, 0]` |
