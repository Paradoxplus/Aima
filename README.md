# Xicor Practice

Standalone client-side Fabric practice UI for Minecraft 1.21.11 / Java 21.

## Included
- Lightweight practice settings screen
- Timing-coach and target-overlay toggles (currently UI scaffolding)
- Client-side only; no server components
- No automated aiming, attack input, or triggerbot

## Build
GitHub Actions builds the mod automatically on each push. You can also run it manually from the **Actions** tab using **Build Fabric mod**.

The compiled JAR is uploaded as the workflow artifact named `xicor-practice-minecraft-1.21.11`.

For a local build, use JDK 21 and Gradle 8.12.1:

```bash
gradle build
```

The JAR is generated under `build/libs/`.

## Open the screen
The default key is Right Shift. On mobile launchers, keybinding access depends on the launcher's keyboard/input support. A future touch HUD button can be added.
