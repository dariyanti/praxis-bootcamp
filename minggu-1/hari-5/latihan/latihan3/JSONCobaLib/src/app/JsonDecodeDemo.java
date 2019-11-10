package app;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.json.simple.parser.JSONParser;

class JsonDecodeDemo {

    public static void main(String[] args) {

        JSONParser parser = new JSONParser();
        // String s = "[120980,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
        String s = "{\"nama\":\"dariyanti\",\"popo\":[100,{\"p\":\"q\"}]}";
        String JsonTransaksi = "[{\"id\":\"4\",\"total\":\"800\",\"untung\":\"0\",\"data_transaksi\":\"{\\\"data_transaksi\\\":[{\\\"nama_barang\\\":\\\"barang barang\\\",\\\"kode_barang\\\":\\\"019\\\",\\\"banyak_barang\\\":4,\\\"harga_jual\\\":200,\\\"harga_beli\\\":200,\\\"diskon\\\":0,\\\"sub_total\\\":800,\\\"sub_untung\\\":0}],\\\"kembali\\\":200,\\\"bayar\\\":1000,\\\"diskon\\\":0,\\\"value_diskon\\\":0,\\\"pajak\\\":0,\\\"value_pajak\\\":0,\\\"total\\\":800,\\\"kode\\\":\\\"20191108130959\\\",\\\"timestamp\\\":\\\"2019-11-08 13:09:59\\\",\\\"keterangan\\\":\\\"\\\",\\\"untung\\\":0,\\\"kasir\\\":\\\"Dinta Aditya\\\",\\\"email_kasir\\\":\\\"\\\",\\\"id_kasir\\\":\\\"\\\"}\",\"data_update\":\"0\",\"email_pelanggan\":\"\",\"email_kasir\":\"\",\"nama_pelanggan\":\"\",\"nama_kasir\":\"Dinta Aditya\",\"tipe_pembayaran\":\"tunai\",\"jatuh_tempo\":\"\",\"total_dibayar\":\"\",\"data_piutang\":\"\",\"diskon\":\"0\",\"pajak\":\"0\",\"value_diskon\":\"0\",\"value_pajak\":\"0\",\"created_at\":\"2019-11-08 13:09:59\",\"deleted_at\":\"2019-11-08 06:09:59\"}]";

        try {
            // "obj" merupakan variabel untk menampung hasil dari parsingan string diatas
            // (s)
            Object obj = parser.parse(JsonTransaksi);
            // karena variabel "obj" merupakan object maka menggunakan JSONObject
            // "obj1" merupakan penampung dari hasil parsingan "obj" menggunakan JSONObject
            // tadi
            JSONArray arrayTransaksi = (JSONArray) obj;

            // untuk mendapatkan "key" "nama" maka menggunakan sebagai berikut
            System.out.println(arrayTransaksi.get(0));

            // karena isi dari popo merupakan array maka menggunakan JSONArray
            // "arr1" merupakan penampung dari hasil parsingan "" menggunakan JSONArray tadi
            JSONObject objectTransaksi = (JSONObject) arrayTransaksi.get(0);
            System.out.println("nama kasir : " + objectTransaksi.get("nama_kasir"));
            System.out.println("data transaksi : " + objectTransaksi.get("data_transaksi"));
            // parse hanya menerima string, jadi harus menggunakan toString
            obj = parser.parse(objectTransaksi.get("data_transaksi").toString());
            // System.out.println("The 2nd element of array");
            // System.out.println(array.get(1));
            // System.out.println();

            // JSONObject obj2 = (JSONObject) array.get(1);
            // System.out.println("Field \"1\"");
            // System.out.println(obj2.get("1"));

            // s = "{}";
            // obj = parser.parse(s);
            // System.out.println(obj);

            // s = "[5,]";
            // obj = parser.parse(s);
            // System.out.println(obj);

            // s = "[5,,2]";
            // obj = parser.parse(s);
            // System.out.println(obj);
        } catch (ParseException pe) {

            System.out.println("position: " + pe.getPosition());
            System.out.println(pe);
        }
    }
}
