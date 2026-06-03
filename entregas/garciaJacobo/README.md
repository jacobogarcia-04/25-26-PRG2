# 🏋️‍♂️ Sistema de Gestión de Gimnasio (FitLife Center)

**Autor:** Jacobo García

---

## 📌 1. Descripción del Proyecto

Este sistema simula la gestión de reservas de un gimnasio, permitiendo inscribir socios en actividades específicas mientras se controla de forma estricta el aforo y las normativas de horario.

Además, muestra un apartado de **Actividades**, otro de **Socios** y, por último, uno de **Reservas**.

---

## 🏗️ 2. Arquitectura de Clases

| Clase | Responsabilidad Principal | Característica Clave |
|---------|-------------------------|---------------------|
| **Gimnasio** | Identidad del centro. | Proporciona el nombre global del local. |
| **Actividades** | Cerebro del aforo. | Gestiona inscritos y bloquea si la actividad está llena. |
| **Horario** | Gestión del tiempo. | Valida que las clases duren exactamente 2 horas. |
| **Socios** | Perfil del usuario. | Gestiona el estado de ALTA/BAJA. |
| **Reservas** | Registro de inscripción. | Objeto que vincula Socio, Actividad y Fecha. |
| **Cliente (Main)** | Punto de ejecución. | Instancia objetos y ejecuta las pruebas. |

---

## 🛡️ 3. Control de Aforo Automatizado

La clase **Actividades** actúa como un filtro de seguridad. No es un simple contador de texto; utiliza lógica interna para proteger la capacidad del gimnasio.

### Funcionalidades

- **Validación previa:** El método `agregarActividad()` verifica el estado del objeto antes de modificarlo.
- **Mensajería dinámica:** El sistema informa al usuario del estado real de la actividad (inscritos y aforo máximo) tanto en caso de éxito como de error.

---

## 📅 4. Validación de Normativa de Horarios

Para asegurar la calidad de las clases, la clase **Horario** incluye un método privado llamado `comprobarDuracion()`.

### Funcionalidades

1. Calcula la diferencia entre `horaFin` y `horaInicio`.
2. Emite un aviso preventivo si la actividad no cumple con la planificación de **2 horas de duración**.

---

## 🚀 5. Caso de Prueba: Simulación de Límite de Aforo

Se ha implementado un flujo de prueba en la clase **Cliente** para verificar la robustez del sistema.

### Configuración

- Actividad: **Yoga**
- Aforo máximo: **1 plaza**

### Operación 1 (Juan García)

- El sistema permite la inscripción.
- Se actualiza el estado a **0 plazas libres**.

### Operación 2 (Pablo Martínez)

- El sistema detecta mediante `estaLlena()` que no hay capacidad disponible.

### Resultado

- Se bloquea la inscripción de Pablo.
- Se muestra un mensaje de error personalizado indicando que se ha alcanzado la capacidad máxima.
- Se informa del aforo mediante el método `mostrarAforo()`.

---

## 🖥️ 6. Ejemplo de Ejecución (Consola)

```text
Gimnasio: FitLife Center

Actividades:
  "Yoga (Libres: 1)" - Monitor/a: Elena Ruiz - Lun/Vie
  La actividad comienza a las: 10.0 y termina a las: 12.0

Socios:
  "Juan García" - DNI: 12345678A
  Estado: El socio Juan García está de ALTA.

  "Pablo Martinez" - DNI: 12345678A
  Estado: El socio Pablo Martinez está de ALTA.

Reservas:

  >> ¡Éxito! Socio inscrito en Yoga
  >> Estado actual -> Inscritos: 1 | Aforo máximo: 1

  -> Socio: Juan García
     [Aforo: 1 | Libres: 0]

  Fecha de la reserva: 01/02/2026

----------------------------------------------------

  -> Socio: Pablo Martinez

     No se pudo agregar. La actividad Yoga está llena.
     [!] Capacidad máxima: 1
     [Aforo: 1 | Libres: 0]
```

---

## ✅ Conclusión

El sistema garantiza:

- Control automático del aforo.
- Gestión de socios y reservas.
- Validación de horarios.
- Prevención de sobreocupación en actividades.
- Información clara y detallada para el usuario mediante mensajes dinámicos.

Este proyecto aplica conceptos fundamentales de **Programación Orientada a Objetos (POO)** como encapsulación, composición de objetos y validación de reglas de negocio.
