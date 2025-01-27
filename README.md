# Problema de Maximización de Beneficios usando Programación Dinámica

## Descripción del Proyecto

Este proyecto aborda el problema de maximización de beneficios para una empresa que busca optimizar su inventario, respetando las restricciones de espacio y presupuesto. Se implementaron tres enfoques para resolver este problema:

1. **Recursivo:** Una solución directa pero ineficiente para grandes conjuntos de datos.
2. **Programación dinámica (bottom-up):** Más eficiente, con una tabla que optimiza las subsoluciones.
3. **Programación dinámica (top-down):** Utiliza memoización para mejorar el rendimiento.

El objetivo principal es seleccionar productos que maximicen el beneficio total sin exceder las limitaciones.

---

## Estructura del Proyecto

- **`src/`**: Contiene el código fuente principal.
    - **`Main.java`**: Ejecuta las soluciones y muestra los resultados.
    - **`Recursivo.java`**: Implementación del enfoque recursivo.
    - **`BottomUp.java`**: Implementación del enfoque bottom-up.
    - **`TopDown.java`**: Implementación del enfoque top-down.
- **`test/`**: Archivos con conjuntos de datos de prueba.
- **`README/`**: Documentación técnica y explicativa del proyecto.

---

## Cómo Ejecutar el Proyecto

1. Clona el repositorio desde GitHub:
   ```bash
   git clone https://github.com/Alberthluiiz/InventarioOptimizadoU3.git
   ```
2. Abre el proyecto clonado en tu IDE favorito, como IntelliJ IDEA.
3. Configura el JDK 17 en tu entorno.
4. Navega al archivo `Main.java` dentro del directorio `src/`.
5. Ejecuta la clase `Main.java` para ver los resultados.

---

## Resultados y Comparativa

- **Recursivo:**
    - Ventajas: Sencillo de implementar.
    - Desventajas: Muy lento para conjuntos de datos grandes debido a la explosión combinatoria.

- **Bottom-up:**
    - Ventajas: Rápido y eficiente en tiempo y espacio.
    - Desventajas: Requiere planificación de la tabla de subproblemas.

- **Top-down:**
    - Ventajas: Flexibilidad al construir soluciones.
    - Desventajas: Moderadamente complejo de implementar.

---

## Herramientas y Tecnologías Utilizadas

- **Lenguaje de Programación:** Java 17
- **Entorno de Desarrollo:** IntelliJ IDEA
- **Control de Versiones:** Git y GitHub

---

## Contribuciones

Si deseas contribuir a este proyecto:

1. Haz un fork del repositorio.
2. Crea una rama para tu característica (`git checkout -b feature/nueva-caracteristica`).
3. Realiza tus cambios y súbelos (`git commit -am 'Añadida nueva característica'`).
4. Envía un pull request para revisión.

---

## Clonación y Configuración del Proyecto

Para clonar el proyecto y configurarlo en tu entorno local:

1. Abre una terminal y ejecuta:
   ```bash
   git clone https://github.com/Alberthluiiz/InventarioOptimizadoU3.git
   ```
2. Importa el proyecto clonado en IntelliJ IDEA u otro IDE compatible.
3. Configura el proyecto con el JDK 17.
4. Navega a `src/Main.java` y ejecuta el programa para probar las soluciones.

---
