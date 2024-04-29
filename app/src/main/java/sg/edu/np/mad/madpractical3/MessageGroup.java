package sg.edu.np.mad.madpractical3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView; // Import ImageView here
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import java.util.Random;

public class MessageGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_message_group);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        final TextView textView3 = findViewById(R.id.textView3);
        final ImageView imageView2 = findViewById(R.id.imageView2); // Use ImageView here

        // Set onClickListener for button1
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Set the text for Group 1
                textView3.setText("Group1");

                textView3.setVisibility(View.VISIBLE);

                // Hide the ImageView
                imageView2.setVisibility(View.GONE);
            }
        });

        // Set onClickListener for button2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show the image for Group 2
                imageView2.setImageResource(R.mipmap.ic_launcher_round);


                // Show the ImageView
                imageView2.setVisibility(View.VISIBLE);

                // Clear the text in case it was set previously
                textView3.setText("");
            }
        });
    }
}
