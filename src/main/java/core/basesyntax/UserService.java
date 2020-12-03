package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {

        for (int i = 0; i < records.length; i++) {
            String[] emailUsScore = records[i].split(":");
            if (emailUsScore[0].equals(email)) {
                return Integer.parseInt(emailUsScore[1]);
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
