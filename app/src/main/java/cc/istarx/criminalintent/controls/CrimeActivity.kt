package cc.istarx.criminalintent.controls

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import cc.istarx.criminalintent.R

class CrimeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crime)

        var fragment: Fragment? = supportFragmentManager!!.findFragmentById(R.id.fragment_container)
        if (null == fragment) {
            fragment = CrimeFragment()
            supportFragmentManager.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit()
        }

    }
}
