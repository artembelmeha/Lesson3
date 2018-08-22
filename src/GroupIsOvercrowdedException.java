
public class GroupIsOvercrowdedException extends Exception {
	private String messageText;

	public GroupIsOvercrowdedException(String messageText) {
		super();
		this.messageText = messageText;
	}

	public GroupIsOvercrowdedException() {
		super();
	}

	public String getMessageText() {
		return messageText;
	}

	@Override
	public String toString() {
		return "Exeption [messageText=" + messageText + "]";
	}
}
