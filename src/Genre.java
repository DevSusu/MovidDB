class Genre implements Comparable<Genre> {
	// FIXME implement this
	// Implement a Genre class.
	String name;
	MyLinkedList<String> movieList;
	
	public Genre(String name) {
		this.name = name;
		this.movieList = new MyLinkedList<String>(); 
	}

	@Override
	public int compareTo(Genre other) {
		// 0 if same
		// > 0 if other is faster
		return name.compareTo(other.name);
	}

	@Override
	public boolean equals(Object other) { 
		// Changed
		if (! (other instanceof Genre)) return false;
		Genre otherGenre = (Genre)other;
		return name.equals(otherGenre.name); 
	}

	@Override
	public int hashCode() {
		// TODO implement by yourself,
		// or use 'Source' - 'Generate hashCode() and equals() ...'
		// MAKE SURE THAT THE IMPLEMENTATION IS COMPATIBLE WITH equals()
		return 0;
	}

	@Override
	public String toString() {
		String str = this.name + " : { ";
		str += movieList.toString() + "}";
		return str;
	}
}
