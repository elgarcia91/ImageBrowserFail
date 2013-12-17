package imagebrowser.UserInterface;

import imagebrowser.model.Image;

public interface ImageViewer {

    public void show(Image image);

    public Image getImage();
}
// show