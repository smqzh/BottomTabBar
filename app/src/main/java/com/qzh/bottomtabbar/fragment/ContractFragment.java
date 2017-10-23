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
public class ContractFragment extends Fragment {


    public ContractFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView: ============c");
        return inflater.inflate(R.layout.fragment_contract, container, false);
    }

    /*
    *
    * 此方法可以操作刷新
    * */
    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);


    }


}