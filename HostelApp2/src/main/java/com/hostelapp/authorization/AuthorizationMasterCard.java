package com.hostelapp.authorization;

public abstract class AuthorizationMasterCard implements Authorization {
    @Override
    public boolean authorize() {
        return true;
    }
}
