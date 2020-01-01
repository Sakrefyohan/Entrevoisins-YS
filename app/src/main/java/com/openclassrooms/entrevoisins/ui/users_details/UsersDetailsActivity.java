package com.openclassrooms.entrevoisins.ui.users_details;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.ui.neighbour_list.ListNeighbourPagerAdapter;
import org.w3c.dom.Text;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class UsersDetailsActivity extends AppCompatActivity implements View.OnClickListener {

   // private ImageView mInfo;          //neighbours_info_picture;
   // private Button mFavButton;        //neighbours_info_fav_button;
   // private TextView mNameSmall;      //neighbours_info_name_small;
   // private TextView mAddress;        //neighbours_info_address;
   // private TextView mNumber;         //neighbours_info_number;
   // private TextView mLink;           //neighbours_info_link;
   // private TextView mAproposTitle;   //neighbours_info_apropos_title;
   // private TextView mAproposText;    //neighbours_info_apropos_text;
   // private TextView mNameBig;        //neighbours_info_name_big;


    @BindView(R.id.neighbours_info_picture) ImageView mPicture;
    @BindView(R.id.neighbours_info_fav_button)Button mFavButton;
    @BindView(R.id.neighbours_info_name_small)TextView mNameSmall;
    @BindView(R.id.neighbours_info_address) TextView mAddress;
    @BindView(R.id.neighbours_info_number) TextView mNumber;
    @BindView(R.id.neighbours_info_link) TextView mLink;
    @BindView(R.id.neighbours_info_apropos_title) TextView mAproposTitle;
    @BindView(R.id.neighbours_info_apropos_text)TextView mAproposText;
    @BindView(R.id.neighbours_info_name_big)TextView mNameBig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_details);
        ButterKnife.bind(this);

    }

    // Clique sur le bouton Fav
    // Modification de l'etat du voisin
    @OnClick(R.id.neighbours_info_fav_button)
    void setFavButton(View view){

        if(neighbourIsFav) {
            neighbourIsFav = False;
        }else {neighbourIsFav = True;}
    }


}

