package com.leleedits.bot;

import com.leleedits.bot.commands.util.Listener;
import com.leleedits.bot.sql.MySQL;
import com.leleedits.bot.sql.MySQLManager;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.security.auth.login.LoginException;

public class Bot {

    public static Logger logger = LoggerFactory.getLogger(Bot.class);
    private static JDA JDA;

    public static void main(String[] args) throws LoginException {
        JDABuilder builder = JDABuilder.createDefault("");

        builder.addEventListeners(new Listener());

        JDA = builder.build();
    }

    public Logger getLogger() {
        return logger;
    }
}
