package wit.org

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.info
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity(), AnkoLogger {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        info("placemark Activity started..")
        setContentView(R.layout.activity_main)
        btnAdd.setOnClickListener() {
            val placemarkTitle = placemarkTitle.text.toString()

            if (placemarkTitle.isNotEmpty()) {

                info("add Button Pressed. $placemarkTitle")
            } else {
                toast("please Enter a title")
            }

        }
    }
}
