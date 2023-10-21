class UserAuthentication {
    private String username;
    private String password;
    private boolean authenticated;

    public UserAuthentication(String username, String password) {
        this.username = username;
        this.password = password;
        this.authenticated = false;
    }

    public boolean authenticate(String enteredUsername, String enteredPassword) {
        if (username.equals(enteredUsername) && password.equals(enteredPassword)) {
            authenticated = true;
            return true;
        }
        return false;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }
}
