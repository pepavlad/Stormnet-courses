package com.company;

import java.util.Collection;

public class List<T>{
    Node<T> head;
    public void add(T data){
        Node<T> toAdd = new Node<T>(data);
        if (isEmpty()){
            head = toAdd;
            return;
        }
        Node<T> tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        tmp.next = toAdd;
    }
    public void addAll(List<T> list){
        Node<T> tmp = head;
        Node<T> newList = list.head;
        while (tmp.next != null){
            tmp = tmp.next;
        }
        while (newList.next != null){
            add(newList.data);
            newList = newList.next;
        }

    }
    public boolean contains(T element) {
        Node<T> tmp = head;
        while (tmp.next != null){
            if (tmp.data == element){
                return true;
            }
            tmp = tmp.next;
        }
        return false;
    }
    public void remove(T data){
        if(head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }
        Node<T> tmp = head;
        while (tmp.next != null) {
            if (tmp.next.data == data) {
                tmp.next = tmp.next.next;
                return;
            }
            tmp = tmp.next;
        }
    }
    public void removeAll(){
        head = null;
    }
    public void print(){
        Node<T> temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public boolean isEmpty(){
        return head == null;
    }
    static class Node<T> {
        T data;
        Node<T> next;
        public Node(T data){
            this.data = data;
            next = null;
        }
    }

}
