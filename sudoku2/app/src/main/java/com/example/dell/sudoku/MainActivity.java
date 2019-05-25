package com.example.dell.sudoku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    public static final String LOG_TAG = MainActivity.class.getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.v(LOG_TAG,"Main Activity");
        Button solv = (Button) findViewById(R.id.button1);
// Set a click listener on that View
        solv.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Log.v(LOG_TAG,"clicked");
                int[] mat = read(view);
                Log.v(LOG_TAG," "+mat[0]+" "+mat[1]+" "+mat[2]);
                //List<Integer> matr = new ArrayList<Integer>();
                //ArrayList<Integer> list = new ArrayList<>();
                //for(int n=0;n<81; n++)
                //    list.add(mat[n]);
                //Log.v(LOG_TAG," "+list.get(0)+" "+list.get(1)+" "+list.get(2)+list.get(3));
                Log.v(LOG_TAG,"clicked1");
                Intent solIntent = new Intent(MainActivity.this, Solution.class);
                Log.v(LOG_TAG,"clicked2");
                Log.v(LOG_TAG,"clicked3");
                solIntent.putExtra("read",mat);
                Log.v(LOG_TAG,"Intent sent");
                startActivity(solIntent);
            }
        });


    }

    public int[] read(View view)
    {
        Log.v(LOG_TAG,"copying");
        int[][] sud = new int[9][9];
        EditText n11 = (EditText) findViewById(R.id.num11);
        Log.v(LOG_TAG,"copied1");
        String ns11 = n11.getText().toString();
        Log.v(LOG_TAG,"copied2");
        sud[0][0] = par(ns11);
        Log.v(LOG_TAG,"element 00:"+sud[0][0]);
        EditText n12 = (EditText) findViewById(R.id.num12);
        String ns12 = n12.getText().toString();
        sud[0][1] = par(ns12);
        Log.v(LOG_TAG,"element 01:"+sud[0][1]);
        EditText n13 = (EditText) findViewById(R.id.num13);
        String ns13 = n13.getText().toString();
        sud[0][2] = par(ns13);
        Log.v(LOG_TAG,"element 02:"+sud[0][2]);
        EditText n14 = (EditText) findViewById(R.id.num14);
        String ns14 = n14.getText().toString();
        sud[0][3] = par(ns14);
        EditText n15 = (EditText) findViewById(R.id.num15);
        String ns15 = n15.getText().toString();
        sud[0][4] = par(ns15);
        EditText n16 = (EditText) findViewById(R.id.num16);
        String ns16 = n16.getText().toString();
        sud[0][5] = par(ns16);
        EditText n17 = (EditText) findViewById(R.id.num17);
        String ns17 = n17.getText().toString();
        sud[0][6] = par(ns17);
        EditText n18 = (EditText) findViewById(R.id.num18);
        String ns18 = n18.getText().toString();
        sud[0][7] = par(ns18);
        EditText n19 = (EditText) findViewById(R.id.num19);
        String ns19 = n19.getText().toString();
        sud[0][8] = par(ns19);
        Log.v(LOG_TAG,"element 08:"+sud[0][8]);
        EditText n21 = (EditText) findViewById(R.id.num21);
        String ns21 = n21.getText().toString();
        sud[1][0] = par(ns21);
        Log.v(LOG_TAG,"copied10");
        EditText n22 = (EditText) findViewById(R.id.num22);
        String ns22 = n22.getText().toString();
        sud[1][1] = par(ns22);
        EditText n23 = (EditText) findViewById(R.id.num23);
        String ns23 = n23.getText().toString();
        sud[1][2] = par(ns23);
        EditText n24 = (EditText) findViewById(R.id.num24);
        String ns24 = n24.getText().toString();
        sud[1][3] = par(ns24);
        EditText n25 = (EditText) findViewById(R.id.num25);
        String ns25 = n25.getText().toString();
        sud[1][4] = par(ns25);
        EditText n26 = (EditText) findViewById(R.id.num26);
        String ns26 = n26.getText().toString();
        sud[1][5] = par(ns26);
        EditText n27 = (EditText) findViewById(R.id.num27);
        String ns27 = n27.getText().toString();
        sud[1][6] = par(ns27);
        EditText n28 = (EditText) findViewById(R.id.num28);
        String ns28 = n28.getText().toString();
        sud[1][7] = par(ns28);
        EditText n29 = (EditText) findViewById(R.id.num29);
        String ns29 = n29.getText().toString();
        sud[1][8] = par(ns29);
        EditText n31 = (EditText) findViewById(R.id.num31);
        String ns31 = n31.getText().toString();
        sud[2][0] = par(ns31);
        EditText n32 = (EditText) findViewById(R.id.num32);
        String ns32 = n32.getText().toString();
        sud[2][1] = par(ns32);
        EditText n33 = (EditText) findViewById(R.id.num33);
        String ns33 = n33.getText().toString();
        sud[2][2] = par(ns33);
        EditText n34 = (EditText) findViewById(R.id.num34);
        String ns34 = n34.getText().toString();
        sud[2][3] = par(ns34);
        EditText n35 = (EditText) findViewById(R.id.num35);
        String ns35 = n35.getText().toString();
        sud[2][4] = par(ns35);
        EditText n36 = (EditText) findViewById(R.id.num36);
        String ns36 = n36.getText().toString();
        sud[2][5] = par(ns36);
        EditText n37 = (EditText) findViewById(R.id.num37);
        String ns37 = n37.getText().toString();
        sud[2][6] = par(ns37);
        EditText n38 = (EditText) findViewById(R.id.num38);
        String ns38 = n38.getText().toString();
        sud[2][7] = par(ns38);
        EditText n39 = (EditText) findViewById(R.id.num39);
        String ns39 = n39.getText().toString();
        sud[2][8] = par(ns39);
        EditText n41 = (EditText) findViewById(R.id.num41);
        String ns41 = n41.getText().toString();
        sud[3][0] = par(ns41);
        Log.v(LOG_TAG,"copied30");
        EditText n42 = (EditText) findViewById(R.id.num42);
        String ns42 = n42.getText().toString();
        sud[3][1] = par(ns42);
        EditText n43 = (EditText) findViewById(R.id.num43);
        String ns43 = n43.getText().toString();
        sud[3][2] = par(ns43);
        EditText n44 = (EditText) findViewById(R.id.num44);
        String ns44 = n44.getText().toString();
        sud[3][3] = par(ns44);
        EditText n45 = (EditText) findViewById(R.id.num45);
        String ns45 = n45.getText().toString();
        sud[3][4] = par(ns45);
        EditText n46 = (EditText) findViewById(R.id.num46);
        String ns46 = n46.getText().toString();
        sud[3][5] = par(ns46);
        EditText n47 = (EditText) findViewById(R.id.num47);
        String ns47 = n47.getText().toString();
        sud[3][6] =par(ns47);
        EditText n48 = (EditText) findViewById(R.id.num48);
        String ns48 = n48.getText().toString();
        sud[3][7] = par(ns48);
        EditText n49 = (EditText) findViewById(R.id.num49);
        String ns49 = n49.getText().toString();
        sud[3][8] = par(ns49);
        EditText n51 = (EditText) findViewById(R.id.num51);
        String ns51 = n51.getText().toString();
        sud[4][0] = par(ns51);
        EditText n52 = (EditText) findViewById(R.id.num52);
        String ns52 = n52.getText().toString();
        sud[4][1] = par(ns52);
        EditText n53 = (EditText) findViewById(R.id.num53);
        String ns53 = n53.getText().toString();
        sud[4][2] = par(ns53);
        EditText n54 = (EditText) findViewById(R.id.num54);
        String ns54 = n54.getText().toString();
        sud[4][3] = par(ns54);
        EditText n55 = (EditText) findViewById(R.id.num55);
        String ns55 = n55.getText().toString();
        sud[4][4] = par(ns55);
        EditText n56 = (EditText) findViewById(R.id.num56);
        String ns56 = n56.getText().toString();
        sud[4][5] = par(ns56);
        EditText n57 = (EditText) findViewById(R.id.num57);
        String ns57 = n57.getText().toString();
        sud[4][6] = par(ns57);
        EditText n58 = (EditText) findViewById(R.id.num58);
        String ns58 = n58.getText().toString();
        sud[4][7] = par(ns58);
        EditText n59 = (EditText) findViewById(R.id.num59);
        String ns59 = n59.getText().toString();
        sud[4][8] = par(ns59);
        EditText n61 = (EditText) findViewById(R.id.num61);
        String ns61 = n61.getText().toString();
        Log.v(LOG_TAG,"copied48");
        sud[5][0] = par(ns61);
        EditText n62 = (EditText) findViewById(R.id.num62);
        String ns62 = n62.getText().toString();
        sud[5][1] = par(ns62);
        EditText n63 = (EditText) findViewById(R.id.num63);
        String ns63 = n63.getText().toString();
        sud[5][2] = par(ns63);
        EditText n64 = (EditText) findViewById(R.id.num64);
        String ns64 = n64.getText().toString();
        sud[5][3] = par(ns64);
        EditText n65 = (EditText) findViewById(R.id.num65);
        String ns65 = n65.getText().toString();
        sud[5][4] = par(ns65);
        EditText n66 = (EditText) findViewById(R.id.num66);
        String ns66 = n66.getText().toString();
        sud[5][5] = par(ns66);
        EditText n67 = (EditText) findViewById(R.id.num67);
        String ns67 = n67.getText().toString();
        sud[5][6] = par(ns67);
        EditText n68 = (EditText) findViewById(R.id.num68);
        String ns68 = n68.getText().toString();
        sud[5][7] = par(ns68);
        EditText n69 = (EditText) findViewById(R.id.num69);
        String ns69 = n69.getText().toString();
        sud[5][8] = par(ns69);
        EditText n71 = (EditText) findViewById(R.id.num71);
        String ns71 = n71.getText().toString();
        sud[6][0] = par(ns71);
        EditText n72 = (EditText) findViewById(R.id.num72);
        String ns72 = n72.getText().toString();
        sud[6][1] = par(ns72);
        EditText n73 = (EditText) findViewById(R.id.num73);
        String ns73 = n73.getText().toString();
        sud[6][2] = par(ns73);
        EditText n74 = (EditText) findViewById(R.id.num74);
        String ns74 = n74.getText().toString();
        sud[6][3] = par(ns74);
        EditText n75 = (EditText) findViewById(R.id.num75);
        String ns75 = n75.getText().toString();
        sud[6][4] = par(ns75);
        EditText n76 = (EditText) findViewById(R.id.num76);
        String ns76 = n76.getText().toString();
        sud[6][5] = par(ns76);
        EditText n77 = (EditText) findViewById(R.id.num77);
        String ns77 = n77.getText().toString();
        sud[6][6] = par(ns77);
        EditText n78 = (EditText) findViewById(R.id.num78);
        String ns78 = n78.getText().toString();
        sud[6][7] = par(ns78);
        EditText n79 = (EditText) findViewById(R.id.num79);
        String ns79 = n79.getText().toString();
        sud[6][8] = par(ns79);
        EditText n81 = (EditText) findViewById(R.id.num81);
        String ns81 = n81.getText().toString();
        sud[7][0] = par(ns81);
        EditText n82 = (EditText) findViewById(R.id.num82);
        String ns82 = n82.getText().toString();
        sud[7][1] = par(ns82);
        EditText n83 = (EditText) findViewById(R.id.num83);
        String ns83 = n83.getText().toString();
        sud[7][2] = par(ns83);
        EditText n84 = (EditText) findViewById(R.id.num84);
        String ns84 = n84.getText().toString();
        sud[7][3] = par(ns84);
        EditText n85 = (EditText) findViewById(R.id.num85);
        String ns85 = n85.getText().toString();
        sud[7][4] = par(ns85);
        EditText n86 = (EditText) findViewById(R.id.num86);
        String ns86 = n86.getText().toString();
        sud[7][5] = par(ns86);
        EditText n87 = (EditText) findViewById(R.id.num87);
        String ns87 = n87.getText().toString();
        sud[7][6] = par(ns87);
        EditText n88 = (EditText) findViewById(R.id.num88);
        String ns88 = n88.getText().toString();
        sud[7][7] = par(ns88);
        EditText n89 = (EditText) findViewById(R.id.num89);
        String ns89 = n89.getText().toString();
        sud[7][8] = par(ns89);
        EditText n91 = (EditText) findViewById(R.id.num91);
        String ns91 = n91.getText().toString();
        sud[8][0] = par(ns91);
        EditText n92 = (EditText) findViewById(R.id.num92);
        String ns92 = n92.getText().toString();
        sud[8][1] = par(ns92);
        EditText n93 = (EditText) findViewById(R.id.num93);
        String ns93 = n93.getText().toString();
        sud[8][2] = par(ns93);
        EditText n94 = (EditText) findViewById(R.id.num94);
        String ns94 = n94.getText().toString();
        sud[8][3] = par(ns94);
        EditText n95 = (EditText) findViewById(R.id.num95);
        String ns95 = n95.getText().toString();
        sud[8][4] = par(ns95);
        EditText n96 = (EditText) findViewById(R.id.num96);
        String ns96 = n96.getText().toString();
        sud[8][5] = par(ns96);
        EditText n97 = (EditText) findViewById(R.id.num97);
        String ns97 = n97.getText().toString();
        sud[8][6] = par(ns97);
        EditText n98 = (EditText) findViewById(R.id.num98);
        String ns98 = n98.getText().toString();
        sud[8][7] = par(ns98);
        EditText n99 = (EditText) findViewById(R.id.num99);
        String ns99 = n99.getText().toString();
        sud[8][8] = par(ns99);
        int[] m = new int[81];
        Log.v(LOG_TAG,"copied all");
        int k=0;
        for(int i=0; i<9; i++)
            for(int j=0; j<9; j++,k++)
                m[k]=sud[i][j];
        Log.v(LOG_TAG,"elements: "+m[0] + " "+ m[1]+ " "+ m[2]);
        Log.v(LOG_TAG,"returning");
    return m;
    }

    public int par(String s)
    {
        switch (s)
        {
            case "1":return 1;
            case "2":return 2;
            case "3":return 3;
            case "4":return 4;
            case "5":return 5;
            case "6":return 6;
            case "7":return 7;
            case "8":return 8;
            case "9":return 9;
            default:return 0;
        }
    }

}
