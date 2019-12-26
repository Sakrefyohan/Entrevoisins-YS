package com.openclassrooms.entrevoisins.ui.users_details;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.ui.neighbour_list.ListNeighbourPagerAdapter;

import org.w3c.dom.Text;

import butterknife.ButterKnife;

public class UsersDetails extends AppCompatActivity  {

    private ImageView ;     //neighbours_info_picture;
    private Button ;        //neighbours_info_fav_button;
    private TextView ;      //neighbours_info_name_small;
    private TextView ;      //neighbours_info_adress;
    private TextView ;      //neighbours_info_number;
    private TextView ;      //neighbours_info_link;
    private TextView ;      //neighbours_info_apropos_title;
    private TextView ;      //neighbours_info_apropos_text;
    private TextView ;      //neighbours_info_name_big;
    private TextView ;      //neighbours_info_return_button;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_details);
        ButterKnife.bind(this);

        mInfo = (TextView) findViewById(R.id.activity_main_greeting_txt);



    }
}
