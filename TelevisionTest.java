public class TelevisionTest {

	private String currentState;
	private int currentVolume;
	private int currentChannel;
	
		
	public String getCurrentState() {
		return currentState;
	}

	public void setCurrentState(String currentState) {
		this.currentState = currentState;
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public void setCurrentVolume(int currentVolume) {
		this.currentVolume = currentVolume;
	}

	public int getCurrentChannel() {
		return currentChannel;
	}

	public void setCurrentChannel(int currentChannel) {
		this.currentChannel = currentChannel;
	}
	
	
	
	public int increaseVolume(int increasedVolume)
	{
		currentVolume+=increasedVolume;
		return currentVolume;
	}
	

	public int decreaseVolume(int decreasedVolume)
	{
		currentVolume-=decreasedVolume;
		return currentVolume;
	}
	
	public int changeChannel(int changedChannel)
	{
		currentChannel=changedChannel;
		return currentChannel;
	}
	
	public void turnTV(String state)
	{
		currentState=state;
		if (currentState.equals("ON"))
		{
			System.out.println("The TV is switched ON");
		}
		else if(currentState.equals("OFF"))
		{
			System.out.println("The TV is switched OFF");
			System.exit(0);
		}
		else
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
	}
	
	
}