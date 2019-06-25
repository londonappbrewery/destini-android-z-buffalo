package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    TextView mStoryTextView;
    Button mTopButton;
    Button mBottomButton;
    int myStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:



        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(myStoryIndex == 1){
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                    myStoryIndex = 3;
                }
               else if(myStoryIndex == 3){
                    mStoryTextView.setText(R.string.T6_End);
                   myStoryIndex = 6;
                    //kill buttons
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);

                }
               else if (myStoryIndex==2){
                    mStoryTextView.setText(R.string.T3_Story);
                    mTopButton.setText(R.string.T3_Ans1);
                    mBottomButton.setText(R.string.T3_Ans2);
                    myStoryIndex = 3;
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(myStoryIndex == 1){
                    mStoryTextView.setText(R.string.T2_Story);
                    mTopButton.setText(R.string.T2_Ans1);
                    mBottomButton.setText(R.string.T2_Ans2);
                    myStoryIndex = 2;
                }

                else if(myStoryIndex == 3){
                    mStoryTextView.setText(R.string.T5_End);
                    myStoryIndex = 5;
                    // kill buttons
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }
                else if(myStoryIndex ==2){
                    mStoryTextView.setText(R.string.T4_End);
                    myStoryIndex = 4;
                    // kill buttons
                    mTopButton.setVisibility(View.GONE);
                    mBottomButton.setVisibility(View.GONE);
                }


            }
        });

    }
}
