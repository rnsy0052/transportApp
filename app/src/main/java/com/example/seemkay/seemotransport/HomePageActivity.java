package com.example.seemkay.seemotransport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class HomePageActivity extends AppCompatActivity {


    GridView gridView;

    public String[] mNames = {
            "Schedule_Pick_Up" ,
            "Schedule Drop"  ,
            "Cancle trip"  ,
            "Wait For Me"  ,
            "Today's Bus"  ,
            "My Trip" ,
            "Track Cab"  ,
            "Time to Reach Home"  ,
            "Reached Home"  ,
            "Raise Alert"  ,
            "Help Desk"
    };

    public int[] mImages = {
            R.drawable.pick,
            R.drawable.drop,
            R.drawable.cancle,
            R.drawable.wait,
            R.drawable.todays_bus,
            R.drawable.my_trip,
            R.drawable.track_cab,
            R.drawable.time_to_reach,
            R.drawable.reached_home,
            R.drawable.alert,
            R.drawable.help_desk


    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page2);


                ImageAdapter imageAdapter = new ImageAdapter(HomePageActivity.this, mNames,  mImages);
        gridView = (GridView)findViewById(R.id.iGridView);
                gridView.setAdapter(imageAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                final Intent intent;

                switch(position)
                {
                    case 0:
                        intent = new Intent(HomePageActivity.this,Schedule_Pick_Up.class);
                        break;

                    case 1:
                        intent = new Intent(HomePageActivity.this,Schedule_Pick_Up.class);
                        break;
                    case 2:
                        intent = new Intent(HomePageActivity.this,Schedule_Pick_Up.class);
                        break;

                    case 3:
                        intent = new Intent(HomePageActivity.this,Schedule_Pick_Up.class);
                        break;
                    case 4:
                        intent = new Intent(HomePageActivity.this,Schedule_Pick_Up.class);
                        break;
                    case 5:
                        intent = new Intent(HomePageActivity.this,Schedule_Pick_Up.class);
                        break;
                    case 6:
                        intent = new Intent(HomePageActivity.this,Schedule_Pick_Up.class);
                        break;
                    case 7:
                        intent = new Intent(HomePageActivity.this,Schedule_Pick_Up.class);
                        break;
                    case 8:
                        intent = new Intent(HomePageActivity.this,Schedule_Pick_Up.class);
                        break;
                    case 9:
                        intent = new Intent(HomePageActivity.this,Schedule_Pick_Up.class);
                        break;
                    case 10:
                        intent = new Intent(HomePageActivity.this,Schedule_Pick_Up.class);
                        break;

                    case 11:
                        intent = new Intent(HomePageActivity.this,Schedule_Pick_Up.class);
                        break;
                    default:
                        intent = new Intent(HomePageActivity.this,HomePageActivity.class);
                        break;
                }

               startActivity(intent);

            }
        });

    }
}


