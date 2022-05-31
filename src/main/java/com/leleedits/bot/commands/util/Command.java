package com.leleedits.bot.commands.util;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import java.util.List;

public interface Command {

    void run(List<String> args, MessageReceivedEvent event);

    String getCommand();

    String getHelp();
}
