package cn.apiclub.captcha.backgrounds;

import cn.apiclub.captcha.util.FileUtil;
import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.security.SecureRandom;

public class ImageBackgroundProducer implements BackgroundProducer {
    private static final SecureRandom random = new SecureRandom();
    private final int imageId;

    public ImageBackgroundProducer() {
        this.imageId = random.nextInt(11);
    }

    public ImageBackgroundProducer(int imageId) {
        this.imageId = imageId > 11 ? 0 : imageId;
    }

    @Override
    public BufferedImage addBackground(BufferedImage bi) {
        return getBackground(bi.getWidth(), bi.getHeight());
    }

    @Override
    public BufferedImage getBackground(int width, int height) {
        try {
            BufferedImage img = ImageIO.read(FileUtil.readResource(("/backgrounds/" + this.imageId + ".png"));
            Graphics2D graphics  = img.createGraphics();
            graphics.setPaint(null);
            graphics.drawImage(img, 0, 0, null);
            graphics.dispose();
            return img;
        } catch (IOException e) {
            System.err.println("Image could not found!");
        }
        return null;
    }
}
