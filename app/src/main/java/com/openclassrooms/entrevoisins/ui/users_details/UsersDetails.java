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

    private ImageView mInfo;     //neighbours_info_picture;
    private Button mFavButton;        //neighbours_info_fav_button;
    private TextView mNameSmall;      //neighbours_info_name_small;
    private TextView mAddress;      //neighbours_info_address;
    private TextView mNumber;      //neighbours_info_number;
    private TextView mLink;      //neighbours_info_link;
    private TextView mAproposTitle;      //neighbours_info_apropos_title;
    private TextView mAproposText;      //neighbours_info_apropos_text;
    private TextView mNameBig;      //neighbours_info_name_big;
    private TextView mReturnButton;      //neighbours_info_return_button;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_details);
        ButterKnife.bind(this);

        mInfo = findViewById(R.id.neighbours_info_picture);
        mFavButton = findViewById(R.id.neighbours_info_fav_button);
        mNameSmall = findViewById(R.id.neighbours_info_name_small);
        mAddress = findViewById(R.id.neighbours_info_address);
        mNumber = findViewById(R.id.neighbours_info_number);
        mLink = findViewById(R.id.neighbours_info_link);
        mAproposTitle = findViewById(R.id.neighbours_info_apropos_title);
        mAproposText = findViewById(R.id.neighbours_info_apropos_text);
        mNameBig = findViewById(R.id.neighbours_info_name_big);
        mReturnButton = findViewById(R.id.neighbours_info_return_button);




    }
}
