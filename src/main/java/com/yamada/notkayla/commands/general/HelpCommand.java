package com.yamada.notkayla.commands.general;

import com.yamada.notkayla.commands.Command;
import net.dv8tion.jda.core.*;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;
import java.awt.Color;

public class HelpCommand implements Command {

    @Override
    public void run(JDA bot, GuildMessageReceivedEvent event) {
        EmbedBuilder embed = new EmbedBuilder();
        embed.setColor(new Color(0xe91e63));
        embed.setTitle("Need some help?");
        embed.setDescription("I'm Yamada, and my prefix is `!y`. I hope to make your server a better place!");
        embed.setThumbnail(event.getGuild().getSelfMember().getUser().getAvatarUrl());
        embed.setFooter(String.format("Hello, %s", event.getAuthor().getName()), event.getAuthor().getAvatarUrl());
        embed.addField("General", "`help` - You're viewing it\n`info` - Shows general info about Yamada\n`ping` - Pong!\n`user` - View information on a server member", false);
        embed.addField("Image", "`dog` - Fetches a random dog\n`cat` - Fetches a random cat\n`duck` - Fetches a random duck", false);
        event.getChannel().sendMessage(embed.build()).queue();

    }
}
