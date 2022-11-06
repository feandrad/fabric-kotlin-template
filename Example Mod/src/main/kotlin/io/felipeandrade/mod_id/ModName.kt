package io.felipeandrade.mod_id

import net.fabricmc.api.ModInitializer

object ModName : ModInitializer {
    private const val MOD_ID = "mod_id"

    override fun onInitialize() {
        println("Example mod has been initialized.")
    }
}