package cn.apiclub.captcha;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testWebApp()
    {
/*		List<Color> colors = new ArrayList<Color>();
		colors.add(Color.GREEN);
		colors.add(Color.BLUE);
		colors.add(Color.ORANGE);
		colors.add(Color.RED);
		
		List<Font> fonts = new ArrayList<Font>();
		fonts.add(new Font("Geneva", 2, 32));
		fonts.add(new Font("Courier", 3, 32));
		fonts.add(new Font("Arial", 1, 32));
	    
		//WordRenderer wordRenderer = new ColoredEdgesWordRenderer(colors, fonts);
		WordRenderer wordRenderer = new DefaultWordRenderer(colors, fonts);
		
		Captcha captcha = new Captcha.Builder(150, 50).addText(wordRenderer).gimp(new DropShadowGimpyRenderer())
				.addBackground(new TransparentBackgroundProducer()).build();*/

		//request.getSession().setAttribute("verifyCode", captcha.getAnswer());
		
		//CaptchaServletUtil.writeImage(response, captcha.getImage());
    }
    
/*    public void testApp() throws FileNotFoundException{
    	List<Color> colors = new ArrayList<Color>();
		colors.add(Color.GREEN);
		colors.add(Color.BLUE);
		colors.add(Color.ORANGE);
		colors.add(Color.RED);
		
		List<Font> fonts = new ArrayList<Font>();
		fonts.add(new Font("Geneva", 2, 32));
		fonts.add(new Font("Courier", 3, 32));
		fonts.add(new Font("Arial", 1, 32));
	    
		//WordRenderer wordRenderer = new ColoredEdgesWordRenderer(colors, fonts);
		WordRenderer wordRenderer = new DefaultWordRenderer(colors, fonts);
		
		Captcha captcha = new Captcha.Builder(150, 50).addText(wordRenderer).gimp(new DropShadowGimpyRenderer())
				.addBackground(new TransparentBackgroundProducer()).build();
		
		CaptchaServletUtil.writeImage(new FileOutputStream("d:\\captcha.png"), captcha.getImage());
		
    }*/
}
