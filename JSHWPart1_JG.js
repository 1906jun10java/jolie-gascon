/*var homework = {};

1. Return the nth Fibonacci number
`x`
 f(0) = 0
 f(1) = 1
 f(10) = 55 

homework.fibonacci = function(n){

};
*/


let homework = {}; // only need this once in DOM console thing
homework.fibonacci = function fiboJam (n){

if (n === 0){ //If the position is 1, the return will be 0.  ..... 0,1,2,3,4 is position 1,2,3,4,5
            
    return 0
}
if (n === 1){  //If the position is 2, the return will be 1
    
    return 1
}
if (n === 2){ //this position also returns 1 because..... 2 - 2 = 0, and 2 - 1 = 1....  factsss
   
    return 1
}
else {
    
    return (fiboJam(n-2)+fiboJam(n-1)); //this method is looking to add up all the ones , and will keep returning the method until it's finished

}
}

console.log(homework.fibonacci(10)); //method 




 /* 2. Sort array of integers

 f([2,4,5,1,3,1]) = [1,1,2,3,4,5]

 Don't use the Array sort() method... that would be lame.

homework.sort = function(array) {

};
*/

let sleepyArray = [2,4,5,1,3,1]; 

let homework = {};

function innerChange (sleepyArray, i, j) { //what gets passed into change function? array, i, and j...  
                                            //what gets passed into sleepyArray itself?   j-1, and j itself
    let temp = sleepyArray [i];  //gonna put moving index in temp placeholder
    sleepyArray[i] = sleepyArray [j]; //what's in array j is now put array i
    sleepyArray[j] = temp;  // ...  temp leaves temp and re-enters array
}
    homework.sort = function essentiallyBubbleSort(sleepyArray) { //array gets passed into function bubblesort
        for ( let i = 0; i < sleepyArray.length; i++) { // iterating through length of sleepyArray
            for ( let j = 1; j < sleepyArray.length; j++) {
                if (sleepyArray [j - 1] > sleepyArray[j]) { // if greater, do the thing.....enter into the innerChange method
                    innerChange (sleepyArray, j - 1, j);
                }
            }
        }
        return sleepyArray;
    }
    
console.log(homework.sort(sleepyArray));

//console.log(essentiallyBubbleSort(sleepyArray));

/*3. Return the factorial of n

f(0) = 1
f(1) = 1
f(3) = 6

homework.factorial = function(n){
    */

   let homework = {};

   homework.factorial = function factorial(n){ //recursion method 
    if(n===0||n===1){ // both 0 and 1 return 1
      return 1;
    }
    return n*factorial(n-1); // factorial is (example) 5: 5 x 4 x 3 x 2 x 1 = 120
                            // 5 x (5 -1) etc
   }
console.log(homework.factorial(5));

/*4. Rotate left

Given array, rotate left n times and return array

f([1,2,3,4,5], 1) = [2,3,4,5,1]
f([1,2,3,4,5], 6) = [2,3,4,5,1]
f([1,2,3,4,5], 3) = [4,5,1,2,3]


homework.rotateLeft = function(array, n) {

};*/

let nightArray = [1,2,3,4,5]; 

let homework = {};

homework.rotateLeft = function rotateLeft (n) {

    for (let i = 0; i < n; i++) {

       let  y = nightArray[0]; // index 0, needsto be moved up the front

            nightArray.push(y); // adds an element to the end of the array
            nightArray.shift();  // removes an element from the beginning of an array 

    }
    
return nightArray;
}
 console.log(homework.rotateLeft(1));

 /*5. Balanced Brackets

 A bracket is any one of the following: (, ), {, }, [, or ]

 The following are balanced brackets:
    ()
    ()()
    (())
    ({[]})

 The following are NOT balanced brackets:
 (
 )
 (()
 ([)]

 Return true if balanced
 Return false if not balanced

homework.balancedBrackets = function(bracketsString){

};*/
let homework = {};

homework.balancedBrackets = function balancedBracketChecker(n){

if (n.length <= 1 ){
    return false

    let somethingsomething 

    let stack = []

    let openingBrackets = ['[', '{', '(']
    let closingBrackets = [']', '}', ')']

    for (let i = 0, i < n.length; i++) {
somethingsomething

if (closingBrackets.indexOf > -1){



}
    }
}
else{

    return (balancedBracketChecker()); //I know I do something here with push and pop 

//I will work on this assignment part, post submission
}

}

console.log(homework.balancedBrackets(10)); //method 

            
               
            