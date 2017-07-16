package com.example.fragmentrecyclerviewmvpdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class PersonListFragment extends Fragment {

    private RecyclerView mRecyclerView;
    List<Person> mPersonList;
    String [] listFirstName = {"Rey", "Robert", "Adi","Hanah"};
    String [] listLastName = {"Castro", "Gentilizo", "Salada"};
    int[] age = {23,24,25};

    private RecyclerAdapterPerson mAdapterPerson;



    public PersonListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflating the fragment_person_list.xml
        View rootView = inflater.inflate(R.layout.fragment_person_list, null);
        mPersonList = new ArrayList<Person>();
            for (int i = 0; i<3; i++){
                mPersonList.add(new Person(listFirstName[i], listLastName[i], age[i]));
            }

        // Reference to the recyclerview
        mRecyclerView = (RecyclerView)rootView.findViewById(R.id.recyclerViewPerson);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        // Adapter
        mAdapterPerson = new RecyclerAdapterPerson(mPersonList);
        mRecyclerView.setAdapter(mAdapterPerson);

        return rootView;
    }

}
