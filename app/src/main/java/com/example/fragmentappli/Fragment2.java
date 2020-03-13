package com.example.fragmentappli;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment2 extends Fragment1 {
    public Fragment2(){
    }


    @Override
    //inflater est un objet qui va transformer les view defini en XML en objet Java
    //container est le viewgroup(RelativeLayout, frameLayout...) sers à contenir le fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_2, container, false);
        return rootView;
    }
}
