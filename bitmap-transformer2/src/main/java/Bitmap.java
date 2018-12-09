
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Bitmap {
    public BufferedImage original;
    public String newName;
    public Bitmap(BufferedImage image, String outputName){
        this.original = image;
        this.newName = outputName;

    }

    public void flipHorizontally(){
       for(int i = 0; i<original.getHeight(); i++){
           for(int j = 0; j<original.getWidth()/2; j++){
               int temp = original.getRGB(j,i);
               original.setRGB(i,j,original.getRGB(i,original.getWidth()-j-1));
               original.setRGB(i,original.getWidth()-j-1,temp);
         }
      }
    save();
 }
 //flip vertically
 public void flipVertically(){
     for(int i = 0; i<original.getHeight(); i++){
         for(int j = 0; j<original.getWidth()/2; j++){
             int temp = original.getRGB(i,j);
             original.setRGB(i,j,original.getRGB(i,original.getWidth()-j-1));
             original.setRGB(i,original.getWidth()-j-1,temp);
         }
     }
save();
 }
 //darken
    public void darken(){
        for(int i = 0; i<original.getHeight(); i++){
            for(int j = 0; j<original.getWidth()/2; j++){
                original.setRGB(j,i,(new Color(original.getRGB(j,i))).darker().getRGB());
            }

        }
        save();
    }

 //save
    public void save(){
        File output = new File(this.newName);
        try{
            ImageIO.write(original, "bmp", output);
        }catch (IOException e){

        }

    }
}
