package com.semicolon.diceroller;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
  private MediaPlayer mediaPlayer;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final ImageView diceImage = findViewById(R.id.dice_image);
    mediaPlayer = MediaPlayer.create(this, R.raw.dice_sound);
    diceImage.setOnClickListener(new OnClickListener() {
      @Override
      public void onClick(View v) {
        Random random = new Random();
        int randomNumber = random.nextInt(6) + 1;
        mediaPlayer.start();
        switch (randomNumber) {
          case 1:
            diceImage.setImageResource(R.drawable.ic_dice_1);
            break;
          case 2:
            diceImage.setImageResource(R.drawable.ic_dice_2);
            break;
          case 3:
            diceImage.setImageResource(R.drawable.ic_dice_3);
            break;
          case 4:
            diceImage.setImageResource(R.drawable.ic_dice_4);
            break;
          case 5:
            diceImage.setImageResource(R.drawable.ic_dice_5);
            break;
          case 6:
            diceImage.setImageResource(R.drawable.ic_dice_6);
            break;
          default:
            return;
        }

      }
    });
  }
}
