package com.hostelapp;

public abstract class AuthorizationMasterCard implements Authorization {
    @Override
    public boolean authorize() {
        return true;
    }
}
