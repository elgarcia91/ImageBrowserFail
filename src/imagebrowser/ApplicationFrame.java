
package imagebrowser;

import imagebrowser.UserInterface.ImageViewer;
import java.awt.PopupMenu;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ApplicationFrame extends JFrame{
    private ImageViewer imageViewer;
    
    public ApplicationFrame(){
        super("Image viewer");
        this.setSize(1024, 800);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.createComponents();
        this.setVisible(true);
    }

    public ImageViewer getImageViewer() {
        return imageViewer;
    }
    
    private void createComponents() {
        this.add(createImagePanel());
    }

    private JPanel createImagePanel() {
        ImagePanel panel = new ImagePanel();
        this.imageViewer = panel;
        return panel;
    }

}
