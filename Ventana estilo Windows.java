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

            for(Window window : JFrame.getWindows()) {
                SwingUtilities.updateComponentTreeUI(window);
            }
    
        } catch(Exception e){
            e.printStackTrace();
        }
         //JOptionPane.showMessageDialog(null, "LookAndFeel: " + UIManager.getLookAndFeel().toString(), "LAF", JOptionPane.PLAIN_MESSAGE);
    }
