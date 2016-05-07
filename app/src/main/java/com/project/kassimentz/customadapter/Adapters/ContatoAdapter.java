package com.project.kassimentz.customadapter.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.project.kassimentz.customadapter.Model.Contato;
import com.project.kassimentz.customadapter.R;

import java.util.List;

/**
 * Created by Kassi on 07/05/16.
 */
public class ContatoAdapter extends BaseAdapter {

    private List<Contato> listaContatos;
    private Context contexto;

    public  ContatoAdapter (Context contexto, List<Contato> listaContatos){
        this.contexto = contexto;
        this.listaContatos = listaContatos;
    }

    @Override
    public int getCount() {
        return listaContatos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaContatos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Contato contato = listaContatos.get(position);

        LayoutInflater inflater = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.list_item, null);

        TextView txtNome = (TextView) view.findViewById(R.id.txtNome);
        txtNome.setText(contato.getNome());

        TextView txtFone = (TextView) view.findViewById(R.id.txtFone);
        txtFone.setText(contato.getTelefone());

        return view;
    }
}
