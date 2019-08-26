package android.imd.dialogexample

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class RadioDialogFragment:DialogFragment(), DialogInterface.OnClickListener {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return AlertDialog.Builder(requireActivity())
            .setTitle("Escolha uma linguagem")
            .setSingleChoiceItems(
                R.array.linguagens,
                2,
                this)
            .create()
    }

    override fun onClick(p0: DialogInterface?, p1: Int) {
        val linguagens = requireActivity()
            .resources.getStringArray(R.array.linguagens)
        val linguagem = linguagens[p1]

        Toast.makeText(requireActivity(), linguagem, Toast.LENGTH_SHORT).show()
    }
}