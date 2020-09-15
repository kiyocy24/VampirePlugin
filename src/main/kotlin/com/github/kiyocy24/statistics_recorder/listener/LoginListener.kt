package com.github.kiyocy24.statistics_recorder.listener

import com.github.kiyocy24.statistics_recorder.entity.view.User
import com.github.kiyocy24.statistics_recorder.mysqlConn
import com.github.kiyocy24.statistics_recorder.repository.UserRepository
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerLoginEvent
import java.sql.Timestamp

object LoginListener : Listener {
    @EventHandler
    fun onPlayerLoginEvent(e: PlayerLoginEvent) {
        val user = UserRepository(mysqlConn).searchByUuid(e.player.uniqueId.toString())
        val newUser = User(
                uuid = e.player.uniqueId.toString(),
                name = e.player.name,
                lastLogin = Timestamp(System.currentTimeMillis())
        )
        if (user.id == 0) {
            UserRepository(mysqlConn).insert(newUser)
        }
        else {
            UserRepository(mysqlConn).
            update(newUser)
        }
    }
}