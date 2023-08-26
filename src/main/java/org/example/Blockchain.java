package org.example;

import java.util.ArrayList;
import java.util.List;

public class Blockchain {
    private List<Block> chain;
    private int difficulty;

    public Blockchain(int difficulty) {
        chain = new ArrayList<>();
        this.difficulty = difficulty;
        // Create the genesis block
        addBlock(new Block(0, System.currentTimeMillis(), "Genesis Block", "0"));
    }

    public void addBlock(Block newBlock) {
        // Calculate hash and perform proof-of-work
        newBlock.mineBlock(difficulty, chain.isEmpty() ? "0" : chain.get(chain.size() - 1).getHash());
        chain.add(newBlock);
    }

    public Block[] getChain() {
        return new Block[0];
    }

    // Other methods like validation, consensus, etc.
}
