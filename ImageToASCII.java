import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class ImageToASCII {
    private static final String ASCII_CHARS = "@%#*+=-:. "; // Dark to light mapping

    public static void main(String[] args) {
        String imagePath = "imagepath.jpeg"; // Replace with your image path
        int width = 100;  // Set desired width
        int height = 50;  // Set desired height

        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            image = resizeImage(image, width, height);
            String asciiArt = convertToASCII(image);
            System.out.println(asciiArt);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static BufferedImage resizeImage(BufferedImage image, int width, int height) {
        Image tmp = image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resized = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = resized.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();
        return resized;
    }

    private static String convertToASCII(BufferedImage image) {
        StringBuilder ascii = new StringBuilder();
        for (int y = 0; y < image.getHeight(); y++) {
            for (int x = 0; x < image.getWidth(); x++) {
                int pixel = image.getRGB(x, y);
                int gray = (int) (0.3 * ((pixel >> 16) & 0xFF) + 0.59 * ((pixel >> 8) & 0xFF) + 0.11 * (pixel & 0xFF));
                int index = (gray * (ASCII_CHARS.length() - 1)) / 255;
                ascii.append(ASCII_CHARS.charAt(index));
            }
            ascii.append("\n");
        }
        return ascii.toString();
    }
}