package android.imd.dialogexample

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.DialogFragment

class CheckedDialogFragment: DialogFragment(), DialogInterface.OnMultiChoiceClickListener {
    override fun onClick(p0: DialogInterface?, p1: Int, p2: Boolean) {
        val linguagens = requireActivity().
            resources.getStringArray(R.array.linguagens)

        val linguagem = linguagens[p1]

        if (p2){
            Toast.makeText(requireActivity(),
                "Você escolheu a linguagem $linguagem",
                Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(requireActivity(),
                "Você desmarcou a linguagem $linguagem",
                Toast.LENGTH_SHORT).show()
        }
    }

    var checked = booleanArrayOf(true, false, true, false, false)

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireActivity())
            .setTitle("Escolha uma ou mais linguagens")
            .setMultiChoiceItems(R.array.linguagens,
                checked, this)
            .create()
    }
}