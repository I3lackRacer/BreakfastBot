import java.io.IOException;
import java.util.Random;

import in.ashwanthkumar.slack.webhook.Slack;
import in.ashwanthkumar.slack.webhook.SlackMessage;

public class BreakfastBot {

	private static final Random RANDOM = new Random();
	private static final String[] member = new String[] { 
			"@UDXRZPDEU", 
			"@pb" 
			};

	public static void main(String[] args) {
		new BreakfastBot().sendMessageToAtelierBreakfast();
	}

	public void sendMessageToAtelierBreakfast() {
		String user = member[RANDOM.nextInt(member.length)];
		SlackMessage slackMessage = new SlackMessage("<" + user + "> ist heute mit Essen machen dran.");
		Slack slack = new Slack("https://hooks.slack.com/services/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");
		try {
			slack.push(slackMessage);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
