package ru.itis.summerpractice24

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar

class FragmentOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_one, container, false)
        val editText = view.findViewById<EditText>(R.id.editText)
        val sendButton = view.findViewById<Button>(R.id.sendButton)

        sendButton.setOnClickListener {
            val text = editText.text.toString()
            if (text.isEmpty()) {
                // Show a snackbar if the text is empty
                Snackbar.make(view, "Для отправки текста требуется заполнить поле", Snackbar.LENGTH_SHORT).show()
            } else {
                // Prepare a bundle to pass the text to another fragment
                val bundle = Bundle()
                bundle.putString("text", text)
                // Navigate to the details fragment with the bundle
                findNavController().navigate(R.id.action_fragment_one_to_details, bundle)
            }
        }

        return view
    }
}
