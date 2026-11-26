# FactuGest

Proyecto Android nativo en Kotlin con Jetpack Compose y Material 3.

## Estructura inicial

```text
app/src/main/java/com/example/factugest/
├── MainActivity.kt                 # Entrada Android
└── ui/
    ├── FactuGestApp.kt             # Scaffold, barra superior e inferior
    ├── navigation/
    │   ├── FactuGestDestination.kt # Rutas y títulos
    │   └── FactuGestNavHost.kt     # Grafo de navegación
    ├── components/
    │   └── ScreenPlaceholder.kt    # Contenido provisional compartido
    ├── screens/
    │   ├── home/HomeScreen.kt
    │   ├── invoices/InvoicesScreen.kt
    │   ├── clients/ClientsScreen.kt
    │   └── settings/SettingsScreen.kt
    └── theme/                     # Colores, tipografía y tema existentes
```

Las cuatro secciones son una propuesta inicial, pendiente de adaptar a las
pantallas del proyecto Flutter. Cada pantalla es un composable independiente
con su propia vista previa. La navegación conserva y restaura el estado de las
secciones y evita duplicar destinos al pulsar la pestaña seleccionada.

Los textos están en `app/src/main/res/values/strings.xml`. Los iconos de la barra
son iniciales provisionales. Esta base todavía no contiene formularios, datos,
autenticación ni persistencia. Se añadirán modelos, repositorios y ViewModels
cuando las pantallas necesiten esa lógica.

Para añadir una sección: crear su pantalla en `ui/screens`, declarar su destino
en `FactuGestDestination` y registrarlo en `FactuGestNavHost`.

## Compilación

Desde Android Studio, sincronizar Gradle y ejecutar el módulo `app`.
Desde una terminal con JDK y Android SDK configurados:

```powershell
.\gradlew.bat :app:assembleDebug
```

Dependencia de navegación: [Navigation Compose](https://developer.android.com/develop/ui/compose/navigation).
