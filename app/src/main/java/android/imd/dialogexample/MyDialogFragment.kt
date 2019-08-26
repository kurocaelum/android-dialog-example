package android.imd.dialogexample

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class MyDialogFragment: DialogFragment(), DialogInterface.OnClickListener {
    override fun onClick(p0: DialogInterface?, wich: Int) {
        var msg: String? = null

        if(wich == DialogInterface.BUTTON_POSITIVE){
            msg = "Você clicou em SIM"
        }
        else if(wich == DialogInterface.BUTTON_NEGATIVE){
            msg = "Você clicou em NÃO"
        }

        Toast.makeText(requireActivity(), msg, Toast.LENGTH_SHORT).show()
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(requireActivity())
            .setTitle("Pergunta")
            .setMessage("Você entendeu como funciona Dialog")
            .setPositiveButton("Sim", this)
            .setNegativeButton("Não", this)

        return builder.create()
    }
}