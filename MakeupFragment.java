package com.example.gajraj;

import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MakeupFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MakeupFragment extends Fragment {
    CardView m1,m2,m3,m4,m5,m6,m7,m8,m9,m10;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MakeupFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MakeupFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MakeupFragment newInstance(String param1, String param2) {
        MakeupFragment fragment = new MakeupFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_makeup, container, false);
        m1=(CardView) view.findViewById(R.id.m1);
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Product Benefits \nEvenly cover spots,blemishes,dark circles and patchy skin tone.It is smudge free and long lasting.The Vitamin E and silicones enrich the skin-rejuvenating,replenishing and nourishing it on application",Toast.LENGTH_LONG).show();
            }
        });
        m2=(CardView) view.findViewById(R.id.m2);
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Product Benefits \nIt adds perfect touch up to the makeup.It helps you to get rid of excess oil and sweat on your face.Add buildable coverage to your skin and sets your makeup for long hours",Toast.LENGTH_LONG).show();
            }
        });

        m3=(CardView) view.findViewById(R.id.m3);
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Product Benefits \nDesigned by experts,this lip color has an intense matte payoff that lasts long and looks freshly applied for up to 16 hours ",Toast.LENGTH_LONG).show();
            }
        });

        m4=(CardView) view.findViewById(R.id.m4);
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Product Benefits \nThe Primer+Matte lip color makes your lips smooth with a creamy finish.It also ensures that they remain crease-free.It last up to 12 hours.",Toast.LENGTH_LONG).show();
            }
        });

        m5=(CardView) view.findViewById(R.id.m5);
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Product Benefits \nIt's richly pigmented and lasts all day long.Water resistant formula.Smudge proof eyeliner",Toast.LENGTH_LONG).show();
            }
        });

        m6=(CardView) view.findViewById(R.id.m6);
        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Product Benefits \nIt makes look your eye more attractive and more bright.It gives wet-shen gloss to lashes and slightly darkens them.",Toast.LENGTH_LONG).show();
            }
        });

        m7=(CardView) view.findViewById(R.id.m7);
        m7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Product Benefits \nThe eyse shadow palette range is highly pigmented,blendable without loss of pay-off and lasts for hours without creasing or smudging. .",Toast.LENGTH_LONG).show();
            }
        });

        m8=(CardView) view.findViewById(R.id.m8);
        m8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Product Benefits \nIt is long lasting(up to 22 hours). Gives a deep black finish.Smudge proof and water proof.",Toast.LENGTH_LONG).show();
            }
        });

        m9=(CardView) view.findViewById(R.id.m9);
        m9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Product Benefits \nIdeal for normal to oily skin.The long lasting powder leaves a natural,pore-less looking finish with long lasting shine control.Removes excess oils.",Toast.LENGTH_LONG).show();
            }
        });
        m10=(CardView) view.findViewById(R.id.m10);
        m10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Product Benefits \nIt has a creamy consistency that eventually settles in to matte finish. With stunning shades and don't fail to impress,it provides maximum coverage with the right amount of color.",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}