

package com.foodcourt.foodcourt;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;

public class ItemOneFragment extends Fragment{
    public static ItemOneFragment newInstance() {
        ItemOneFragment fragment = new ItemOneFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_item_one, container, false);
        //Code to get the button from layout file
        Button btn = (Button) rootView.findViewById(R.id.fpview);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //Implement the code to run on button click here
                Log.i("HI", "Button Pressed");

                MainActivity activity = (MainActivity) getActivity();
                activity.onFpView();
            }
        });
        return rootView;
    }


}
