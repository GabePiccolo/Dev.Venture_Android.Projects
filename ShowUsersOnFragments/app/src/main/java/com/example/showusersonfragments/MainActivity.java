package com.example.showusersonfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SelectUserFragment.OnSelectUserListener{

    private List<User> userList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createUserList();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_select_user, SelectUserFragment.newInstance())
                .commit();
    }

    @Override
    public void onUserSelected(int id) {
        Toast.makeText(this, "User selected: " + id, Toast.LENGTH_LONG).show();
        updateUserDetailFragment(id);
    }

    private void updateUserDetailFragment(int id){
        int userPosition = id - 1;
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_show_user, UserDetailFragment.newInstance(userList.get(userPosition)))
                .commit();
    }

    private void createUserList(){
        User user1 = new User(1, "Linguini","Lingus");
        User user2 = new User(2, "Zorba","Piruleta");
        User user3 = new User(3, "Kaczan","Zejukao");
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
    }
}
