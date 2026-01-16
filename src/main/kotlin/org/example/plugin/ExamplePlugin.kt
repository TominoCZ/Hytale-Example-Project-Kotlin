package org.example.plugin

import com.hypixel.hytale.logger.HytaleLogger
import com.hypixel.hytale.server.core.plugin.JavaPlugin
import com.hypixel.hytale.server.core.plugin.JavaPluginInit

/**
 * This class serves as the entrypoint for your plugin. Use the setup method to register into game registries or add
 * event listeners.
 */
class ExamplePlugin(init: JavaPluginInit) : JavaPlugin(init) {
    override fun setup() {
        LOGGER.atInfo().log("Setting up plugin $name")
        commandRegistry.registerCommand(ExampleCommand(name, manifest.version.toString()))
    }

    companion object {
        private val LOGGER = HytaleLogger.forEnclosingClass()
    }

    init {
        LOGGER.atInfo().log("Hello from $name version ${manifest.version}")
    }
}
