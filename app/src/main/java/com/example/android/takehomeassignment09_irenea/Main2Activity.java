package com.example.android.takehomeassignment09_irenea;

import android.content.Intent;
import android.service.autofill.FillRequest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main2Activity extends AppCompatActivity {
    EditText mFriName,mFriAge;
    CheckBox mEatSweets;

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference friendRef = database.getReference("Friend");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        initializeViewControls();
    }

    private void initializeViewControls(){
        mFriName = findViewById(R.id.friName);
        mFriAge = findViewById(R.id.friAge);
        mEatSweets = findViewById(R.id.eatSweets);
    }

    public void submitFriend(View view) {
        String friName = mFriName.getText().toString();
        int friAge = Integer.valueOf(mFriAge.getText().toString());
        boolean eatSweets = mEatSweets.isChecked();

        Friend fri = new Friend(friName,friAge,eatSweets);
        friendRef.push().setValue(fri);

        Intent data = new Intent(this, MainActivity.class);
        startActivity(data);
    }
}
