package imagebrowser;

import imagebrowser.UserInterface.ImageViewer;
import imagebrowser.model.Image;
import imagebrowser.swing.SwingBitmap;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class ImagePanel extends JPanel implements ImageViewer  {
    private Image image;
    private int xPos;
    private int offset;

    @Override
    public void show(Image image) {
        this.image = image;
        repaint();
    }

    @Override
    public Image getImage() {
        return image; 
    }
    
    @Override
    public void paint(Graphics graphics){
        graphics.drawImage(getBitmap(), offset, 0, null);
    }

    private BufferedImage getBitmap() {
        if (image.getBitmap() instanceof SwingBitmap) {
            return getBufferedImage((SwingBitmap)image.getBitmap());
        }
        return null;
    }

    private BufferedImage getBufferedImage(SwingBitmap swingBitmap) {
        return swingBitmap.getBufferedImage();
    }

   
}
