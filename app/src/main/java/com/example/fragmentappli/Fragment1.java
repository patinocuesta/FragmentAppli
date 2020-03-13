package com.example.fragmentappli;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class Fragment1 extends Fragment {

    public Fragment1(){
    }

    @Override
    //inflater est un objet qui va transformer les view defini en XML en objet Java
    //container est le viewgroup(RelativeLayout, frameLayout...) sers à contenir le fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_1, container, false);
        Button b1 = v.findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick(View v) {
              TextView t= getActivity().findViewById(R.id.texte);
              t.setText("du fragment vers activity");
              FragmentManager f= getFragmentManager();
              Fragment2 f2= (Fragment2) f.findFragmentById(R.id.fragemnt2);
              TextView t2= f2.getActivity().findViewById(R.id.texte2);
              t2.setText("du fragment1 vers le fragment2");
          }
        });
        return v;
    }
}
