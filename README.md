# Diseño de Arquitectura SOA para Sistema de Pagos

La empresa de pagos electrónicos 'PagoRápido' necesita una arquitectura de Servicios Orientados (SOA) que integre sus sistemas heredados con nuevas funcionalidades de API. Los actores clave son el 'procesador de pagos', el 'buró de crédito' y el 'gateway de pagos'. El sistema debe manejar un volumen de 10 000 transacciones por segundo con un SLA de 99.9%. El diseño debe abordar la consistencia de los datos entre el 'procesador de pagos' y el 'buró de crédito', y la idempotencia de las solicitudes de pago por número de operación. El sistema debe fallar de manera segura ante errores del 'gateway de pagos'.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Diseño de la arquitectura SOA |
| **Nivel** | senior-l2 |
| **Tipo** | mixed |
| **Tiempo estimado** | 2 semanas |

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Obtener el proyecto base funcional enviando el Código Base a un asistente de IA, que lo analizará, corregirá errores y generará un ZIP listo para usar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Asegúrate de tener instalado para ejecutar el proyecto: Un IDE o editor de código.
- Copia todo el contenido del campo **Código Base** de este reto — incluyendo el texto de instrucciones que aparece al inicio.
- Abre un asistente de IA (Claude en claude.ai, ChatGPT o Gemini — se recomienda Claude), pega el contenido copiado en el chat y envíalo.
- El asistente analizará los archivos, corregirá errores y generará un archivo ZIP descargable. Descárgalo y extráelo en la carpeta donde quieras trabajar.
- Verifica que el proyecto arranca sin errores.

**Entregable:** El proyecto compila/arranca sin errores.

<details>
<summary>Pistas de conocimiento</summary>

- Copia el Código Base completo incluyendo el texto de instrucciones al inicio — esas instrucciones le indican al asistente exactamente qué hacer con los archivos.
- Si el asistente no genera el ZIP automáticamente al terminar el análisis, escríbele: "genera el ZIP ahora".
- Si el proyecto tiene errores al arrancar, comparte el mensaje de error con el mismo asistente para que lo corrija.

</details>

### Fase 1: Exploración del Sistema Heredado

**Objetivo:** Identificar las restricciones y ambigüedades en los sistemas heredados que deben integrarse con la nueva arquitectura SOA.

**Tiempo estimado:** 3 días

**Instrucciones:**

- Analiza los sistemas heredados de 'PagoRápido' para identificar sus componentes, responsabilidades y restricciones.
- Documenta al menos dos restricciones relevantes y dos ambigüedades que podrían afectar la integración con la nueva arquitectura.

**Entregable:** Documento que detalla las restricciones y ambigüedades identificadas en los sistemas heredados.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo las restricciones técnicas de los sistemas heredados pueden impactar la arquitectura SOA.
- Piensa en cómo las ambigüedades en la documentación de los sistemas heredados podrían ser resueltas.

</details>

### Fase 2: Diseño de la Arquitectura SOA

**Objetivo:** Diseñar la arquitectura SOA que integre los sistemas heredados con las nuevas funcionalidades de API.

**Tiempo estimado:** 5 días

**Instrucciones:**

- Crea un registro de decisiones que detalle las opciones consideradas, los pros y contras de cada opción, y la decisión final para la arquitectura SOA.
- Considera cómo manejar la consistencia de los datos entre el 'procesador de pagos' y el 'buró de crédito', y la idempotencia de las solicitudes de pago.

**Entregable:** Registro de decisiones que detalla el diseño de la arquitectura SOA, incluyendo las opciones consideradas, los pros y contras, y la decisión final.

<details>
<summary>Pistas de conocimiento</summary>

- Piensa en cómo los patrones de integración pueden ser aplicados para resolver las restricciones identificadas en la fase anterior.
- Considera los trade-offs entre consistencia y disponibilidad al diseñar la arquitectura.

</details>

### Fase 3: Implementación de la Arquitectura SOA

**Objetivo:** Implementar la arquitectura SOA diseñada en la fase anterior.

**Tiempo estimado:** 5 días

**Instrucciones:**

- Implementa la arquitectura SOA siguiendo el diseño detallado en el registro de decisiones.
- Asegúrate de que el sistema maneje el volumen de transacciones esperado y cumpla con el SLA requerido.
- Documenta cómo el sistema falla de manera segura ante errores del 'gateway de pagos'.

**Entregable:** Implementación de la arquitectura SOA que integra los sistemas heredados con las nuevas funcionalidades de API.

<details>
<summary>Pistas de conocimiento</summary>

- Considera cómo los principios de API pueden ser aplicados para garantizar la calidad y la seguridad de las integraciones.
- Piensa en cómo el sistema puede ser monitoreado y mantenido una vez implementado.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es una arquitectura SOA y por qué es importante para la integración de sistemas en 'PagoRápido'?
- **paraQueSirve**: ¿Para qué sirve el registro de decisiones en el diseño de la arquitectura SOA?
- **comoSeUsa**: ¿Cómo se usan los patrones de integración para resolver las restricciones identificadas en los sistemas heredados?
- **erroresComunes**: ¿Cuáles son los errores comunes al diseñar una arquitectura SOA y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica el diseño de una arquitectura SOA y cómo se pueden justificar?

## Criterios de Evaluacion

- Identificar restricciones y ambigüedades en los sistemas heredados.
- Diseñar una arquitectura SOA que integre los sistemas heredados con las nuevas funcionalidades de API.
- Implementar la arquitectura SOA siguiendo el diseño detallado en el registro de decisiones.
- Documentar cómo el sistema falla de manera segura ante errores del 'gateway de pagos'.

---

*Reto generado automaticamente por Challenge Generator - Pragma*
