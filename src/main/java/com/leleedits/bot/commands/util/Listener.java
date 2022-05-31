package com.leleedits.bot.commands.util;

import com.leleedits.bot.Bot;
import com.leleedits.bot.util.Constants;
import net.dv8tion.jda.api.events.ReadyEvent;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Listener extends ListenerAdapter {

    public final CommandManager manager = new CommandManager();
    public final Logger logger = LoggerFactory.getLogger(Bot.class);

    @Override
    public void onReady(@NotNull ReadyEvent event) {
        logger.info("Bot is online!");
    }
}
