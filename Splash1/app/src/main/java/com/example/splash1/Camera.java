package com.example.splash1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Camera extends AppCompatActivity {

    // variables
    ImageView imagePic;
    Button btnTakePic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        //type cast
        imagePic = findViewById(R.id.ImageViewCamera);
        btnTakePic = findViewById(R.id.btnPic);
    }

    //method to take picture
    public  void captureImage(View view)
    {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,0);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        try
        {
            super.onActivityResult(requestCode, resultCode, data);
            //image type
            Bitmap bm = (Bitmap) data.getExtras().get("data");
            imagePic.setImageBitmap(bm);
            Toast.makeText(this , "Image saved",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e)
        {
            Toast.makeText(this, "unable to take picture", Toast.LENGTH_SHORT).show();
        }
    }
}