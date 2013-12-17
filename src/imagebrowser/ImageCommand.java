package imagebrowser;

import imagebrowser.UserInterface.ImageViewer;

public abstract class ImageCommand implements Command{
    public ImageViewer viewer;
    
    @Override
    public abstract void execute();
}
