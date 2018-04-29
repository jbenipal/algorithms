package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrefixMatch
{
    public class TrieNode
    {
        public TrieNode()
        {
            currentChar_ = '\0';
            mappings_ = new HashMap<>();
            isWord_ = false;
        }

        public TrieNode(char c, Map<Character, TrieNode> mappings, boolean isWord)
        {
            currentChar_ = c;
            mappings_ = mappings;
            isWord_ = isWord;
        }

        char currentChar_;
        Map<Character, TrieNode> mappings_;
        boolean isWord_;

    }

    public PrefixMatch(List<String> dictionary)
    {
        root_ = new TrieNode();
        buildTrie(dictionary);
    }

    private void buildTrie(List<String> dictionary)
    {
        for(String word: dictionary)
        {
            TrieNode currentNode = root_;
            for(int i=0; i< word.length(); ++i) {
                char c = word.charAt(i);
                if (!currentNode.mappings_.containsKey(c))
                {
                    TrieNode trieNode = new TrieNode(c, new HashMap<>(), i == word.length()-1);
                    currentNode.mappings_.put(c, trieNode);
                    currentNode = trieNode;
                } else {
                    if (i == word.length() - 1) {
                        currentNode.isWord_ = true;
                    }
                    currentNode = currentNode.mappings_.get(c);
                }
            }
        }
    }

    public List<String> findStringsWithPrefix(String prefix)
    {
        List<TrieNode> nodes = getAllMatchingNodesWithPrefix(prefix);
        List<String> matchingWords = new ArrayList<>();

        for (TrieNode node : nodes) {
            StringBuilder sb = new StringBuilder();
            sb.append(prefix);
            visit(matchingWords, sb, node);
        }

        return matchingWords;
    }

    private void visit(List<String> words, StringBuilder sb, TrieNode node)
    {
        if (node.isWord_) {
            words.add(sb.toString());
        }
        node.mappings_.forEach((key, value) -> {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(sb.toString());
            sb2.append(key);
            visit(words, sb2, value);
        });
    }

    private List<TrieNode> getAllMatchingNodesWithPrefix(final String prefix)
    {
        List<TrieNode> currentNodes = new ArrayList<>();
        currentNodes.add(root_);
        for (int i=0; i < prefix.length(); ++i) {
            List<TrieNode> newNodes = new ArrayList<>();
            char c = prefix.charAt(i);
            if (c == '?') {
                for(TrieNode currentNode: currentNodes) {
                    currentNode.mappings_.forEach((key, value) -> {
                        newNodes.add(value);
                    });
                }
            } else {
                for (TrieNode currentNode : currentNodes) {
                    if (currentNode.mappings_.containsKey(c)) {
                        newNodes.add(currentNode.mappings_.get(c));
                    }
                }
            }
            currentNodes = newNodes;
        }

        return currentNodes;
    }

    final TrieNode root_;
}