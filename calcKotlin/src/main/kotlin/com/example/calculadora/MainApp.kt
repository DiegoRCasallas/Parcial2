package com.example.calculadora

// MainApp.kt
import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class MainApp : Application() {

    override fun start(stage: Stage) {
        val loader = FXMLLoader(MainApp::class.java.getResource("calculadora.fxml"))
        val scene = Scene(loader.load(),360.0, 600.0)
        stage.title = "Calculadora Científica"
        stage.scene = scene
        stage.show()
    }
}

fun main(args: Array<String>) {
    Application.launch(MainApp::class.java, *args)
}
