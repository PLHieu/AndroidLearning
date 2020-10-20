package com.example.recycleview_jetpack;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<Hero> mHeros;

    public HeroAdapter(Context mContext, ArrayList<Hero> mHeros) {
        this.mContext = mContext;
        this.mHeros = mHeros;
    }

    // Load layout cua 1 dong va tra ve mot ViewHolder
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        View heroView = inflater.inflate(R.layout.row, parent, false);
        ViewHolder viewHolder = new ViewHolder(heroView);
        return viewHolder;
    }

    @Override
    // Gan data vao trong RecyclerView thong qua ViewHolder
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Hero hero = mHeros.get(position);
        holder.mImageHero.setImageResource(mHeros.get(position).getImage());
        holder.mTextName.setText(hero.getName());
    }

    @Override
    public int getItemCount() {
        return mHeros.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImageHero;
        private TextView mTextName;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImageHero = itemView.findViewById(R.id.image_hero);
            mTextName = itemView.findViewById(R.id.text_name);
        }
    }

}
