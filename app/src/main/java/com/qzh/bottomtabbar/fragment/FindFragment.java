package com.qzh.bottomtabbar.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qzh.bottomtabbar.R;

import static android.content.ContentValues.TAG;

/**
 * Created by Administrator on 2017/10/23 0023.
 */
/**
 * A simple {@link Fragment} subclass.
 */
public class FindFragment extends Fragment {

    public FindFragment() {


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView: ============f");
        return inflater.inflate(R.layout.fragment_find, container, false);
    }
}
