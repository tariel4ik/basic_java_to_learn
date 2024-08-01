package equals_and_hascode_practise;

import java.util.Objects;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null){
            return false;
        }
        if(o instanceof User anotherUser){
            return this.login.equals(anotherUser.login) && this.password.equals(anotherUser.password);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.login.hashCode();
    }
}
