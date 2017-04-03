boolean button1 = false;
boolean button2 = false;
GumballMachine gumach = new GumballMachine(100);

void setup() 
{
  size(800, 800) ;
  background(255) ;
  smooth() ;
  strokeWeight(3);
  strokeCap(ROUND);
  frameRate(30);
}

void draw() {

  fill(0);
  PFont font;
  font = loadFont("BookAntiqua-48.vlw");
  
  textFont(font, 32);

  text("Gumball Machine", 250, 60);

  PImage image = loadImage("gumball.jpg");
  image(image, (width-image.width)/2, (height-image.height)/2);
  textSize(20);
  text("Current Gumball count: " + gumach.count, 60, 350);

  Boxes();
//runTest();
}

public void Boxes() {



  if ((mouseX > 200) && (mouseX < 300) && (mouseY > 670) && (mouseY < 720)) {
    fill(96);
    if (mousePressed) {
        gumach.insertQuarter();
        button1 = true;  
        button2 = false;
    }
  } else {
        fill(255);
  }
  if (button1) {
        fill(0);
        rect(200, 670, 100, 50, 10);
  } else {
        rect(200, 670, 100, 50, 10);
  }

  if ((mouseX > 500) && (mouseX < 600) && (mouseY > 670) && (mouseY < 720)) {
        fill(96);
        if (mousePressed) {
            gumach.turnCrank();
            button2 = true;
            button1 = false;
    }
  } else {
            fill(255);
  }
  if (button2) {
            fill(0);
            rect(500, 670, 100, 50, 10);
  } else {
            rect(500, 670, 100, 50, 10);
  }
  
  fill(0);
  textSize(14);
  
  if (button1)
    fill(255);
  text("Insert Quarter", 205, 700);
  fill(0);
  
  if (button2)
    fill(255);
  text("Turn Crank", 512, 700);
  fill(0);
}


public void runTest() {
  GumballMachine gumballMachine = new GumballMachine(5);
  System.out.println(gumballMachine);
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  System.out.println(gumballMachine);
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  gumballMachine.insertQuarter();
  gumballMachine.turnCrank();
  System.out.println(gumballMachine);
}