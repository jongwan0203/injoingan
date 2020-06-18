package com.example.openproject_java;

//데이터베이스에서 데이터를 주고받는 객체
//2018038092 안준
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import androidx.annotation.NonNull;

public class DatabaseControl {
    private FirebaseDatabase database;
    private DatabaseReference myRef;


    public DatabaseControl(){
        //2018038092 안준
        //데이터베이스를 다루는 인스턴스를 생성하는 생성자
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference();
    }

    public void writeNewUser(String UserID,User user){
        //2018038092 안준
        //유저 데이터 쓰기
        myRef.child("Users").child(UserID).setValue(user);
    }

    public void addPlant(String UserID, Plant plant){
        //2018038092 안준
        //유저객체의 하위객체 plant에 식물 데이터 쓰기
        myRef.child("Users").child(UserID).child("myPlant").setValue(plant);
    }


    public void updateData(String UserID, final String NewValue, String key){
        //2018038092 안준
        //특정 key에 데이터를 업데이트
        //새로운 값 NewValue를 인자로 받아서 해당 경로에 업데이트
        //users->userID->key
        myRef.child("Users").child(UserID).child(key).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                //해당 경로에 NewValue로 업데이트
                dataSnapshot.getRef().child("plant_name").setValue(NewValue);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
//데이터를 가져오는 메소드 추가해야함.

}
