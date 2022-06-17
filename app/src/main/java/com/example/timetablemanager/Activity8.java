package com.example.timetablemanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        sat1 = (EditText) findViewById(R.id.Sat1);
        sat2 = (EditText) findViewById(R.id.Sat2);
        sat3 = (EditText) findViewById(R.id.Sat3);
        sat4 = (EditText) findViewById(R.id.Sat4);
        sat5 = (EditText) findViewById(R.id.Sat5);
        sat6 = (EditText) findViewById(R.id.Sat6);
        sat7 = (EditText) findViewById(R.id.Sat7);

        abort = (Button) findViewById(R.id.abortbtn);
        save = (Button) findViewById(R.id.savebtn);

        db = openOrCreateDatabase("TimeT", Context.MODE_PRIVATE,null);
        db.execSQL("CREATE TABLE IF NOT EXISTS TimeT(Section TEXT," +
                "Day TEXT," +
                "Subject TEXT," +
                "primary key(Section,Day));");
        try {
            save.setOnClickListener(v -> {
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','MON1','" + mon1.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','MON2','" + mon2.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','MON3','" + mon3.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','MON4','" + mon4.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','MON5','" + mon5.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','MON6','" + mon6.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','MON7','" + mon7.getText() + "');");

                db.execSQL("INSERT INTO TimeT VALUES('CSEA','TUE1','" + tue1.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','TUE2','" + tue2.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','TUE3','" + tue3.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','TUE4','" + tue4.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','TUE5','" + tue5.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','TUE6','" + tue6.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','TUE7','" + tue7.getText() + "');");

                db.execSQL("INSERT INTO TimeT VALUES('CSEA','WED1','" + wed1.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','WED2','" + wed2.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','WED3','" + wed3.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','WED4','" + wed4.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','WED5','" + wed5.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','WED6','" + wed6.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','WED7','" + wed7.getText() + "');");

                db.execSQL("INSERT INTO TimeT VALUES('CSEA','THU1','" + thu1.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','THU2','" + thu2.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','THU3','" + thu3.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','THU4','" + thu4.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','THU5','" + thu5.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','THU6','" + thu6.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','THU7','" + thu7.getText() + "');");

                db.execSQL("INSERT INTO TimeT VALUES('CSEA','FRI1','" + fri1.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','FRI2','" + fri2.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','FRI3','" + fri3.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','FRI4','" + fri4.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','FRI5','" + fri5.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','FRI6','" + fri6.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','FRI7','" + fri7.getText() + "');");

                db.execSQL("INSERT INTO TimeT VALUES('CSEA','SAT1','" + sat1.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','SAT2','" + sat2.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','SAT3','" + sat3.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','SAT4','" + sat4.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','SAT5','" + sat5.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','SAT6','" + sat6.getText() + "');");
                db.execSQL("INSERT INTO TimeT VALUES('CSEA','SAT7','" + sat7.getText() + "');");

                Toast.makeText(getBaseContext(), "Time-Table Successfully Updated", Toast.LENGTH_LONG).show();
            });
        }catch (Exception e){
            Toast.makeText(getBaseContext(), "Error Updating Time-Table", Toast.LENGTH_LONG).show();
        }

    }
}