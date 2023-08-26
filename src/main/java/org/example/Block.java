package org.example;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class Block {
    private int index;
    private long timestamp;
    private String previousHash;
    private String data;
    private String hash;
    private int nonce;

    public Block(int i, long l, String genesisBlock, String number) {
    }

    public String getIndex() {
        return null;
    }

    public void mineBlock(int difficulty, String number) {
    }

    public String getPreviousHash() {
        return null;
    }

    public String getTimestamp() {
        return null;
    }

    public String getData() {
        return null;
    }

    public String getHash() {
        return null;
    }

    public String getNonce() {
        return null;
    }

    // Constructor, getters, setters, and hash calculation methods
}

