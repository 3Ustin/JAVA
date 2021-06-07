// WRITE A FUNCTION THAT RETURNS WHETHER THE GIVEN ARRAY HAS A BALANCE POINT BETWEEN THE VALUES
// WHERE ONE SIDE IS EQUAL TO THE OTHER

function balancePoint(arr){
    let sumLeft = 0;
    let sumRight = 0;
    for(let i = 0; i < arr.length; i++){
        let j = arr.length - 1;
        sumLeft += arr[i];
        if(sumLeft > arr[j]){
            sumRight += arr[j];
            j--;
        }
        if(i == j - 1 && sumLeft == arr[j] || i == j -1 && sumLeft == sumRight){
            console.log("True -balance point is at arr index of: ", i);
            return i;
        }
        if(i == j - 1 && sumLeft != arr[j] || i == j -1 && sumLeft != sumRight){
            return false;
        }
    }
}

function balanceIndex(arr) {
    let leftSum = 0;
    let rightSum = 0;
    let j = (arr.length - 1);           //starts at last index of array
    for (let i = 0; i < arr.length; i++) {
        if (leftSum < rightSum) {       //if left is smaller, add to left's sum, increment to the right (increase i)
            leftSum += arr[i];
        }
        else if (rightSum < leftSum) {      //if right is smaller, add to right's sum, increment to the left (decrease j)
            rightSum += arr[j];
            j--;
        }
        else {                              //if sums are equal
            if (i == j) {                   //if left and right position are equal, return true
                return true;
            }
            else {              //if left position is before right position, add to both, increment on both directions (i+, j-)
                leftSum += arr[i];
                rightSum += arr[j];
                j--;
            }

        }
    }
    return false
}

    // console.log(balancePoint([1,2,3,4,10])) // TRUE
    // ---> 1+2+3+4 = 10     10 == 10 so balanced
    // console.log(balancePoint([1,2,3,2,1])) // FALSE
    // console.log(balancePoint([1,2,3,1,2,3,2,1])) // FALSE
    // console.log(balancePoint([2,2])) // TRUE