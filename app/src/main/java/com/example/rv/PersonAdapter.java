package com.example.rv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {

	private ArrayList<String> data;

	public PersonAdapter(ArrayList<String> data) {
		this.data = data;
	}

	@NonNull
	@Override
	public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		return new PersonViewHolder
			(LayoutInflater.from(parent.getContext()).inflate
				(R.layout.item_person, parent, false));
	}

	@Override
	public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
		holder.bind(data.get(position));
	}

	@Override
	public int getItemCount() {
		return data.size();
	}

	static class PersonViewHolder extends RecyclerView.ViewHolder{
		private TextView person;

		public PersonViewHolder(@NonNull View itemView) {
			super(itemView);
			person=itemView.findViewById(R.id.person);
		}

		public void bind(String name) {
			person.setText(name);
		}
	}
}
