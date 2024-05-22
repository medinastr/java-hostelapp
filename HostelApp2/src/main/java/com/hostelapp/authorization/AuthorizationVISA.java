package com.hostelapp.authorization;

public abstract class AuthorizationVISA implements Authorization {
    @Override
    public boolean authorize() {
        return true;
    }
}
