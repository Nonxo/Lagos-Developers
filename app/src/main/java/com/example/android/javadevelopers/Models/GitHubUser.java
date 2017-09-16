package com.example.android.javadevelopers.Models;

/**
 * Created by SEAMFIX PC on 16/09/2017.
 */

public class GitHubUser {
    public String profileImageUrl;
    public String Username;
    public String profileUrl;
    public String fullName;
    public String followersCount;
    public String followingCount;
    public String reposCount;

    public GitHubUser(String profileUrl, String username, String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
        this.Username = username;
        this.profileUrl = profileUrl;
    }
}

