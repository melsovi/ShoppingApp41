package com.company.shoppingapp41.presentation.task

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.company.shoppingapp41.R
import com.company.shoppingapp41.databinding.ActivitySecondTaskBinding

class SecondTaskActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondTaskBinding
    private var user: String? = null
    private var user2: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLauncherRealization()
    }

    private fun initLauncherRealization() {
        binding.btnClicker.setOnClickListener {
            if (binding.editText.text?.isEmpty() == true && binding.editText2.text?.isEmpty() == true) {
                Toast.makeText(this, getString(R.string.redactor_toast), Toast.LENGTH_SHORT)
                    .show()
            } else {
                user = binding.editText.text.toString()
                user2 = binding.editText2.text.toString()
                setResult(RESULT_OK, intent.putExtra(TaskActivity.USER_KEY, user))
                setResult(RESULT_OK, intent.putExtra(TaskActivity.USER_KEY2, user2))
                finish()
            }
        }
    }
}