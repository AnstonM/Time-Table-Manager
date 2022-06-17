package com.example.timetablemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//gg
public class Activity8 extends AppCompatActivity {
    EditText mon1,mon2,mon3,mon4,mon5,mon6,mon7,tue1,tue2,tue3,tue4,tue5,tue6,tue7;
    EditText wed1,wed2,wed3,wed4,wed5,wed6,wed7,thu1,thu2,thu3,thu4,thu5,thu6,thu7;
    EditText fri1,fri2,fri3,fri4,fri5,fri6,fri7,sat1,sat2,sat3,sat4,sat5,sat6,sat7;
    Button abort,save;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8);

        mon1 = (EditText) findViewById(R.id.Mon1);
        mon2 = (EditText) findViewById(R.id.Mon2);
        mon3 = (EditText) findViewById(R.id.Mon3);
        mon4 = (EditText) findViewById(R.id.Mon4);
        mon5 = (EditText) findViewById(R.id.Mon5);
        mon6 = (EditText) findViewById(R.id.Mon6);
        mon7 = (EditText) findViewById(R.id.Mon7);

        tue1 = (EditText) findViewById(R.id.Tue1);
        tue2 = (EditText) findViewById(R.id.Tue2);
        tue3 = (EditText) findViewById(R.id.Tue3);
        tue4 = (EditText) findViewById(R.id.Tue4);
        tue5 = (EditText) findViewById(R.id.Tue5);
        tue6 = (EditText) findViewById(R.id.Tue6);
        tue7 = (EditText) findViewById(R.id.Tue7);

        wed1 = (EditText) findViewById(R.id.Wed1);
        wed2 = (EditText) findViewById(R.id.Wed2);
        wed3 = (EditText) findViewById(R.id.Wed3);
        wed4 = (EditText) findViewById(R.id.Wed4);
        wed5 = (EditText) findViewById(R.id.Wed5);
        wed6 = (EditText) findViewById(R.id.Wed6);
        wed7 = (EditText) findViewById(R.id.Wed7);

        thu1 = (EditText) findViewById(R.id.Thu1);
        thu2 = (EditText) findViewById(R.id.Thu2);
        thu3 = (EditText) findViewById(R.id.Thu3);
        thu4 = (EditText) findViewById(R.id.Thu4);
        thu5 = (EditText) findViewById(R.id.Thu5);
        thu6 = (EditText) findViewById(R.id.Thu6);
        thu7 = (EditText) findViewById(R.id.Thu7);

        fri1 = (EditText) findViewById(R.id.Fri1);
        fri2 = (EditText) findViewById(R.id.Fri2);
        fri3 = (EditText) findViewById(R.id.Fri3);
        fri4 = (EditText) findViewById(R.id.Fri4);
        fri5 = (EditText) findViewById(R.id.Fri5);
        fri6 = (EditText) findViewById(R.id.Fri6);
        fri7 = (EditText) findViewById(R.id.Fri7);


        abort = (Button) findViewById(R.id.abortbtn);
        save = (Button) findViewById(R.id.savebtn);

        db = openOrCreateDatabase("TimeT", Context.MODE_PRIVATE,null);
        db.execSQL("CREATE TABLE IF NOT EXISTS TimeT(Section TEXT," +
                "Day TEXT," +
                "Teacher TEXT," +
                "Subject TEXT," +
                "primary key(Section,Day));");



//        Bundle bundle = getIntent().getBundleExtra("sect");
//        String section = bundle.getString("sec");
        String sec = "CSEA";
        try{
            save.setOnClickListener(v -> {
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','MON1','KKM','" + mon1.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','MON2','ANS','" + mon2.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','MON3','MDS','" + mon3.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','MON4','PRT','" + mon4.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','MON5','KKM','" + mon5.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','MON6','KKM','" + mon6.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','MON7','KKM','" + mon7.getText().toString()+ "');");

                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','TUE1','PRT','" + tue1.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','TUE2','MDS','" + tue2.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','TUE3','KKM','" + tue3.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','TUE4','ANS','" + tue4.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','TUE5','ANS','" + tue5.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','TUE6','ANS','" + tue6.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','TUE7','ANS','" + tue7.getText().toString()+ "');");

                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','WED1','RKS','" + wed1.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','WED2','ASM','" + wed2.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','WED3','ASM','" + wed3.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','WED4','ASM','" + wed4.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','WED5','MDS','" + wed5.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','WED6','MDS','" + wed6.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','WED7','','" + wed7.getText().toString()+ "');");

                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','THU1','PRT','" + thu1.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','THU2','ANS','" + thu2.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','THU3','KKM','" + thu3.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','THU4','','" + thu4.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','THU5','','" + thu5.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','THU6','','" + thu6.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','THU7','','" + thu7.getText().toString()+ "');");

                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','FRI1','RKS','" + fri1.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','FRI2','KKM','" + fri2.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','FRI3','ANS','" + fri3.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','FRI4','MDS','" + fri4.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','FRI5','','" + fri5.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','FRI6','','" + fri6.getText().toString()+ "');");
                db.execSQL("INSERT INTO TimeT VALUES('"+sec+"','FRI7','','" + fri7.getText().toString()+ "');");


                Toast.makeText(getBaseContext(), "Time-Table Successfully Updated", Toast.LENGTH_LONG).show();
            });
        }catch (Exception e){
            Toast.makeText(getBaseContext(), "Error Updating Time-Table", Toast.LENGTH_LONG).show();
        }

    }
}