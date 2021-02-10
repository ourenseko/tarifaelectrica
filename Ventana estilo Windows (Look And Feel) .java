public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        
         try { 
            // método que selecciona la decoración LAF, se comentan todos menos el preferido
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            // MetalLookAndFeel elige el del sistema operativo, en Windows su aspecto es igual a WindowsLookAndFeel
            //UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
                 //javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");

            for(Window window : JFrame.getWindows()) {
                SwingUtilities.updateComponentTreeUI(window);
            }
    
        } catch(Exception e){
            e.printStackTrace();
        }
         //JOptionPane.showMessageDialog(null, "LookAndFeel: " + UIManager.getLookAndFeel().toString(), "LAF", JOptionPane.PLAIN_MESSAGE);
    }

    
    /*
    https://stackoverflow.com/questions/9541045/how-to-set-jframe-look-and-feel
    https://docs.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
    https://www.developer.com/java/data/working-with-javafx-ui-layouts.html
    http://www.forosdelweb.com/f45/alternativas-swing-para-escritorio-985066/
    https://www.pushing-pixels.org/category/substance
    https://www.pushing-pixels.org/wp-content/uploads/2008/01/lawson-frog.jpg
    https://perez987.es/cambiar-lookandfeel-en-java/
    */
