package com.example.customlistview;

import android.content.Context;
import android.view.SurfaceControlViewHost;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<RowObject> {

    private Context _context;
    private int _resource;
    private List<RowObject> _arrobjects;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<RowObject> arrobjects) {
        super(context, resource, arrobjects);
        _context = context;
        _resource = resource;
        _arrobjects = arrobjects;

    }

    private static class ViewHolder{
        ImageView img;
        TextView title;
        TextView des;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = LayoutInflater.from(_context).inflate(R.layout.row, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.des = (TextView) convertView.findViewById(R.id.rowDes);
            viewHolder.title = (TextView) convertView.findViewById(R.id.rowTitle);
            viewHolder.img = (ImageView) convertView.findViewById(R.id.row_imgView);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder)convertView.getTag();
        }

        RowObject rowObject = _arrobjects.get(position);
        viewHolder.img.setImageResource(rowObject.getImage());
        viewHolder.title.setText(rowObject.getTitle());
        viewHolder.des.setText(rowObject.getDescription());

        return convertView;
    }
}
