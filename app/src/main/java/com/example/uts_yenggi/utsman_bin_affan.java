package com.example.uts_yenggi;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;


 public class utsman_bin_affan extends ListActivity {
        protected void onCreate(Bundle isicle) {
            super.onCreate(isicle);
            String[] listRS = new String[]{"Sejarah", "Silsilah", "Wilayah Kekuasan", "Foto Peninggalan"};
            this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listRS));
        }

        protected void onListItemClick(ListView l, View v, int position, long id) {
            super.onListItemClick(l, v, position, id);
            Object o = this.getListAdapter().getItem(position);
            String pilihan = o.toString();
            tampilkanpilihan(pilihan);
        }

        private void tampilkanpilihan(String pilihan) {
            try {
                Intent a = null;
                if (pilihan.equals("Sejarah")) {
                    String website = "https://jateng.inews.id/berita/kisah-khalifah-utsman-bin-affan";
                    a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

                } else if (pilihan.equals("Silsilah")) {
                    String website = "http://walpaperhd99.blogspot.com/2020/01/riwayat-hidup-silsilah-utsman-bin-affan.html";
                    a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

                } else if (pilihan.equals("Wilayah Kekuasan")) {
                    String website = "https://budayakanberislam.blogspot.com/2019/06/perluasan-wilayah-islam-pada-masa-usman.html";
                    a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

                } else if (pilihan.equals("Foto Peninggalan")) {
                    String website = "https://aceh.kemenag.go.id/berita/505520/sumur-raumah-ustman-bin-affan-hingga-persoalan-wakaf-terkini";
                    a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
                }
                startActivity(a);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


