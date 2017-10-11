/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Boogster
 */

public class Queue {
    public IntLL head;
    public IntLL tail;
    
    public Queue()
    {
        head = null;
        tail = null;
    }
    /********************************************************
 *  enqueue(int value)
 *  Robert Gomez
 * ******************************************************
 * Purpose: Add new int value to Link List Stack
 * Method Inputs
 *      int value
 * Return Value
 *      None
 * ******************************************************
 * 10/10/2017
 * ******************************************************
 * @param value 
 ********************************************************/
    public void enqueue(int value)
    {
        IntLL temp = new IntLL();
        if(head ==null)
        {
            temp.value = value;
            head = temp;
            tail = temp;
        }
        else
        {
            temp.value = value;
            tail.nextLL = temp;
            tail = temp;
        }
    }
    /********************************************************
 *  dequeue()
 *  Robert Gomez
 * ******************************************************
 * Purpose: removes last Link form top of link list
 * Method Inputs
 *      none
 * Return Value
 *      removed Link
 * ******************************************************
 * 10/10/2017
 * ******************************************************
 * @param value 
 ********************************************************/
    public int dequeue()
    {
        int toBeReturned;
        if(head != null)
        {
            toBeReturned = head.value;
            head = head.nextLL;
        }
        else
        {
            toBeReturned = 0;
        }
        return toBeReturned;
    }
    //answer being returned
    public String circle()
    {
        String answer = "";
        IntLL temp = head;
        
        while(temp != null)
        {
            answer += temp.value + ", ";
            temp = temp.nextLL;
        }
        
        return answer;
    }
}
