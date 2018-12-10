import org.junit.Test;
import static org.junit.Assert.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java .awt.*;

public class BitmapTest {
    private File one = new File("resources", "abstract.bmp");

    @Test
    public void testFlipVertically() {
        try {
            BufferedImage img = ImageIO.read(one);
            Bitmap bm = new Bitmap(img, "src/test/java/abstract_test_fv.bmp");
            int expected = img.getRGB(0, 0);
            int expected2 = img.getRGB(20, 50);
            bm.flipVertically();
            assertTrue(bm.newName.length() > 0);
            assertEquals("pixel y value should be reversed", expected, bm.original.getRGB(0, img.getHeight() - 1));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testFlipHorizonally() {
        try {
            BufferedImage img = ImageIO.read(one);
            Bitmap bm = new Bitmap(img, "src/test/java/abstract_test_fh.bmp");

            bm.flipHorizontally();
            assertTrue(bm.newName.length() > 0);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
    @Test
    public void testDarken(){
        try{
            BufferedImage img = ImageIO.read(one);
            Bitmap bm = new Bitmap(img, "src/test/java/abstract_test_dn.bmp");
            int origina1 = img.getRGB(0,0);
            int original2 = img.getRGB(20,50);
            bm.darken();
            assertEquals("rgb value lower than original1", true,origina1>bm.original.getRGB(0,0));

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
