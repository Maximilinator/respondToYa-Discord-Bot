package listeners;

import net.dv8tion.jda.core.events.guild.voice.GuildVoiceJoinEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class VoiceListener extends ListenerAdapter {

	public void onGuildVoiceJoin(GuildVoiceJoinEvent event) {
		event.getGuild().getTextChannelsByName("musiclog", true).get(0)
				.sendMessage(event.getVoiceState().getMember().getUser().getName()
						+ " ------> " + event.getChannelJoined().getName())
				.queue();
	}
}
