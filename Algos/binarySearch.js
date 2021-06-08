function binarySearch(arr,value){
    var inThere = false;

    while(inThere == false){
        // console.log('here');
        // console.log(arr[Math.floor(arr.length/2)]);
        console.log(arr[Math.floor((arr.length-1)/2)]);
        if(value < arr[Math.floor((arr.length-1)/2)]){
            arr = arr.slice(0,arr[Math.floor((arr.length-1)/2)]);
            console.log("less than: " + arr + arr[Math.floor((arr.length-1)/2)]);
            if(arr.length == 0){
                return false;
            }
        }
        else if(arr[Math.floor((arr.length-1)/2)] < value){
            console.log("greater than: " + arr);
            arr = arr.slice(arr[Math.floor((arr.length-1)/2)], arr.length)
            if(arr.length == 0){
                return false;
            }
        }
        else{
            console.log(arr);
            return true;
        }
    }
}

console.log(binarySearch([1,3,4,5,6,7,8,9],8));