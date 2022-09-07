package au.edu.swin.sdmd.l05_detailedimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import au.edu.swin.sdmd.l05_detailedimages.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val nameStr = intent.getStringExtra("name")
        binding.name.text = nameStr

        val authorStr = intent.getStringExtra("author")
        binding.author.text = authorStr
    }
}