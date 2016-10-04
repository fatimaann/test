package com.example.androidstudio.gargarf;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;
import android.view.View;
import android.widget.EditText;

/**
 * Created by androidstudio on 10/09/16.
 */
public class TouchListener extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nextscreen);

        final ImageView image = (ImageView)findViewById(R.id.image);
        final EditText text =(EditText) findViewById(R.id.Text1);
        final EditText text1 =(EditText) findViewById(R.id.Text3);
        final EditText text2 =(EditText) findViewById(R.id.Text4);
        final EditText text3 =(EditText) findViewById(R.id.Text);
        final EditText text4 =(EditText) findViewById(R.id.Text5);


        image.setOnTouchListener(new View.OnTouchListener(){
            float x1,x2,y1,y2,diffy1,diffx1,diffx,diffy;
            @Override
            public boolean onTouch(View v,MotionEvent motion){
                int a= motion.getAction();
                switch(a){
                    case MotionEvent.ACTION_DOWN:
                        x1=motion.getX();
                        y1=motion.getY();
                        text.setText("X1 " + x1 + " Y1 " + y1);
                        return true;
                    case MotionEvent.ACTION_UP:
                        x2=motion.getX();
                        y2= motion.getY();
                       text1.setText("X2 " + x2 + " Y2 " + y2);
                        if (x2>x1 && y2>y1) {
                            diffx = x2 - x1;
                            diffy = y2 - y1;
                            text2.setText("X= " + diffx + " Y= " + diffy);
                        }
                        if (x1>x2 && y1>y2){
                            diffx1=x1-x2;
                            diffy1=y1-y2;
                            text2.setText("X= " + diffx1 + " Y= " + diffy1);
                        }
                        if (x1<x2 && y1<y2){
                            text3.setText("Swipe Right and Down");
                        }
                        if (x1>x2 && y1>y2){
                            text3.setText("Swipe Left and Up");

                        }
                        if (x1<x2 && y1>y2){
                           text3.setText("Swipe Right and Up");
                        }
                        if (x1>x2 && y1<y2){
                            text3.setText("Swipe Left and Down");
                        }
                        if (diffx<0 && diffy<0){
                        text4.setText("Quadrant 3");
                        }
                        if (diffx>0 && diffy<0){
                            text4.setText("Quadrant 4");
                        }
                        if (diffx>0 && diffy>0){
                            text4.setText("Quadrant 1");
                        }
                        if (diffx<0 && diffy>0){
                            text4.setText("Quadrant 2");
                        }
                        if (diffx1<0 && diffy1<0){
                            text4.setText("Quadrant 3");
                        }
                        if (diffx1>0 && diffy1<0){
                            text4.setText("Quadrant 4");
                        }
                        if (diffx1>0 && diffy1>0){
                            text4.setText("Quadrant 1");
                        }
                        if (diffx1<0 && diffy1>0){
                            text4.setText("Quadrant 2");
                        }
                        return true;

                }
                return false;

            }

        });
    }

}
