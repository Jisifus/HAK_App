package at.arthurbraun.hak_app

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.timetable_fragment.button

/**
 * Created by Arthur on 26.02.2018.
 */
class timetableFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater!!.inflate(R.layout.timetable_fragment,null)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button.setOnClickListener {
            Toast.makeText(activity, "You are inside timetable fragment", Toast.LENGTH_SHORT).show()
        }
    }
}