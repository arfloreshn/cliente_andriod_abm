package api.rest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.volley.Cache;
import com.android.volley.Network;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.BasicNetwork;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import api.entidades.Asegurado;

import static java.security.AccessController.getContext;


public class MainActivity extends AppCompatActivity  {

    ArrayList<Asegurado> lstAsegurados;
    RequestQueue requestQueue;
    RequestQueue queque = Volley.newRequestQueue(this);
    Cache cache = new DiskBasedCache(getCacheDir(),1024*1024);
    Network network = new BasicNetwork(new HurlStack());

    Button btnRequest;
    private static final String TAG = MainActivity.class.getName();
    private final static String servidor = "http://localhost:8080/rest";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRequest = (Button) findViewById(R.id.btnRequest);
    }


   public void cmdListarTodo(View v) {

       requestQueue = new RequestQueue(cache, network);
       requestQueue.start();

       String sSql = servidor + "/asegurado/2";
       StringRequest stringRequest = new StringRequest(
               Request.Method.GET
               , sSql
               , new Response.Listener<String>() {
           @Override
           public void onResponse(String response) {
               Toast.makeText(getApplicationContext(), "Response :" + response.toString(), Toast.LENGTH_LONG).show();//display the response on screen
               requestQueue.stop();
           }
       },
               new Response.ErrorListener() {
                   @Override
                   public void onErrorResponse(VolleyError error) {
                       Log.i(TAG, "Error :" + error.toString());
                   }
               });
       requestQueue.add(stringRequest);
   };


   };

