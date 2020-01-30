package com.openclassrooms.entrevoisins.ui.users_details;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.service.NeighbourApiService;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.openclassrooms.entrevoisins.ui.neighbour_list.NeighbourFragment.NEIGHBOUR;


public class UsersDetailsActivity extends AppCompatActivity {

    private NeighbourApiService mApiService;


    @BindView(R.id.neighbours_info_picture)
    ImageView mPicture;
    @BindView(R.id.neighbours_info_fav_button)
    FloatingActionButton mFavButton;
    @BindView(R.id.neighbours_info_name_small)
    TextView mNameSmall;
    @BindView(R.id.neighbours_info_address)
    TextView mAddress;
    @BindView(R.id.neighbours_info_number)
    TextView mNumber;
    @BindView(R.id.neighbours_info_link)
    TextView mLink;
    @BindView(R.id.neighbours_info_apropos_title)
    TextView mAproposTitle;
    @BindView(R.id.neighbours_info_apropos_text)
    TextView mAproposText;
    @BindView(R.id.neighbours_info_name_big)
    TextView mNameBig;

    private Neighbour neighbour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_users_details);
        ButterKnife.bind(this);

        neighbour = (Neighbour) getIntent().getSerializableExtra(NEIGHBOUR);
        mNameBig.setText(neighbour.getName());
        mNameSmall.setText(neighbour.getName());
        mAddress.setText(neighbour.getAddress());
        mNumber.setText(neighbour.getNumber());
        mLink.setText(neighbour.getLink());
        mAproposText.setText(neighbour.getAproposText());

        /**
         * Using glide to charge picture for the neighbour
         * */

        Glide.with(this).load(neighbour.getAvatarUrl()).into(mPicture);


        //Ternary expression
        mFavButton.setImageDrawable(ResourcesCompat.getDrawable(getResources(), neighbour.getNeighbourIsFav() ? R.drawable.ic_star_fav : R.drawable.ic_star_nofav, null));


    }

    // Click on the Fav button
    // Changing the neighbour's condition
    @OnClick(R.id.neighbours_info_fav_button)
    void setFavButton(View view) {

        neighbour.setNeighbourIsFav(!neighbour.getNeighbourIsFav());
        mApiService = DI.getNeighbourApiService();
        mApiService.changeFavoriteNeighbour(neighbour.getId());
        mFavButton.setImageDrawable(ResourcesCompat.getDrawable(getResources(), neighbour.getNeighbourIsFav() ? R.drawable.ic_star_fav : R.drawable.ic_star_nofav, null));

    }


}

