package com.example.rv;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {

private ArrayList<String> persons;
private RecyclerView recyclerView;
private PersonAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

	@Override
	public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
		super.onViewCreated(view, savedInstanceState);
	loadData();
	recyclerView = view.findViewById(R.id.recycler);
	adapter =  new PersonAdapter (persons);
	recyclerView.setAdapter(adapter);
    }

	private void loadData() {
    	persons = new ArrayList<>();
    	persons.add("Maks");
    	persons.add("Maks");
    	persons.add("Maks");
    	persons.add("Maks");
    	persons.add("Maks");
    	persons.add("Maks");
    	persons.add("Maks");
    	persons.add("Maks");
    	persons.add("Maks");
    	persons.add("Maks");
    	persons.add("Maks");
    	persons.add("Maks");
    	persons.add("Maks");
    	persons.add("Maks");
    	persons.add("Maks");
    	persons.add("Maks");
    	persons.add("Maks");
    	persons.add("Maks");
    	persons.add("Maks");
    	persons.add("Maks");
    	persons.add("Maks");
	}


}