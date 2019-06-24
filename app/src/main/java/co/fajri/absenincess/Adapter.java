package co.fajri.absenincess;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.TarunaViewHolder> {

    private ArrayList<Model> dataList;

    public Adapter(ArrayList<Model> dataList){
        this.dataList = dataList;
    }

    @Override
    public TarunaViewHolder onCreateViewHolder (ViewGroup parent,int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.list_item,parent, false);
        return new TarunaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(TarunaViewHolder holder, int position) {
        holder.tvNo.setText(dataList.get(position).getNo());
        holder.tvNama.setText(dataList.get(position).getNama());
        holder.tvNpt.setText(dataList.get(position).getNpt());
        holder.tvKelas.setText(dataList.get(position).getKelas());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() :0;
    }

    public class TarunaViewHolder extends RecyclerView.ViewHolder{
        private TextView tvNo,tvNama,tvNpt,tvKelas;

        public TarunaViewHolder(View itemView) {
            super(itemView);
            tvNo = (TextView) itemView.findViewById(R.id.tv_no);
            tvNama = (TextView) itemView.findViewById(R.id.tv_nama);
            tvNpt = (TextView) itemView.findViewById(R.id.tv_npt);
            tvKelas = (TextView) itemView.findViewById(R.id.tv_kelas);
        }
    }
}