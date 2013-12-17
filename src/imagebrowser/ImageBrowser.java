package imagebrowser;

import imagebrowser.UserInterface.ImageViewer;
import imagebrowser.model.Image;

public class ImageBrowser {

    public static void main(String[] args) {
        new ImageBrowser().execute();
    }

    private void execute() {
        Image[] images = linkImages(createImages());
        ImageViewer viewer = createImageViewer(images[0]);
        //Crear Consola o Panel???
    }

    private Image[] linkImages(Image[] images) {
        for (int i = 0; i < images.length; i++) {
            Image image = images[i];
            Image nextImage = images[(i+1)%images.length];
            image.setNext(nextImage);
            Image prevImage = images[(i-1)%images.length];
            image.setPrev(prevImage);
        }
    }

    private Image[] createImages() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ImageViewer createImageViewer(Image image) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
