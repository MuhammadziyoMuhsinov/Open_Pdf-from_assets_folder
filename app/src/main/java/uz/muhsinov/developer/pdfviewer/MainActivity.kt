package uz.muhsinov.developer.pdfviewer

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.github.barteksc.pdfviewer.PDFView
import java.io.File

class MainActivity : AppCompatActivity() {
    lateinit var pdfView: PDFView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pdfView = findViewById(R.id.pdfView)
        pdfView.fromAsset("myPdf.pdf").load()

    }
}