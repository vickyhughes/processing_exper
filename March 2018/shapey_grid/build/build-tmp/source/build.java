import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class build extends PApplet {

int s = 50;

public void setup() {
	
}

public void draw() {
	noLoop();
	background(0xffcdcdcd);
	noStroke();
	for (int y = s; y < height - s - s/5; y += s+s/5) {
		for (int x = s; x < width - s - s/5; x += s+s/5) {
			fill(0xff52a0d0);
			stroke(255);
			rect(x, y, s, s);
			random_circles(x, y , s);
			random_rectangles(x, y, s);
			random_sq_grid(x, y , s);
			}
		}
}

public void random_rectangles(float x, float y, float h) {
	noStroke();
	fill(0xff008f95);
	int random_num = round(random(1));
	if (random_num == 1) {
		beginShape();
		vertex(x, y + h/2);
		vertex(x + h/2, y + h);
		vertex(x + h, y + h/2);
		vertex(x + h/2, y);
		endShape();
	};
}

public void random_circles(float x, float y, float h) {
	noStroke();
	fill(0xff015249);
	int random_num = round(random(1));
	if (random_num == 1) {
		ellipse(x+h/2, y+h/2, h, h);
	}
}

public void random_sq_grid(float x, float y, float h) {
	noStroke();
	fill(0xff88bbd6);
	int random_num = round(random(4));
	if (random_num == 1) {
		rect(x + h/8, y+ h/8, 3*h/4, 3*h/4);
	} else if (random_num == 2) {
		// row 1
		rect(x + h/8, y + h/8, h/4, h/4);
		rect(x + 5*h/8, y + h/8, h/4, h/4);
		// row 2
		rect(x + h/8, y + 5*h/8, h/4, h/4);
		rect(x + 5*h/8, y + 5*h/8, h/4, h/4);
	} else if (random_num == 3) {
		// row 1
		rect(x + h/7, y + h/7, h/5, h/5);
		rect(x + 3*h/7, y + h/7, h/5, h/5);
		rect(x + 5*h/7, y + h/7, h/5, h/5);
		// row 2
		rect(x + h/7, y + 3*h/7, h/5, h/5);
		rect(x + 3*h/7, y + 3*h/7, h/5, h/5);
		rect(x + 5*h/7, y + 3*h/7, h/5, h/5);
		// row 3
		rect(x + h/7, y + 5*h/7, h/5, h/5);
		rect(x + 3*h/7, y + 5*h/7, h/5, h/5);
		rect(x + 5*h/7, y + 5*h/7, h/5, h/5);
	} else if (random_num == 4) {
		// row 1
		rect(x + h/9, y + h/9, h/9, h/9);
		rect(x + 3*h/9, y + h/9, h/9, h/9);
		rect(x + 5*h/9, y + h/9, h/9, h/9);
		rect(x + 7*h/9, y + h/9, h/9, h/9);
		// row 2
		rect(x + h/9, y + 3*h/9, h/9, h/9);
		rect(x + 3*h/9, y + 3*h/9, h/9, h/9);
		rect(x + 5*h/9, y + 3*h/9, h/9, h/9);
		rect(x + 7*h/9, y + 3*h/9, h/9, h/9);
		// row 3
		rect(x + h/9, y + 5*h/9, h/9, h/9);
		rect(x + 3*h/9, y + 5*h/9, h/9, h/9);
		rect(x + 5*h/9, y + 5*h/9, h/9, h/9);
		rect(x + 7*h/9, y + 5*h/9, h/9, h/9);
		// row 4
		rect(x + h/9, y + 7*h/9, h/9, h/9);
		rect(x + 3*h/9, y + 7*h/9, h/9, h/9);
		rect(x + 5*h/9, y + 7*h/9, h/9, h/9);
		rect(x + 7*h/9, y + 7*h/9, h/9, h/9);

	}
}

  public void settings() { 	size(640, 640); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "build" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
