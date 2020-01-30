package com.openclassrooms.entrevoisins.ui.neighbour_list;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.openclassrooms.entrevoisins.R;
import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.events.DeleteNeighbourEvent;
import com.openclassrooms.entrevoisins.events.UsersDetailsEvent;
import com.openclassrooms.entrevoisins.model.Neighbour;
import com.openclassrooms.entrevoisins.service.NeighbourApiService;
import com.openclassrooms.entrevoisins.ui.users_details.UsersDetailsActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.List;


public class NeighbourFragment extends Fragment {

    private NeighbourApiService mApiService;
    private List<Neighbour> mNeighbours;
    private RecyclerView mRecyclerView;
    private final static String NEIGHBOURFAV = "0";
    private boolean neighbourIsFavFragment;
    public final static String NEIGHBOUR = "NEIGHBOUR_PARAMETERS";


    /**
     * Create and return a new instance
     * @return @{@link NeighbourFragment}
     */

    /**
     *
     *  Adding a fav Boolean isFav
     */

    public static NeighbourFragment newInstance(boolean isFav) {
        NeighbourFragment fragment = new NeighbourFragment();
        //Creation of the favorites bundle
        Bundle favoriteNeighbour= new Bundle();
        //Adding the value in the bundle
        favoriteNeighbour.putBoolean(NEIGHBOURFAV, isFav);
        fragment.setArguments(favoriteNeighbour);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mApiService = DI.getNeighbourApiService();
        neighbourIsFavFragment = getArguments().getBoolean(NEIGHBOURFAV);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_neighbour_list, container, false);
        Context context = view.getContext();
        mRecyclerView = (RecyclerView) view;
        mRecyclerView.setLayoutManager(new LinearLayoutManager(context));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));

        return view;
    }

    /**
     * Init the List of neighbours
     */
    private void initList() {


        if(neighbourIsFavFragment){
            mNeighbours = mApiService.getFavoriteNeighbour();
            mRecyclerView.setAdapter(new MyNeighbourRecyclerViewAdapter(mNeighbours));

        }else{
            mNeighbours = mApiService.getNeighbours();
            mRecyclerView.setAdapter(new MyNeighbourRecyclerViewAdapter(mNeighbours));}


    }

    @Override
    public void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    public void onResume() {
        super.onResume();
        initList();
    }

    @Override
    public void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    /**
     * Fired if the user clicks on a delete button
     * @param event
     */
    @Subscribe
    public void onDeleteNeighbour(DeleteNeighbourEvent event) {
        mApiService.deleteNeighbour(event.neighbour);
        initList();
    }


    @Subscribe
    public void onUserDetails(UsersDetailsEvent event) {

    Intent userDetails = new Intent(getContext(), UsersDetailsActivity.class);
    userDetails.putExtra(NEIGHBOUR, event.mNeighbour);
    startActivity(userDetails);
    }

}
