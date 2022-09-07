package au.edu.swin.sdmd.l05_detailedimages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import au.edu.swin.sdmd.l05_detailedimages.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val station = Location("Glenferrie Station", "Ada May Plante",
            -37.821539f, 145.036473f)

        val vStation = findViewById<TextView>(R.id.station)
        vStation.setOnClickListener {
            val detailActivityIntent = Intent(this, DetailActivity::class.java)
            detailActivityIntent.putExtra("location", station)
            startActivity(detailActivityIntent)
        }
    }
}