package com.leleedits.bot.commands;

import com.leleedits.bot.commands.util.Command;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.List;

public class ExampleCommand implements Command {

    @Override
    public void run(List<String> args, MessageReceivedEvent event) {
        event.getChannel().sendMessage("This is a example command!").queue();
    }

    @Override
    public String getCommand() {
        return "example";
    }

    @Override
    public String getHelp() {
        return "Just an example command...";
    }
}
