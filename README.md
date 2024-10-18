# Secuencia de matriz consecutiva más larga en Java

Este proyecto implementa un algoritmo en Java que identifica la secuencia más larga de números consecutivos en un arreglo. Es eficiente y útil para distintos escenarios como análisis de datos, gestión de rangos numéricos, y problemas de programación competitiva.

## Descripción del Algoritmo

El algoritmo identifica secuencias consecutivas de números dentro de un arreglo y devuelve la longitud de la secuencia más larga. Utiliza un `HashSet` para lograr una búsqueda eficiente con complejidad temporal de \(O(n)\).

## Casos de Uso

### 1. **Análisis de Datos Secuenciales**

Este algoritmo es útil para analizar secuencias continuas de eventos en datos secuenciales, como marcas de tiempo en transacciones o lecturas de sensores.

#### Ejemplo:

```java
int[] diasVisualizacion = {5, 6, 7, 10, 11, 12, 13, 20, 21};
int resultado = longestConsecutive(diasVisualizacion); // Resultado: 4
```

2. **Gestión de Rangos Numéricos**

Si trabajas con rangos numéricos, este algoritmo te ayuda a identificar brechas en un conjunto de datos numéricos, como series de números o identificadores.

#### Ejemplo:

```java
int[] numerosSerie = {1001, 1002, 1003, 1005, 1006, 1007, 1010};
int resultado = longestConsecutive(numerosSerie); // Resultado: 3 (números consecutivos: 1005, 1006, 1007)
```

3. **Problemas en Competencias de Programación**

Este problema es común en plataformas de programación competitiva como LeetCode y Codeforces, y requiere una solución eficiente para grandes conjuntos de datos.

#### Ejemplo:

```java
int[] nums = {9, 1, 4, 7, 3, 2, 6, 8};
int resultado = longestConsecutive(nums); // Resultado: 4 (números consecutivos: 1, 2, 3, 4)
```

4. **Detección de Secuencias en Juegos**
En aplicaciones de simulación o videojuegos, este algoritmo puede detectar secuencias de eventos consecutivos, como rachas de puntuaciones o niveles completados.

#### Ejemplo:

```java
int[] nivelesCompletados = {1, 2, 3, 5, 6, 7, 9};
int resultado = longestConsecutive(nivelesCompletados); // Resultado: 3 (niveles: 1, 2, 3)
```

5. **Secuencias en Series Temporales**
En análisis de series temporales, este algoritmo ayuda a detectar períodos continuos de actividad o eventos, como días consecutivos de aumentos en precios de acciones.

#### Ejemplo:

```java
int[] diasAumento = {3, 4, 5, 7, 8, 10, 11, 12};
int resultado = longestConsecutive(diasAumento); // Resultado: 3 (días: 10, 11, 12)
```

6. **Reconstrucción de Datos Faltantes**
Este algoritmo también puede identificar brechas en conjuntos de datos incompletos y ayudar a sugerir los valores faltantes.

#### Ejemplo:

```java
int[] horasConDatos = {1, 2, 3, 5, 6, 9, 10, 11};
int resultado = longestConsecutive(horasConDatos); // Resultado: 3 (horas: 5, 6)
```
### Implementación en el Código

En el mismo entorno donde ejecutas el algoritmo `longestConsecutive`. Simplemente define el arreglo correspondiente y llama al método, como se muestra en los ejemplos. Esto te permitirá ver cómo el algoritmo se adapta a diferentes contextos y datos.

#### Resumen:

Se puede aplicar el algoritmo en múltiples escenarios del mundo real. Si decides implementar estos ejemplos en tu código, no dudes en experimentar con diferentes conjuntos de datos y ver su comportamiento