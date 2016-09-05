package de.tbreitbach.android.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick

class Main2Activity : AppCompatActivity() {

    @BindView(R.id.hello_kotlin)
    lateinit var helloKotlin: TextView

    @BindView(R.id.event_button)
    lateinit var eventButton: Button

    /*
    @OnClick(R.id.event_button)
        fun clickedEventButton() {
            Toast.makeText(this, "Event Button clicked.", Toast.LENGTH_LONG).show()
        }
    */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        ButterKnife.bind(this)

        helloKotlin.text = "Hello lovely Kotlin"
        eventButton.text = "Event Button"

        eventButton.setOnClickListener { Toast.makeText(this, "Event Button clicked.", Toast.LENGTH_LONG).show() }

    }
}
