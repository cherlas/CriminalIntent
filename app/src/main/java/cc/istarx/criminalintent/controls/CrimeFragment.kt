package cc.istarx.criminalintent.controls

import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import cc.istarx.criminalintent.R
import cc.istarx.criminalintent.modules.Crime
import kotlinx.android.synthetic.main.fragment_crime.view.*

class CrimeFragment : Fragment() {
    private var mCrime: Crime? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mCrime = Crime()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v: View = inflater.inflate(R.layout.fragment_crime, container, false)

        v.crime_title.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                mCrime!!.mTitle = s.toString()
            }

        })

        v.crime_date.text = mCrime!!.mDate.toString()
        v.crime_date.isEnabled = false

        v.crime_is_solved.setOnCheckedChangeListener { buttonView, isChecked ->
            run {
                if (isChecked) {
                    mCrime!!.mIsSolved = true
                }
            }
        }
        return v
    }
}
