package org.example;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PeerNode {
    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain(4); // Difficulty for PoW

        // Add blocks to the blockchain
        blockchain.addBlock(new Block(1, System.currentTimeMillis(), "Transaction Data 1", ""));
        blockchain.addBlock(new Block(2, System.currentTimeMillis(), "Transaction Data 2", ""));

        // Print the blockchain
        for (Block block : blockchain.getChain()) {
            System.out.println("Index: " + block.getIndex());
            System.out.println("Previous Hash: " + block.getPreviousHash());
            System.out.println("Timestamp: " + block.getTimestamp());
            System.out.println("Data: " + block.getData());
            System.out.println("Hash: " + block.getHash());
            System.out.println("Nonce: " + block.getNonce());
            System.out.println("--------------------------------");
        }
    }

    // Calculate hash using SHA-256
    private static String calculateHash(String input) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();

            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

}
