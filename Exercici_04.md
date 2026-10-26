## Anàlisi
 
L'entrada són 8 enters que es llegeixen per teclat i es desen en un array de 8 caselles, amb índexs del 0 al 7. La mida és fixa i no es demana a l'usuari. La sortida són tres recomptes: quants nombres són positius, quants són negatius i quants són zero.
 
Calen tres comptadors de tipus enter, anomenats `positius`, `negatius` i `zeros`, que valen 0 abans de començar. El programa té dues fases: primer es llegeixen i es desen les vuit dades, i després, en un segon recorregut, es classifiquen. El zero no és ni positiu ni negatiu, i per això té la seva pròpia categoria.
 
## Pseudocodi
 
```
INICI
    dades ← ARRAY DE 8 ENTERS
    positius ← 0
    negatius ← 0
    zeros ← 0
 
    escriure("Introdueix 8 enters:")
 
    PER i DES DE 0 FINS A 7
        escriure("Enter de la posició ", i, ":")
        llegir(dades[i])
    FI_PER
 
    PER i DES DE 0 FINS A 7
        SI dades[i] > 0
            positius ← positius + 1
        SINÓ
            SI dades[i] < 0
                negatius ← negatius + 1
            SINÓ
                zeros ← zeros + 1
            FI_SI
        FI_SI
    FI_PER
 
    escriure("Positius:", positius)
    escriure("Negatius:", negatius)
    escriure("Zeros:", zeros)
FINAL
```
