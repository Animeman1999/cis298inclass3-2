package edu.kvcc.cis298.criminalintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * Created by dbarnes on 10/5/2016.
 */
public class CrimeFragment extends Fragment {

    private Crime mCrime;
    private EditText mTitleField;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        //Use the inflator to inflate the layout file we want to use with this fragment
        //The first parameter is the layout resource. The second is the passed in
        //container that is the parent widget.
        //The last parameter is whether or not to statically assign the fragment
        //to the parent (FrameLayout) container.
        View v = inflater.inflate(R.layout.fragment_crime, container, false);

        //Get a reference to the EditText Widget in the layout file.
        //instead of just calling findViewById, which is a activity method,
        //we need to call the findViewById that is part of the view we just created.
        //aside from that, it operates the same.
        mTitleField = (EditText)v.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //We aren't doing anything here.
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mCrime.setTitle(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {
                //We aren't doing anything here either.
            }
        });
        return v;
    }
}








