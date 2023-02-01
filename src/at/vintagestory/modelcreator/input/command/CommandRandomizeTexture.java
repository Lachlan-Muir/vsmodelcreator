package at.vintagestory.modelcreator.input.command;

import at.vintagestory.modelcreator.ModelCreator;
import at.vintagestory.modelcreator.ProjectChangeHistory;
import at.vintagestory.modelcreator.model.Element;

public class CommandRandomizeTexture implements ProjectCommand
{
	private static ProjectChangeHistory history = ModelCreator.changeHistory;
	
	@Override
	public void execute()
	{
		if (ModelCreator.currentProject.SelectedElement != null) {		
    		history.beginMultichangeHistoryState();
    		ModelCreator.currentProject.SelectedElement.RandomizeTexture();
			history.endMultichangeHistoryState(ModelCreator.currentProject);
		}
		
    	ModelCreator.updateValues(null);
	}
}
