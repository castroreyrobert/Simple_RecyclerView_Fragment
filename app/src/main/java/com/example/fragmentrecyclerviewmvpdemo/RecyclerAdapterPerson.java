package com.example.fragmentrecyclerviewmvpdemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by castroreyrobert on 7/11/17.
 */

public class RecyclerAdapterPerson extends RecyclerView.Adapter<RecyclerAdapterPerson.ViewHolder> {

    private List<Person> mPersonList;

    private Context mContext;

    public RecyclerAdapterPerson(Context context, List<Person> personList) {
        mPersonList = new ArrayList<Person>();
        mContext = context;
        mPersonList = personList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //Inflate the layout from item_person
        View itemLayout = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_person, null);
        ViewHolder viewHolder = new ViewHolder(itemLayout);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.firstName.setText(mPersonList.get(position).getFirstName());
        holder.lastName.setText(mPersonList.get(position).getLastName());
        holder.age.setText(String.valueOf(mPersonList.get(position).getAge()));
    }

    @Override
    public int getItemCount() {
        return mPersonList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView firstName, lastName, age;
        public ViewHolder(View itemView) {
            super(itemView);
            // Views in item_person.xml
            initViews(itemView);

        }

        @Override
        public void onClick(View v) {

        }

        private void initViews(View view){
            firstName = (TextView)view.findViewById(R.id.textViewBoardMateName);
            lastName = (TextView)view.findViewById(R.id.textViewAddress);
            age = (TextView)view.findViewById(R.id.textViewNumber);
        }
    }
}
