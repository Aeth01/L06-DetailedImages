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

        val location = intent.getParcelableExtra<Location>("location")
        location?.let{
            binding.name.text = it.name
            binding.author.text = it.author
            binding.latitude.text = it.latitude.toString()
            binding.longitude.text = it.longitude.toString()
        }
    }
}