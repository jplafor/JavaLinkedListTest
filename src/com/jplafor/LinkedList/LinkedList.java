package com.jplafor.linkedlist;

public class LinkedList<T>{

    private Node<T> headNode;

    public LinkedList(){
        this.headNode = new Node<T>();
    }

    public void append(T data){
        if(this.headNode.getData() == null){
            this.headNode.setData(data);
        }else{
            Node<T> nodeCursor = this.headNode;
            while(nodeCursor.hasNextNode()){
                nodeCursor = nodeCursor.getNextNode();
            }
            nodeCursor.setNextNode(new Node<T>(data));
        }
    }

    public void print(){
        Node<T> nodeCursor = this.headNode;
        while(nodeCursor.hasData()){
            System.out.println(nodeCursor.getData().toString());
            if(nodeCursor.hasNextNode()){
                nodeCursor = nodeCursor.getNextNode();
            }else{
                break;
            }
        }
    }

    private class Node<T>{

        private T data;
        private Node<T> nextNode;

        // Constructors
        public Node(T data){
            this.data = data;
            this.nextNode = null;
        }

        public Node(){
            this.data = null;
            this.nextNode = null;
        }

        //Getters and setters
        
        //data
        public void setData(T data){
            this.data = data;
        }
        public T getData(){
            return this.data; 
        }
        public boolean hasData(){
            if(this.data != null){
                return true;
            }else{
                return false;
            }
        }

        //nextNode
        public Node<T> getNextNode(){
            return this.nextNode;
        }
        public boolean hasNextNode(){
            if(this.nextNode != null){
                return true;
            }else{
                return false;
            }
        }
        public boolean setNextNode(Node<T> node){
            if(this.nextNode == null){
                this.nextNode = node;
                return true;
            }else{
                return false;
            }   
        }


    }
}