# Exercici 12. Informe de notes del grup

**Objectiu:** combinar validació, emmagatzematge, acumulació, comparació i recompte.

## Anàlisi

Llegeix les notes enteres de 10 alumnes i desa-les en un array de 10 caselles. Cada nota ha d'estar entre `0` i `10`, inclosos. Si una nota no és vàlida, mostra `Nota no vàlida` i torna-la a demanar per al mateix alumne. Només les notes vàlides ocupen una casella.

Després de desar les 10 notes vàlides, calcula la mitjana, compta aprovats i suspesos, troba la nota màxima i la mínima, i mostra els índexs de les notes estrictament superiors a la mitjana. La mitjana s'ha de calcular abans d'aquest últim recorregut.

## Pseudocodi

```text
INICI
    notes ← ARRAY DE 10 ENTERS

    PER i DES DE 0 FINS A 9
        llegir(notes[i])
        MENTRE notes[i] < 0 O notes[i] > 10
            escriure("Nota no vàlida")
            llegir(notes[i])
        FI_MENTRE
    FI_PER

    suma ← 0
    PER i DES DE 0 FINS A 9
        suma ← suma + notes[i]
    FI_PER
    mitjana ← suma * 1.0 / 10

    aprovats ← 0
    suspesos ← 0
    maxim ← notes[0]
    minim ← notes[0]
    PER i DES DE 0 FINS A 9
        SI notes[i] >= 5
            aprovats ← aprovats + 1
        SINÓ
            suspesos ← suspesos + 1
        FI_SI
        SI notes[i] > maxim
            maxim ← notes[i]
        FI_SI
        SI notes[i] < minim
            minim ← notes[i]
        FI_SI
    FI_PER

    escriure("Mitjana:", mitjana)
    escriure("Aprovats:", aprovats)
    escriure("Suspesos:", suspesos)
    escriure("Màxim:", maxim)
    escriure("Mínim:", minim)

    quantitatSuperiors ← 0
    PER i DES DE 0 FINS A 9
        SI notes[i] > mitjana
            escriure(i)
            quantitatSuperiors ← quantitatSuperiors + 1
        FI_SI
    FI_PER
    SI quantitatSuperiors == 0
        escriure("Cap nota supera la mitjana")
    FI_SI
FINAL
```

## Traça manual

Notes vàlides: `[4, 5, 7, 8, 3, 10, 6, 5, 2, 10]`. La suma és `60` i la mitjana és `60 * 1.0 / 10 = 6.0`.

| Índex | Nota | Classificació | És superior a 6.0? |
|---:|---:|---|:---:|
| 0 | 4 | Suspès | No |
| 1 | 5 | Aprovat | No |
| 2 | 7 | Aprovat | Sí |
| 3 | 8 | Aprovat | Sí |
| 4 | 3 | Suspès | No |
| 5 | 10 | Aprovat | Sí |
| 6 | 6 | Aprovat | No |
| 7 | 5 | Aprovat | No |
| 8 | 2 | Suspès | No |
| 9 | 10 | Aprovat | Sí |

El resultat és 7 aprovats, 3 suspesos, màxim 10, mínim 2 i índexs superiors a la mitjana `2, 3, 5, 9`.

## Comprovació

| Notes vàlides | Resultat esperat |
|---|---|
| `[4, 5, 7, 8, 3, 10, 6, 5, 2, 10]` | Mitjana 6.0; 7 aprovats, 3 suspesos; màxim 10, mínim 2; índexs `2, 3, 5, 9` |
| Deu notes iguals a 5 | Mitjana 5.0; 10 aprovats; cap nota superior a la mitjana |
| Deu zeros | Mitjana 0.0; 0 aprovats i 10 suspesos |

Per comprovar la validació, introdueix `-1`, després `11` i després `7` per al primer alumne. Es rebutgen les dues primeres entrades; el `7` s'emmagatzema a l'índex `0`, i encara queden nou notes per llegir.
