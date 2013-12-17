package imagebrowser.persistence;

import imagebrowser.ImageLoader;
import imagebrowser.model.Bitmap;
import imagebrowser.model.Image;

public class ProxyImage implements Image {

    private final ImageLoader loader;
    private Image realImage;

    public ProxyImage(ImageLoader loader) {
        this.loader = loader;
    }

    @Override
    public Bitmap getBitmap() {
        checkLoaded();
        return realImage.getBitmap();
    }

    private void checkLoaded() {
        if (realImage == null) {
            realImage = loader.load();
        }
    }
}