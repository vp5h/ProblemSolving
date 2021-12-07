const arr =[10,4,5,2,5,6,9]

function avg(arr) {
    var sum=0
    arr.map((ele)=>{sum = sum + ele})
    return (+sum/arr.length).toFixed(2)
}
console.log(avg(arr))

function sum(arr) {
    var sum=0
    arr.map((ele)=>{sum = sum + ele})
    return +sum.toFixed(2)
}

console.log(sum(arr))

