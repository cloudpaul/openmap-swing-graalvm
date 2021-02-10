import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Properties;
import com.bbn.openmap.MapBean;
import com.bbn.openmap.layer.shape.ShapeLayer;

public class SwingTest {

  public static void main(final String[] args) {

    JFrame frame = new JFrame("Swing!");
    frame.setSize(640, 480);

      MapBean mapBean = new MapBean();
      ShapeLayer shapeLayer = new ShapeLayer();
      Properties shapeLayerProps = new Properties();
      shapeLayerProps.put("prettyName", "Political Solid");
      shapeLayerProps.put("lineColor", "000000");
      shapeLayerProps.put("fillColor", "BDDE83");
      shapeLayerProps.put("shapeFile", "data/shape/dcwpo-browse.shp");
      shapeLayerProps.put("spatialIndex", "data/shape/dcwpo-browse.ssx");
      shapeLayer.setProperties(shapeLayerProps);
      mapBean.add(shapeLayer);
      frame.getContentPane().add(mapBean);

    frame.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
    frame.setVisible(true);
  }
}
