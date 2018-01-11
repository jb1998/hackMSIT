package com.developer.jatin.hackmsit;

import android.app.AlertDialog;
import android.app.Fragment;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link case1.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link case1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class case1 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public case1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment case1.
     */
    // TODO: Rename and change types and number of parameters
    public static case1 newInstance(String param1, String param2) {
        case1 fragment = new case1();
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
//        return inflater.inflate(R.layout.fragment_blank, container, false);
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        TextView t1=(TextView)view.findViewById(R.id.more1);
        TextView t2=(TextView)view.findViewById(R.id.more2);
        TextView t3=(TextView)view.findViewById(R.id.more3);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                alert.setTitle("For maths");
//                ImageView imageView=new ImageView(Links_activity.this);
                TextView textView=new TextView(getActivity());
                textView.setText("Educate Girls along with UBS Optimus Foundation (UBSOF) and Children's Investment Fund Foundation (CIFF) launched the world's first Development Impact Bond (DIB) in education on June 16, 2014.\n" +
                        " It's a 3-year pilot that begun in the academic year of 2015.");

                textView.setPadding(20, 20, 20, 20);
//                imageView.setBackgroundResource(R.drawable.android);

                alert.setView(textView);
                alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
                alert.show();
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                alert.setTitle("For maths");
//                ImageView imageView=new ImageView(Links_activity.this);
                TextView textView=new TextView(getActivity());
                textView.setText("Educate Girls along with UBS Optimus Foundation (UBSOF) and Children's Investment Fund Foundation (CIFF) launched the world's first Development Impact Bond (DIB) in education on June 16, 2014.\n" +
                        " It's a 3-year pilot that begun in the academic year of 2015.");

                textView.setPadding(20, 20, 20, 20);
//                imageView.setBackgroundResource(R.drawable.android);

                alert.setView(textView);
                alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
                alert.show();
            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
                alert.setTitle("For maths");
//                ImageView imageView=new ImageView(Links_activity.this);
                TextView textView=new TextView(getActivity());
                textView.setText("Educate Girls along with UBS Optimus Foundation (UBSOF) and Children's Investment Fund Foundation (CIFF) launched the world's first Development Impact Bond (DIB) in education on June 16, 2014.\n" +
                        " It's a 3-year pilot that begun in the academic year of 2015.");

                textView.setPadding(20, 20, 20, 20);
//                imageView.setBackgroundResource(R.drawable.android);

                alert.setView(textView);
                alert.setNegativeButton("Close", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.dismiss();
                    }
                });
                alert.show();
            }
        });
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
