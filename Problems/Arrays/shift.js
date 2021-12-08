var arr1 = [1,2,3,4,5];

// // console.log(arr1.pop())
// // console.log(arr1.pop())

// console.log(arr)

function shiting(arr){
    let value = arr.pop()
    arr.unshift(value)
    return arr
}
  

console.log(shiting(arr1))