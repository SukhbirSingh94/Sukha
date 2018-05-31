package com.ayushmaan.sukha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView imageView;
    Button btNext,btPrev;

    int imageIds[] = {R.drawable.car1,R.drawable.car2,R.drawable.car3,R.drawable.car4,R.drawable.car5};

    int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.iv1);
        btNext = (Button) findViewById(R.id.btNext);
        btPrev = (Button) findViewById(R.id.btPrev);

        btNext.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                index++;
                if(index==5)
                {
                    index=0;
                }
                imageView.setImageResource(imageIds[index]);
            }
        });
        btPrev.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                index--;
                if(index==-1)
                {
                    index = 4;
                }
                imageView.setImageResource(imageIds[index]);
            }
        });


    }
}