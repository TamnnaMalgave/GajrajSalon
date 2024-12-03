package com.example.gajraj;

import static android.content.Context.MODE_PRIVATE;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LwaxingFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class LwaxingFragment extends Fragment {
    CardView c1,c2,c3,c4,c5;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    FirebaseDatabase database;
    DatabaseReference reference,dbref;

    private ProgressDialog pd;
    Context context;

    public LwaxingFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment LwaxingFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static LwaxingFragment newInstance(String param1, String param2) {
        LwaxingFragment fragment = new LwaxingFragment();
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
        OnBackPressedCallback callback=new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Intent i=new Intent(getActivity().getApplicationContext(),services.class);
                startActivity(i);
            }
        };

        requireActivity().getOnBackPressedDispatcher().addCallback(this,callback);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lwaxing, container, false);
        pd = new ProgressDialog( getActivity());
        reference = FirebaseDatabase.getInstance().getReference();

        c1 = (CardView) view.findViewById(R.id.c1);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //rate=200;
                TextView facewax = view.findViewById(R.id.text1);
                TextView facewaxdiscrip = view.findViewById(R.id.text2);
                String title = facewax.getText().toString();
                String discrip = facewaxdiscrip.getText().toString();
                AlertDialog.Builder ab = new AlertDialog.Builder(getActivity())
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                uploadData(title,discrip);


                            }
                        }).setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                ab.setTitle("CONFIRMATION");
                ab.setMessage("Do you really want to book it?");
                ab.show();
            }
        });
        c2 = (CardView) view.findViewById(R.id.c2);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //rate=200;
                TextView rollon = view.findViewById(R.id.text3);
                TextView rollondiscrip = view.findViewById(R.id.text4);
                String title = rollon.getText().toString();
                String discrip = rollondiscrip.getText().toString();
                AlertDialog.Builder ab = new AlertDialog.Builder(getActivity())
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                uploadData(title,discrip);


                            }
                        }).setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                ab.setTitle("CONFIRMATION");
                ab.setMessage("Do you really want to book it?");
                ab.show();
            }
        });
        c3 = (CardView) view.findViewById(R.id.c3);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //rate=200;
                TextView honey = view.findViewById(R.id.text5);
                TextView honeydiscrip = view.findViewById(R.id.text6);
                String title = honey.getText().toString();
                String discrip = honeydiscrip.getText().toString();
                AlertDialog.Builder ab = new AlertDialog.Builder(getActivity())
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                uploadData(title,discrip);


                            }
                        }).setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                ab.setTitle("CONFIRMATION");
                ab.setMessage("Do you really want to book it?");
                ab.show();
            }
        });
        c4 = (CardView) view.findViewById(R.id.c4);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //rate=200;
                TextView choco = view.findViewById(R.id.text7);
                TextView chocodiscrip = view.findViewById(R.id.text8);
                String title = choco.getText().toString();
                String discrip = chocodiscrip.getText().toString();
                AlertDialog.Builder ab = new AlertDialog.Builder(getActivity())
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                uploadData(title,discrip);


                            }
                        }).setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                ab.setTitle("CONFIRMATION");
                ab.setMessage("Do you really want to book it?");
                ab.show();
            }
        });
        c5 = (CardView) view.findViewById(R.id.c5);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //rate=200;
                TextView bead = view.findViewById(R.id.text9);
                TextView beaddiscrip = view.findViewById(R.id.text10);
                String title = bead.getText().toString();
                String discrip = beaddiscrip.getText().toString();
                AlertDialog.Builder ab = new AlertDialog.Builder(getActivity())
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                uploadData(title,discrip);


                            }
                        }).setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                ab.setTitle("CONFIRMATION");
                ab.setMessage("Do you really want to book it?");
                ab.show();
            }
        });
        return view;
    }
    private void uploadData(String s,String s1) {
        pd.setMessage("Uploading...");
        pd.show();
        SharedPreferences sP = getActivity().getSharedPreferences("Mypref",MODE_PRIVATE);
        String uniqueKey = sP.getString("uniquekey","no value");
        dbref = reference.child("users");
        dbref.child(uniqueKey).child("LadiesWaxing").child(s).setValue(s1).addOnSuccessListener(new OnSuccessListener() {
            @Override
            public void onSuccess(Object o) {
                pd.dismiss();
                Toast.makeText(getActivity(), "Your data updated successfully.", Toast.LENGTH_SHORT).show();



            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                pd.dismiss();
                Toast.makeText(getActivity(), "Something went wrong.", Toast.LENGTH_SHORT).show();
            }
        });

    }
}