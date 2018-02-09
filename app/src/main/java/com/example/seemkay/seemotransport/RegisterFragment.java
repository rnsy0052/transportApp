package com.example.seemkay.seemotransport;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by emkay on 9/2/18.
 */

public class RegisterFragment extends android.support.v4.app.Fragment {


    public static final RegisterFragment newInstance(String id) {

        RegisterFragment f = new RegisterFragment();
        Bundle bd1 = new Bundle(1);
        bd1.putString("id",id);
        f.setArguments(bd1);
        return f;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = null;
        String id = getArguments().getString("id");
        if(id.charAt(0) == '0') {
            rootView = (ViewGroup) inflater.inflate(R.layout.register_page_login, container, false);
            return rootView;
        }
        else if(id.charAt(0)=='1') {
            rootView = (ViewGroup) inflater.inflate(R.layout.register_page_personal, container, false);
            return rootView;
        }
        else if(id.charAt(0)=='2') {
            rootView = (ViewGroup) inflater.inflate(R.layout.register_page_supervisor, container, false);
            return rootView;
        }
        return rootView;

    }

}
