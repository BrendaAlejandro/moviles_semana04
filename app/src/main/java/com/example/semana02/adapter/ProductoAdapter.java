package com.example.semana02.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.semana02.R;
import com.example.semana02.entity.Producto;

import java.util.List;

public class ProductoAdapter extends ArrayAdapter<Producto> {
    private Context context;
    private List<Producto> objects;
    public ProductoAdapter(@NonNull Context context, int resource, @NonNull List<Producto> objects) {
        super(context, resource, objects);
        this.context = context;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.producto_item, parent, false);

        Producto objProducto = objects.get(position);

        TextView txtId = row.findViewById(R.id.idItemId);
        txtId.setText(String.valueOf(objProducto.getId()));

        TextView txtTitle = row.findViewById(R.id.idItemProductoTitle);
        txtTitle.setText(String.valueOf(objProducto.getTitle()));


        TextView txtRate = row.findViewById(R.id.idItemRate);
        txtRate.setText(String.valueOf(objProducto.getRating().getRate()));

        TextView txtCount= row.findViewById(R.id.idItemCount);
        txtCount.setText(String.valueOf(objProducto.getRating().getCount()));

        return row;
    }
}
