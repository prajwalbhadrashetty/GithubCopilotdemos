package com.cts.jgitdemos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.eclipse.jgit.api.Git;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.transport.UsernamePasswordCredentialsProvider;
import java.io.File;


public class GitService {

    /* logger for logging */
    private static final Logger LOGGER = LoggerFactory.getLogger(GitService.class);
    //location of the git repository
    private String REMOTE_URL;

    // location to store the repository;
    private String LOCAL_PATH;

    //constructor
    public GitService(String REMOTE_URL, String LOCAL_PATH) {
        this.REMOTE_URL = REMOTE_URL;
        this.LOCAL_PATH = LOCAL_PATH;
    }

    //clone the repository and handle GitAPIException
    public void cloneRepo() {
        try {
            Git.cloneRepository()
                    .setURI(REMOTE_URL)
                    .setDirectory(new File(LOCAL_PATH))
                    .call();
        } catch (GitAPIException e) {
            LOGGER.error("GitAPIException: " + e.getMessage());
        }
    }

    // add ad commit all files with a commit message
    public void addCommitAll(String commitMessage) {
        try {
            Git git = Git.open(new File(LOCAL_PATH));
            git.add().addFilepattern(".").call();
            git.commit().setMessage(commitMessage).call();
        } catch (Exception e) {
            LOGGER.error("Exception: " + e.getMessage());
        }
    }

    //status of repository
    public void status() {
        try {
            Git git = Git.open(new File(LOCAL_PATH));
            System.out.println(git.status().call().getAdded());
        } catch (Exception e) {
            LOGGER.error("Exception: " + e.getMessage());
        }
    }

    //push to remote repository with usuername password credentials
    public void push(String username, String password) {
        try {
            Git git = Git.open(new File(LOCAL_PATH));
            git.push().setCredentialsProvider(new UsernamePasswordCredentialsProvider(username, password)).call();
        } catch (Exception e) {
            LOGGER.error("Exception: " + e.getMessage());
        }
    }


    //to do pull from repository
    public void pull() {
        try {
            Git git = Git.open(new File(LOCAL_PATH));
            git.pull().call();
        } catch (Exception e) {
            LOGGER.error("Exception: " + e.getMessage());
        }
    }

    // initialize a new repository
    public void init() {
        try {
            Git git = Git.init().setDirectory(new File(LOCAL_PATH)).call();
        } catch (Exception e) {
            LOGGER.error("Exception: " + e.getMessage());
        }
    }

    // create main method to test cloneRepo method
    public static void main(String[] args)  {
        String REMOTE_URL="https://github.com/prajwalbhadrashetty/jgit-githubtest";
        String LOCAL_PATH="D:\\jgitdemo";
        GitService gitService = new GitService(REMOTE_URL, LOCAL_PATH);

        // call cloneRepo method to clone the repository with try catch block
        try {
            gitService.cloneRepo();
        } catch (Exception e) {
            LOGGER.error("Exception: " + e.getMessage());
        }

//        // call status method and commit method with try catch block
        try {
            gitService.status();
            gitService.addCommitAll("commit message");
        } catch (Exception e) {
            LOGGER.error("Exception: " + e.getMessage());
        }


        //call the push method with try catch block
        try {
            gitService.push("prajwalbhadrashetty", "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");
        } catch (Exception e) {
            LOGGER.error("Exception: " + e.getMessage());
        }


        //call the pull method with try catch block
        try {
            gitService.pull();
        } catch (Exception e) {
            LOGGER.error("Exception: " + e.getMessage());
        }


        //call the init method with try catch block
        try {
            gitService.init();
        } catch (Exception e) {
            LOGGER.error("Exception: " + e.getMessage());
        }

    }
}