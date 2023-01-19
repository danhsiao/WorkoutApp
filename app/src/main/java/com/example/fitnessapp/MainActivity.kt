package com.example.fitnessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.content.Intent
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Action Bar
        supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM;
        supportActionBar?.setCustomView(R.layout.action_bar_layout);

        setContentView(R.layout.activity_main)

        // CLick Listener Card View
        clickListener();
    }

    // Click Listener Card View Fun
    public fun clickListener() {
        var workoutBtn = findViewById<CardView>(R.id.workout_btn)
        workoutBtn.setOnClickListener {
            openWorkout()
        }

        var mealsBtn = findViewById<CardView>(R.id.meals_btn)
        mealsBtn.setOnClickListener {
            openMeals()
        }

        var progressBtn = findViewById<CardView>(R.id.progress_btn)
        progressBtn.setOnClickListener {
            openProgress()
        }

        var caloriesBtn = findViewById<CardView>(R.id.track_calories_btn)
        caloriesBtn.setOnClickListener {
            openCalories()
        }

        var recoveryBtn = findViewById<CardView>(R.id.recovery_btn)
        recoveryBtn.setOnClickListener {
            openRecovery()
        }
    }

    private fun openWorkout() {
        startActivity(Intent(this@MainActivity, Workout::class.java))
    }

    private fun openMeals() {
        startActivity(Intent(this@MainActivity, Meals::class.java))
    }

    private fun openProgress() {
        startActivity(Intent(this@MainActivity, Progress::class.java))
    }

    private fun openCalories() {
        startActivity(Intent(this@MainActivity, TrackCalories::class.java))
    }

    private fun openRecovery() {
        startActivity(Intent(this@MainActivity, Recovery::class.java))
    }

}