package net.funkpla.examplemod

import net.fabricmc.api.ModInitializer
import net.funkpla.examplemod.Constants.MOD_NAME
import org.slf4j.Logger

@Suppress("UnusedExpression")
object ExampleMod : ModInitializer {

    private val logger: Logger = Constants.LOG


    override fun onInitialize() {

        logger.info("Initializing $MOD_NAME")
    }

}
