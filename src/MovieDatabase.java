public class MovieDatabase {
	
	MyLinkedList<Genre> genreList;

	public MovieDatabase() {
		// implemented
		this.genreList = new MyLinkedList<Genre>();  
	}

	public void insert(String genre, String title) {
		// FIXME implement this
		// Insert the given genre and title to the MovieDatabase.
		// Printing functionality is provided for the sake of debugging.
		
		System.out.println(genre);
		System.out.println(title);
		
		Genre newGenre = new Genre(genre);
		if ( genreList.add(newGenre) ) {
			
		}
		
		System.out.println(genreList.toString());
		
		// This code should be removed before submitting your work.
		System.err.printf("[trace] INSERT [%s] [%s]\n", genre, title);
	}

	public void delete(String genre, String title) {
		// FIXME implement this
		// Remove the given genre and title from the MovieDatabase.
		// Printing functionality is provided for the sake of debugging.
		
		// This code should be removed before submitting your work.
		System.err.printf("[trace] DELETE [%s] [%s]\n", genre, title);
	}

	public MyLinkedList<QueryResult> search(String term) {
		// FIXME implement this
		// Search the given term from the MovieDatabase.
		// You should return a linked list of QueryResult.
		// The search command is handled at SearchCmd.java.
		// Printing functionality is provided for the sake of debugging.
		// This code should be removed before submitting your work.
		System.err.printf("[trace] SEARCH [%s]\n", term);

		MyLinkedList<QueryResult> results = new MyLinkedList<QueryResult>();

		return results;
	}
}
