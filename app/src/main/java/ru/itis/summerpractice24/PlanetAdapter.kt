package ru.itis.summerpractice24

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class PlanetAdapter(
    private val planets: List<Planet>,
    private val onItemClickListener: (Int) -> Unit
) : RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>() {

    class PlanetViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)
        val descriptionTextView: TextView = itemView.findViewById(R.id.descriptionTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.planet_item, parent, false)
        return PlanetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        val planet = planets[position]

        // Используем Picasso для загрузки изображения
        Picasso.get()
            .load(planet.imageUrl)
            .placeholder(R.drawable.placeholder) // Плейсхолдер пока изображение загружается
            .error(R.drawable.error) // Изображение при ошибке загрузки
            .into(holder.imageView)

        holder.nameTextView.text = planet.name
        holder.descriptionTextView.text = planet.shortDescription

        holder.itemView.setOnClickListener {
            onItemClickListener(planet.id)
        }
    }

    override fun getItemCount(): Int {
        return planets.size
    }
}
