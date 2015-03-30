# simplecaptcha
a simple captcha for apiclub

this simplecaptcha as well as SimpleCaptcha (http://simplecaptcha.sourceforge.net)

In Maven:
```xml
 <dependency>
   <groupId>cn.apiclub.tool</groupId>
   <artifactId>simplecaptcha</artifactId>
   <version>1.2.2</version>
 </dependency>
```

How to use it ? For Example:

```java
 List<Color> colors = new ArrayList<Color>();
 colors.add(Color.GREEN);
 colors.add(Color.BLUE);
 
 List<Font> fonts = new ArrayList<Font>();
 fonts.add(new Font("Geneva", 2, 32));
 fonts.add(new Font("Courier", 3, 32));
 
 WordRenderer wordRenderer = new DefaultWordRenderer(colors, fonts);
 
 Captcha captcha = new Captcha.Builder(150, 50).addText(wordRenderer)).build();
 
 //Output to file
 CaptchaServletUtil.writeImage(new FileOutputStream("d:\\captcha.png"), captcha.getImage());
 
 //Show it on the web page
 CaptchaServletUtil.writeImage(response, captcha.getImage());
 
```

if you do not like using it from maven repository,you can just download it by click (https://raw.githubusercontent.com/tavenli/simplecaptcha/master/release/1.2.2/simplecaptcha-1.2.2.jar)

<br/>
![001](https://raw.githubusercontent.com/tavenli/simplecaptcha/master/example/captcha1.png)

<br/>
![002](https://raw.githubusercontent.com/tavenli/simplecaptcha/master/example/captcha2.png)

<br/>
![003](https://raw.githubusercontent.com/tavenli/simplecaptcha/master/example/example_big.png)

<br/>
![004](https://raw.githubusercontent.com/tavenli/simplecaptcha/master/example/example_chinese.png)

<br/>
![005](https://raw.githubusercontent.com/tavenli/simplecaptcha/master/example/example_multi.png)

<br/>
![006](https://raw.githubusercontent.com/tavenli/simplecaptcha/master/example/example_outline_noisy.png)


