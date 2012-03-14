package color2.space;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

///////////////////////////////////////////////////////////////////////
//Importing android views and widgets is a must for almost every task,
//but only Activity and Bundle are auto imported 
//when you create a new project. You can, however, type 
//in the code, hover your mouse over the error notification, and the 
//assist screen that pops up will direct you on the import package
///////////////////////////////////////////////////////////////////////

public class Color2Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       
        setContentView(R.layout.main); 
        //importing the res/layout/main.xml file to be used as the main view. 
        //Also, connecting the model and the controller
     
        
        //tying java items to their respective XML components. Also, building specific communication channels in the bridge between Model and Controller
  
        final Button buttonBlack = (Button) findViewById(R.id.buttonBlack);
        final Button buttonRed = (Button) findViewById(R.id.buttonRed);
        final Button buttonGreen = (Button) findViewById(R.id.buttonGreen);
        final Button buttonBlue = (Button) findViewById(R.id.buttonBlue);
        final Button buttonYellow = (Button) findViewById(R.id.buttonYellow);
        final Button ok = (Button) findViewById(R.id.ok);
        final TextView screen = (TextView) findViewById(R.id.tvScreen);   
     //   final String colorGreen = (String) findViewById(R.string.colorGreen);
        
         
       //Checking is Java/XML item buttonBlack is pressed, then creating an onClick event (prefab code, think toString)
       buttonBlack.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                
                Toast.makeText(Color2Activity.this, "Black Selected", Toast.LENGTH_SHORT).show();
                //Toast.make a message appear(where, what to display, display duration) display method call
               
                //altering the java item 'screen' affects XML item tvScreen instantly, no drawing or refreshing required
                screen.setBackgroundColor(0xFF000000);
                screen.setTextColor(0xFFFFFFFF);
                screen.setText("Hello World! in Black");
                screen.setTextSize(18);

            }
        });
       
        
        buttonRed.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Color2Activity.this, "Red Selected", Toast.LENGTH_SHORT).show();
                screen.setBackgroundColor(0xFFFF0000);
                screen.setTextColor(0xFFFFFFFF);
                screen.setText("Hello World! in Red");
                screen.setTextSize(18);

            }
        });
        
        
        buttonGreen.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Color2Activity.this, "Green Selected", Toast.LENGTH_SHORT).show();
                screen.setBackgroundColor(0xFF00FF00);
                screen.setTextColor(0xFF000000);
                screen.setText("Hello World! in Green");
                screen.setTextSize(18);

            }
        });
        
        buttonYellow.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Color2Activity.this, "Yellow Selected", Toast.LENGTH_SHORT).show();
                screen.setBackgroundColor(0xFFeeee00);
                screen.setTextColor(0xFF000000);
                screen.setText("Hello World! in Yellow");
                screen.setTextSize(18);

            }
        });

        

        buttonBlue.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Color2Activity.this, "Blue Selected", Toast.LENGTH_SHORT).show();
                screen.setBackgroundColor(0xFF0000FF);
                screen.setTextColor(0xff000000);
                screen.setText("Hello World! in Blue");
                screen.setTextSize(18);
 
            }
        });
        
        ok.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(Color2Activity.this, "White Selected", Toast.LENGTH_SHORT).show();
                screen.setBackgroundColor(0xFFFFFFFF);
                screen.setTextColor(0xFF000000);
                screen.setTextSize(9);
                screen.setText("Hello World! in White. \nIf you've noticed, " +
                		"not only has the background color been changing, the text color " +
                		"has also been changing. \nAll this has been accomplished by tethering " +
                		"our Java TextView item 'screen' to 'tvScreen', a XML item. To modify this 'screen' " +
                		"we also tethered our buttons similarly, and added an OnClick event method. \nAlso, " +
                		"this White block uses smaller text. Another text field you see popping up is " +
                		"a Toast message. It is an easy and convienent system message with a simple format " +
                		"and a modifiable delay. Toast may also output variables using get methods, such " +
                		"as 'tv.getText'. \nYou may use RGB or hex when calling numbers in XML but you must " +
                		"use number format when calling them in Java, or source them " +
                		"from R (auto generated resource class), when they are in number format either way.");


            }
        });
    }
}