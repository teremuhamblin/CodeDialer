class CodeListAdapter(
    private val codes: List<SecretCode>,
    private val onClick: (SecretCode) -> Unit,
    private val onFavoriteClick: (SecretCode) -> Unit
) : RecyclerView.Adapter<CodeListAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val codeText: TextView = view.findViewById(R.id.codeText)
        val descText: TextView = view.findViewById(R.id.descText)
        val favIcon: ImageView = view.findViewById(R.id.favoriteIcon)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_code, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = codes[position]

        holder.codeText.text = item.code
        holder.descText.text = item.description
        holder.favIcon.setImageResource(
            if (item.isFavorite) R.drawable.ic_star_filled else R.drawable.ic_star_outline
        )

        holder.itemView.setOnClickListener { onClick(item) }
        holder.favIcon.setOnClickListener { onFavoriteClick(item) }
    }

    override fun getItemCount(): Int = codes.size
}
