package com.github.kiyocy24.stat_recorder.entity.db

import java.sql.Timestamp

class KillLog(
        val id: Int = 0,
        val userId: Int = 0,
        val userLoginNum: Int = 0,
        val bat: Int = 0,
        val blaze: Int = 0,
        val caveSpider: Int = 0,
        val chicken: Int = 0,
        val cow: Int = 0,
        val creeper: Int = 0,
        val drowned: Int = 0,
        val enderman: Int = 0,
        val endermite: Int = 0,
        val ghast: Int = 0,
        val husk: Int = 0,
        val magmaCube: Int = 0,
        val phantom: Int = 0,
        val pig: Int = 0,
        val piglin: Int = 0,
        val pillager: Int = 0,
        val sheep: Int = 0,
        val shulker: Int = 0,
        val silverfish: Int = 0,
        val skeleton: Int = 0,
        val slime: Int = 0,
        val snowman: Int = 0,
        val spider: Int = 0,
        val squid: Int = 0,
        val villager: Int = 0,
        val witch: Int = 0,
        val wither: Int = 0,
        val witherSkelton: Int = 0,
        val wolf: Int = 0,
        val zombie: Int = 0,
        val zombieVillager: Int = 0,
        val zombiePiglin: Int = 0,
        val createdAt: Timestamp = Timestamp(0),
        val updatedAt: Timestamp = Timestamp(0)
) {}