package io.ankit.twisteddemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ModelDummyAdapter extends RecyclerView.Adapter<ModelDummyAdapter.DemoViewHolder> {
    Context context;
    ArrayList<Integer> data;

    public ModelDummyAdapter(Context context, ArrayList<Integer> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public ModelDummyAdapter.DemoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recycler_item,parent,false);

        return new DemoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ModelDummyAdapter.DemoViewHolder holder, int position) {
        Integer integer=data.get(position);
        holder.textView.setText(String.valueOf(integer));

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class DemoViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        public DemoViewHolder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.textView);
        }
    }
}
