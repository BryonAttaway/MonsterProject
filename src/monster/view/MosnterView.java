package monster.view;

import javas.swing.JOptionPane;

public class MosnterView
{
	private MonsterAppController baseController;
	
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;
	}
	
	
	public void displayInformation()
	{
		JOptionPane.showMessageDialog(null, "Imade a monster");
		JOptionPane.showMessageDialog(null, "It's name is" + baseController.getMyMonster().getName());
	}
}
