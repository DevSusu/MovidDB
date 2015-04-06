import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class AbstractCommand implements Command {
	@Override
	public void apply(MovieDatabase db, String args) throws DatabaseException {
		String[] arga = parse(args);
		queryDatabase(db, arga);
	}

	private String[] parse(String args) throws CommandParseException {
		if (args.isEmpty()) {
			return new String[] {};
		} else {
			// Replaced Original Code with Regex matcher.
			Pattern p = Pattern.compile("(?<genre>[a-zA-Z ]+)\\%[ ]+\\%(?<title>[a-zA-Z ]+)");
			Matcher m = p.matcher(args);
			m.find();

			String[] parsedArgs = new String[2];
			parsedArgs[0] = m.group("genre");
			parsedArgs[1] = m.group("title");

			return parsedArgs;
		}
	}

	protected abstract void queryDatabase(MovieDatabase db, String[] arga) throws DatabaseException;
}
