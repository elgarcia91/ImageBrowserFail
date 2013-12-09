package imagebrowser;

public abstract class Image {

    public abstract void setNext(Image image);
    public abstract Image getNext();
    public abstract void setPrev(Image image);
    public abstract Image getPrev();
    public abstract Dimension getDimension();
}
