
# Project Title

A brief description of what this project does and who it's for


# 🚀 Calculadora de Altura de Proyectiles

Una aplicación en Java que permite calcular la altura de un objeto lanzado en función de su velocidad inicial, ángulo de lanzamiento y tiempo transcurrido. Ideal para estudiantes y entusiastas de la física que desean explorar el movimiento parabólico de una manera práctica.

## 📋 Características

- **Cálculo de altura**: Implementa una fórmula física para determinar la altura de un proyectil en cualquier instante.
- **Validación de entradas**: Manejo de errores para garantizar que solo se procesen valores válidos.
- **Reintentos en caso de errores**: El usuario puede volver a ingresar valores en caso de errores o datos inválidos.
- **Resultados redondeados**: El cálculo de altura redondea los resultados a 2 decimales para mayor claridad.

## 🛠️ Cómo funciona

1. El usuario ingresa:
   - **Velocidad inicial** (en m/s).
   - **Ángulo de lanzamiento** (en grados).
   - **Tiempo transcurrido** (en segundos).
2. La aplicación calcula la altura utilizando la fórmula del movimiento parabólico:
   \[
   altura = v_{y} \cdot t + \frac{1}{2} \cdot g \cdot t^2
   \]
   Donde \( v_{y} = v_{inicial} \cdot \sin(\text{ángulo en radianes}) \).
3. Los resultados se redondean a 2 decimales y se presentan al usuario.

## ⚙️ Requisitos

- **Java 8 o superior**.
- Cualquier IDE o entorno de ejecución que soporte Java.

## 🚀 Instalación y Ejecución

1. Clona este repositorio:
    ```bash
   git clone https://github.com/Danymjia/Excepciones_Conversion_Datos_Ejercicio1.git```

2.  Abre el proyecto en tu IDE favorito (Eclipse, IntelliJ, VS Code, etc.).
3. Compila y ejecuta el archivo Main.java.

## 📁 Estructura del Proyecto
├── **Main.java** -  Clase principal que interactúa con el usuario

├── **Calcular.java** - Clase lógica que realiza los cálculos físicos


## 🧪 Ejemplo de Uso
**Entrada:**

Ingrese la velocidad inicial en m/s: 20

Ingrese el ángulo de lanzamiento en grados: 45

Ingrese el tiempo en segundos: 2

**Salida:**

La altura a los 2.0 segundos es: 14.20 m

## 🛡️ Validaciones y Manejo de Errores

- Se asegura que los valores ingresados no sean negativos.
- Manejo de excepciones como:
    -  ```InputMismatchException:``` Detecta entradas no numéricas.
    - ```IllegalArgumentException:``` Maneja valores negativos u otros datos no válidos.
- El usuario puede reintentar hasta que los valores ingresados sean correctos.

## 🤝 Contribuciones
¡Las contribuciones son bienvenidas! Si deseas mejorar esta aplicación:

1. Haz un fork del repositorio.
2. Crea una rama para tus cambios:
```
git checkout -b nombre-nueva-funcionalidad
```
3. Realiza tus cambios y haz un commit:
```
git commit -m "feat: añadir nueva funcionalidad"
```
4. Envía tus cambios
```
git push origin mi-nueva-funcionalidad
```
5. Abre un Pull Request.

## 🧾 Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.


## Authors

- [@Danymjia](https://github.com/Danymjia)
- [@Adrian-Caiza](https://github.com/Adrian-Caiza)
- [@jmvillanueva-dev](https://github.com/jmvillanueva-dev)

¡Gracias por usar la Calculadora de Altura! 😊

