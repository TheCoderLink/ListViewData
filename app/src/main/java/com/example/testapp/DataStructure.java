package com.example.testapp;

public class DataStructure
    {
        private Node head;
        private Node tail;

        public void pushFirst(String object) {
            Node newNode = new Node(object);

            if (head == null) {
                //add to beginning
                head = tail = newNode;
                head.previous = null;
                tail.next = null;
            } else {
                //add to head
                head.previous = newNode;
                newNode.next = head;
                head = newNode;
                head.previous = null;
            }
        }

        public void pushLast(String object) {
            Node newNode = new Node(object);

            if (head == null) {
                //add to beginning
                head = tail = newNode;
                head.previous = null;
                tail.next = null;
            } else {
                //add to tail
                tail.next = newNode;
                newNode.previous = tail;
                tail = newNode;
                tail.next = null;
            }
        }

        public void popFirst()
        {
            if(head != null)
            {
                if(head.next == null)
                {
                    head = null;
                    tail = null;
                }
                else
                {
                    head = head.next;
                    head.previous = null;
                }
            }
            else
            {
                System.out.println("Delete from an empty list?");
                System.exit(0);
            }
        }

        public void popLast()
        {
            if(tail != null)
            {
                if(tail.previous == null)
                {
                    tail = null;
                    head = null;
                }
                else
                {
                    tail = tail.previous;
                    tail.next = null;
                }
            }
            else
            {
                System.out.println("Delete from an empty list?");
                System.exit(0);
            }
        }
        public void showList()
        {
            Node current = head;
            if(head == null)
            {
                System.out.println("List is empty");
                return;
            }
            else
            {
                System.out.println("Nodes of List: ");
                while(current != null)
                {
                    System.out.print(current.data + " ");
                    current = current.next;
                }
                System.out.println();
            }
        }

        public int lengthOfList()
        {
            int count = 0;
            Node position = head;
            while(position != null)
            {
                count++;
                position = position.next;
            }
            return count;
        }

        public String peekFirst()
        {
            if(head != null)
            {
                return head.getData() + "";
            }
            else
            {
                System.out.println("List is empty.");
                return null;
            }
        }

        public String peekLast()
        {
            if(tail != null)
            {
                return tail.getData() + "";
            }
            else
            {
                System.out.println("List is empty.");
                return null;
            }
        }

        private class Node
        {
            //instance variables
            private String data;
            Node previous;
            Node next;
            //constructors
            public Node (String data)
            {
                this.data = data;
            }
            //getters & setters
            public String getData()
            {
                return data;
            }
        }//end inner class Node
    }
