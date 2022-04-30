import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public class CSVParser {

	public List<Contestant> Parse() throws IOException, URISyntaxException {
		List<Contestant> parsedContestants = new ArrayList<Contestant>();
		CSVReader csvReader = new CSVReader(new FileReader("/Users/jjvega/Documents/devCodeCamp/Sweepstakes/src/main/java/sweepstakes_data.csv"));
		List<String[]> allRows = csvReader.readAll();
		for (String[] row : allRows.subList(1, allRows.size())) {
			int id = Integer.parseInt(row[0]);
			String firstName = row[1];
			String lastName = row[2];
			String email = row[3];
			Contestant contestant = new Contestant(id, firstName, lastName, email);
			parsedContestants.add(contestant);
		}
		return parsedContestants;

	}

}
