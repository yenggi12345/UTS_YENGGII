package com.example.uts_yenggi;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ayyubiyah extends ListActivity {
    protected void onCreate(Bundle isicle) {
        super.onCreate(isicle);
        String[] listRS = new String[]{"Sejarah", "Silsilah", "Wilayah Kekuasan", "Foto Peninggalan"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listRS));
    }
    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Sejarah")) {
                String website = "https://id.wikipedia.org/wiki/Dinasti_Ayyubiyah";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            } else if (pilihan.equals("Silsilah")) {
                String website = "https://www.kompas.com/skola/read/2020/11/27/090000269/sejarah-perang-salib-iii-1189-1192-";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            } else if (pilihan.equals("Wilayah Kekuasan")) {
                String website = "https://www.google.com/search?q=wilayah+kekuasaan+dinasti+ayyubiyah&safe=strict&sxsrf=ALeKk01tYHun7hcrrBko_WT1CZfRZ_O3-g:1624287224793&tbm=isch&source=iu&ictx=1&fir=E16x7ZDYSX56FM%252CGKqIqCuDRVb_1M%252C_&vet=1&usg=AI4_-kT9Q7L1ZrU0RD6wzwypQt9yR6BISQ&sa=X&ved=2ahUKEwioza-4_ajxAhUIbn0KHZXYC1wQ_h16BAgMEAE#imgrc=E16x7ZDYSX56FM";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            } else if (pilihan.equals("Foto Peninggalan")) {
                String website = "https://www.republika.co.id/berita/m8lhlo/peninggalan-dinasti-umayyah-5habis";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
            }
            startActivity(a);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

