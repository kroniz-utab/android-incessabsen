package co.fajri.absenincess;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<Model> tarunaArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        Adapter adapter = new Adapter(tarunaArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);


        recyclerView.setAdapter(adapter);
    }

    void addData(){
        tarunaArrayList = new ArrayList<>();
        tarunaArrayList.add(new Model("01","Ade Hermawan Fajri", "41.17.0063", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("02","Adhityana Cahya Desyandari", "41.17.0064", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("03","Aditya Rafi Pratama", "41.17.0065", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("04","Adji Satrio", "41.17.0066", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("05","Afi Fatzi Fathur Wijanarko", "41.17.0067", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("06","Arindea Anggraini Setiawan", "41.17.0068", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("07","Aurora Denita", "41.17.0069", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("08","Badia Lumbanbatu", "41.17.0070", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("09","Bagas Mahendra Putra", "41.17.0071", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("10","Hendra Setiaji", "41.17.0072", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("11","Iqbal Lilo Mranoto", "41.17.0073", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("12","Jaya Hasan", "41.17.0074", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("13","Martua Verlin Putra Siahaan", "41.17.0075", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("14","Megawati Putri", "41.17.0076", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("15","Mochamad Fadzika Ardan", "41.17.0077", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("16","Muhamad Hidayat", "41.17.0078", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("17","Muhamad Zaki Lazuardi", "41.17.0079", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("18","Muhammad Sultan Malik Yuzakir", "41.17.0080", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("19","Muhammad Taqi Ramadhan", "41.17.0081", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("20","Muhammad Thareq Amal", "41.17.0082", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("21","Nicholas Sanjaya Siahaan", "41.17.0083", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("22","Niken Putri Ramadhani", "41.17.0084", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("23","Nurma Agustika", "41.17.0085", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("24","Ofan Setya Rahayu", "41.17.0086", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("25","Raisan Fikar Jatmiko", "41.17.0087", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("26","Rama Widho Ananda", "41.17.0088", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("27","Rudy Zakaria", "41.17.0089", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("28","Sekar Amelinda Praniza", "41.17.0090", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("29","Sigit Ary Subara", "41.17.0091", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("30","Timur Idam Kesuma", "41.17.0092", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("31","Veresita Kurnia Ayu", "41.17.0093", "INSTRUMENTASI 4C"));
        tarunaArrayList.add(new Model("32","Yusri", "42.18.0001", "INSTRUMENTASI 4C"));
    }

}
