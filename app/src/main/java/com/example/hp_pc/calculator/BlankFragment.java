package com.example.hp_pc.calculator;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hp_pc.calculator.databinding.FragmentBlankBinding;

public class BlankFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    //final FragmentBlankBinding binding2= DataBindingUtil.setContentView(
    //BlankFragment,R.layout.fragment_blank);


}
