package com.example.p10_ps;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class frag1 extends Fragment {

    ArrayList<String> alColour;
    Button btnColour;


    public frag1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View frag1 = inflater.inflate(R.layout.fragment_1, container, false);

        btnColour = frag1.findViewById(R.id.btnColour);
        alColour = new ArrayList<String>();
        alColour.add("#AAFFAA");
        alColour.add("#FFAAAA");
        alColour.add("#AAAAFF");
        alColour.add("#FFAAFF");
        alColour.add("#AABBCC");

        btnColour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rand = new Random().nextInt(3);
                String randColour = alColour.get(rand);
                frag1.setBackgroundColor(Color.parseColor(randColour));
            }
        });
     return frag1;
    }

}
