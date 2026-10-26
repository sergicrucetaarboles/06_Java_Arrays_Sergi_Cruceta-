# Exercici 5. Màxim, mínim i primera posició
 
**Objectiu:** conservar un valor extrem i l'índex on s'ha trobat.
 
## Anàlisi
 
L'entrada són 7 enters que es llegeixen per teclat i es desen en un array de 7 caselles, amb índexs del 0 al 6. La mida és fixa i no es demana a l'usuari. La sortida són quatre dades: el valor màxim, l'índex on apareix, el valor mínim i l'índex on apareix.
 
Calen quatre variables auxiliars de tipus enter: `maxim`, `posMaxim`, `minim` i `posMinim`. Les dues primeres guarden el millor màxim trobat fins ara i la casella on s'ha vist; les dues últimes fan el mateix amb el mínim. El programa té dues fases: primer es llegeixen i es desen les set dades, i després, en un segon recorregut, es busquen els extrems.
 
Un detall important és que l'enunciat demana la primera posició quan un extrem es repeteix. Per això, a la comparació s'utilitzen els operadors estrictes `>` i `<`, i no `>=` ni `<=`. Si un valor és igual a l'extrem actual, no es considera una millora i l'índex guardat no canvia, de manera que es conserva la primera aparició.
 
## Pseudocodi
 
```
INICI
    dades ← ARRAY DE 7 ENTERS
 
    escriure("Introdueix 7 enters:")
 
    PER i DES DE 0 FINS A 6
        escriure("Enter de la posició ", i, ":")
        llegir(dades[i])
    FI_PER
 
    maxim ← dades[0]
    posMaxim ← 0
    minim ← dades[0]
    posMinim ← 0
 
    PER i DES DE 1 FINS A 6
        SI dades[i] > maxim
            maxim ← dades[i]
            posMaxim ← i
        FI_SI
 
        SI dades[i] < minim
            minim ← dades[i]
            posMinim ← i
        FI_SI
    FI_PER
 
    escriure("Màxim:", maxim, "a l'índex", posMaxim)
    escriure("Mínim:", minim, "a l'índex", posMinim)
FINAL
```
 
## Explicació
 
El programa comença definint l'array de 7 caselles i omplint-lo amb un primer bucle de la posició 0 a la 6. El límit és 6 perquè `FINS A` inclou l'últim valor i un array de 7 caselles té índexs del 0 al 6.
 
Un cop l'array és ple, el màxim i el mínim s'inicialitzen amb el primer element, `dades[0]`, i els dos índexs amb 0. Això vol dir que, abans de començar el recorregut, es parteix de la suposició que el primer valor és alhora el màxim i el mínim. A partir d'aquí, el segon bucle comença a l'índex 1, perquè la casella 0 ja ha estat considerada, i compara cada valor amb els extrems guardats. Si el valor és més gran que el màxim, es substitueixen tant el màxim com el seu índex. Si és més petit que el mínim, passa el mateix amb el mínim. Les dues preguntes són `SI` independents i no un `SINÓ`, perquè un mateix valor no pot ser alhora més gran que el màxim i més petit que el mínim, però és necessari que cada comparació es faci per separat. Al final es mostren els dos resultats amb el seu índex.
 
## Pregunta per al pseudocodi
 
**Per què inicialitzar el màxim a 0 no serviria si tots els nombres fossin negatius?**
 
Si el màxim s'inicialitzés a 0 i tots els nombres de l'array fossin negatius, cap valor seria mai més gran que 0. La condició `dades[i] > maxim` no es compliria en cap iteració, i el programa acabaria mostrant un màxim de 0, que és un valor que no existeix a l'array, amb un índex que tampoc correspondria a cap posició real. Per exemple, amb l'entrada `[-8, -3, -10, -1, -5, -6, -2]`, el màxim correcte és `-1` i el programa donaria `0`. El mateix problema es produiria amb el mínim inicialitzat a 0 si tots els nombres fossin positius.
 
La solució és inicialitzar tant el màxim com el mínim amb un valor que sí que pertanyi a l'array, normalment el primer, `dades[0]`. D'aquesta manera el valor inicial sempre és un candidat vàlid, i qualsevol altre valor que el superi o l'igualin per sota el substituirà correctament, sigui quin sigui el signe dels nombres.
 
## Traça manual
 
Cas d'exemple: `[-4, 9, 2, 9, -6, 3, -6]`. Abans del bucle, `maxim = -4`, `posMaxim = 0`, `minim = -4` i `posMinim = 0`.
 
| Iteració | Índex i | Valor consultat | Màxim | posMàxim | Mínim | posMínim | Què passa |
|---|---|---|---|---|---|---|---|
| 1 | 1 | 9 | 9 | 1 | -4 | 0 | 9 > -4, nou màxim |
| 2 | 2 | 2 | 9 | 1 | -4 | 0 | cap canvi |
| 3 | 3 | 9 | 9 | 1 | -4 | 0 | 9 no és > 9, es conserva l'índex 1 |
| 4 | 4 | -6 | 9 | 1 | -6 | 4 | -6 < -4, nou mínim |
| 5 | 5 | 3 | 9 | 1 | -6 | 4 | cap canvi |
| 6 | 6 | -6 | 9 | 1 | -6 | 4 | -6 no és < -6, es conserva l'índex 4 |
 
El resultat final és màxim 9 a l'índex 1 i mínim -6 a l'índex 4, que coincideix amb l'exemple de l'enunciat. Les iteracions 3 i 6 demostren que, amb comparacions estrictes, els valors repetits no canvien la primera posició.
 
## Comprovació
 
| Prova | Entrada | Resultat esperat | Resultat obtingut |
|---|---|---|---|
| Exemple | -4, 9, 2, 9, -6, 3, -6 | Màxim 9 a l'índex 1; mínim -6 a l'índex 4 | Màxim 9 a l'índex 1; mínim -6 a l'índex 4 |
| Tots negatius | -8, -3, -10, -1, -5, -6, -2 | Màxim -1 a l'índex 3; mínim -10 a l'índex 2 | Màxim -1 a l'índex 3; mínim -10 a l'índex 2 |
| Set valors iguals | 4, 4, 4, 4, 4, 4, 4 | Màxim 4 a l'índex 0; mínim 4 a l'índex 0 | Màxim 4 a l'índex 0; mínim 4 a l'índex 0 |
 
La prova de tots negatius confirma que inicialitzar amb `dades[0]` resol el problema plantejat a la pregunta. La prova dels set valors iguals confirma que, quan no hi ha cap valor estrictament millor, els dos índexs es queden a 0.
 
