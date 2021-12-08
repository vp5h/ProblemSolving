// Find sum of two arrays.
// [3,5,2,9,4] = 3+5+2+9+4 = 23
// [6,2,8,1,3] = 6+2+8+1+3 = 20
// Final Output : 20+23 = 43

let arr1= [3,5,2,9,4];
let arr2= [6,2,8,1,3];

function Twosum(arr1,arr2){
   let sum1=0;
   let sum2=0;
    arr1.map(ele=>{
        sum1 = sum1 + ele
    })
    arr2.map(ele=>{
        sum2 = sum2 + ele
    })

    return +sum1 + +sum2

}


console.log(Twosum(arr1,arr2))