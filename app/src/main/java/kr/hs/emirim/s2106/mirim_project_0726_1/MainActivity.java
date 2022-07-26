package kr.hs.emirim.s2106.mirim_project_0726_1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText editAngle;
    ImageView imgV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editAngle = findViewById(R.id.edit_angle);
        imgV = findViewById(R.id.imgv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.item_rotate:  // 그림 회전 메뉴
                imgV.setRotation(Float.parseFloat(editAngle.getText().toString()));
                return true;
            case R.id.item_yangyang:
                imgV.setImageResource(R.drawable.yangyang);
                item.setChecked(true);
                return true;
            case R.id.item_napoli:
                imgV.setImageResource(R.drawable.napoli);
                item.setChecked(true);
                return true;
            case R.id.item_thai:
                imgV.setImageResource(R.drawable.thai);
                item.setChecked(true);
                return true;
        }
        return false;
    }
}