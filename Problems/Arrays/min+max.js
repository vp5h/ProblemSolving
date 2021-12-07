const arr =[10,4,5,2,5,6,9]

function min(arr) {
    var min=Infinity
    arr.map((ele)=>{if(ele<min){
        min = ele
    }})
    return +(min)
}
console.log(min(arr))

function max(arr) {
    var max=0
    arr.map((ele)=>{if(ele>max){
        max = ele
    }})
    return +max
}

console.log(max(arr))

