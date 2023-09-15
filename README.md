## Descripción de cada función

- `main():` Esta función es el punto de entrada del programa. Se encarga de inicializar las variables, simular las caminatas aleatorias, calcular los resultados estadísticos y mostrarlos por pantalla.
- `randomWalk():` Esta función simula una caminata aleatoria desde la posición inicial (0) hasta que se alcanza la posición inicial nuevamente. Devuelve el número de pasos de la caminata aleatoria.

## Explicación del código

La función main() comienza por inicializar las variables simulations, variance, results y df. Luego, simula 1000 caminatas aleatorias y almacena los resultados en la lista results.

A continuación, la función calcula los resultados estadísticos: la media, el valor mínimo, el valor máximo y la desviación estándar. Para calcular la varianza, se utiliza la siguiente fórmula:

varianza = (suma((valor - media)^2)) / (número de valores)
Finalmente, la función muestra los resultados estadísticos por pantalla.

La función randomWalk() simula una caminata aleatoria desde la posición inicial (0) hasta que se alcanza la posición inicial nuevamente. Para ello, utiliza un objeto Random para lanzar una moneda y determinar la dirección de cada paso. La función devuelve el número de pasos de la caminata aleatoria.

## Analisis de resultados

El analisis de resultados se basan en 1000 simulaciones, y aquí hay un análisis de estos:

- `Media (Promedio):` La media es aproximadamente 7.710. Esto significa que, en promedio, la partícula regresa a su posición inicial después de alrededor de 7.710 pasos en cada simulación.

- `Valor Mínimo:` El valor mínimo observado en las 1000 simulaciones fue 2. Esto indica que en al menos una de las simulaciones, la partícula pudo regresar a su posición inicial después de solo 2 pasos.

- `Valor Máximo:` El valor máximo observado en las 1000 simulaciones fue 66. Esto indica que en una de las simulaciones, la partícula tomó 66 pasos para regresar a su posición inicial, lo que representa una de las peores ejecuciones en términos de tiempo.


- `Desviación Estándar:` La desviación estándar es aproximadamente 9.539. La desviación estándar mide la dispersión de los datos. Cuanto mayor sea la desviación estándar, más dispersos estarán los resultados alrededor de la media. En este caso, una desviación estándar de alrededor de 9.539 indica que los resultados varían considerablemente de una simulación a otra.

En resumen, los resultados muestran que, en promedio, la partícula tiende a regresar a su posición inicial después de alrededor de 7.710 pasos, pero la variabilidad es alta, ya que la desviación estándar es considerable. Además, los valores mínimo y máximo indican que hay una amplia gama de posibles resultados en diferentes simulaciones, desde retornos rápidos en 2 pasos hasta casos excepcionales que pueden llevar hasta 66 pasos o más para volver al inicio.