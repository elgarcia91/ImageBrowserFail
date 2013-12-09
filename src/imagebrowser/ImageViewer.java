package imagebrowser;

public abstract class ImageViewer {

    private Image image;

    public void setImage(Image image) {
        this.image = image;
        refresh();
    }

    public Image getImage() {
        return image;
    }

    public abstract void refresh();
}
