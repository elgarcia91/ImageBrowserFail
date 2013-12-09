package imagebrowser;

public class ProxyImage extends Image {

    private final ImageLoader loader;
    private Image next;
    private Image prev;
    private Image realImage;

    public ProxyImage(ImageLoader loader) {
        this.loader = loader;
    }

    @Override
    public void setNext(Image image) {
        this.next = image;
    }

    @Override
    public Image getNext() {
        return next;
    }

    @Override
    public void setPrev(Image image) {
        this.prev = image;
    }

    @Override
    public Image getPrev() {
        return prev;
    }

    @Override
    public Dimension getDimension() {
        if (realImage == null) {
            realImage = loader.load();
        }
        return realImage.getDimension();
    }
}