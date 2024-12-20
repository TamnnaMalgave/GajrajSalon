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
 * Use the {@link SkinFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SkinFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    CardView s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
    public SkinFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SkinFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SkinFragment newInstance(String param1, String param2) {
        SkinFragment fragment = new SkinFragment();
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
        View view= inflater.inflate(R.layout.fragment_skin, container, false);
        s1=(CardView) view.findViewById(R.id.s1);
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Product Benefits \nEveryuth Naturals Purifying Neem Face Wash, enriched with Tea Tree Oil, Chamomile and neem extract, cleanses your skin. Made with nano marine extracts, this face wash helps in rehydrating the skin. Nano-Multi Vitamins helps with Sebum control for healthy, beautiful and clear skin. Suitable for all skin types.",Toast.LENGTH_LONG).show();
            }
        });
        s2=(CardView) view.findViewById(R.id.s2);
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Product Benefits \nGently polish away unwanted pigmentation, dead cells and blackheads with natures essence anti marks face scrub. Powered by a papaya enzyme proven to lighten marks, the formulation is tough on scars and bumps but delicate on skin, leaving your face smooth, soft and flawless.",Toast.LENGTH_LONG).show();
            }
        });

        s3=(CardView) view.findViewById(R.id.s3);
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Product Benefits \nThis cream based cleansing scrub has special properties of golden dust, peppermint oil and orange oil which give deep cleansing effect while giving a gentle scrubbing also. It's cleaning action balances the PH of the skin. While gentle grains helps in removing blackheads and dead cells. ",Toast.LENGTH_LONG).show();
            }
        });

        s4=(CardView) view.findViewById(R.id.s4);
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Product Benefits \nPowered by 100 percent pure activated charcoal for absorbing skin toxins , cleansing pores, removing blackheads and dirt.",Toast.LENGTH_LONG).show();
            }
        });

        s5=(CardView) view.findViewById(R.id.s5);
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Product Benefits \nVisibly works on dark spots/marks on the skin.\n" +
                        "Impart glow to reveal brighter skin tone with regular weekly usage.\n" +
                        "Reveals brighter, even skin tone with visible difference with every use.\n" +
                        "Lightens and brightens skin tone.",Toast.LENGTH_LONG).show();
            }
        });

        s6=(CardView) view.findViewById(R.id.s6);
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Product Benefits \nTightens pores, helps to prevent dirt and grime from entering your skin. Makes your skin look firm and youthful with a natural glow. It lightens dark spots and pigmentation and gives you a healthy glowing skin.",Toast.LENGTH_LONG).show();
            }
        });

        s7=(CardView) view.findViewById(R.id.s7);
        s7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Product Benefits \nHelps exfoliate and detoxify the skin, giving it, a porcelain-like smoothness.\n" +
                        "It accelerates cell renewal, giving the skin a youthful glow.\n" +
                        "It gently nourishes the skin and helps restore its luster.\n" +
                        "It helps remove dead cells and maintains pH balance of the skin. .",Toast.LENGTH_LONG).show();
            }
        });

        s8=(CardView) view.findViewById(R.id.s8);
        s8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Product Benefits \nThe Scrub purifies and brightens the skin. Contains botanical extracts of rose, orange peel, aloe vera, carrot seed and Vitamin-E, along with honey. Makes skin smooth, supple and translucent, with a youthful glow..",Toast.LENGTH_LONG).show();
            }
        });

        s9=(CardView) view.findViewById(R.id.s9);
        s9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Product Benefits \nIt is a moisturising cream that controls oiliness and tones the pores, imparting a smooth texture. It is specially designed to moisturise normal, oily and combination skin. A light, frothy cream, easily absorbed, leaving the skin healthy and youthful.",Toast.LENGTH_LONG).show();
            }
        });
        s10=(CardView) view.findViewById(R.id.s10);
        s10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Product Benefits \nOzone Glo Radiance Skin Activating Nectar offers nourishment, hydration and repair of skin cells to obtain extraordinary radiance and healing. This skin-activating nectar has natural antioxidant and moisturizing properties that improve the skin tone and texture, leaving skin smoother, brighter and more radiant..",Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }
}