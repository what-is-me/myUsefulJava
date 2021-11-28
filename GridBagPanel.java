import javax.swing.*;
import java.awt.*;

public class GridBagPanel extends JPanel {
    GridBagLayout gridBag;

    private GridBagPanel(GridBagLayout gridBag) {
        super(gridBag);
        this.gridBag = gridBag;
    }

    public GridBagPanel() {
        this(new GridBagLayout());
    }

    public Component add(Component comp, int gridx, int gridy, int gridwidth, int gridheight, double zoomMultiples, int w) {
        gridBag.addLayoutComponent(comp, new GridBagConstraints(gridx, gridy, gridwidth, gridheight, zoomMultiples, zoomMultiples, GridBagConstraints.CENTER, GridBagConstraints.BOTH, new Insets(w, w, w, w), 0, 0));
        return add(comp);
    }

    public Component add(Component comp, int gridx, int gridy, int gridwidth, int gridheight) {
        return add(comp, gridx, gridy, gridwidth, gridheight, 1, 0);
    }
    /**
     * comp 组件名
     * 
     * gridx 起始x坐标
     * 
     * gridy 起始y坐标
     * 
     * gridwidth 宽度
     * 
     * gridheight 高度
     * 
     * zoomMultiples 缩放比例，不放大为0
     * 
     * w 与周围组件间隔
     */
}