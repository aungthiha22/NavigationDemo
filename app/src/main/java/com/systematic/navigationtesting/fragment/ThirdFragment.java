package com.systematic.navigationtesting.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.systematic.navigationtesting.R;

public class ThirdFragment extends Fragment {

    TextView textView;

    public static ThirdFragment newInstance(int someInt, String someTitle) {
        ThirdFragment thirdFragment = new ThirdFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", someInt);
        args.putString("someTitle", someTitle);
        thirdFragment.setArguments(args);
        return thirdFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        // Defines the xml file for the fragment
        return inflater.inflate(R.layout.third_fragment, parent, false);

    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
        textView = view.findViewById(R.id.txt_first_fragment);

        textView.setText("This is Testing third");
    }

}