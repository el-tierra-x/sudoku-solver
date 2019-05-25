package com.example.dell.sudoku;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by DELL on 07-Nov-17.
 */

public class Solution extends AppCompatActivity {

    public static int[][] sud = new int[9][9];

    public static final String LOG_TAG = Solution.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(LOG_TAG,"Intent received");
        setContentView(R.layout.solution);
        Log.v(LOG_TAG,"set content");
        //Bundle b = getIntent().getExtras();
        //Log.v(LOG_TAG,"extract bundle");
        ArrayList<Integer> list= new ArrayList<Integer>(81);
        //list = getIntent().getExtras().getIntegerArrayList("read");
        int[] m = new int[81];
        if(getIntent().getIntArrayExtra("read")==null){
            Toast.makeText(this,"Wrong Input! Unable to solve",
                   Toast.LENGTH_SHORT).show();
        }
        else
        {
            m = getIntent().getExtras().getIntArray("read");
            Log.v(LOG_TAG,"int[] extracted");
        }
        //    Log.v(LOG_TAG,"array null");
        //}
        //Log.v(LOG_TAG,"array null"+b.get("read"));



        //int[] m = new int[81];
        for(int i=0,k=0; i<9;i++)
            for(int j=0; j<9; j++,k++)
                sud[i][j]=m[k];
        Log.v(LOG_TAG,""+sud[0][0]+" "+sud[0][1]+" "+sud[0][2]+" "+sud[0][3]);
        solve(sud);
          writeMatrix(sud);
        //else
        //{
        //    Toast.makeText(this,"Wrong Input! Unable to solve",
        //            Toast.LENGTH_SHORT).show();
        //}

    }


    public void writeMatrix(int[][] matrix)
    {
        Log.v(LOG_TAG,"writing matrix");
        TextView n00 = (TextView) findViewById(R.id.editText00);
        n00.setText(""+sud[0][0]);
        Log.v(LOG_TAG,""+sud[0][0]);
        TextView n01 = (TextView) findViewById(R.id.editText01);
        n01.setText(""+sud[0][1]);
        Log.v(LOG_TAG,""+sud[0][1]);
        TextView n02 = (TextView) findViewById(R.id.editText02);
        n02.setText(""+sud[0][2]);
        TextView n03 = (TextView) findViewById(R.id.editText03);
        n03.setText(""+sud[0][3]);
        TextView n04 = (TextView) findViewById(R.id.editText04);
        n04.setText(""+sud[0][4]);
        TextView n05 = (TextView) findViewById(R.id.editText05);
        n05.setText(""+sud[0][5]);
        TextView n06 = (TextView) findViewById(R.id.editText06);
        n06.setText(""+sud[0][6]);
        TextView n07 = (TextView) findViewById(R.id.editText07);
        n07.setText(""+sud[0][7]);
        TextView n08 = (TextView) findViewById(R.id.editText08);
        n08.setText(""+sud[0][8]);
        TextView n10 = (TextView) findViewById(R.id.editText10);
        n10.setText(""+sud[1][0]);
        TextView n11 = (TextView) findViewById(R.id.editText11);
        n11.setText(""+sud[1][1]);
        TextView n12 = (TextView) findViewById(R.id.editText12);
        n12.setText(""+sud[1][2]);
        TextView n13 = (TextView) findViewById(R.id.editText13);
        n13.setText(""+sud[1][3]);
        TextView n14 = (TextView) findViewById(R.id.editText14);
        n14.setText(""+sud[1][4]);
        TextView n15 = (TextView) findViewById(R.id.editText15);
        n15.setText(""+sud[1][5]);
        TextView n16 = (TextView) findViewById(R.id.editText16);
        n16.setText(""+sud[1][6]);
        TextView n17 = (TextView) findViewById(R.id.editText17);
        n17.setText(""+sud[1][7]);
        TextView n18 = (TextView) findViewById(R.id.editText18);
        n18.setText(""+sud[1][8]);
        TextView n20 = (TextView) findViewById(R.id.editText20);
        n20.setText(""+sud[2][0]);
        TextView n21 = (TextView) findViewById(R.id.editText21);
        n21.setText(""+sud[2][1]);
        TextView n22 = (TextView) findViewById(R.id.editText22);
        n22.setText(""+sud[2][2]);
        TextView n23 = (TextView) findViewById(R.id.editText23);
        n23.setText(""+sud[2][3]);
        TextView n24 = (TextView) findViewById(R.id.editText24);
        n24.setText(""+sud[2][4]);
        TextView n25 = (TextView) findViewById(R.id.editText25);
        n25.setText(""+sud[2][5]);
        TextView n26 = (TextView) findViewById(R.id.editText26);
        n26.setText(""+sud[2][6]);
        TextView n27 = (TextView) findViewById(R.id.editText27);
        n27.setText(""+sud[2][7]);
        TextView n28 = (TextView) findViewById(R.id.editText28);
        n28.setText(""+sud[2][8]);
        TextView n30 = (TextView) findViewById(R.id.editText30);
        n30.setText(""+sud[3][0]);
        TextView n31 = (TextView) findViewById(R.id.editText31);
        n31.setText(""+sud[3][1]);
        TextView n32 = (TextView) findViewById(R.id.editText32);
        n32.setText(""+sud[3][2]);
        TextView n33 = (TextView) findViewById(R.id.editText33);
        n33.setText(""+sud[3][3]);
        TextView n34 = (TextView) findViewById(R.id.editText34);
        n34.setText(""+sud[3][4]);
        TextView n35 = (TextView) findViewById(R.id.editText35);
        n35.setText(""+sud[3][5]);
        TextView n36 = (TextView) findViewById(R.id.editText36);
        n36.setText(""+sud[3][6]);
        TextView n37 = (TextView) findViewById(R.id.editText37);
        n37.setText(""+sud[3][7]);
        TextView n38 = (TextView) findViewById(R.id.editText38);
        n38.setText(""+sud[3][8]);
        TextView n40 = (TextView) findViewById(R.id.editText40);
        n40.setText(""+sud[4][0]);
        TextView n41 = (TextView) findViewById(R.id.editText41);
        n41.setText(""+sud[4][1]);
        TextView n42 = (TextView) findViewById(R.id.editText42);
        n42.setText(""+sud[4][2]);
        TextView n43 = (TextView) findViewById(R.id.editText43);
        n43.setText(""+sud[4][3]);
        TextView n44 = (TextView) findViewById(R.id.editText44);
        n44.setText(""+sud[4][4]);
        TextView n45 = (TextView) findViewById(R.id.editText45);
        n45.setText(""+sud[4][5]);
        TextView n46 = (TextView) findViewById(R.id.editText46);
        n46.setText(""+sud[4][6]);
        TextView n47 = (TextView) findViewById(R.id.editText47);
        n47.setText(""+sud[4][7]);
        TextView n48 = (TextView) findViewById(R.id.editText48);
        n48.setText(""+sud[4][8]);
        TextView n50 = (TextView) findViewById(R.id.editText50);
        n50.setText(""+sud[5][0]);
        TextView n51 = (TextView) findViewById(R.id.editText51);
        n51.setText(""+sud[5][1]);
        TextView n52 = (TextView) findViewById(R.id.editText52);
        n52.setText(""+sud[5][2]);
        TextView n53 = (TextView) findViewById(R.id.editText53);
        n53.setText(""+sud[5][3]);
        TextView n54 = (TextView) findViewById(R.id.editText54);
        n54.setText(""+sud[5][4]);
        TextView n55 = (TextView) findViewById(R.id.editText55);
        n55.setText(""+sud[5][5]);
        TextView n56 = (TextView) findViewById(R.id.editText56);
        n56.setText(""+sud[5][6]);
        TextView n57 = (TextView) findViewById(R.id.editText57);
        n57.setText(""+sud[5][7]);
        TextView n58 = (TextView) findViewById(R.id.editText58);
        n58.setText(""+sud[5][8]);
        TextView n60 = (TextView) findViewById(R.id.editText60);
        n60.setText(""+sud[6][0]);
        TextView n61 = (TextView) findViewById(R.id.editText61);
        n61.setText(""+sud[6][1]);
        TextView n62 = (TextView) findViewById(R.id.editText62);
        n62.setText(""+sud[6][2]);
        TextView n63 = (TextView) findViewById(R.id.editText63);
        n63.setText(""+sud[6][3]);
        TextView n64 = (TextView) findViewById(R.id.editText64);
        n64.setText(""+sud[6][4]);
        TextView n65 = (TextView) findViewById(R.id.editText65);
        n65.setText(""+sud[6][5]);
        TextView n66 = (TextView) findViewById(R.id.editText66);
        n66.setText(""+sud[6][6]);
        TextView n67 = (TextView) findViewById(R.id.editText67);
        n67.setText(""+sud[6][7]);
        TextView n68 = (TextView) findViewById(R.id.editText68);
        n68.setText(""+sud[6][8]);
        TextView n70 = (TextView) findViewById(R.id.editText70);
        n70.setText(""+sud[7][0]);
        TextView n71 = (TextView) findViewById(R.id.editText71);
        n71.setText(""+sud[7][1]);
        TextView n72 = (TextView) findViewById(R.id.editText72);
        n72.setText(""+sud[7][2]);
        TextView n73 = (TextView) findViewById(R.id.editText73);
        n73.setText(""+sud[7][3]);
        TextView n74 = (TextView) findViewById(R.id.editText74);
        n74.setText(""+sud[7][4]);
        TextView n75 = (TextView) findViewById(R.id.editText75);
        n75.setText(""+sud[7][5]);
        TextView n76 = (TextView) findViewById(R.id.editText76);
        n76.setText(""+sud[7][6]);
        TextView n77 = (TextView) findViewById(R.id.editText77);
        n77.setText(""+sud[7][7]);
        TextView n78 = (TextView) findViewById(R.id.editText78);
        n78.setText(""+sud[7][8]);
        TextView n80 = (TextView) findViewById(R.id.editText80);
        n80.setText(""+sud[8][0]);
        TextView n81 = (TextView) findViewById(R.id.editText81);
        n81.setText(""+sud[8][1]);
        TextView n82 = (TextView) findViewById(R.id.editText82);
        n82.setText(""+sud[8][2]);
        TextView n83 = (TextView) findViewById(R.id.editText83);
        n83.setText(""+sud[8][3]);
        TextView n84 = (TextView) findViewById(R.id.editText84);
        n84.setText(""+sud[8][4]);
        TextView n85 = (TextView) findViewById(R.id.editText85);
        n85.setText(""+sud[8][5]);
        TextView n86 = (TextView) findViewById(R.id.editText86);
        n86.setText(""+sud[8][6]);
        TextView n87 = (TextView) findViewById(R.id.editText87);
        n87.setText(""+sud[8][7]);
        TextView n88 = (TextView) findViewById(R.id.editText88);
        n88.setText(""+sud[8][8]);

    }

    static boolean solve( int[][] cells) {
        int unfilled[][] = new int[81][2];
        int check[][] = new int[9][9];
        int count=0;
        for(int a=0,c=0; a<9; a++)
            for(int b=0; b<9; b++)
                if(cells[a][b]!=0)
                {check[a][b]=1;}
                else
                {check[a][b]=0;unfilled[c][0]=a;unfilled[c++][1]=b;count++;}
        Stack b = new Stack();
        int d=0,flag;
        for(int i=1;i<10; i++)
            if(legal(unfilled[d][0],unfilled[d][1],i,cells))
            {b.push(i);cells[unfilled[d][0]][unfilled[d][1]]=i;break;}
        d++;
        while(d<count)
        {
            flag=0;
            for(int i=1;i<10;i++)
                if(legal(unfilled[d][0],unfilled[d][1],i,cells))
                {flag=1;b.push(i);cells[unfilled[d][0]][unfilled[d][1]]=i;break; }
            while(flag==0)
            {
                d--;
                int t=b.pop();
                cells[unfilled[d][0]][unfilled[d][1]]=0;
                if((b.isEmpty()&&t==9)||d==-1)
                    return false;
                for(int i=t+1; i<10; i++)
                    if(legal(unfilled[d][0],unfilled[d][1],i,cells))
                    {flag=1;b.push(i);cells[unfilled[d][0]][unfilled[d][1]]=i;break; }
            }
            d++;
        }
        return true;
    }


    static boolean legal(int i, int j, int val, int[][] cells) {
        for (int k = 0; k < 9; ++k)  // row
            if (val == cells[k][j])
                return false;

        for (int k = 0; k < 9; ++k) // col
            if (val == cells[i][k])
                return false;

        int boxRowOffset = (i / 3)*3;
        int boxColOffset = (j / 3)*3;
        for (int k = 0; k < 3; ++k) // box
            for (int m = 0; m < 3; ++m)
                if (val == cells[boxRowOffset+k][boxColOffset+m])
                    return false;

        return true; // no violations, so it's legal
    }
}
