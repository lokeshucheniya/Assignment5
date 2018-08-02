import java.util.*; 
class Television {

	public static void main(String args[])
	{
		
		Scanner scanner=new Scanner(System.in);
		TelevisionTest television=new TelevisionTest();
		
		
		System.out.println("Enter the Current state (ON/OFF)");
		String currentState= scanner.nextLine();
		television.setCurrentState(currentState);
		
		
		if(currentState.equals("OFF"))
		{
			System.out.println("Do you want to turn on the TV?");
			String turn= scanner.nextLine();
			if(turn.equals("Yes"))
			{
				television.turnTV("ON");
			}
			else
				System.exit(0);
		}
		
		
		
		System.out.println("Enter the Current volume");
		int currentVolume= scanner.nextInt();
		television.setCurrentVolume(currentVolume);
		
		System.out.println("Enter the Current channel");
		int currentChannel= scanner.nextInt();
		television.setCurrentChannel(currentChannel);
		
		
		
		
		System.out.println("Do you want to increase the volume?");
		String answerIncreaseVolune= scanner.next();
		// System.out.println(answerIncreaseVolune);
		
		if(answerIncreaseVolune.equals("Yes"))
		{
			System.out.println("Enter the value by which you want to increase the volune");
			int increasedVolume=scanner.nextInt();
			television.increaseVolume(increasedVolume);
			System.out.println("The current volume is "+television.getCurrentVolume());
		}
		
		System.out.println("Do you want to decrease the volume?");
		String answerDecreaseVolune= scanner.next();
		if(answerDecreaseVolune.equals("Yes"))
		{
			System.out.println("Enter the value by which you want to decrease the volune");
			int decreasedVolume=scanner.nextInt();
			television.decreaseVolume(decreasedVolume);
			System.out.println("The current volume is "+television.getCurrentVolume());
		}
		
		System.out.println("Do you want to change the channel?");
		String answerchangeChannel= scanner.next();
		if(answerchangeChannel.equals("Yes"))
		{
			System.out.println("Enter the channel number");
			int changedChannel=scanner.nextInt();
			television.changeChannel(changedChannel);
			System.out.println("The current channel is "+television.getCurrentChannel());
		}
		
		System.out.println("Do you want to turn off the TV?");
		String turn= scanner.next();
		if(turn.equals("Yes"))
		{
			television.turnTV("OFF");
		}
	}
}