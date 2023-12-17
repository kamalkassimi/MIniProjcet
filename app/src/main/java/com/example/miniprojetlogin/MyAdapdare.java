package com.example.miniprojetlogin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapdare extends RecyclerView.Adapter<MyAdapdare.WorkHolder> {
    static List<data> removec = new ArrayList<>();
    List<data> lists;
    MyAdapdare adapdare = this;
    public MyAdapdare(List<data> listWork) {
        this.lists = listWork;
    }

    public static class WorkHolder extends RecyclerView.ViewHolder{
        TextView title,text,data_fin11,data_debu ,option;
        Button button;
        CheckBox checkBox;
        public WorkHolder(View view){
            super(view);
            title = view.findViewById(R.id.title);
            text = view.findViewById(R.id.kamal);
            data_fin11 = view.findViewById(R.id.data_fin1);
            data_debu = view.findViewById(R.id.data_debu11);
            option = view.findViewById(R.id.option11);
           checkBox = view.findViewById(R.id.check);
//            button = view.findViewById(R.id.btn);
        }
    }

    @NonNull
    @Override
    public WorkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent,false);
        return new WorkHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull WorkHolder holder, int position) {
        data list = lists.get(position);
        holder.title.setText(list.getTitle());
        holder.data_fin11.setText(list.getData_fin());
        holder.data_debu.setText(list.getData_deub());
        holder.option.setText(list.getOption());
        holder.checkBox.setChecked(list.isCheck());
//        holder.button.setOnClickListener((View)->{
//                lists.remove(list);
//                removec.add(list);
//                adapdare.notifyDataSetChanged();
//        });
//        String priority = ListWork.get(position).getPriorite();
//        if (priority == "Important"){
//            holder.text3.setTextColor(Color.RED);
//        }else if (priority == "Moyen"){
//            holder.text3.setTextColor(Color.BLUE);
//        }else {
//            holder.text3.setTextColor(Color.GREEN);
//        }

        //
       // ListWork.add(list);
    }
    @Override
    public int getItemCount() {
        return lists.size();
    }
}
